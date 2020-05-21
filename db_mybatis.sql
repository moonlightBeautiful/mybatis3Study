/*
 Navicat Premium Data Transfer

 Source Server         : aliyun
 Source Server Type    : MySQL
 Source Server Version : 50644
 Source Host           : 47.244.180.90:3306
 Source Schema         : db_mybatis

 Target Server Type    : MySQL
 Target Server Version : 50644
 File Encoding         : 65001

 Date: 09/07/2019 08:49:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_address0301
-- ----------------------------
DROP TABLE IF EXISTS `t_address0301`;
CREATE TABLE `t_address0301`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sheng` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `shi` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qu` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_address0301
-- ----------------------------
INSERT INTO `t_address0301` VALUES (1, '江苏省', '苏州市', '姑苏区');
INSERT INTO `t_address0301` VALUES (2, '江苏省', '南京市', '鼓楼区');

-- ----------------------------
-- Table structure for t_grade0302
-- ----------------------------
DROP TABLE IF EXISTS `t_grade0302`;
CREATE TABLE `t_grade0302`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gradeName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_grade0302
-- ----------------------------
INSERT INTO `t_grade0302` VALUES (1, '大学一年级');
INSERT INTO `t_grade0302` VALUES (2, '大学二年级');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES (null, '张三', 10);
INSERT INTO `t_student` VALUES (null, '李四', 11);
INSERT INTO `t_student` VALUES (null, '王五', 12);
INSERT INTO `t_student` VALUES (null, '李四4', 12);
INSERT INTO `t_student` VALUES (null, '李四5', 12);
INSERT INTO `t_student` VALUES (null, '李四6', 12);
INSERT INTO `t_student` VALUES (null, '李四7', 12);
INSERT INTO `t_student` VALUES (null, '李四8', 12);
INSERT INTO `t_student` VALUES (null, '李四', 12);
INSERT INTO `t_student` VALUES (null, '王五', 12);

-- ----------------------------
-- Table structure for t_student0301
-- ----------------------------
DROP TABLE IF EXISTS `t_student0301`;
CREATE TABLE `t_student0301`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `addressId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `addressId`(`addressId`) USING BTREE,
  CONSTRAINT `t_student0301_ibfk_1` FOREIGN KEY (`addressId`) REFERENCES `t_address0301` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_student0301
-- ----------------------------
INSERT INTO `t_student0301` VALUES (1, '张三', 10, 1);
INSERT INTO `t_student0301` VALUES (2, '李四', 11, 2);
INSERT INTO `t_student0301` VALUES (3, '李四', 11, 2);
INSERT INTO `t_student0301` VALUES (4, '李四', 11, 2);
INSERT INTO `t_student0301` VALUES (5, '李四', 11, 2);
INSERT INTO `t_student0301` VALUES (6, '李四', 11, 2);
INSERT INTO `t_student0301` VALUES (7, '李四', 11, 2);

-- ----------------------------
-- Table structure for t_student0302
-- ----------------------------
DROP TABLE IF EXISTS `t_student0302`;
CREATE TABLE `t_student0302`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `gradeId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `addressId`(`gradeId`) USING BTREE,
  CONSTRAINT `t_student0302_ibfk_1` FOREIGN KEY (`gradeId`) REFERENCES `t_grade0302` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_student0302
-- ----------------------------
INSERT INTO `t_student0302` VALUES (1, '张三', 10, 1);
INSERT INTO `t_student0302` VALUES (2, '李四', 11, 2);
INSERT INTO `t_student0302` VALUES (3, '王五', 12, 2);

SET FOREIGN_KEY_CHECKS = 1;
