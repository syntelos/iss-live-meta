#!/bin/bash

if ./compile.sh
then
    java -classpath bin client.main
fi
