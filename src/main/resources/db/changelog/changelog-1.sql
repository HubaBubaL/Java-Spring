--liquibase formatted sql

--changeset MGrigorev:1
--comment first migration
CREATE SCHEMA if not exists animals;
CREATE TABLE animals.animal_type
(
    id SERIAL PRIMARY KEY,
    type VARCHAR(100)
);

CREATE TABLE animals.animal
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    breed VARCHAR(100),
    cost DOUBLE PRECISION,
    character VARCHAR(100),
    secret_info VARCHAR(100),
    type_id INTEGER,
    CONSTRAINT fk_animal_type
        FOREIGN KEY(type_id)
            REFERENCES animals.animal_type(id)
);

 INSERT INTO animals.animal_type (id, type)
 VALUES(1, 'Shark');
 INSERT INTO animals.animal_type (id, type)
 VALUES(2, 'Wolf');
 INSERT INTO animals.animal_type (id, type)
 VALUES(3, 'Cat');
 INSERT INTO animals.animal_type (id, type)
 VALUES(4, 'Dog');
 INSERT INTO animals.animal (id,name, breed, cost, character, secret_info, type_id)
 VALUES(1, 'Barsik', 'persian', 1000, 'good', 'secret cat', 3);
 INSERT INTO animals.animal (id,name, breed, cost, character, secret_info, type_id)
 VALUES(2, 'Jeck', 'husky', 2000, 'vigorous', 'secret dog', 4);
 INSERT INTO animals.animal (id,name, breed, cost, character, secret_info, type_id)
 VALUES(3, 'Alisa', 'white shark', 10000, 'dangerous', 'secret shark', 1);
 INSERT INTO animals.animal (id,name, breed, cost, character, secret_info, type_id)
 VALUES(4, 'Alex', 'northern wolf', 50000, 'dangerous', 'secret wolf', 2);
--rollback truncate table demo;