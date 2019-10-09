/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : vue

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 09/10/2019 16:40:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zs_billinfo
-- ----------------------------
DROP TABLE IF EXISTS `zs_billinfo`;
CREATE TABLE `zs_billinfo`  (
  `billid` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `billno` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '票据号码',
  `billtypeNo` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '票据种类编码',
  `billtypeName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '票据种类编码',
  `makeDate` datetime(0) NULL DEFAULT NULL COMMENT '开具日期',
  `makePlayer` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开票人',
  PRIMARY KEY (`billid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '票据信息主表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
