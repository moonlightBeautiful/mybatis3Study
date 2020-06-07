DROP TABLE IF EXISTS `t_address`;
CREATE TABLE `t_address`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `sheng` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `shi` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qu` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
insert  into `t_address`(`id`,`sheng`,`shi`,`qu`) values (1,'江苏省','苏州市','姑苏区'),(2,'江苏省','南京市','鼓楼区');


DROP TABLE IF EXISTS `t_grade`;
CREATE TABLE `t_grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gradeName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
insert  into `t_grade`(`id`,`gradeName`) values (1,'大学一年级'),(2,'大学二年级');


DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `addressId` int(11) DEFAULT NULL,
  `gradeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_t_student` (`gradeId`),
  KEY `FK_t_student2` (`addressId`),
  CONSTRAINT `FK_t_student2` FOREIGN KEY (`addressId`) REFERENCES `t_address` (`id`),
  CONSTRAINT `FK_t_student` FOREIGN KEY (`gradeId`) REFERENCES `t_grade` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
insert  into `t_student`(`id`,`name`,`age`,`addressId`,`gradeId`) values (1,'张三',10,1,1),(2,'李四',11,2,2),(3,'王五',12,2,2);


