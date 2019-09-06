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

 Date: 06/09/2019 15:16:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for xt_unit
-- ----------------------------
DROP TABLE IF EXISTS `xt_unit`;
CREATE TABLE `xt_unit`  (
  `guid` int(6) NOT NULL AUTO_INCREMENT,
  `unitcode` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单位编码',
  `unitname` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单位名称',
  `pid` int(6) NULL DEFAULT NULL COMMENT '父级单位id',
  PRIMARY KEY (`guid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xt_unit
-- ----------------------------
INSERT INTO `xt_unit` VALUES (1, '010', '国防部', 0);
INSERT INTO `xt_unit` VALUES (2, '011', '陆军', 1);
INSERT INTO `xt_unit` VALUES (3, '012', '海军', 1);
INSERT INTO `xt_unit` VALUES (4, '013', '空军', 1);
INSERT INTO `xt_unit` VALUES (5, '020', '外交部', 0);
INSERT INTO `xt_unit` VALUES (6, '021', '对日外交', 5);
INSERT INTO `xt_unit` VALUES (7, '022', '对美外交', 5);
INSERT INTO `xt_unit` VALUES (8, '023', '对俄外交', 5);

SET FOREIGN_KEY_CHECKS = 1;
