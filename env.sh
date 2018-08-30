#! /bin/bash

select name in "up" "run" "stop" "down" "quit";
do
  
  case $name in
    up) docker-compose $name -d;;
    start | stop | down) docker-compose $name;;
    quit) exit 0;;
    *) echo 'usage';;
  esac
  exit 0
done