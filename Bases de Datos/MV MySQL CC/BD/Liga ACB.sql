drop database if exists liga_ACB;
create database liga_ACB;
use liga_ACB;

create table equipos(
idEquipo int auto_increment,
nombreEquipo varchar(20) not null,
ciudad varchar(20) not null,
webOficial varchar(100),
puntos int,
primary key(idEquipo)
);

create table jugadores(
codigo int auto_increment,
nombre varchar(20) not null,
apellido varchar(30) not null,
puesto enum('Escolta', 'Pivot', 'Base', 'Alero') not null,
idCapitan int,
fechaAlta date,
salario decimal(10,2) not null,
idEquipo int,
altura double,
primary key(codigo),
foreign key(idEquipo) references equipos(idEquipo)
);

create table partidos(
eLocal int,
eVisitante int,
resultado varchar(7) default '0-0' not null,
fecha date not null, 
arbitro int,
foreign key(eLocal) references equipos(idEquipo),
foreign key(eVisitante) references equipos(idEquipo)
);

load data infile 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\equipos.csv' into table equipos
fields terminated by ','
enclosed by '"'
lines terminated by '\n'
ignore 1 rows;

load data infile 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\jugadores.csv' into table jugadores
fields terminated by ','
enclosed by '"'
lines terminated by '\n'
ignore 1 rows;

load data infile 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\partidos.csv' into table partidosos
fields terminated by ','
enclosed by '"'
lines terminated by '\n'
ignore 1 rows;