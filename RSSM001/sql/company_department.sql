/*
Navicat MySQL Data Transfer

Source Server         : farm
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : test01

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-09-27 21:43:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for company_department
-- ----------------------------
DROP TABLE IF EXISTS `company_department`;
CREATE TABLE `company_department` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `parent_id` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company_department
-- ----------------------------
INSERT INTO `company_department` VALUES ('1', 'A', '0');
INSERT INTO `company_department` VALUES ('2', 'B', '0');
INSERT INTO `company_department` VALUES ('3', 'C', '0');
INSERT INTO `company_department` VALUES ('4', 'A-1', '1');
INSERT INTO `company_department` VALUES ('5', 'A-2', '1');
INSERT INTO `company_department` VALUES ('6', 'B-1', '2');
INSERT INTO `company_department` VALUES ('7', 'A-1-1', '4');
