/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 8.0.19 : Database - todo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`todo` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `todo`;

/*Table structure for table `folder` */

DROP TABLE IF EXISTS `folder`;

CREATE TABLE `folder` (
  `folderID` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`folderID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `folder` */

insert  into `folder`(`folderID`,`name`) values 
(1,'folder 1'),
(2,'folder 2');

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `itemId` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `checked` tinyint(1) NOT NULL,
  `folderId` bigint DEFAULT NULL,
  PRIMARY KEY (`itemId`),
  KEY `fk_folderId` (`folderId`),
  CONSTRAINT `fk_folderId` FOREIGN KEY (`folderId`) REFERENCES `folder` (`folderID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `item` */

insert  into `item`(`itemId`,`name`,`checked`,`folderId`) values 
(1,'task 1',0,1),
(2,'task 2',1,1),
(3,'task 3',0,1),
(4,'other foder',0,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
