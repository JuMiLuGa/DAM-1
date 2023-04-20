DROP DATABASE IF EXISTS `ligaACB`;
CREATE SCHEMA `ligaACB`;
USE `ligaACB` ;


-- -----------------------------------------------------
-- Table `liga`.`equipo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ligaACB`.`equipos` (
  `idEquipo` INT(4) AUTO_INCREMENT PRIMARY KEY,
  `nombreEquipo` VARCHAR(45) NOT NULL ,
  `ciudad` VARCHAR(25) NOT NULL ,
  `webOficial` VARCHAR(100),
  `puntos` INT(3) NOT NULL);

-- -----------------------------------------------------
-- Table `liga`.`partido`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ligaACB`.`partidos` (
  `eLocal` INT(4) NOT NULL ,
  `eVisitante` INT(4) NOT NULL ,
  `resultado` VARCHAR(10) NOT NULL ,
  `fecha` DATE NOT NULL ,
  `arbitro` INT(3) NOT NULL ,

  PRIMARY KEY (`eLocal`, `eVisitante`) ,

  CONSTRAINT `fk_eLocal`
    FOREIGN KEY (`eLocal`)
    REFERENCES `ligaACB`.`equipos` (`idEquipo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

  CONSTRAINT `fk_eVisitante`
    FOREIGN KEY (`eVisitante`)
    REFERENCES `ligaACB`.`equipos` (`idEquipo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);



-- -----------------------------------------------------
-- Table `liga`.`jugador`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ligaACB`.`jugadores` (
  `idJugador` INT(4) AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL ,
  `apellido` VARCHAR(20) NOT NULL ,
  `puesto` SET('Escolta', 'Pivot', 'Alero','Base') NOT NULL ,
  `idCapitan` INT(4) NOT NULL ,
  `fechaAlta` DATE NOT NULL ,
  `salario` DECIMAL(8,2) NOT NULL ,
  `idEquipo` INT(4),
  `altura` DECIMAL(3,2),

  PRIMARY KEY (`idJugador`),

  CONSTRAINT `fk_idEquipo`
    FOREIGN KEY (`idEquipo` )
    REFERENCES `ligaACB`.`equipos` (`idEquipo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,

  CONSTRAINT `fk_idCapitan`
    FOREIGN KEY (`idCapitan` )
    REFERENCES `ligaACB`.`jugadores` (`idJugador` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- CARGA DE DATOS
LOAD DATA INFILE "C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\equipos.csv"
REPLACE
INTO TABLE equipos
FIELDS TERMINATED BY ',' /*valor por defecto*/
ENCLOSED BY '"'
-- LINES TERMINATED BY '\n'
IGNORE 1 LINES;


-- LOAD DATA LOCAL INFILE "C:\\Users\\wadmin\\Documents\\ligaACB\\jugadores.csv"
LOAD DATA INFILE "C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\jugadores.csv"
REPLACE
INTO TABLE jugadores
FIELDS TERMINATED BY ',' /*valor por defecto*/
ENCLOSED BY '"'
-- LINES TERMINATED BY '\n'
IGNORE 1 LINES;



-- LOAD DATA LOCAL INFILE "C:\\Users\\wadmin\\Documents\\ligaACB\\partidos.csv"
LOAD DATA  INFILE "C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\partidos.csv"
REPLACE
INTO TABLE partidos
FIELDS TERMINATED BY ',' /*valor por defecto*/
OPTIONALLY ENCLOSED BY '"'
-- LINES TERMINATED BY '\r\n'
 IGNORE 1 LINES;
