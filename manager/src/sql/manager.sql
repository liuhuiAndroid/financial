/*
Navicat MySQL Data Transfer

Source Server         : 118.126.111.144
Source Server Version : 50722
Source Host           : 118.126.111.144:3306
Source Database       : manager

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-07-20 13:34:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '产品编号',
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '产品名称',
  `threshold_amount` decimal(15,3) NOT NULL COMMENT '起投金额',
  `step_amount` decimal(15,3) NOT NULL COMMENT '投资步长',
  `lock_term` smallint(6) NOT NULL COMMENT '锁定期',
  `reward_rate` decimal(5,3) NOT NULL COMMENT '收益率,0-100 百分比值',
  `status` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '状态,AUDINTING:审核中,IN_SELL:销售中,LOCKED:暂停销售,FINISHED:已结束',
  `memo` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建者',
  `update_at` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('T001', '灵活宝1号4', '10.000', '1.000', '0', '3.420', 'IN_SELL', null, '2018-07-08 22:26:35', null, '2018-07-08 22:26:35', null);
INSERT INTO `product` VALUES ('T002', '活期盈-金色人生', '10.000', '0.000', '0', '3.280', 'IN_SELL', null, '2018-07-08 22:26:36', null, '2018-07-08 22:26:36', null);
INSERT INTO `product` VALUES ('T003', '朝朝盈-聚财', '100.000', '10.000', '0', '3.860', 'IN_SELL', null, '2018-07-08 22:26:36', null, '2018-07-08 22:26:36', null);
