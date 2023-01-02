# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table canteen (
  id                            varchar(255),
  name                          varchar(255),
  description                   varchar(255),
  title                         varchar(255),
  date                          datetime(6),
  image                         varchar(255),
  value                         double not null,
  adress                        varchar(255)
);

create table category (
  id                            integer auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table feedback (
  description                   varchar(255)
);

create table image (
  name                          varchar(255),
  image                         varchar(255),
  description                   varchar(255)
);

create table login (
  username                      varchar(255),
  password                      varchar(255)
);

create table menu (
  description                   varchar(255),
  date                          datetime(6),
  value                         double not null
);

create table profile (
  name                          varchar(255),
  nationality                   varchar(255),
  adress                        varchar(255),
  email                         varchar(255),
  nif                           varchar(255)
);

create table reset_password (
  token                         varchar(255),
  password                      varchar(255),
  confirm_password              varchar(255)
);

create table role (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  constraint pk_role primary key (id)
);

create table signup (
  username                      varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  confirm_password              varchar(255)
);

create table ticket (
  description                   varchar(255),
  date                          datetime(6),
  value                         double not null
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  token                         varchar(255),
  email                         varchar(255),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id)
);

create table wallet (
  value                         double not null,
  description                   varchar(255)
);


# --- !Downs

drop table if exists canteen;

drop table if exists category;

drop table if exists feedback;

drop table if exists image;

drop table if exists login;

drop table if exists menu;

drop table if exists profile;

drop table if exists reset_password;

drop table if exists role;

drop table if exists signup;

drop table if exists ticket;

drop table if exists user;

drop table if exists wallet;

