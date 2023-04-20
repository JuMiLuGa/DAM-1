drop database if exists BDKadoo;
create database BDKadoo;
use BDKadoo;

create table TCENTR(
NUMCE int auto_increment,
NOMCE varchar(30),
SENAS varchar(75),
primary key(NUMCE)
);

create table TDEPTO(
NUMDE int auto_increment,
NUMCE int,
DIREC int,
TIDIR enum('P', 'F'),
PRESU int ,
DEPDE int,
NOMDE varchar(30),
primary key(NUMDE),
foreign key(NUMCE) references TCENTR(NUMCE) on delete set null on update cascade
);

create table TEMPLE(
NUMEM int auto_increment,
NUMDE int,
EXTEL varchar(5) not null,
FECNA date,
FECIN date not null,
SALAR double(10,2),
COMIS double(5,2),
NUMHI tinyint,
NOMEM varchar(50),
primary key(NUMEM),
foreign key(NUMDE) references TDEPTO(NUMDE) on delete set null on update cascade
);




