/*
Navicat MySQL Data Transfer

Source Server         : 118.126.111.144
Source Server Version : 50722
Source Host           : 118.126.111.144:3306
Source Database       : seller

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-07-20 13:34:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order_t
-- ----------------------------
DROP TABLE IF EXISTS `order_t`;
CREATE TABLE `order_t` (
  `order_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '订单编号',
  `chan_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '渠道编号',
  `product_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '产品编号',
  `chan_user_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '渠道用户编号',
  `order_type` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '类型,APPLY:申购,REDEEM:赎回',
  `order_status` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '状态,INIT:初始化,PROCESS:处理中,SUCESS:成功,FAIL:失败',
  `outer_order_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '外部订单编号',
  `amount` decimal(15,3) NOT NULL COMMENT '金额',
  `memo` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of order_t
-- ----------------------------
INSERT INTO `order_t` VALUES ('6d8bf1eadb3a4035a58171c6ef8217d7', '111', 'T001', '111', 'APPLY', 'SUCCESS', '1111', '10.000', 'memo', '2017-12-31 10:10:06', '2018-07-20 10:21:34');
INSERT INTO `order_t` VALUES ('c6b91ab114244ea09fd025c0de552415', 'string', 'T001', 'string', 'APPLY', 'SUCCESS', 'string', '10.000', 'string', '2017-12-31 10:34:44', '2018-07-20 10:35:44');
INSERT INTO `order_t` VALUES ('cb7e0193761e4db082be7de89599efea', 'string', 'T001', 'string', 'APPLY', 'SUCCESS', 'string', '10.000', 'string', '2018-07-20 10:34:44', '2018-07-20 11:00:41');
INSERT INTO `order_t` VALUES ('eab1dcf3477244dda2b1becea329e98e', 'string', 'T001', 'string', 'APPLY', 'SUCCESS', 'string', '10.000', 'string', '2017-12-31 10:34:44', '2018-07-20 10:35:11');
