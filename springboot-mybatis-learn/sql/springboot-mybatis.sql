/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.17-log : Database - springboot-mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`springboot-mybatis` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `springboot-mybatis`;

/*Table structure for table `t_class` */

DROP TABLE IF EXISTS `t_class`;

CREATE TABLE `t_class` (
  `id` varchar(50) NOT NULL COMMENT '班级表主键',
  `name` varchar(20) DEFAULT NULL COMMENT '班级名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_class` */

insert  into `t_class`(`id`,`name`) values ('1','一班'),('2','二班'),('3','三班'),('4','四班');

/*Table structure for table `t_student` */

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `id` varchar(50) NOT NULL COMMENT '学生表主键',
  `name` varchar(20) DEFAULT NULL COMMENT '学生姓名',
  `class_id` varchar(50) DEFAULT NULL COMMENT '学生所在的班级id',
  `teacher_id` varchar(50) DEFAULT NULL COMMENT '班主任id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_student` */

insert  into `t_student`(`id`,`name`,`class_id`,`teacher_id`) values ('1','1',NULL,NULL),('10','10',NULL,NULL),('11','11',NULL,NULL),('12','12',NULL,NULL),('13','13',NULL,NULL),('14','14',NULL,NULL),('2','2',NULL,NULL),('3','3',NULL,NULL),('4','4',NULL,NULL),('5','5',NULL,NULL),('6','6',NULL,NULL),('7','7',NULL,NULL),('8','8',NULL,NULL),('9','9',NULL,NULL);

/*Table structure for table `t_teacher` */

DROP TABLE IF EXISTS `t_teacher`;

CREATE TABLE `t_teacher` (
  `id` varchar(50) NOT NULL COMMENT '班主任id',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_teacher` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
