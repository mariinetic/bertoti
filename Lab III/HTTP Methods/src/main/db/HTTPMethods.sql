DROP DATABASE sburrestdemo;
CREATE DATABASE sburrestdemo;
USE sburrestdemo;

CREATE TABLE bolsas (
    id VARCHAR(255) NOT NULL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    imagem_url VARCHAR(255) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL
);
SHOW TABLES;