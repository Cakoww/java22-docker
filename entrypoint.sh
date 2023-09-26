#!/bin/sh
set -e
service ssh start
java -jar /app/target/app.jar