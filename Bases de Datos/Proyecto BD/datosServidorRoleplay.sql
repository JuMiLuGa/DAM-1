USE ServidorRoleplay;

/* RUTA DE LOS ARCHIVOS:
C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\
*/

LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\usuariosServidorRoleplay.csv'
INTO TABLE usuarios
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(nombre, contraseña) SET codUsuario=NULL;

LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\ropaServidorRoleplay.csv'
INTO TABLE ropa
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(torso, piernas, calzado) SET vestimenta=NULL;

LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\personajesServidorRoleplay.csv'
INTO TABLE personajes
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(nombreApellidos,sexo,raza,fechaNacimiento,vestimenta,codUsuario) SET codPersonaje=NULL;

LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\propiedadesServidorRoleplay.csv'
INTO TABLE propiedades
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(tipoPropiedad,precio,aforo,codPersonaje) SET codPropiedad=NULL;

LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\trabajosServidorRoleplay.csv'
INTO TABLE trabajos
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\modCochesServidorRoleplay.csv'
INTO TABLE modcoches
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(modelo) SET codModeloCoche=NULL;

LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\vehiculosServidorRoleplay.csv'
INTO TABLE vehiculos
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\modArmasServidorRoleplay.csv'
INTO TABLE modarmas
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(modelo) SET codModeloArma=NULL;

LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\armasServidorRoleplay.csv'
INTO TABLE armas
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(codModeloArma,codPersonaje) SET numSerie=NULL;

