#!/bin/bash

mkdir bin
javac -d bin $(find src -type f -name '*.java')
