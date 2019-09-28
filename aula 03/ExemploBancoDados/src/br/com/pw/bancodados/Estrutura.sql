DROP DATABASE IF EXISTS banco_dados;
CREATE DATABASE banco_dados;

USE banco_dados;

CREATE TABLE livros(
    id INT, # número inteiro
    nome VARCHAR(100), # campo de texto com no máximo 100 caracteres 
    preco DOUBLE
);