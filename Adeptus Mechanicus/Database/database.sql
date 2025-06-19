CREATE DATABASE IF NOT EXISTS cars;
USE cars;

CREATE TABLE IF NOT EXISTS cars(
    idCars int not null AUTO_INCREMENT,
    Mark varchar(255) not null,
    Price int,
    Count int,
    PRIMARY KEY (idCars)
);

insert into cars(Mark, Price, Count)
values("Lada", 10000, 52), ("Toyota", 35000, 13), ("Mercedez", 50000, 19)