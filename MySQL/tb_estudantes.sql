CREATE DATABASE db_escola;

use db_escola;

CREATE TABLE estudantes (

id bigint auto_increment,
nome varchar(100) not null,
serie int not null, 
media_notas float(2,0) not null,
materia_preferida varchar(100),
PRIMARY KEY (id)
);

RENAME TABLE estudantes to tb_estudantes;

INSERT INTO tb_estudantes (nome, serie, media_notas, materia_preferida) 
values ("Júlia", 2, 6.9, "Geografia");

INSERT INTO tb_estudantes (nome, serie, media_notas, materia_preferida) 
values ("Maria", 3, 10, "Matemática");

INSERT INTO tb_estudantes (nome, serie, media_notas, materia_preferida) 
values ("Gabriel", 1, 7.3, "Lingua Portuguesa");

INSERT INTO tb_estudantes (nome, serie, media_notas, materia_preferida) 
values ("Fabricio", 8, 6.3, "Educação Física");

INSERT INTO tb_estudantes (nome, serie, media_notas, materia_preferida) 
values ("Mauricio", 6, 5.9, "Artes");

INSERT INTO tb_estudantes (nome, serie, media_notas, materia_preferida) 
values ("Jaqueline", 7, 8.3, "Ciências");

INSERT INTO tb_estudantes (nome, serie, media_notas, materia_preferida) 
values ("Tais", 9, 5.4, "Matemática");

INSERT INTO tb_estudantes (nome, serie, media_notas, materia_preferida) 
values ("Daniel", 5, 8, "História");

SELECT * FROM tb_estudantes;

SELECT * FROM tb_estudantes WHERE media_notas > 7.0;

SELECT * FROM tb_estudantes WHERE media_notas < 7.0;

UPDATE tb_estudantes SET materia_preferida = "Geografia" WHERE id = 5;

