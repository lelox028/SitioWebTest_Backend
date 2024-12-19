#create DATABASE
CREATE DATABASE `SitioWebTest` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE SitioWebTest;
#Create table
CREATE TABLE `Items` (
  `id_Items` int(11) NOT NULL,
  `name_Items` varchar(100) NOT NULL,
  `status_Items` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id_Items`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

#Insert test data
INSERT INTO `Items` (id_Items, name_Items, status_Items) VALUES
(1,'Texto que se actualice segun variables de React', 1),
(2,'Listas con checkbox', 0),
(3,'Una Database conectada.', 0),
(4,'Una foto mia (Opcional: salir presentable)', 1),
(5,'Links a mi github, linkedin, etc.', 0),
(6,'useStates', 1),
(7,'Seccion About Me', 0),
(8,'Seccion Works', 0),
(9,'CRUD checkboxes',0),
(10,'Footer con opciones de contacto',0),
(11,'Seccion/pagina Skills',0),
(12,"PopUps",0);

#Read new Data
SELECT *
FROM Items;

TRUNCATE TABLE Items;

INSERT INTO `Items` (id_Items, name_Items, status_Items) VALUES
(15,"test",1)
