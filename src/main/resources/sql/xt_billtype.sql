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

 Date: 09/09/2019 18:17:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for xt_billtype
-- ----------------------------
DROP TABLE IF EXISTS `xt_billtype`;
CREATE TABLE `xt_billtype`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `billcode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '票据种类编码',
  `billname` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '票据种类名称',
  `isdzpj` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0是 1 否',
  `startdate` datetime(0) NULL DEFAULT NULL COMMENT '票据启用日期',
  `enddate` datetime(0) NULL DEFAULT NULL COMMENT '票据种类取消日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xt_billtype
-- ----------------------------
INSERT INTO `xt_billtype` VALUES (1, '100100', '陆军军方统一票据', '1', '2019-09-08 10:38:54', '2019-09-10 10:39:00');
INSERT INTO `xt_billtype` VALUES (2, '100101', '陆军军方餐厅票据', '1', '2019-09-08 10:38:54', '2019-09-10 10:39:00');
INSERT INTO `xt_billtype` VALUES (3, '100200', '海军军方统一票据', '1', '2019-09-09 10:40:20', '2019-09-11 10:40:23');
INSERT INTO `xt_billtype` VALUES (4, '100201', '海军军方军舰票据', '1', '2019-09-09 10:40:20', '2019-09-11 10:40:23');

SET FOREIGN_KEY_CHECKS = 1;
