/*
 * Copyright 2014, John Pritchard, Syntelos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package client;

import schema.Console;
import schema.ConsoleSet;
import schema.ConsoleSetArray;
import schema.Schema;
import schema.Schematic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class main {

    final static String HOST = "push1.jsc.nasa.gov";
    final static int PORT = 80;

    public static void main(String[] argv){
        ConsoleSet console = null;
        for (String arg : argv){
            try {
                Console list = Console.valueOf(arg);

                if (null == console)
                    console = list;

                else if (console instanceof ConsoleSetArray){

                    ((ConsoleSetArray)console).add(list);
                }
                else {
                    console = new ConsoleSetArray(console).add(list);
                }
            }
            catch (RuntimeException rex){
                Schematic sch = Schema.For(arg);
                if (null != sch){

                    if (null == console)
                        console = new ConsoleSetArray(sch);

                    else if (console instanceof ConsoleSetArray){

                        ((ConsoleSetArray)console).add(sch);
                    }
                    else {
                        console = new ConsoleSetArray(console).add(sch);
                    }
                }
                else {
                    System.err.println("Usage: client.main [NAME|CONSOLE]*");
                    System.exit(1);
                }
            }
        }
        if (null == console){
            console = Console.VVO;
        }
        try {
            while (true){
                /*
                 * Re/connect
                 */
                try {
                    Socket socket = new Socket(HOST,PORT);
                    try {
                        DataInputStream in = new DataInputStream(socket.getInputStream());
                        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                        /*
                         * Get a session identifier
                         */
                        CreateSession create = new CreateSession();
                        create.q(out);
                        create.p(in);

                        if (create.ok){

                            while (true){
                                try {
                                    /*
                                     * Define symbol set
                                     */
                                    ControlSession ctrl = new ControlSession(create,console);
                                    ctrl.q(out);
                                    ctrl.p(in);

                                    if (ctrl.ok){
                                        /*
                                         * Read data
                                         */
                                        BindSession bind = new BindSession(create);
                                        bind.q(out);
                                        /*
                                         * Never returns, throws session or control timeout
                                         */
                                        bind.p(in);
                                    }
                                    else {
                                        System.err.println("client.main: error, session control: "+ctrl.response);
                                    }
                                }
                                catch (ControlTimeoutException poll){

                                    System.err.println("\nclient.main: recycle session");
                                }
                            }
                        }
                        else {
                            System.err.println("client.main: error, session create: "+create.response);
                        }
                    }
                    finally {
                        socket.close();
                    }
                }
                catch (SessionTimeoutException reconnect){

                    System.err.println("\nclient.main: discard session, reconnect");
                }
            }
        }
        catch (Exception exc){
            exc.printStackTrace();
            System.exit(1);
        }
    }
}
