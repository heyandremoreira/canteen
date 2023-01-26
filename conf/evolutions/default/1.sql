# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table canteen (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  address                       varchar(255),
  image_id                      bigint,
  constraint uq_canteen_image_id unique (image_id),
  constraint pk_canteen primary key (id)
);

create table dish (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  type                          varchar(10),
  value                         double not null,
  menu_id                       bigint,
  dish_quantity                 integer not null,
  constraint pk_dish primary key (id)
);

create table feedback (
  description                   varchar(255),
  ticket_id                     bigint
);

create table image (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  image                         varchar(255),
  description                   varchar(255),
  constraint pk_image primary key (id)
);

create table menu (
  id                            bigint auto_increment not null,
  date                          date,
  canteen_id                    bigint,
  constraint pk_menu primary key (id)
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

create table ticket (
  id                            bigint auto_increment not null,
  user_id                       bigint,
  dish_id                       bigint,
  local_date                    date,
  constraint pk_ticket primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  nationality                   varchar(255),
  address                       varchar(255),
  email                         varchar(255),
  nif                           varchar(255),
  token                         varchar(255),
  balance                       double not null,
  status                        varchar(50) default 'pending',
  image_id                      bigint,
  constraint uq_user_username unique (username),
  constraint uq_user_email unique (email),
  constraint uq_user_image_id unique (image_id),
  constraint pk_user primary key (id)
);

create table user_role (
  id                            bigint auto_increment not null,
  user_id                       bigint,
  role_id                       bigint,
  is_active                     TINYINT DEFAULT 0 not null,
  constraint pk_user_role primary key (id)
);

alter table canteen add constraint fk_canteen_image_id foreign key (image_id) references image (id) on delete restrict on update restrict;

create index ix_dish_menu_id on dish (menu_id);
alter table dish add constraint fk_dish_menu_id foreign key (menu_id) references menu (id) on delete restrict on update restrict;

create index ix_feedback_ticket_id on feedback (ticket_id);
alter table feedback add constraint fk_feedback_ticket_id foreign key (ticket_id) references ticket (id) on delete restrict on update restrict;

create index ix_menu_canteen_id on menu (canteen_id);
alter table menu add constraint fk_menu_canteen_id foreign key (canteen_id) references canteen (id) on delete restrict on update restrict;

create index ix_ticket_user_id on ticket (user_id);
alter table ticket add constraint fk_ticket_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;

create index ix_ticket_dish_id on ticket (dish_id);
alter table ticket add constraint fk_ticket_dish_id foreign key (dish_id) references dish (id) on delete restrict on update restrict;

alter table user add constraint fk_user_image_id foreign key (image_id) references image (id) on delete restrict on update restrict;

create index ix_user_role_user_id on user_role (user_id);
alter table user_role add constraint fk_user_role_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;

create index ix_user_role_role_id on user_role (role_id);
alter table user_role add constraint fk_user_role_role_id foreign key (role_id) references role (id) on delete restrict on update restrict;


# --- !Downs

alter table canteen drop foreign key fk_canteen_image_id;

alter table dish drop foreign key fk_dish_menu_id;
drop index ix_dish_menu_id on dish;

alter table feedback drop foreign key fk_feedback_ticket_id;
drop index ix_feedback_ticket_id on feedback;

alter table menu drop foreign key fk_menu_canteen_id;
drop index ix_menu_canteen_id on menu;

alter table ticket drop foreign key fk_ticket_user_id;
drop index ix_ticket_user_id on ticket;

alter table ticket drop foreign key fk_ticket_dish_id;
drop index ix_ticket_dish_id on ticket;

alter table user drop foreign key fk_user_image_id;

alter table user_role drop foreign key fk_user_role_user_id;
drop index ix_user_role_user_id on user_role;

alter table user_role drop foreign key fk_user_role_role_id;
drop index ix_user_role_role_id on user_role;

drop table if exists canteen;

drop table if exists dish;

drop table if exists feedback;

drop table if exists image;

drop table if exists menu;

drop table if exists reset_password;

drop table if exists role;

drop table if exists ticket;

drop table if exists user;

drop table if exists user_role;

