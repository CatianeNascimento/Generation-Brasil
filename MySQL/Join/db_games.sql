CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_personagens (

id bigint auto_increment,
nome varchar(100) not null,
habilidade varchar(100) not null, 
equipamentos varchar(100),
xp int,
id_classe bigint,
PRIMARY KEY (id)
);

CREATE TABLE tb_classes (

id bigint auto_increment, 
tipo varchar(100) not null, 
caracteristica_dominante varchar(100) not null,
id_personagem bigint,
PRIMARY KEY (id),
FOREIGN KEY (id_personagem) REFERENCES tb_personagens (id)
);

ALTER TABLE tb_personagens ADD CONSTRAINT fk_personagens_classes
FOREIGN KEY (id_classe) REFERENCES tb_classes (id);

INSERT INTO tb_classes (tipo, caracteristica_dominante)
values ("guerreiro", "alta resistência");

INSERT INTO tb_classes (tipo, caracteristica_dominante)
values ("cavaleiro", "baixo dano");

INSERT INTO tb_classes (tipo, caracteristica_dominante)
values ("arqueiro", "baixa resistência");

INSERT INTO tb_classes (tipo, caracteristica_dominante)
values ("caçador", "alto dano");

INSERT INTO tb_classes (tipo, caracteristica_dominante)
values ("mago", "alta dano");

SELECT * FROM tb_classes;

INSERT INTO tb_personagens (nome, habilidade, equipamentos, xp, id_classe)
values ("Strife", "força", "espada", 3, 2);

INSERT INTO tb_personagens (nome, habilidade, equipamentos, xp, id_classe)
values ("Zangan", "persuasão", "capa", 5, 1);

INSERT INTO tb_personagens (nome, habilidade, equipamentos, xp, id_classe)
values ("Sephiroth", "velocidade", "espaldeira", 3, 2);

INSERT INTO tb_personagens (nome, habilidade, equipamentos, xp, id_classe)
values ("Vicent", "força", "arma", 2, 5);

INSERT INTO tb_personagens (nome, habilidade, equipamentos, xp, id_classe)
values ("Aerith", "agilidade", "arco-flecha", 2, 4);

INSERT INTO tb_personagens (nome, habilidade, equipamentos, xp, id_classe)
values ("Beatrice", "silenciosa", "colar dourado", 1, 1);

INSERT INTO tb_personagens (nome, habilidade, xp, id_classe)
values ("Simbul", "força", 4, 1);

INSERT INTO tb_personagens (nome, habilidade, equipamentos, xp, id_classe)
values ("Vingador", "escalador", "arco", 5, 3);

SELECT * FROM tb_personagens;

ALTER TABLE tb_personagens ADD ataque int;
ALTER TABLE tb_personagens ADD defesa int;

UPDATE tb_personagens SET ataque = 1400 WHERE id = 1;
UPDATE tb_personagens SET ataque = 1580 WHERE id = 2;
UPDATE tb_personagens SET ataque = 2048 WHERE id = 3;
UPDATE tb_personagens SET ataque = 4000 WHERE id = 4;
UPDATE tb_personagens SET ataque = 5879 WHERE id = 5;
UPDATE tb_personagens SET ataque = 4789 WHERE id = 6;
UPDATE tb_personagens SET ataque = 870 WHERE id = 7;
UPDATE tb_personagens SET ataque = 1789 WHERE id = 8;

UPDATE tb_personagens SET defesa = 7894 WHERE id = 1;
UPDATE tb_personagens SET defesa = 1350 WHERE id = 2;
UPDATE tb_personagens SET defesa = 1750 WHERE id = 3;
UPDATE tb_personagens SET defesa = 2400 WHERE id = 4;
UPDATE tb_personagens SET defesa = 8697 WHERE id = 5;
UPDATE tb_personagens SET defesa = 3500 WHERE id = 6;
UPDATE tb_personagens SET defesa = 2000 WHERE id = 7;
UPDATE tb_personagens SET defesa = 1000 WHERE id = 8;

SELECT * FROM tb_personagens WHERE ataque > 2000;

SELECT * FROM tb_personagens WHERE defesa > 1000 AND defesa < 2000;

SELECT * FROM tb_personagens WHERE nome LIKE "%c%";

SELECT * FROM tb_personagens INNER JOIN tb_classes 
ON tb_classes.id = tb_personagens.id_classe;

SELECT * FROM tb_personagens INNER JOIN tb_classes 
on tb_classes.id = tb_personagens.id_classe WHERE id_classe = 2;
