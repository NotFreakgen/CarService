FROM mysql

WORKDIR /Database

ENV MYSQL_ROOT_PASSWORD=root

EXPOSE 3306

COPY ./database.sql /docker-entrypoint-initdb.d/