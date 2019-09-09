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

 Date: 09/09/2019 18:17:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for e_bill_chargeitem
-- ----------------------------
DROP TABLE IF EXISTS `e_bill_chargeitem`;
CREATE TABLE `e_bill_chargeitem`  (
  `guid` int(6) NOT NULL AUTO_INCREMENT,
  `bitycode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '票据种类编码',
  `itemcode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执收项目编码',
  PRIMARY KEY (`guid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of e_bill_chargeitem
-- ----------------------------
INSERT INTO `e_bill_chargeitem` VALUES (1, '100100', '1001');
INSERT INTO `e_bill_chargeitem` VALUES (2, '100100', '1002');
INSERT INTO `e_bill_chargeitem` VALUES (3, '100100', '1003');
INSERT INTO `e_bill_chargeitem` VALUES (4, '100101', '1004');
INSERT INTO `e_bill_chargeitem` VALUES (5, '100200', '1101');
INSERT INTO `e_bill_chargeitem` VALUES (6, '100200', '1102');
INSERT INTO `e_bill_chargeitem` VALUES (7, '100201', '1103');
INSERT INTO `e_bill_chargeitem` VALUES (8, '100201', '1104');

SET FOREIGN_KEY_CHECKS = 1;
