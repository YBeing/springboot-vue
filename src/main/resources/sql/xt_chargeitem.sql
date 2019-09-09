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

 Date: 09/09/2019 18:16:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for xt_chargeitem
-- ----------------------------
DROP TABLE IF EXISTS `xt_chargeitem`;
CREATE TABLE `xt_chargeitem`  (
  `guid` int(6) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `itemcode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执收项目编码',
  `itemname` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执收项目名称',
  PRIMARY KEY (`guid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xt_chargeitem
-- ----------------------------
INSERT INTO `xt_chargeitem` VALUES (1, '1001', '陆军军火开销');
INSERT INTO `xt_chargeitem` VALUES (2, '1002', '陆军人力开销');
INSERT INTO `xt_chargeitem` VALUES (3, '1003', '陆军军饷开销');
INSERT INTO `xt_chargeitem` VALUES (4, '1004', '陆军餐厅食材开销');
INSERT INTO `xt_chargeitem` VALUES (5, '1101', '海军军火开销');
INSERT INTO `xt_chargeitem` VALUES (6, '1102', '海军人力开销');
INSERT INTO `xt_chargeitem` VALUES (7, '1103', '海军军饷开销');
INSERT INTO `xt_chargeitem` VALUES (8, '1104', '海军餐厅食材开销');

SET FOREIGN_KEY_CHECKS = 1;
