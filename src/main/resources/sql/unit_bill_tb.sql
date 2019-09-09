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

 Date: 09/09/2019 18:17:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for unit_bill_tb
-- ----------------------------
DROP TABLE IF EXISTS `unit_bill_tb`;
CREATE TABLE `unit_bill_tb`  (
  `guid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `unitcode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单位编码（对应xt_unit）',
  `billcode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '票据种类编码（对应xt_billtype）',
  PRIMARY KEY (`guid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of unit_bill_tb
-- ----------------------------
INSERT INTO `unit_bill_tb` VALUES (1, '011', '100100');
INSERT INTO `unit_bill_tb` VALUES (2, '011', '100101');
INSERT INTO `unit_bill_tb` VALUES (3, '012', '100200');
INSERT INTO `unit_bill_tb` VALUES (4, '012', '100201');

SET FOREIGN_KEY_CHECKS = 1;
