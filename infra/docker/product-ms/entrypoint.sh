#!/bin/bash
set -e

echo "Esperando a que la base de datos esté lista..."
/app/wait-for-it.sh -t 60 product-db:5432 --strict -- echo "Base de datos lista!"

echo "Iniciando aplicación..."
exec java -jar /app/app.jar