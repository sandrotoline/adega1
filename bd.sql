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

create table uau_usuario_autorizacao (
usr_id bigint unsigned not null,
aut_id bigint unsigned not null,
primary key (usr_id, aut_id),
foreign key uau_usr_fk (usr_id) references usr_usuario (usr_id) on delete restrict on update cascade,
foreign key uau_aut_fk (aut_id) references aut_autorizacao (aut_id) on delete restrict on update cascade
);

create table fabricante(
  fb_id bigint unsigned not null,
  fb_nome varchar(50) not null,
  fb_pais varchar(50) not null, 
  primary key (fb_id),
   unique key uni_fb_nome (fb_nome)
);

create table bebida(
  bed_id bigint unsigned not null,
  beb_nome varchar(50) not null,
  beb_volume varchar(10) not null,
  beb_tipo varchar(30) not null,
  beb_descricao varchar(500) not null,
  fb_beb_id bigint unsigned not null,
  primary key (bed_id),
  foreign key beb_fab_fk (fb_beb_id) references fabricante(fb_id) on delete restrict on update cascade,
  unique key uni_beb_nome (beb_nome)
);