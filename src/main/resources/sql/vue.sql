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

 Date: 18/11/2019 17:10:43
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
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of e_bill_stock
-- ----------------------------
INSERT INTO `e_bill_stock` VALUES (1, '123456', '010', '100100', '0000000000', '0000000013', 13);
INSERT INTO `e_bill_stock` VALUES (2, '123456', '010', '100203', '0000000000', '0000000013', 13);

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of e_model
-- ----------------------------
INSERT INTO `e_model` VALUES (1, '1', '1', NULL, '2019-10-01 00:00:00', '2019-10-18 00:00:00');
INSERT INTO `e_model` VALUES (2, '2', '2', NULL, '2019-10-01 00:00:00', '2019-10-03 00:00:00');
INSERT INTO `e_model` VALUES (3, '3', '3', NULL, '2019-10-01 00:00:00', '2019-10-03 00:00:00');
INSERT INTO `e_model` VALUES (4, '', '4', NULL, '2019-10-07 00:00:00', '2019-10-19 00:00:00');
INSERT INTO `e_model` VALUES (7, '10010', '5', NULL, '2019-10-18 00:00:00', '2019-10-25 00:00:00');
INSERT INTO `e_model` VALUES (8, '100203', '8', NULL, '2019-10-18 00:00:00', '2019-10-16 00:00:00');
INSERT INTO `e_model` VALUES (9, '100203', '8', NULL, '2019-10-18 00:00:00', '2019-10-16 00:00:00');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `USER_ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `USERNAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  `PASSWORD` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `NICKNAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `TELPHONE` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `ADDRESS` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'admin', 'admin', '小明', '17550210165', '河南省');
INSERT INTO `t_user` VALUES (2, 'yizhiwazi', '123456', '小华', '15890734606', '浙江省');

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xt_billtype
-- ----------------------------
INSERT INTO `xt_billtype` VALUES (1, '100100', '陆军军方统一票据', '1', '2019-09-08 10:38:54', '2019-09-10 10:39:00');
INSERT INTO `xt_billtype` VALUES (2, '100101', '陆军军方餐厅票据', '1', '2019-09-08 10:38:54', '2019-09-10 10:39:00');
INSERT INTO `xt_billtype` VALUES (3, '100200', '海军军方统一票据', '1', '2019-09-09 10:40:20', '2019-09-11 10:40:23');
INSERT INTO `xt_billtype` VALUES (4, '100201', '海军军方军舰票据', '1', '2019-09-09 10:40:20', '2019-09-11 10:40:23');
INSERT INTO `xt_billtype` VALUES (9, '100203', 'ceshi', '1', '2019-10-14 00:00:00', '2019-10-09 00:00:00');

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

-- ----------------------------
-- Table structure for zs_billinfo
-- ----------------------------
DROP TABLE IF EXISTS `zs_billinfo`;
CREATE TABLE `zs_billinfo`  (
  `billid` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `billno` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '票据号码',
  `billtypeNo` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '票据种类编码',
  `billtypeName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '票据种类名称',
  `makeDate` datetime(0) NOT NULL COMMENT '开具日期',
  `makePlayer` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '开票人(复核人)',
  `unitcode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '执收单位',
  `payerName` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '交款人',
  `tel` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交款人手机号',
  `idcard` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交款人身份证号',
  `email` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交款人邮箱',
  `payerKind` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交款人性质',
  `totalMoney` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '总金额',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`billid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '票据信息主表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for zs_billinfodetail
-- ----------------------------
DROP TABLE IF EXISTS `zs_billinfodetail`;
CREATE TABLE `zs_billinfodetail`  (
  `guid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `p_billid` int(11) NULL DEFAULT NULL COMMENT 'zs_billinfo表的主键两表关联',
  `itemcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执收项目编码',
  `unitcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单位',
  `count` int(11) NULL DEFAULT NULL COMMENT '数量',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '标准',
  `money` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`guid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
