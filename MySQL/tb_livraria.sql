CREATE DATABASE db_livraria;

USE db_livraria;

CREATE TABLE tb_produtos (

id bigint auto_increment,
nome_livro varchar(100) not null, 
autor varchar(100) not null, 
preco decimal(10.0) not null,
genero varchar(100),
PRIMARY KEY (id)
);

INSERT INTO tb_produtos (nome_livro, autor, preco, genero)
values ("Não conte a Ninguém", "Harlan Coben", 49.90, "suspense");

INSERT INTO tb_produtos (nome_livro, autor, preco, genero)
values ("Verity", "Collen Hoover", 39.90, "suspense");

INSERT INTO tb_produtos (nome_livro, autor, preco, genero)
values ("Kindred", "Octavia Butier", 35.00, "ficção científica");

INSERT INTO tb_produtos (nome_livro, autor, preco, genero)
values ("O poder do Hábito", "Charles Duhigg", 44.90, "autoajuda");

INSERT INTO tb_produtos (nome_livro, autor, preco, genero)
values ("Sejamos todos Feministas", "Chimamanda Ngozi Adichie", 19.90, "feminismo");

INSERT INTO tb_produtos (nome_livro, autor, preco, genero)
values ("1984", "George Orwell", 12.90, "ficcão distópica");

INSERT INTO tb_produtos (nome_livro, autor, preco, genero)
values ("Sejamos todos Feministas", "Chimamanda Ngozi Adichie", 19.90, "feminismo");

INSERT INTO tb_produtos (nome_livro, autor, preco, genero)
values ("Todas as Garotas Desaparecidas", "Megan Miranda", 24.90, "suspense");

INSERT INTO tb_produtos (nome_livro, autor, preco, genero)
values ("A Metamorfose", "Franz Kafka", 19.90, "ficção");

SELECT * FROM tb_produtos WHERE preco < 500;

SELECT * FROM tb_produtos WHERE preco > 500;

UPDATE tb_produtos SET preco = 15.90 WHERE id = 7;



