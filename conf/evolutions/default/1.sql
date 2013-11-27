# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cat (
  guid                      varchar(40) not null,
  name                      varchar(255),
  man_guid                  varchar(40),
  timestamp                 timestamp not null,
  constraint pk_cat primary key (guid))
;

create table dog (
  guid                      varchar(40) not null,
  name                      varchar(255),
  man_guid                  varchar(40),
  timestamp                 timestamp not null,
  constraint pk_dog primary key (guid))
;

create table man (
  guid                      varchar(40) not null,
  name                      varchar(255),
  timestamp                 timestamp not null,
  constraint pk_man primary key (guid))
;

alter table cat add constraint fk_cat_man_1 foreign key (man_guid) references man (guid) on delete restrict on update restrict;
create index ix_cat_man_1 on cat (man_guid);
alter table dog add constraint fk_dog_man_2 foreign key (man_guid) references man (guid) on delete restrict on update restrict;
create index ix_dog_man_2 on dog (man_guid);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists cat;

drop table if exists dog;

drop table if exists man;

SET REFERENTIAL_INTEGRITY TRUE;

