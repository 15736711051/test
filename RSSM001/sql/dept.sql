/*
Navicat MySQL Data Transfer

Source Server         : farm
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : test01

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-09-27 14:48:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(11) NOT NULL auto_increment,
  `code` varchar(50) NOT NULL default '',
  `parent_code` varchar(50) default NULL COMMENT '为0时是一级部门',
  `name` varchar(50) default '',
  `remark` varchar(255) default '',
  `create_person` varchar(50) default '',
  `create_date` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '001', '0', 'A', '无', 'sam', '2019-09-27 12:38:58');
INSERT INTO `dept` VALUES ('2', '00101', '001', 'A-1', '无', 'am', '2019-09-27 12:39:03');
INSERT INTO `dept` VALUES ('3', '0010101', '00101', 'A-1-1', '无', 'sam', '2019-09-27 12:39:07');
INSERT INTO `dept` VALUES ('4', '00102', '001', 'A-2', '无', 'sam', '2019-09-27 12:39:11');
INSERT INTO `dept` VALUES ('5', '002', '0', 'B', 'wu', 'sam', '2019-09-27 12:54:13');
INSERT INTO `dept` VALUES ('6', '00201', '002', 'B-1', 'wu', 'sam', '2019-09-27 12:54:17');
INSERT INTO `dept` VALUES ('7', '0020101', '00201', 'B-1-1', 'wu', 'sam', '2019-09-27 12:54:24');
