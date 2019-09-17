/*
 Navicat Premium Data Transfer

 Source Server         : TencentCloud
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : 129.204.21.11:3306
 Source Schema         : vue

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 17/09/2019 13:37:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for e_model
-- ----------------------------
DROP TABLE IF EXISTS `e_model`;
CREATE TABLE `e_model`  (
  `modelid` int(6) NOT NULL AUTO_INCREMENT,
  `bitycode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '票据种类编码',
  `modelversion` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '模板版本号',
  `modelUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上传到服务器上的模板的路径',
  `modelStartDate` datetime(0) NULL DEFAULT NULL COMMENT '模板起止有效期',
  `modelEndDate` datetime(0) NULL DEFAULT NULL COMMENT '模板终止有效期',
  PRIMARY KEY (`modelid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
