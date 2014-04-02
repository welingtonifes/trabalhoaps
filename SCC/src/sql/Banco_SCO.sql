CREATE TABLE usuario(
cod_usuario SERIAL              NOT NULL,
nome               VARCHAR(40)  NOT NULL,
senha              VARCHAR(20)  NOT NULL,
CONSTRAINT pk_usuario
  PRIMARY KEY(cod_usuario)
); 

CREATE TABLE paciente(
cod_paciente     SERIAL         NOT NULL,
nome             VARCHAR(40)    NOT NULL,
cpf              VARCHAR(20)   UNIQUE NOT NULL,
datanascimento   VARCHAR(20)    NOT NULL,
sexo             VARCHAR(20)    NOT NULL,
uf               VARCHAR(20)    NOT NULL,
cidade           VARCHAR(40)    NOT NULL,
bairro           VARCHAR(40)    NOT NULL,
cep              VARCHAR(20)    NOT NULL,
rua              VARCHAR(20)    NOT NULL,
numero           VARCHAR(10)    NOT NULL,
telefone         VARCHAR(20)    NOT NULL,
celular          VARCHAR(20)    NOT NULL,
email            VARCHAR(40)    NOT NULL,
CONSTRAINT pk_paciente
  PRIMARY KEY (cod_paciente)
); 

CREATE TABLE dentista(
cod_dentista     SERIAL         NOT NULL,
nome             VARCHAR(40)    NOT NULL,
cpf              VARCHAR(20)   UNIQUE NOT NULL,
datanascimento   VARCHAR(20)    NOT NULL,
sexo             VARCHAR(20)    NOT NULL,
uf               VARCHAR(20)    NOT NULL,
cidade           VARCHAR(40)    NOT NULL,
bairro           VARCHAR(40)    NOT NULL,
cep              VARCHAR(20)    NOT NULL,
rua              VARCHAR(20)    NOT NULL,
numero           VARCHAR(10)    NOT NULL,
telefone         VARCHAR(20)    NOT NULL,
celular          VARCHAR(20)    NOT NULL,
email            VARCHAR(40)    NOT NULL,
CONSTRAINT pk_dentista
  PRIMARY KEY (cod_dentista)
); 

CREATE TABLE secretaria(
cod_secretaria   SERIAL         NOT NULL,
nome             VARCHAR(40)    NOT NULL,
cpf              VARCHAR(20)   UNIQUE NOT NULL,
datanascimento   VARCHAR(20)    NOT NULL,
sexo             VARCHAR(20)    NOT NULL,
uf               VARCHAR(20)    NOT NULL,
cidade           VARCHAR(40)    NOT NULL,
bairro           VARCHAR(40)    NOT NULL,
cep              VARCHAR(20)    NOT NULL,
rua              VARCHAR(20)    NOT NULL,
numero           VARCHAR(10)    NOT NULL,
telefone         VARCHAR(20)    NOT NULL,
celular          VARCHAR(20)    NOT NULL,
email            VARCHAR(40)    NOT NULL,
CONSTRAINT pk_secretaria
  PRIMARY KEY (cod_secretaria)
); 

CREATE TABLE servico(
cod_servico      SERIAL         NOT NULL,
nome             VARCHAR(40)  UNIQUE  NOT NULL,
valor            INTEGER        NOT NULL,
plano_saude      VARCHAR(20)    NOT NULL,
CONSTRAINT pk_servico
  PRIMARY KEY (cod_servico)
);

INSERT INTO usuario(nome,senha)
  VALUES('admin','1234');

INSERT INTO usuario(nome,senha)
  VALUES('charles','1234');
  
--SELECT *FROM usuario;

--SELECT *FROM paciente;