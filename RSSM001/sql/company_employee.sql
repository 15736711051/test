/*
Navicat MySQL Data Transfer

Source Server         : farm
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : test01

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-09-27 21:43:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for company_employee
-- ----------------------------
DROP TABLE IF EXISTS `company_employee`;
CREATE TABLE `company_employee` (
  `id` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  `age` int(11) default NULL,
  `department_id` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company_employee
-- ----------------------------
