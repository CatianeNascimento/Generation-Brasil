CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias (
id bigint auto_increment, 
categoria varchar(100) not null,
classe varchar(100) not null,
PRIMARY KEY (id)
);

CREATE TABLE tb_produtos (
id bigint auto_increment,
nome varchar(100) not null,
preco decimal (3,2) not null, 
quantidade int, 
apresentacao varchar(100) not null, 
id_categoria bigint,
PRIMARY KEY (id),
FOREIGN KEY (id_categoria) REFERENCES tb_categorias (id)
);

INSERT INTO tb_categorias (categoria, classe)
values ("medicamento", "analgésico");

INSERT INTO tb_categorias (categoria, classe)
values ("medicamento", "anti-inflamatório");

INSERT INTO tb_categorias (categoria, classe)
values ("medicamento", "antialérgico");

INSERT INTO tb_categorias (categoria, classe)
values ("perfumaria", "cabelo");

INSERT INTO tb_categorias (categoria, classe)
values ("perfumaria", "cosméticos");

INSERT INTO tb_categorias (categoria, classe)
values ("perfumaria", "unhas");

SELECT * FROM tb_categorias;

INSERT INTO tb_produtos (nome, preco, quantidade, apresentacao, id_categoria) 
values ("dipirona", 2.99, 1500, "comprimido", 1);

INSERT INTO tb_produtos (nome, preco, quantidade, apresentacao, id_categoria) 
values ("diclofenaco", 9.99, 500, "comprimido", 2);

INSERT INTO tb_produtos (nome, preco, quantidade, apresentacao, id_categoria) 
values ("loratadina", 6.99, 200, "xarope", 3);

INSERT INTO tb_produtos (nome, preco, quantidade, apresentacao, id_categoria) 
values ("creme de pentar", 19.90, 50, "semi-sólida", 4);

INSERT INTO tb_produtos (nome, preco, quantidade, apresentacao, id_categoria) 
values ("delineador de olhos", 34.90, 100, "líquido", 5);

INSERT INTO tb_produtos (nome, preco, quantidade, apresentacao, id_categoria) 
values ("esmalte", 2.99, 1500, "líquida", 6);

INSERT INTO tb_produtos (nome, preco, quantidade, apresentacao, id_categoria) 
values ("prometazina", 16.90, 200, "comprimido", 3);

INSERT INTO tb_produtos (nome, preco, quantidade, apresentacao, id_categoria) 
values ("shampoo anti-caspa", 14.99, 100, "líquido", 4);

SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos WHERE preco > 50.00;

SELECT * FROM tb_produtos WHERE preco >= 5.00 AND preco <= 60;

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_categorias.id = tb_produtos.id_categoria;

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_categorias.id = tb_produtos.id_categoria WHERE id_categoria = 5;