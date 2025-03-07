#!/bin/bash

chmod +x ./docker/scripts/parse_env.sh
./docker/scripts/parse_env.sh

run="${RUN_COMMANDS_AUTO:-false}"

if [[ "$run" == "true" ]]; then
    mvn clean package
    mvn spring-boot:run
else
    tail -f /dev/null
fi
