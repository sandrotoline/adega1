create schema adega;

use adega;

create user 'user'@'localhost' identified by 'adm123';

grant select, insert, delete, update on adega.* to user@'localhost';


create table usr_usuario (
  usr_id bigint unsigned not null auto_increment,
  usr_nome varchar(20) not null,
  usr_login varchar(100) not null,
  usr_senha varchar(100) not null,
  primary key (usr_id),
  unique key uni_usuario_login (usr_login)
  );

create table aut_autorizacao (
  aut_id bigint unsigned not null auto_increment,
  aut_nome varchar(20) not null,
  primary key (aut_id),
  unique key uni_aut_nome (aut_nome)
);