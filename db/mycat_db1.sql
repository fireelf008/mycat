/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : mycat_db1

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-11-09 08:56:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` bigint(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `age` int(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('928072310500495360', '张三', '男', '28');

-- ----------------------------
-- Table structure for tb_user_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_order`;
CREATE TABLE `tb_user_order` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `order_no` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user_order
-- ----------------------------
INSERT INTO `tb_user_order` VALUES ('928083903393173504', '928072310500495360', '123456');
INSERT INTO `tb_user_order` VALUES ('928084251897892864', '928072310500495360', '123456');
INSERT INTO `tb_user_order` VALUES ('928088424622198784', '928072310500495360', '123456');
INSERT INTO `tb_user_order` VALUES ('928088427113615360', '928072310500495360', 'abcde');
INSERT INTO `tb_user_order` VALUES ('928106504169590784', '928072310500495360', '123456111');
INSERT INTO `tb_user_order` VALUES ('928106693060071424', '928072310500495360', '123456111');
INSERT INTO `tb_user_order` VALUES ('928107798095597568', '928072310500495360', '123456222');
INSERT INTO `tb_user_order` VALUES ('928107799169339392', '928072310500495360', 'abcdebbba');
INSERT INTO `tb_user_order` VALUES ('928108111439466496', '928072310500495360', '123456333');
INSERT INTO `tb_user_order` VALUES ('928108111963754496', '928072310500495360', 'abcdefccc');
INSERT INTO `tb_user_order` VALUES ('928108807509381120', '928072310500495360', '123456333');
INSERT INTO `tb_user_order` VALUES ('928108808536985600', '928072310500495360', 'abcdefccc');
