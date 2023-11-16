/*==============================================================*/
/* Database name:  projetointegrador_2                          */
/* DBMS name:      MySQL 8.0                                    */
/*==============================================================*/

USE projetointegrador_2;

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS usuarios;
DROP TABLE IF EXISTS financiamento;
DROP TABLE IF EXISTS recursos;
SET FOREIGN_KEYS_CHECKS=1;

/*==============================================================*/
/* Table: usuarios                                              */
/*==============================================================*/
CREATE TABLE usuarios
(
	id INTEGER AUTO_INCREMENT NOT NULL,
	nome VARCHAR(100) NOT NULL,
	login VARCHAR(100) NOT NULL,
	senha VARCHAR(100) NOT NULL,
	ativo BOOLEAN NOT NULL,
	PRIMARY KEY (id ASC)
);

/*==============================================================*/
/* Table: financiamento                                         */
/*==============================================================*/
CREATE TABLE financiamento
(
	id INTEGER AUTO_INCREMENT NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	parcelas INT NOT NULL,
	valor DECIMAL(10, 2) NOT NULL,
	usuario_id INTEGER NOT NULL,
	PRIMARY KEY (id ASC),
    CONSTRAINT fk_usuario FOREIGN KEY (usuario_id)
		REFERENCES usuarios (id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

/*==============================================================*/
/* Table: recursos                                              */
/*==============================================================*/
CREATE TABLE recursos
(
	id INTEGER AUTO_INCREMENT NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	categoria VARCHAR(100) NOT NULL,
	valor DECIMAL(10, 2) NOT NULL,
	tipo VARCHAR(15) NOT NULL,
    usuario_id INTEGER NOT NULL,
	PRIMARY KEY (id ASC),
	CONSTRAINT fk_recursos_usuario FOREIGN KEY (usuario_id)
		REFERENCES usuarios (id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);