FROM mysql:5.7

COPY schema3.sql /docker-entrypoint-initdb.d
