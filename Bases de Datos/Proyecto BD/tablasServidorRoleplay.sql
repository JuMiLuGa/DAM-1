DROP DATABASE IF EXISTS ServidorRoleplay;

CREATE DATABASE ServidorRoleplay;

USE ServidorRoleplay;

CREATE TABLE usuarios(
codUsuario INT AUTO_INCREMENT,
nombre VARCHAR(15) NOT NULL,
contraseña VARCHAR(20) NOT NULL,
PRIMARY KEY(codUsuario)
);

CREATE TABLE ropa (
vestimenta INT AUTO_INCREMENT,
torso VARCHAR(20),
piernas VARCHAR(20),
calzado VARCHAR (20),
PRIMARY KEY (vestimenta)
);

CREATE TABLE personajes(
codPersonaje INT AUTO_INCREMENT,
nombreApellidos VARCHAR(40) NOT NULL,
sexo ENUM('M','F') DEFAULT 'M',
raza VARCHAR(15),
fechaNacimiento DATE NOT NULL,
vestimenta INT NOT NULL,
codUsuario INT,
PRIMARY KEY (codPersonaje),
CONSTRAINT personajes_usuariosFK FOREIGN KEY (codUsuario) REFERENCES usuarios (codUsuario) on delete restrict on update cascade,
CONSTRAINT personajes_ropaFK FOREIGN KEY (vestimenta) REFERENCES ropa (vestimenta)on delete restrict on update cascade
);


CREATE TABLE propiedades(
codPropiedad INT AUTO_INCREMENT,
tipoPropiedad ENUM ('CASA','GARAJE','APARTAMENTO') NOT NULL,
precio DECIMAL(10,2),
aforo INT,
codPersonaje INT,
PRIMARY KEY (codPropiedad),
CONSTRAINT propiedades_personajesFK FOREIGN KEY (codPersonaje) REFERENCES personajes (codPersonaje)on delete restrict on update cascade
);

CREATE TABLE trabajos (
nombreTrabajo VARCHAR(20),
salario DECIMAL(10,2),
codPersonaje INT,
PRIMARY KEY (nombreTrabajo),
CONSTRAINT trabajos_personajesFK FOREIGN KEY (codPersonaje) REFERENCES personajes (codPersonaje)on delete restrict on update cascade
);

CREATE TABLE modCoches (
codModeloCoche INT AUTO_INCREMENT,
modelo VARCHAR (30),
PRIMARY KEY (codModeloCoche)
);

CREATE TABLE vehiculos (
matricula VARCHAR(7),
codModeloCoche INT,
codPersonaje INT,
PRIMARY KEY (matricula),
CONSTRAINT vehiculos_modCochesFK FOREIGN KEY (codModeloCoche) REFERENCES modCoches (codModeloCoche)on delete restrict on update cascade,
CONSTRAINT vehiculos_personajesFK FOREIGN KEY (codPersonaje) REFERENCES personajes (codPersonaje)on delete restrict on update cascade
);

CREATE TABLE modArmas (
codModeloArma INT AUTO_INCREMENT,
modelo VARCHAR(30),
PRIMARY KEY (codModeloArma)
);

CREATE TABLE armas (
numSerie INT AUTO_INCREMENT,
codModeloArma INT,
codPersonaje INT,
PRIMARY KEY (numSerie),
CONSTRAINT armas_modArmasFK FOREIGN KEY (codModeloArma) REFERENCES modArmas (codModeloArma)on delete restrict on update cascade,
CONSTRAINT armas_personajesFK FOREIGN KEY (codPersonaje) REFERENCES personajes (codPersonaje)on delete restrict on update cascade
);