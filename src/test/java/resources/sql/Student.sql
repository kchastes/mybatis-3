SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Student
-- ----------------------------
DROP TABLE IF EXISTS `Student`;
CREATE TABLE `Student`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `userName` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `birthday` datetime(0) NULL DEFAULT NULL,
  `classId` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Student
-- ----------------------------
INSERT INTO `Student` VALUES (1, '学生甲', 18, '2022-08-30 13:39:28', 1);
INSERT INTO `Student` VALUES (2, '学生乙', 22, '2022-08-17 13:39:45', 2);
INSERT INTO `Student` VALUES (3, '学生丙', 12, '2022-08-02 13:40:03', 2);
INSERT INTO `Student` VALUES (4, '学生丁', 33, '2022-08-30 13:40:16', 4);

SET FOREIGN_KEY_CHECKS = 1;
