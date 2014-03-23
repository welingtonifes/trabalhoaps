CREATE TABLE usuario (
  cod_usuario         SERIAL,
  nome_usuario        VARCHAR(40) NOT NULL,
  senha_usuario       VARCHAR(40) NOT NULL,
  descricao_usuario   VARCHAR(30) NOT NULL,
  CONSTRAINT pk_usuario PRIMARY KEY (cod_usuario)
);

insert into usuario (nome_usuario,senha_usuario,descricao_usuario) values ('usuario','1234','usuário administrador');