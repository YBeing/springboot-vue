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

 Date: 09/10/2019 16:40:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for e_bill_stock
-- ----------------------------
DROP TABLE IF EXISTS `e_bill_stock`;
CREATE TABLE `e_bill_stock`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `regicode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '行政区划编码',
  `unitcode` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '单位FS_GUID',
  `bitycode` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '票据种类编码',
  `startno` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '起始号码',
  `endno` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '结束号码',
  `sheets` bigint(10) NOT NULL COMMENT '份数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
