#!/usr/bin/env bash

WORKING_DIR=${BASH_SOURCE%/*}

rm -rf $WORKING_DIR/tmp
mkdir $WORKING_DIR/tmp
javadoc -d $WORKING_DIR/tmp $(find . -name *.java)
open $WORKING_DIR/tmp/index.html
