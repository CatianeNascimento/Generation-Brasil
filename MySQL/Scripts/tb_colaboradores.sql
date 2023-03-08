CREATE DATABASE db_rh;

use db_rh;

CREATE TABLE colaboradores (

id bigint auto_increment,
nome varchar(255) not null,
cargo varchar(100) not null,
setor varchar(100) not null,
salario decimal(10,0) not null,
PRIMARY KEY(id)
);

INSERT INTO colaboradores (nome, cargo, setor, salario)
values("João", "estágiario", "marketing", 1200.00);

INSERT INTO colaboradores (nome, cargo, setor, salario)
values("Cristiane", "desenvolvedora junior", "TI", 4000.00);

INSERT INTO colaboradores (nome, cargo, setor, salario)
values("Luis", "analista de infraestrutura", "TI", 4500.00);

INSERT INTO colaboradores (nome, cargo, setor, salario)
values("Monique", "analista de dados pleno", "TI", 7000.00);

INSERT INTO colaboradores (nome, cargo, setor, salario)
values("Gabriel", "assistente de web design", "TI", 1900.00);

SELECT * FROM colaboradores WHERE salario > 2000.00;

SELECT * FROM colaboradores WHERE salario < 2000.00;

UPDATE colaboradores SET cargo = "assistente de marketing", salario = 1800.00 WHERE id = 1;

SELECT * FROM colaboradores;

RENAME TABLE colaboradores to tb_colaboradores;
