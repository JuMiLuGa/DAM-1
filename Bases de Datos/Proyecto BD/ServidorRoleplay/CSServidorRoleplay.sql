-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: servidorroleplay
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `armas`
--

DROP TABLE IF EXISTS `armas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `armas` (
  `numSerie` int NOT NULL AUTO_INCREMENT,
  `codModeloArma` int DEFAULT NULL,
  `codPersonaje` int DEFAULT NULL,
  PRIMARY KEY (`numSerie`),
  KEY `armas_modArmasFK` (`codModeloArma`),
  KEY `armas_personajesFK` (`codPersonaje`),
  CONSTRAINT `armas_modArmasFK` FOREIGN KEY (`codModeloArma`) REFERENCES `modarmas` (`codModeloArma`),
  CONSTRAINT `armas_personajesFK` FOREIGN KEY (`codPersonaje`) REFERENCES `personajes` (`codPersonaje`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `armas`
--

LOCK TABLES `armas` WRITE;
/*!40000 ALTER TABLE `armas` DISABLE KEYS */;
INSERT INTO `armas` VALUES (1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,6,6),(7,7,7),(8,8,8),(9,9,9),(10,10,10),(11,11,11),(12,12,12),(13,13,13),(14,14,14),(15,15,15),(16,16,16),(17,17,17),(18,18,18),(19,19,19),(20,20,20),(21,21,21),(22,22,22),(23,23,23),(24,24,24),(25,25,25),(26,26,26),(27,27,27),(28,28,28),(29,29,29),(30,30,30);
/*!40000 ALTER TABLE `armas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auditoria_personajes`
--

DROP TABLE IF EXISTS `auditoria_personajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `auditoria_personajes` (
  `idAuditoria` int NOT NULL AUTO_INCREMENT,
  `fecha` datetime DEFAULT NULL,
  `codPersonaje` int DEFAULT NULL,
  `nombreAntiguo` varchar(40) DEFAULT NULL,
  `nombreNuevo` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`idAuditoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auditoria_personajes`
--

LOCK TABLES `auditoria_personajes` WRITE;
/*!40000 ALTER TABLE `auditoria_personajes` DISABLE KEYS */;
/*!40000 ALTER TABLE `auditoria_personajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modarmas`
--

DROP TABLE IF EXISTS `modarmas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modarmas` (
  `codModeloArma` int NOT NULL AUTO_INCREMENT,
  `modelo` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codModeloArma`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modarmas`
--

LOCK TABLES `modarmas` WRITE;
/*!40000 ALTER TABLE `modarmas` DISABLE KEYS */;
INSERT INTO `modarmas` VALUES (1,'Pistola'),(2,'Escopeta'),(3,'Revolver'),(4,'Cuchillo'),(5,'Machete'),(6,'Bate de beisbol'),(7,'Hacha'),(8,'Lanzallamas'),(9,'Granada'),(10,'Arco'),(11,'Fusil de asalto'),(12,'Subfusil'),(13,'Rifle de francotirador'),(14,'Lanzacohetes'),(15,'Pistola electrica'),(16,'Lanza'),(17,'Boomerang'),(18,'Ballesta'),(19,'Espada'),(20,'Puño americano'),(21,'Garrote'),(22,'Cadena'),(23,'Bomba de humo'),(24,'Gas lacrimogeno'),(25,'Cóctel molotov'),(26,'C4'),(27,'Bomba de proximidad'),(28,'Granada de gas'),(29,'Granada aturdidora'),(30,'Mina antitanque');
/*!40000 ALTER TABLE `modarmas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modcoches`
--

DROP TABLE IF EXISTS `modcoches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modcoches` (
  `codModeloCoche` int NOT NULL AUTO_INCREMENT,
  `modelo` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codModeloCoche`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modcoches`
--

LOCK TABLES `modcoches` WRITE;
/*!40000 ALTER TABLE `modcoches` DISABLE KEYS */;
INSERT INTO `modcoches` VALUES (1,'Focus'),(2,'Fiesta'),(3,'Kuga'),(4,'EcoSport'),(5,'Mustang'),(6,'Explorer'),(7,'Edge'),(8,'Transit'),(9,'Ranger'),(10,'F-150'),(11,'F-250'),(12,'Taurus'),(13,'Escape'),(14,'Fusion'),(15,'Expedition'),(16,'C-MAX'),(17,'Mondeo'),(18,'S-MAX'),(19,'Galaxy'),(20,'Ka'),(21,'B-MAX'),(22,'Grand C-MAX'),(23,'Tourneo Connect'),(24,'Transit Connect'),(25,'Tourneo Courier'),(26,'Transit Courier'),(27,'Tourneo Custom'),(28,'Transit Custom'),(29,'Ranger Raptor'),(30,'Transit Chasis Cabina');
/*!40000 ALTER TABLE `modcoches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personajes`
--

DROP TABLE IF EXISTS `personajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personajes` (
  `codPersonaje` int NOT NULL AUTO_INCREMENT,
  `nombreApellidos` varchar(40) NOT NULL,
  `sexo` enum('M','F') DEFAULT 'M',
  `raza` varchar(15) DEFAULT NULL,
  `fechaNacimiento` date NOT NULL,
  `vestimenta` int NOT NULL,
  `codUsuario` int DEFAULT NULL,
  PRIMARY KEY (`codPersonaje`),
  KEY `personajes_usuariosFK` (`codUsuario`),
  KEY `personajes_ropaFK` (`vestimenta`),
  CONSTRAINT `personajes_ropaFK` FOREIGN KEY (`vestimenta`) REFERENCES `ropa` (`vestimenta`),
  CONSTRAINT `personajes_usuariosFK` FOREIGN KEY (`codUsuario`) REFERENCES `usuarios` (`codUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personajes`
--

LOCK TABLES `personajes` WRITE;
/*!40000 ALTER TABLE `personajes` DISABLE KEYS */;
INSERT INTO `personajes` VALUES (1,'John Smith','M','Humano','1990-12-01',1,1),(2,'Alice Johnson','F','Elfo','1985-06-24',2,2),(3,'Hank Williams','M','Enano','1978-03-15',3,3),(4,'Aria Stark','F','Medioelfo','1996-09-23',4,4),(5,'Gandalf Grey','M','Mago','1955-01-01',5,5),(6,'Legolas Greenleaf','M','Elfo','1992-02-14',6,6),(7,'Tyrion Lannister','M','Lannister','1982-04-24',7,7),(8,'Daenerys Targaryen','F','Targaryen','1986-10-23',8,8),(9,'Bilbo Baggins','M','Hobbit','1950-09-22',9,9),(10,'Frodo Baggins','M','Hobbit','1951-08-04',10,10),(11,'Samwise Gamgee','M','Hobbit','1952-05-01',11,11),(12,'Gimli','M','Enano','1953-12-29',12,12),(13,'Eowyn of Rohan','F','Humano','1954-10-08',13,13),(14,'Meriadoc Brandybuck','M','Hobbit','1956-12-16',14,14),(15,'Peregrin Took','M','Hobbit','1957-03-03',15,15),(16,'Thorin Oakenshield','M','Enano','1958-05-21',16,16),(17,'Bard the Bowman','M','Humano','1959-06-02',17,17),(18,'Prince Imrahil','M','Humano','1960-12-21',18,18),(19,'Galadriel','F','Elfo','1961-01-01',19,19),(20,'Arwen Undomiel','F','Elfo','1962-01-01',20,20),(21,'Sauron','M','Maia','1970-01-01',21,21),(22,'Witch-King of Angmar','M','Nazgul','1960-01-01',22,22),(23,'Boromir','M','Humano','1961-02-23',23,23),(24,'Faramir','M','Humano','1962-05-07',24,24),(25,'Denethor II','M','Humano','1963-04-02',25,25),(26,'Eomer','M','Humano','1964-03-06',26,26),(27,'Eowyn','F','Humano','1965-10-12',27,27),(28,'Treebeard','M','Ent','1978-10-12',28,28),(29,'Gollum','M','Hobbit','1966-08-23',29,29),(30,'Legoland Castle','M','Toy','2003-10-12',30,30);
/*!40000 ALTER TABLE `personajes` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `tr_auditoria_personajes` AFTER UPDATE ON `personajes` FOR EACH ROW BEGIN
    DECLARE fecha_actual DATETIME;
    SET fecha_actual = NOW();
    
    INSERT INTO auditoria_personajes (fecha, codPersonaje, nombreAntiguo, nombreNuevo)
    VALUES (fecha_actual, OLD.codPersonaje, OLD.nombreApellidos, NEW.nombreApellidos);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `propiedades`
--

DROP TABLE IF EXISTS `propiedades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `propiedades` (
  `codPropiedad` int NOT NULL AUTO_INCREMENT,
  `tipoPropiedad` enum('CASA','GARAJE','APARTAMENTO') NOT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  `aforo` int DEFAULT NULL,
  `codPersonaje` int DEFAULT NULL,
  PRIMARY KEY (`codPropiedad`),
  KEY `propiedades_personajesFK` (`codPersonaje`),
  CONSTRAINT `propiedades_personajesFK` FOREIGN KEY (`codPersonaje`) REFERENCES `personajes` (`codPersonaje`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propiedades`
--

LOCK TABLES `propiedades` WRITE;
/*!40000 ALTER TABLE `propiedades` DISABLE KEYS */;
INSERT INTO `propiedades` VALUES (1,'CASA',120000.00,8,1),(2,'GARAJE',25000.50,2,2),(3,'APARTAMENTO',75000.00,6,3),(4,'CASA',220000.00,10,4),(5,'GARAJE',15000.00,1,5),(6,'GARAJE',20000.00,2,6),(7,'CASA',180000.00,7,7),(8,'CASA',320000.00,12,8),(9,'APARTAMENTO',128500.00,4,9),(10,'CASA',250000.00,9,10),(11,'GARAJE',5000.00,1,11),(12,'APARTAMENTO',94000.00,3,12),(13,'APARTAMENTO',110000.00,5,13),(14,'CASA',175000.00,8,14),(15,'GARAJE',18000.00,2,15),(16,'APARTAMENTO',79900.00,5,16),(17,'CASA',420000.00,14,17),(18,'CASA',290000.00,12,18),(19,'GARAJE',9500.00,2,19),(20,'APARTAMENTO',63000.00,3,20),(21,'CASA',480000.00,15,21),(22,'GARAJE',8000.00,1,22),(23,'APARTAMENTO',89900.00,4,23),(24,'CASA',570000.00,16,24),(25,'CASA',260000.00,10,25),(26,'GARAJE',6000.00,1,26),(27,'APARTAMENTO',115000.00,4,27),(28,'APARTAMENTO',91000.00,3,28),(29,'CASA',200000.00,9,29),(30,'GARAJE',3500.00,1,30),(31,'CASA',1300000.00,10,2),(32,'APARTAMENTO',650000.99,4,10),(33,'APARTAMENTO',100000.50,3,1),(34,'CASA',750000.87,8,14),(35,'APARTAMENTO',85000.00,1,25),(36,'APARTAMENTO',79000.55,2,15),(37,'GARAJE',15000.00,1,17),(38,'CASA',280000.00,6,7),(39,'GARAJE',5000.00,1,19),(40,'GARAJE',16000.00,2,23),(41,'CASA',575000.45,7,29),(42,'GARAJE',12000.00,2,24),(43,'APARTAMENTO',45000.00,1,30),(44,'CASA',950000.00,11,16),(45,'CASA',320500.00,5,27),(46,'CASA',286000.00,5,18),(47,'CASA',480000.00,9,13),(48,'CASA',556900.00,10,12),(49,'CASA',390000.00,5,26),(50,'CASA',1250000.00,13,4),(51,'APARTAMENTO',59877.00,2,11),(52,'APARTAMENTO',178000.45,3,3),(53,'APARTAMENTO',123456.78,4,8),(54,'GARAJE',10000.00,1,6),(55,'APARTAMENTO',59400.00,2,20),(56,'CASA',725000.00,8,21),(57,'CASA',990000.00,11,22),(58,'APARTAMENTO',236000.00,4,28),(59,'GARAJE',8999.99,1,9);
/*!40000 ALTER TABLE `propiedades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ropa`
--

DROP TABLE IF EXISTS `ropa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ropa` (
  `vestimenta` int NOT NULL AUTO_INCREMENT,
  `torso` varchar(20) DEFAULT NULL,
  `piernas` varchar(20) DEFAULT NULL,
  `calzado` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`vestimenta`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ropa`
--

LOCK TABLES `ropa` WRITE;
/*!40000 ALTER TABLE `ropa` DISABLE KEYS */;
INSERT INTO `ropa` VALUES (1,'camiseta','pantalón corto','zapatillas'),(2,'sudadera','pantalón largo','botas'),(3,'camisa','pantalón corto','sandalias'),(4,'chaqueta','vaqueros','botines'),(5,'camiseta','leggins','zapatillas'),(6,'polo','pantalón corto','chanclas'),(7,'jersey','pantalón largo','botas'),(8,'camisa','pantalón corto','zapatillas'),(9,'chaqueta','pantalón corto','sandalias'),(10,'camiseta','vaqueros','botines'),(11,'sudadera','leggins','zapatillas'),(12,'camisa','pantalón corto','chanclas'),(13,'chaqueta','pantalón largo','botas'),(14,'polo','pantalón corto','zapatillas'),(15,'jersey','vaqueros','sandalias'),(16,'camiseta','leggins','botines'),(17,'sudadera','pantalón corto','zapatillas'),(18,'camisa','pantalón largo','chanclas'),(19,'chaqueta','pantalón corto','botas'),(20,'camiseta','pantalón corto','sandalias'),(21,'polo','vaqueros','zapatillas'),(22,'jersey','leggins','botines'),(23,'camisa','pantalón largo','zapatillas'),(24,'chaqueta','pantalón corto','chanclas'),(25,'camiseta','vaqueros','botas'),(26,'sudadera','leggins','sandalias'),(27,'polo','pantalón corto','zapatillas'),(28,'jersey','pantalón largo','chanclas'),(29,'camiseta','pantalón corto','botines'),(30,'chaqueta','vaqueros','zapatillas');
/*!40000 ALTER TABLE `ropa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabajos`
--

DROP TABLE IF EXISTS `trabajos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trabajos` (
  `nombreTrabajo` varchar(20) NOT NULL,
  `salario` decimal(10,2) DEFAULT NULL,
  `codPersonaje` int DEFAULT NULL,
  PRIMARY KEY (`nombreTrabajo`),
  KEY `trabajos_personajesFK` (`codPersonaje`),
  CONSTRAINT `trabajos_personajesFK` FOREIGN KEY (`codPersonaje`) REFERENCES `personajes` (`codPersonaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabajos`
--

LOCK TABLES `trabajos` WRITE;
/*!40000 ALTER TABLE `trabajos` DISABLE KEYS */;
INSERT INTO `trabajos` VALUES ('Abogado',6000.00,3),('Actor',6000.00,10),('Arquitecto',5500.00,7),('Artista plástico',3500.00,9),('Bombero',5500.00,15),('Chef',6000.00,23),('Cocinero',3000.00,16),('Contador',4500.00,6),('Dentista',7500.00,24),('Diseñador gráfico',4000.00,2),('Diseñador interiores',5000.00,29),('Economista',6000.00,26),('Electricista',3500.00,19),('Enfermero',4000.00,17),('Entrenador',3500.00,22),('Escritor',3000.00,8),('Informático',5000.00,21),('Ingeniero',7000.00,5),('Mecanico',6500.00,28),('Médico',8000.00,4),('Modelo',4000.00,11),('Músico',3500.00,30),('Periodista',4500.00,18),('Plomero',3000.00,20),('Policía',4500.00,14),('Profesor',5000.00,13),('Programador',5000.00,1),('Programador web',5500.00,27),('Psicólogo',5500.00,12),('Veterinario',5500.00,25);
/*!40000 ALTER TABLE `trabajos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `codUsuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(15) NOT NULL,
  `contraseña` varchar(20) NOT NULL,
  PRIMARY KEY (`codUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Ana','contraseña1'),(2,'Juan','contraseña2'),(3,'María','contraseña3'),(4,'Carlos','contraseña4'),(5,'Laura','contraseña5'),(6,'Pedro','contraseña6'),(7,'Lucía','contraseña7'),(8,'Javier','contraseña8'),(9,'Sofía','contraseña9'),(10,'Diego','contraseña10'),(11,'Carolina','contraseña11'),(12,'Pablo','contraseña12'),(13,'Marta','contraseña13'),(14,'Luis','contraseña14'),(15,'Carmen','contraseña15'),(16,'Fernando','contraseña16'),(17,'Isabel','contraseña17'),(18,'Manuel','contraseña18'),(19,'Elena','contraseña19'),(20,'Ricardo','contraseña20'),(21,'Silvia','contraseña21'),(22,'Oscar','contraseña22'),(23,'Ana María','contraseña23'),(24,'Gabriel','contraseña24'),(25,'Marcela','contraseña25'),(26,'Ramiro','contraseña26'),(27,'Verónica','contraseña27'),(28,'Lorena','contraseña28'),(29,'Sebastián','contraseña29'),(30,'Natalia','contraseña30');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculos` (
  `matricula` varchar(7) NOT NULL,
  `codModeloCoche` int DEFAULT NULL,
  `codPersonaje` int DEFAULT NULL,
  PRIMARY KEY (`matricula`),
  KEY `vehiculos_modCochesFK` (`codModeloCoche`),
  KEY `vehiculos_personajesFK` (`codPersonaje`),
  CONSTRAINT `vehiculos_modCochesFK` FOREIGN KEY (`codModeloCoche`) REFERENCES `modcoches` (`codModeloCoche`),
  CONSTRAINT `vehiculos_personajesFK` FOREIGN KEY (`codPersonaje`) REFERENCES `personajes` (`codPersonaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` VALUES ('1234ABC',1,1),('1234EFG',11,11),('1234IJK',21,21),('1234PQR',6,6),('1234TUV',16,16),('1234XYZ',26,26),('3456CDE',19,19),('3456GHI',29,29),('3456JKL',4,4),('3456NOP',14,14),('3456RST',24,24),('3456YZA',9,9),('5678ABC',27,27),('5678DEF',2,2),('5678HIJ',12,12),('5678LMN',22,22),('5678STU',7,7),('5678WXY',17,17),('7890BCD',10,10),('7890FGH',20,20),('7890JKL',30,30),('7890MNO',5,5),('7890QRS',15,15),('7890UVW',25,25),('9012DEF',28,28),('9012GHI',3,3),('9012KLM',13,13),('9012OPQ',23,23),('9012VWX',8,8),('9012ZAB',18,18);
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vista_personajes_propiedades`
--

DROP TABLE IF EXISTS `vista_personajes_propiedades`;
/*!50001 DROP VIEW IF EXISTS `vista_personajes_propiedades`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_personajes_propiedades` AS SELECT 
 1 AS `nombreApellidos`,
 1 AS `codPropiedad`,
 1 AS `tipoPropiedad`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vista_personajes_propiedades`
--

/*!50001 DROP VIEW IF EXISTS `vista_personajes_propiedades`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_personajes_propiedades` AS select `p`.`nombreApellidos` AS `nombreApellidos`,`pr`.`codPropiedad` AS `codPropiedad`,`pr`.`tipoPropiedad` AS `tipoPropiedad` from (`personajes` `p` left join `propiedades` `pr` on((`p`.`codPersonaje` = `pr`.`codPersonaje`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-25 23:25:02
