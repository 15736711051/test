/*
Navicat MySQL Data Transfer

Source Server         : farm
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : test01

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-09-27 14:48:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(21) NOT NULL auto_increment,
  `name` varchar(50) default '',
  `age` int(11) default NULL,
  `phone` varchar(50) default NULL,
  `dept_code` varchar(50) default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'zhang3', '19', '15737723625', '0010101');
INSERT INTO `employee` VALUES ('2', 'lisi', '20', '15762512651', '00101');
INSERT INTO `employee` VALUES ('3', 'lisi', '20', '15762512651', '00101');
