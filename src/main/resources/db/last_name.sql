/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : db0

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 04/09/2020 15:08:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for last_name
-- ----------------------------
DROP TABLE IF EXISTS `last_name`;
CREATE TABLE `last_name`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `zh_character` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '汉字',
  `zh_pin_yin` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '拼音',
  `hk_pin_yin` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_user` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `create_datetime` datetime(0) DEFAULT NULL,
  `modify_user` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `modify_datetime` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 169 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of last_name
-- ----------------------------
INSERT INTO `last_name` VALUES (1, '百里', 'BAI LI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (2, '北堂', 'BEI TANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (3, '北野', 'BEI YE', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (4, '北宫', 'BEI GONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (5, '辟闾', 'BI LV', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (6, '淳于', 'CHUN YU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (7, '成公', 'CHENG GONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (9, '褚师', 'CHU SHI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (10, '端木', 'DUAN MU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (11, '东方', 'DONG FANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (12, '东郭', 'DONG GUO', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (13, '东野', 'DONG YE', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (14, '东门', 'DONG MEN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (15, '第五', 'DI WU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (16, '大狐', 'DA HU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (17, '段干', 'DUAN GAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (18, '段阳', 'DUAN YANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (20, '第二', 'DI ER', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (21, '东宫', 'DONG GONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (22, '公孙', 'GONG SUN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (23, '公冶', 'GONG YE', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (24, '公羊', 'GONG YANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (25, '公良', 'GONG LIANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (26, '公西', 'GONG XI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (27, '公孟', 'GONG MENG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (28, '高堂', 'GAO TANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (29, '高阳', 'GAO YANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (30, '公析', 'GONG XI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (31, '公肩', 'GONG JIAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (32, '公坚', 'GONG JIAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (33, '郭公', 'GUO GONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (34, '谷梁', 'GU LIANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (35, '毌将', 'GUAN JIANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (36, '公乘', 'GONG CHENG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (37, '毌丘', 'GUAN QIU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (38, '公户', 'GONG HU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (40, '公仪', 'GONG YI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (41, '公祖', 'GONG ZU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (42, '皇甫', 'HUANG FU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (43, '黄龙', 'HUANG LONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (44, '胡母', 'HU MU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (46, '夹谷', 'JIA GU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (47, '九方', 'JIU FANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (48, '即墨', 'JI MO', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (49, '梁丘', 'LIANG QIU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (50, '闾丘', 'LV QIU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (52, '陵尹', 'LING YIN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (54, '龙丘', 'LONG QIU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (55, '令狐', 'LING HU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (57, '南宫', 'NAN GONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (58, '南郭', 'NAN GUO', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (60, '南伯', 'NAN BO', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (62, '南门', 'NAN MEN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (63, '南野', 'NAN YE', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (64, '欧阳', 'OU YANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (65, '欧侯', 'OU HOU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (66, '濮阳', 'PU YANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (67, '青阳', 'QING YANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (68, '漆雕', 'QI DIAO', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (69, '亓官', 'QI GUAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (70, '渠丘', 'QU QIU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (71, '壤驷', 'RANG SI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (72, '上官', 'SHANG GUAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (73, '少室', 'SHAO SHI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (74, '少叔', 'SHAO SHU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (75, '司徒', 'SI TU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (76, '司马', 'SI MA', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (77, '司空', 'SI KONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (78, '司寇', 'SI KOU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (79, '士孙', 'SHI SUN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (80, '申屠', 'SHEN TU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (81, '申徒', 'SHEN TU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (82, '申鲜', 'SHEN XIAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (83, '申叔', 'SHEN SHU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (84, '夙沙', 'SU SHA', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (85, '叔先', 'SHU XIAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (86, '叔仲', 'SHU ZHONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (87, '侍其', 'SHI QI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (88, '叔孙', 'SHU SUN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (89, '澹台', 'TAN TAI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (90, '太史', 'TAI SHI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (91, '太叔', 'TAI SHU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (92, '太公', 'TAI GONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (93, '屠岸', 'TU AN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (94, '唐古', 'TANG GU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (95, '闻人', 'WEN REN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (96, '巫马', 'WU MA', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (97, '微生', 'WEI SHENG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (98, '王孙', 'WANG SUN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (99, '无庸', 'WU YONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (100, '夏侯', 'XIA HOU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (101, '西门', 'XI MEN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (102, '信平', 'XIN PING', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (103, '鲜于', 'XIAN YU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (104, '轩辕', 'XUAN YUAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (105, '相里', 'XIANG LI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (106, '新垣', 'XIN YUAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (107, '徐离', 'XU LI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (108, '羊舌', 'YANG SHE', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (109, '羊角', 'YANG JIAO', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (110, '延陵', 'YAN LING', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (111, '於陵', 'WU LING', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (112, '伊祁', 'YI QI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (113, '吾丘', 'WU QIU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (114, '乐正', 'YUE ZHENG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (115, '诸葛', 'ZHU GE', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (116, '颛孙', 'ZHUAN SUN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (117, '仲孙', 'ZHONG SUN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (118, '仲长', 'ZHONG CHANG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (119, '钟离', 'ZHONG LI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (120, '宗政', 'ZONG ZHENG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (121, '主父', 'ZHU FU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (122, '中叔', 'ZHONG SHU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (123, '左人', 'ZUO REN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (124, '左丘', 'ZUO QIU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (125, '宰父', 'ZAI FU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (128, '单于', 'CHAN YU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (129, '叱干', 'CHI GAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (130, '叱利', 'CHI LI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (131, '车非', 'CHE FEI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (132, '独孤', 'DU GU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (133, '大野', 'DA YE', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (134, '独吉', 'DU JI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (135, '达奚', 'DA XI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (136, '哥舒', 'GE SHU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (137, '赫连', 'HE LIAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (138, '呼延', 'HU YAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (139, '贺兰', 'HE LAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (141, '斛律', 'HU LV', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (143, '贺若', 'HE RUO', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (144, '夹谷', 'JIA GU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (146, '可频', 'KE PIN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (147, '慕容', 'MU RONG', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (148, '万俟', 'MO QI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (150, '纳兰', 'NA LAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (152, '仆固', 'PU GU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (153, '仆散', 'PU SAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (155, '屈突', 'QU TU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (156, '屈卢', 'QU LU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (157, '钳耳', 'QIAN ER', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (159, '索卢', 'SUO LU', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (160, '厍狄', 'SHE DI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (161, '拓跋', 'TUO BA', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (162, '同蹄', 'TONG TI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (163, '秃发', 'TU FA', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (164, '完颜', 'WAN YAN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (165, '宇文', 'YU WEN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (166, '尉迟', 'YU CHI', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (167, '耶律', 'YE LV', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');
INSERT INTO `last_name` VALUES (168, '长孙', 'ZHANG SUN', NULL, 'admin', '2020-09-01 12:00:00', 'admin', '2020-09-01 12:00:00');

SET FOREIGN_KEY_CHECKS = 1;
