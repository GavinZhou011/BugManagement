/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.5.27 : Database - bug_management
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`bug_management` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bug_management`;

/*Table structure for table `branch` */

DROP TABLE IF EXISTS `branch`;

CREATE TABLE `branch` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `branch_name` varchar(24) CHARACTER SET gb2312 NOT NULL,
  `location` varchar(32) CHARACTER SET gb2312 DEFAULT NULL,
  `function` varchar(64) CHARACTER SET gb2312 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `branch` */

insert  into `branch`(`id`,`branch_name`,`location`,`function`) values (1,'信息部','山小创业大厦3楼东区301','管理公司员工信息'),(2,'软件开发部','山小创业大厦5楼西区502','进行软件开发'),(3,'软件测试部','山小创业大厦5楼西区504','进行软件测试');

/*Table structure for table `bug` */

DROP TABLE IF EXISTS `bug`;

CREATE TABLE `bug` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `project_id` int(11) unsigned NOT NULL,
  `module_id` int(11) unsigned NOT NULL,
  `revision_id` int(11) unsigned DEFAULT NULL,
  `bug_status` varchar(24) CHARACTER SET gb2312 DEFAULT '已提交',
  `process_result` varchar(24) CHARACTER SET gb2312 DEFAULT '未解决（尚未处理）',
  `serious_level` varchar(24) CHARACTER SET gb2312 DEFAULT NULL,
  `bug_type` varchar(24) CHARACTER SET gb2312 DEFAULT NULL,
  `discovery_stage` varchar(24) CHARACTER SET gb2312 DEFAULT NULL,
  `title` varchar(100) CHARACTER SET gb2312 DEFAULT NULL,
  `description` text CHARACTER SET gb2312,
  `test_case_id` int(11) unsigned DEFAULT NULL,
  `receiver` int(11) unsigned DEFAULT NULL,
  `creator` int(11) unsigned NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `close_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_bug_module` (`module_id`),
  KEY `FK_bug` (`project_id`),
  CONSTRAINT `FK_bug` FOREIGN KEY (`project_id`) REFERENCES `project` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_bug_module` FOREIGN KEY (`module_id`) REFERENCES `module` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `bug` */

insert  into `bug`(`id`,`project_id`,`module_id`,`revision_id`,`bug_status`,`process_result`,`serious_level`,`bug_type`,`discovery_stage`,`title`,`description`,`test_case_id`,`receiver`,`creator`,`create_time`,`close_time`) values (1,1,1,NULL,'0','0','0',NULL,NULL,NULL,NULL,NULL,0,1012,'2018-05-10 00:00:00','2018-05-12 00:00:00');

/*Table structure for table `bugscreenshot` */

DROP TABLE IF EXISTS `bugscreenshot`;

CREATE TABLE `bugscreenshot` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `bug_id` int(11) unsigned NOT NULL,
  `screenshot_name` varchar(64) CHARACTER SET gb2312 DEFAULT NULL,
  `screenshot_url` varchar(64) CHARACTER SET gb2312 DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_screenshot_bug` (`bug_id`),
  CONSTRAINT `FK_screenshot_bug` FOREIGN KEY (`bug_id`) REFERENCES `bug` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bugscreenshot` */

/*Table structure for table `datadictionary` */

DROP TABLE IF EXISTS `datadictionary`;

CREATE TABLE `datadictionary` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `data_name` varchar(16) DEFAULT NULL,
  `data_key` int(2) DEFAULT NULL,
  `data_value` varchar(16) CHARACTER SET gb2312 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=latin1;

/*Data for the table `datadictionary` */

insert  into `datadictionary`(`id`,`data_name`,`data_key`,`data_value`) values (1,'process_result',0,'未解决（尚未处理）'),(2,'process_result',1,'解决（修复成功）'),(3,'process_result',2,'解决（不是缺陷）'),(4,'process_result',3,'解决（重复缺陷）'),(5,'process_result',4,'未解决（延后解决）'),(6,'process_result',5,'未解决（无法解决）'),(7,'process_result',6,'未解决（不需解决）'),(8,'process_result',7,'未解决（无法重现）'),(9,'bug_status',0,'已提交'),(10,'bug_status',1,'已修复'),(11,'bug_status',2,'已集成'),(12,'bug_status',3,'已处理'),(13,'bug_status',4,'已关闭'),(14,'bug_status',5,'重新打开'),(15,'serious_level',0,'优化'),(16,'serious_level',1,'小缺陷'),(17,'serious_level',2,'一般'),(18,'serious_level',3,'严重'),(19,'serious_level',4,'致命'),(20,'bug_type',0,'界面'),(21,'bug_type',1,'功能'),(22,'bug_type',2,'性能'),(23,'bug_type',3,'配置'),(24,'bug_type',4,'框架'),(25,'bug_type',5,'文档'),(26,'bug_type',6,'其他'),(27,'discovery_stage',0,'单元测试'),(28,'discovery_stage',1,'集成测试'),(29,'discovery_stage',2,'系统测试'),(30,'discovery_stage',3,'验收测试'),(31,'discovery_stage',4,'回归测试'),(32,'discovery_stage',5,'其他'),(33,'revision_status',0,'已分配'),(34,'revision_status',1,'修复中'),(35,'revision_status',2,'已修复'),(36,'revision_status',3,'集成中'),(37,'revision_status',4,'已集成'),(38,'revision_status',5,'待测试'),(39,'revision_status',6,'测试中'),(40,'revision_status',7,'测试完成'),(43,'role',0,'管理员'),(44,'role',1,'项目经理'),(45,'role',2,'测试员'),(46,'role',3,'程序员'),(48,'test',NULL,NULL),(49,'position',0,'保留'),(50,'position',1,'部门经理'),(51,'position',2,'产品经理'),(52,'position',3,'项目经理'),(53,'position',4,'运维开发工程师'),(54,'position',5,'框架开发工程师'),(55,'position',6,'软件开发工程师'),(56,'position',7,'软件测试工程师'),(57,'position',8,'信息管理员');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) unsigned NOT NULL,
  `staff_password` varchar(16) CHARACTER SET latin1 COLLATE latin1_bin DEFAULT NULL,
  `role` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_stafflogin` (`staff_id`),
  CONSTRAINT `FK_stafflogin` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`id`,`staff_id`,`staff_password`,`role`) values (1,3333,'sc123',0),(15,3334,NULL,NULL);

/*Table structure for table `module` */

DROP TABLE IF EXISTS `module`;

CREATE TABLE `module` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `project_id` int(11) unsigned NOT NULL,
  `module_name` char(16) CHARACTER SET gb2312 DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_module_project` (`project_id`),
  CONSTRAINT `FK_module_project` FOREIGN KEY (`project_id`) REFERENCES `project` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `module` */

insert  into `module`(`id`,`project_id`,`module_name`) values (1,1,'登陆模块');

/*Table structure for table `project` */

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `develop_branch_id` int(11) unsigned NOT NULL,
  `test_branch_id` int(11) unsigned DEFAULT NULL,
  `project_name` varchar(64) CHARACTER SET gb2312 DEFAULT NULL,
  `history_version` varchar(16) CHARACTER SET gb2312 DEFAULT NULL,
  `current_version` varchar(16) CHARACTER SET gb2312 DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_project` (`develop_branch_id`),
  CONSTRAINT `FK_project` FOREIGN KEY (`develop_branch_id`) REFERENCES `branch` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `project` */

insert  into `project`(`id`,`develop_branch_id`,`test_branch_id`,`project_name`,`history_version`,`current_version`) values (1,2,3,'缺陷管理体统','1.0','2.0');

/*Table structure for table `revision` */

DROP TABLE IF EXISTS `revision`;

CREATE TABLE `revision` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `bug_id` int(11) unsigned NOT NULL,
  `revision_status` varchar(24) CHARACTER SET gb2312 DEFAULT NULL,
  `test_result` bit(1) DEFAULT NULL,
  `description` text CHARACTER SET gb2312,
  `test_suggestion` text CHARACTER SET gb2312,
  `revise_file_url` varchar(64) CHARACTER SET gb2312 DEFAULT NULL,
  `return_times` int(2) DEFAULT NULL,
  `revise_programmer` int(11) unsigned NOT NULL,
  `integrator` int(11) unsigned DEFAULT NULL,
  `filing_person` int(11) unsigned DEFAULT NULL,
  `sender` int(11) unsigned DEFAULT NULL,
  `receiver` int(11) unsigned DEFAULT NULL,
  `tester` int(11) unsigned DEFAULT NULL,
  `creat_time` datetime DEFAULT NULL,
  `test_begin_time` datetime DEFAULT NULL,
  `test_end_time` datetime DEFAULT NULL,
  `test_duration` int(4) DEFAULT NULL,
  `revise_begin_time` datetime DEFAULT NULL,
  `revision_end_time` datetime DEFAULT NULL,
  `revise_duration` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_revision_bug` (`bug_id`),
  KEY `FK_revision_staff` (`revise_programmer`),
  CONSTRAINT `FK_revision_bug` FOREIGN KEY (`bug_id`) REFERENCES `bug` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_revision_staff` FOREIGN KEY (`revise_programmer`) REFERENCES `staff` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `revision` */

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `branch_id` int(11) unsigned NOT NULL,
  `position` int(2) DEFAULT NULL,
  `staff_name` varchar(8) CHARACTER SET gb2312 NOT NULL,
  `gender` bit(1) NOT NULL,
  `birthday` date DEFAULT NULL,
  `contact` varchar(11) DEFAULT NULL,
  `address` varchar(32) CHARACTER SET gb2312 DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_staff` (`branch_id`),
  CONSTRAINT `FK_staff` FOREIGN KEY (`branch_id`) REFERENCES `branch` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3336 DEFAULT CHARSET=latin1;

/*Data for the table `staff` */

insert  into `staff`(`id`,`branch_id`,`position`,`staff_name`,`gender`,`birthday`,`contact`,`address`) values (1012,1,NULL,'佐浩','','1988-11-08','17909098778','山东省 济南市 市中区 南辛庄西路336号'),(3333,1,1,'杉菜','','1980-08-09','13789876655','山东省 济南市 市中区 南辛庄西路336号'),(3334,1,5,'周瑟','','1993-01-01','17865654443','山东省 济南市 市中区 南辛庄西路'),(3335,1,5,'陈谷','','1990-01-01',NULL,NULL);

/*Table structure for table `staff_bug` */

DROP TABLE IF EXISTS `staff_bug`;

CREATE TABLE `staff_bug` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) unsigned NOT NULL,
  `bug_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `staff_bug` */

/*Table structure for table `testcase` */

DROP TABLE IF EXISTS `testcase`;

CREATE TABLE `testcase` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `project_id` int(11) NOT NULL,
  `module_id` int(11) unsigned NOT NULL,
  `file_name` varchar(64) CHARACTER SET gb2312 NOT NULL,
  `file_url` varchar(64) CHARACTER SET gb2312 DEFAULT NULL,
  PRIMARY KEY (`id`,`file_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `testcase` */

/*Table structure for table `updatebugjour` */

DROP TABLE IF EXISTS `updatebugjour`;

CREATE TABLE `updatebugjour` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `bug_id` int(11) unsigned NOT NULL,
  `field` varchar(24) NOT NULL,
  `history` varchar(64) CHARACTER SET gb2312 DEFAULT NULL,
  `current` varchar(64) CHARACTER SET gb2312 DEFAULT NULL,
  `note` text CHARACTER SET gb2312,
  `staff_id` int(11) unsigned NOT NULL,
  `udate_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_updatebugjour_bug` (`bug_id`),
  KEY `FK_updatebugjour` (`staff_id`),
  CONSTRAINT `FK_updatebugjour` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_updatebugjour_bug` FOREIGN KEY (`bug_id`) REFERENCES `bug` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `updatebugjour` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
