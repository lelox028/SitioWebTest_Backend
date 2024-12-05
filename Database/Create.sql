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
(1,"Texto que se actualice segun variables de React", 1),
(2,"Links a mi github, linkedin, etc.",0);

#Read new Data
SELECT *
FROM Items;

DROP TABLE Items;