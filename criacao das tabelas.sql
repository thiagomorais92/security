-- Database: deixando_seguro

-- DROP DATABASE deixando_seguro;

CREATE DATABASE deixando_seguro
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;



create table users(
	userId integer PRIMARY KEY,
	username varchar(45) NOT NULL,
	password varchar(45) NOT NULL,
	enabled boolean not null default TRUE
);

create table user_roles(
	user_roleId integer PRIMARY KEY,
	userId integer NOT NULL,
	role varchar(45) NOT NULL
);



insert into users(userId,username,password,enabled)
values(1,'user','12345',true);
insert into users(userId,username,password,enabled)
values(2,'admin','12345',true);



insert into user_roles (user_roleId,userId,role)
values(1,1,'ROLE_USER');
insert into user_roles (user_roleId,userId,role)
values(2,2,'ROLE_ADMIN');