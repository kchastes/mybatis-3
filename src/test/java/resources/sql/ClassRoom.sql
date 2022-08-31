
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ClassRoom
-- ----------------------------
DROP TABLE IF EXISTS `ClassRoom`;
CREATE TABLE `ClassRoom`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `className` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `classTeacher` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ClassRoom
-- ----------------------------
INSERT INTO `ClassRoom` VALUES (1, '三年级', '张三');
INSERT INTO `ClassRoom` VALUES (2, '五年级', '刘备');
INSERT INTO `ClassRoom` VALUES (3, '一年级', '曹操');
INSERT INTO `ClassRoom` VALUES (4, '七年级', '关羽');

SET FOREIGN_KEY_CHECKS = 1;
