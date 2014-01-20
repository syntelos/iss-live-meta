#!/bin/bash

if [ ! -d bin ]
then
    mkdir bin
fi
javac -d bin $(find src -type f -name '*.java')
