DROP DATABASE IF EXISTS bdCiclismo;
CREATE DATABASE bdCiclismo ;
USE bdCiclismo;

/*     Table: EQUIPO   */
create table EQUIPO (
NOMEQ VARCHAR(25) not null,
DIRECTOR VARCHAR(45),
primary key(NOMEQ)
);

/*     Table: CICLISTA   */
create table CICLISTA (
DORSAL VARCHAR(25) not null,
NOMBRE VARCHAR(45),
EDAD INTEGER,
NOMEQ VARCHAR(25),
primary key (DORSAL),
foreign key	(NOMEQ) references EQUIPO(NOMEQ) on update cascade on delete restrict
);

/*     Table: ETAPA   */
create table ETAPA (
NETAPA INTEGER not null,
KM FLOAT,
SALIDA VARCHAR(45),
LLEGADA VARCHAR(45),
DORSAL VARCHAR(45),
primary key (NETAPA),
foreign key (DORSAL) references CICLISTA(DORSAL) on update cascade on delete restrict
);

/*     Table: PUERTO   */
create table PUERTO (
NOMPUERTO VARCHAR(45) not null,
ALTURA FLOAT,
CATEGORIA VARCHAR(45),
PENDIENTE DECIMAL(4,2),
NETAPA INTEGER,
DORSAL VARCHAR(25),
primary key (NOMPUERTO),
foreign key (NETAPA) references ETAPA(NETAPA) on update cascade on delete restrict,
foreign key (DORSAL) references CICLISTA(DORSAL) on update cascade on delete restrict
);

/*     Table: MAILLOT   */
create table MAILLOT (
CODIGO VARCHAR(25) not null,
TIPO VARCHAR(45),
COLOR VARCHAR(45),
PREMIO FLOAT,
primary key (CODIGO)
);

/*     Table: LLEVAR   */
create table LLEVAR (
DORSAL VARCHAR(25) not null,
NETAPA INTEGER,
CODIGO VARCHAR(25),
primary key(DORSAL, NETAPA, CODIGO),
foreign key (DORSAL) references CICLISTA(DORSAL) on update cascade on delete restrict,
foreign key (NETAPA) references ETAPA(NETAPA) on update cascade on delete restrict,
foreign key (CODIGO) references MAILLOT(CODIGO) on update cascade on delete restrict
);

/**********   CLAVES FORÁNEAS   ******/




/**********   INSERCIONES   **********/
-- Table: EQUIPO
INSERT INTO equipo VALUES ('Bahrain Victorious', 'Gorazd Stangelj');
INSERT INTO equipo VALUES ('Jumbo-Visma', 'Nico Verhoeven');
INSERT INTO equipo VALUES ('AG2R Citroen Team', 'Laurent Biondi');
INSERT INTO equipo VALUES ('Burgos-BH', 'Julio Andrés Izquierdo');
INSERT INTO equipo VALUES ('EF Education - Nippo', 'Jonathan Vaughters');
INSERT INTO equipo VALUES ('Bora - Hansgrohe', 'Enrico Poitschke');
INSERT INTO equipo VALUES ('Caja Rural - Seguros RGA', 'Xabier Muriel');
INSERT INTO equipo VALUES ('Deceuninck - Quick-Step', 'Wilfried Peeters');
INSERT INTO equipo VALUES ('Euskaltel - Euskadi', 'Jorge Azanza');
INSERT INTO equipo VALUES ('Movistar Team', 'José Luis Jaimerena');
INSERT INTO equipo VALUES ('UAE Abu Dhabi', 'Joxean Fernández "Matxín"');
INSERT INTO equipo VALUES ('Team Bikeexchange', 'Matthew White');
INSERT INTO equipo VALUES ('Israel Start-Up Nation', 'Ran Margaliot');


-- Table: CICLISTA
INSERT INTO ciclista VALUES (1, 'Mikel Landa Meana', 32, 'Bahrain Victorious');
INSERT INTO ciclista VALUES (2, 'Yukiya Arashiro', 37, 'Bahrain Victorious');
INSERT INTO ciclista VALUES (3, 'Primoz Roglic', 32, 'Jumbo-Visma');
INSERT INTO ciclista VALUES (4, 'Koen Bouwman', 28, 'Jumbo-Visma');
INSERT INTO ciclista VALUES (5, 'Geoffrey Bouchard', 29, 'AG2R Citroen Team');
INSERT INTO ciclista VALUES (6, 'Lilian Calmejane', 29, 'AG2R Citroen Team');
INSERT INTO ciclista VALUES (7, 'Daniel Navarro García', 38, 'Burgos-BH');
INSERT INTO ciclista VALUES (8, 'Jetse Bol', 32, 'Burgos-BH');
INSERT INTO ciclista VALUES (9, 'Hugh John Carthy', 27, 'EF Education - Nippo');
INSERT INTO ciclista VALUES (10, 'Jonathan Caicedo', 28, 'EF Education - Nippo');
INSERT INTO ciclista VALUES (11, 'Felix Grossschartner', 28, 'Bora - Hansgrohe');
INSERT INTO ciclista VALUES (12, 'Cesare Benedetti', 34, 'Bora - Hansgrohe');
INSERT INTO ciclista VALUES (13, 'Jonathan Lastra', 28, 'Caja Rural - Seguros RGA');
INSERT INTO ciclista VALUES (14, 'Jon Aberasturi Izaga', 32, 'Caja Rural - Seguros RGA');
INSERT INTO ciclista VALUES (15, 'Fabio Jakobsen', 25, 'Deceuninck - Quick-Step');
INSERT INTO ciclista VALUES (16, 'Andrea Bagioli', 22, 'Deceuninck - Quick-Step');
INSERT INTO ciclista VALUES (17, 'Mikel Bizkarra', 32, 'Euskaltel - Euskadi');
INSERT INTO ciclista VALUES (18, 'Xabier Mikel Azparren', 23, 'Euskaltel - Euskadi');
INSERT INTO ciclista VALUES (19, 'Enric Mas Nicolau', 27, 'Movistar Team');
INSERT INTO ciclista VALUES (20, 'Imanol Erviti', 38, 'Movistar Team');
INSERT INTO ciclista VALUES (21, 'Michael Matthews', 31, 'Team Bikeexchange');
INSERT INTO ciclista VALUES (22, 'Lucas Hamilton', 26, 'Team Bikeexchange');
INSERT INTO ciclista VALUES (23, 'David de la Cruz Melgarejo ', 32, 'UAE Abu Dhabi');
INSERT INTO ciclista VALUES (24, 'Joseph Lloyd Dombrowski', 30, 'UAE Abu Dhabi');
INSERT INTO ciclista VALUES (25, 'Sep Vanmarcke', 33, 'Israel Start-Up Nation');
INSERT INTO ciclista VALUES (26, 'Sebastian Berwick', 22, 'Israel Start-Up Nation');


-- Table: ETAPA

INSERT INTO etapa VALUES (1, 7.1, 'Burgos', 'Burgos', 3);
INSERT INTO etapa VALUES (2, 166.7, 'Caleruela', 'Burgos', 3);
INSERT INTO etapa VALUES (3, 202.8, 'Santo Domingo de Silos', 'Espinosa de los Monteros', 1);
INSERT INTO etapa VALUES (4, 163.9, 'El Burgo de Osma', 'Molina de Aragón', 1);
INSERT INTO etapa VALUES (8, 173.7, 'Santa Pola', 'La Manga del Mar Menor', 3);
INSERT INTO etapa VALUES (9, 188, 'Puerto Lumbreras', 'Alto de Velefique', 3);
INSERT INTO etapa VALUES (11, 133.6, 'Antequera', 'Valdepeñas de Jaén', 12);
INSERT INTO etapa VALUES (14, 165.7, 'Don Benito', 'Pico Villuercas', 3);
INSERT INTO etapa VALUES (15, 197.5, 'Navalmoral de la Mata', 'El Barraco', 25);
INSERT INTO etapa VALUES (16, 180, 'Laredo', 'Santa Cruz de Bezana', 13);
INSERT INTO etapa VALUES (18, 162.6, 'Salas', 'Alto del Gamoniteiro', 3);
INSERT INTO etapa VALUES (19, 191.2, 'Tapia de Casariego', 'Monforte de Lemos', 3);
INSERT INTO etapa VALUES (21, 33.8, 'Padrón', 'Santiago de Compostela', 3);

-- Table: PUERTO
INSERT INTO puerto VALUES ('Alto del Castillo', 940, '3', '6.1', 1, 3);
INSERT INTO puerto VALUES ('Picón Blanco', 1519, '3', 9.16, 2, 2);
INSERT INTO puerto VALUES ('Bocos', 787, '3', 4.9, 2, 21);
INSERT INTO puerto VALUES ('Cuatro Vientos', 950, '2', 2.5, 9, 12);
INSERT INTO puerto VALUES ('Calar Alto', 2158, '1', '4.5', 9, 6);
INSERT INTO puerto VALUES ('Alto de Castro de Filabres', 1273, '3', 10, 9, 12);
INSERT INTO puerto VALUES ('Velefique', 1820, 'E', 14, 9, 26);
INSERT INTO puerto VALUES ('Lagunillas', 809, '3', 5.65, 11, 26);
INSERT INTO puerto VALUES ('Alto de Valdepeñas de Jaén', 1095, '2', 5, 11, 8);
INSERT INTO puerto VALUES ('Puerto de Berzocana', 1050, '3', '5.5', 14, 1);
INSERT INTO puerto VALUES ('Alto de Collado de Ballesteros', 1415, '1', 18, 14, 22);
INSERT INTO puerto VALUES ('Pico de Villuercas', 1570, '1', 6.52, 14, 18);
INSERT INTO puerto VALUES ('Alto de la Centenera', 1350, '1', 5.27, 15, 14);
INSERT INTO puerto VALUES ('Pedro de Bernardo', 1242, '2', '4', 15, 17);
INSERT INTO puerto VALUES ('Puerto de Mijares', 1570, '1', 5.45, 15, 15);
INSERT INTO puerto VALUES ('Puerto de San Juan de Nava', 1116, '3', 4, 15, 21);
INSERT INTO puerto VALUES ('Puerto de San Lorenzo', 1347, '1',7.99, 18, 26);
INSERT INTO puerto VALUES ('Alto de Cobertoria', 1173, '1', 8.6, 18, 8);
INSERT INTO puerto VALUES ('Alto del Cordal', 788, '2',9.04, 18, 26);
INSERT INTO puerto VALUES ('Alto de Gamoniteiro', 1772, 'E', 9.69, 18, 9);
INSERT INTO puerto VALUES ('Alto de Sela de Entorcisa', 432, '3', '4.3', 19, 15);
INSERT INTO puerto VALUES ('Alto la Garganta', 875, '2', 4.8, 19, 11);
INSERT INTO puerto VALUES ('Alto de Barbeitos', 927, '2', 3.9, 19, 25);

-- Table: MAILLOT

INSERT INTO maillot VALUES ('MGE', 'Líder de la General', 'Rojo', 150000);
INSERT INTO maillot VALUES ('MMO', 'Líder de la Montaña', 'Blanco con Puntos Azules', 13000);
INSERT INTO maillot VALUES ('MGC', 'Líder de la General Combinada', 'Blanco', 11000);
INSERT INTO maillot VALUES ('MPU', 'Líder por Puntos', 'Verde', 11000);


-- Table: LLEVAR
INSERT INTO llevar VALUES (3, 1, 'MGE');
INSERT INTO llevar VALUES (3, 2, 'MGE');
INSERT INTO llevar VALUES (3, 8, 'MGE');
INSERT INTO llevar VALUES (3, 9, 'MGE');
INSERT INTO llevar VALUES (3, 18, 'MGE');
INSERT INTO llevar VALUES (3, 19, 'MGE');
INSERT INTO llevar VALUES (3, 21, 'MGE');
INSERT INTO llevar VALUES (3, 1, 'MPU');
INSERT INTO llevar VALUES (15, 4, 'MPU');
INSERT INTO llevar VALUES (15, 8, 'MPU');
INSERT INTO llevar VALUES (15, 9, 'MPU');
INSERT INTO llevar VALUES (7, 14, 'MGC');
INSERT INTO llevar VALUES (8, 16, 'MGC');
INSERT INTO llevar VALUES (11, 11, 'MGC');
INSERT INTO llevar VALUES (18, 16, 'MGE');
INSERT INTO llevar VALUES (21, 21, 'MGC'); 
