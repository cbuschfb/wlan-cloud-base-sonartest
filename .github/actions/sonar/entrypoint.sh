#!/bin/sh -e

ls -la
cd $INPUT_PROJECT_DIR
mvn clean verify sonar:sonar $INPUT_SONAR_ARGS