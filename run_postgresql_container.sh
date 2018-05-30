#!/bin/bash

docker run --rm --name postgres_payment_store \
 -p 5432:5432 \
 -e POSTGRES_DB=todo_store \
 -e POSTGRES_USER=todo_store \
 -e POSTGRES_PASSWORD=test1234 \
 -v $PWD/postgresql_data:/var/lib/postgresql/data \
 -d postgres:10 

