/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : systemadmin

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-10-23 22:18:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_dept`
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '上级部门ID，一级部门为0',
  `name` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `del_flag` tinyint(4) DEFAULT '0' COMMENT '是否删除  -1：已删除  0：正常',
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='部门管理';

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept` VALUES ('6', '0', '研发部', '1', '1');
INSERT INTO `sys_dept` VALUES ('7', '6', '研發一部', '1', '1');
INSERT INTO `sys_dept` VALUES ('8', '6', '研发二部', '2', '1');
INSERT INTO `sys_dept` VALUES ('9', '0', '销售部', '2', '1');
INSERT INTO `sys_dept` VALUES ('10', '9', '销售一部', '1', '1');
INSERT INTO `sys_dept` VALUES ('11', '0', '产品部', '3', '1');
INSERT INTO `sys_dept` VALUES ('12', '11', '产品一部', '1', '1');
INSERT INTO `sys_dept` VALUES ('13', '0', '测试部', '5', '1');
INSERT INTO `sys_dept` VALUES ('14', '13', '测试一部', '1', '1');
INSERT INTO `sys_dept` VALUES ('15', '13', '测试二部', '2', '1');

-- ----------------------------
-- Table structure for `sys_dict`
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict` (
  `id` bigint(64) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '标签名',
  `value` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '数据值',
  `type` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '类型',
  `description` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '描述',
  `sort` decimal(10,0) DEFAULT NULL COMMENT '排序（升序）',
  `parent_id` bigint(64) DEFAULT '0' COMMENT '父级编号',
  `create_by` int(64) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(64) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) COLLATE utf8_bin DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`),
  KEY `sys_dict_value` (`value`),
  KEY `sys_dict_label` (`name`),
  KEY `sys_dict_del_flag` (`del_flag`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='字典表';

-- ----------------------------
-- Records of sys_dict
-- ----------------------------
INSERT INTO `sys_dict` VALUES ('1', '正常', '0', 'del_flag', '删除标记', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('3', '显示', '1', 'show_hide', '显示/隐藏', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('4', '隐藏', '0', 'show_hide', '显示/隐藏', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('5', '是', '1', 'yes_no', '是/否', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('6', '否', '0', 'yes_no', '是/否', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('7', '红色', 'red', 'color', '颜色值', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('8', '绿色', 'green', 'color', '颜色值', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('9', '蓝色', 'blue', 'color', '颜色值', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('10', '黄色', 'yellow', 'color', '颜色值', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('11', '橙色', 'orange', 'color', '颜色值', '50', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('12', '默认主题', 'default', 'theme', '主题方案', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('13', '天蓝主题', 'cerulean', 'theme', '主题方案', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('14', '橙色主题', 'readable', 'theme', '主题方案', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('15', '红色主题', 'united', 'theme', '主题方案', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('16', 'Flat主题', 'flat', 'theme', '主题方案', '60', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('17', '国家', '1', 'sys_area_type', '区域类型', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('18', '省份、直辖市', '2', 'sys_area_type', '区域类型', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('19', '地市', '3', 'sys_area_type', '区域类型', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('20', '区县', '4', 'sys_area_type', '区域类型', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('21', '公司', '1', 'sys_office_type', '机构类型', '60', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('22', '部门', '2', 'sys_office_type', '机构类型', '70', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('23', '小组', '3', 'sys_office_type', '机构类型', '80', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('24', '其它', '4', 'sys_office_type', '机构类型', '90', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('25', '综合部', '1', 'sys_office_common', '快捷通用部门', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('26', '开发部', '2', 'sys_office_common', '快捷通用部门', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('27', '人力部', '3', 'sys_office_common', '快捷通用部门', '50', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('28', '一级', '1', 'sys_office_grade', '机构等级', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('29', '二级', '2', 'sys_office_grade', '机构等级', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('30', '三级', '3', 'sys_office_grade', '机构等级', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('31', '四级', '4', 'sys_office_grade', '机构等级', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('32', '所有数据', '1', 'sys_data_scope', '数据范围', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('33', '所在公司及以下数据', '2', 'sys_data_scope', '数据范围', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('34', '所在公司数据', '3', 'sys_data_scope', '数据范围', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('35', '所在部门及以下数据', '4', 'sys_data_scope', '数据范围', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('36', '所在部门数据', '5', 'sys_data_scope', '数据范围', '50', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('37', '仅本人数据', '8', 'sys_data_scope', '数据范围', '90', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('38', '按明细设置', '9', 'sys_data_scope', '数据范围', '100', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('39', '系统管理', '1', 'sys_user_type', '用户类型', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('40', '部门经理', '2', 'sys_user_type', '用户类型', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('41', '普通用户', '3', 'sys_user_type', '用户类型', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('42', '基础主题', 'basic', 'cms_theme', '站点主题', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('43', '蓝色主题', 'blue', 'cms_theme', '站点主题', '20', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('44', '红色主题', 'red', 'cms_theme', '站点主题', '30', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('45', '文章模型', 'article', 'cms_module', '栏目模型', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('46', '图片模型', 'picture', 'cms_module', '栏目模型', '20', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('47', '下载模型', 'download', 'cms_module', '栏目模型', '30', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('48', '链接模型', 'link', 'cms_module', '栏目模型', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('49', '专题模型', 'special', 'cms_module', '栏目模型', '50', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('50', '默认展现方式', '0', 'cms_show_modes', '展现方式', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('51', '首栏目内容列表', '1', 'cms_show_modes', '展现方式', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('52', '栏目第一条内容', '2', 'cms_show_modes', '展现方式', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('53', '发布', '0', 'cms_del_flag', '内容状态', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('54', '删除', '1', 'cms_del_flag', '内容状态', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('55', '审核', '2', 'cms_del_flag', '内容状态', '15', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('56', '首页焦点图', '1', 'cms_posid', '推荐位', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('57', '栏目页文章推荐', '2', 'cms_posid', '推荐位', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('58', '咨询', '1', 'cms_guestbook', '留言板分类', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('59', '建议', '2', 'cms_guestbook', '留言板分类', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('60', '投诉', '3', 'cms_guestbook', '留言板分类', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('61', '其它', '4', 'cms_guestbook', '留言板分类', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('62', '公休', '1', 'oa_leave_type', '请假类型', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('63', '病假', '2', 'oa_leave_type', '请假类型', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('64', '事假', '3', 'oa_leave_type', '请假类型', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('65', '调休', '4', 'oa_leave_type', '请假类型', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('66', '婚假', '5', 'oa_leave_type', '请假类型', '60', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('67', '接入日志', '1', 'sys_log_type', '日志类型', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('68', '异常日志', '2', 'sys_log_type', '日志类型', '40', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('69', '请假流程', 'leave', 'act_type', '流程类型', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('70', '审批测试流程', 'test_audit', 'act_type', '流程类型', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('71', '分类1', '1', 'act_category', '流程分类', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('72', '分类2', '2', 'act_category', '流程分类', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('73', '增删改查', 'crud', 'gen_category', '代码生成分类', '10', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('74', '增删改查（包含从表）', 'crud_many', 'gen_category', '代码生成分类', '20', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('75', '树结构', 'tree', 'gen_category', '代码生成分类', '30', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('76', '=', '=', 'gen_query_type', '查询方式', '10', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('77', '!=', '!=', 'gen_query_type', '查询方式', '20', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('78', '&gt;', '&gt;', 'gen_query_type', '查询方式', '30', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('79', '&lt;', '&lt;', 'gen_query_type', '查询方式', '40', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('80', 'Between', 'between', 'gen_query_type', '查询方式', '50', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('81', 'Like', 'like', 'gen_query_type', '查询方式', '60', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('82', 'Left Like', 'left_like', 'gen_query_type', '查询方式', '70', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('83', 'Right Like', 'right_like', 'gen_query_type', '查询方式', '80', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('84', '文本框', 'input', 'gen_show_type', '字段生成方案', '10', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('85', '文本域', 'textarea', 'gen_show_type', '字段生成方案', '20', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('86', '下拉框', 'select', 'gen_show_type', '字段生成方案', '30', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('87', '复选框', 'checkbox', 'gen_show_type', '字段生成方案', '40', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('88', '单选框', 'radiobox', 'gen_show_type', '字段生成方案', '50', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('89', '日期选择', 'dateselect', 'gen_show_type', '字段生成方案', '60', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('90', '人员选择', 'userselect', 'gen_show_type', '字段生成方案', '70', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('91', '部门选择', 'officeselect', 'gen_show_type', '字段生成方案', '80', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('92', '区域选择', 'areaselect', 'gen_show_type', '字段生成方案', '90', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('93', 'String', 'String', 'gen_java_type', 'Java类型', '10', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('94', 'Long', 'Long', 'gen_java_type', 'Java类型', '20', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('95', '仅持久层', 'dao', 'gen_category', '代码生成分类', '40', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('96', '男', '1', 'sex', '性别', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('97', '女', '2', 'sex', '性别', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('98', 'Integer', 'Integer', 'gen_java_type', 'Java类型', '30', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('99', 'Double', 'Double', 'gen_java_type', 'Java类型', '40', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('100', 'Date', 'java.util.Date', 'gen_java_type', 'Java类型', '50', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('104', 'Custom', 'Custom', 'gen_java_type', 'Java类型', '90', '0', '1', null, '1', null, null, '1');
INSERT INTO `sys_dict` VALUES ('105', '会议通告', '1', 'oa_notify_type', '通知通告类型', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('106', '奖惩通告', '2', 'oa_notify_type', '通知通告类型', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('107', '活动通告', '3', 'oa_notify_type', '通知通告类型', '30', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('108', '草稿', '0', 'oa_notify_status', '通知通告状态', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('109', '发布', '1', 'oa_notify_status', '通知通告状态', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('110', '未读', '0', 'oa_notify_read', '通知通告状态', '10', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('111', '已读', '1', 'oa_notify_read', '通知通告状态', '20', '0', '1', null, '1', null, null, '0');
INSERT INTO `sys_dict` VALUES ('112', '草稿', '0', 'oa_notify_status', '通知通告状态', '10', '0', '1', null, '1', null, '', '0');
INSERT INTO `sys_dict` VALUES ('113', '删除', '0', 'del_flag', '删除标记', null, null, null, null, null, null, '', '');
INSERT INTO `sys_dict` VALUES ('118', '关于', 'about', 'blog_type', '博客类型', null, null, null, null, null, null, '全url是:/blog/open/page/about', '');
INSERT INTO `sys_dict` VALUES ('119', '交流', 'communication', 'blog_type', '博客类型', null, null, null, null, null, null, '', '');
INSERT INTO `sys_dict` VALUES ('120', '文章', 'article', 'blog_type', '博客类型', null, null, null, null, null, null, '', '');

-- ----------------------------
-- Table structure for `sys_file`
-- ----------------------------
DROP TABLE IF EXISTS `sys_file`;
CREATE TABLE `sys_file` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL COMMENT '文件类型',
  `url` varchar(200) DEFAULT NULL COMMENT 'URL地址',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=utf8 COMMENT='文件上传';

-- ----------------------------
-- Records of sys_file
-- ----------------------------
INSERT INTO `sys_file` VALUES ('110', '0', '/files/d64a62e3-6821-48f1-bac6-a1b9945f4afb.jpg', '2017-10-14 16:20:17');
INSERT INTO `sys_file` VALUES ('111', '0', '/files/aa2c3dc6-495f-48cc-8e12-446eceb2535e.jpg', '2017-10-14 16:20:21');
INSERT INTO `sys_file` VALUES ('114', '0', '/files/84c29777-11bc-44b9-818d-859f2d04d417.jpg', '2017-10-20 09:27:18');
INSERT INTO `sys_file` VALUES ('116', '0', '/files/7e38b411-1c72-413a-b9e7-2a367f111856.jpg', '2017-10-20 11:53:42');
INSERT INTO `sys_file` VALUES ('117', '0', '/files/40073f7e-82ec-43f2-b9d3-fd9068916d4b.jpg', '2017-10-20 11:53:47');
INSERT INTO `sys_file` VALUES ('118', '0', '/files/a973499e-3ec7-4d43-8a52-b6f6517c77e3.jpg', '2017-10-20 11:53:52');
INSERT INTO `sys_file` VALUES ('125', '0', '/files/e2901e59-2e65-45a0-9fd8-284c88133cdd.jpg', '2017-10-20 11:54:20');
INSERT INTO `sys_file` VALUES ('126', '0', '/files/1ca91ae9-799e-4b7b-a72e-680825688677.jpg', '2017-10-20 11:54:24');
INSERT INTO `sys_file` VALUES ('127', '0', '/files/1a42a630-5186-44c1-8378-5f974652d7c8.jpg', '2017-10-20 13:20:49');
INSERT INTO `sys_file` VALUES ('128', '0', '/files/f4f730a9-6bd6-41de-aa05-a0ba3eac59ae.jpg', '2017-10-20 13:21:54');
INSERT INTO `sys_file` VALUES ('131', '0', '/files/4f5f32fd-f5ed-48c5-90ac-f71c9d7ebc24.jpg', '2017-10-20 13:50:00');
INSERT INTO `sys_file` VALUES ('133', '0', '/files/40a1f8c5-a49c-4e80-9932-63772d0123cf.jpg', '2017-12-01 13:18:24');
INSERT INTO `sys_file` VALUES ('134', '0', '/files/fa16862a-27c6-49ea-a6a6-a237b8ec1b50.png', '2017-12-01 13:20:45');
INSERT INTO `sys_file` VALUES ('135', '0', '/files/cbde4711-54b2-41b2-93e0-82bb72544a00.png', '2017-12-01 13:22:32');
INSERT INTO `sys_file` VALUES ('136', '0', '/files/e58393a0-a5bb-443f-a467-00023b36509e.png', '2017-12-01 13:33:31');
INSERT INTO `sys_file` VALUES ('137', '0', '/files/182b51c8-32b1-4d32-a274-fd7d5dfc3082.png', '2017-12-01 13:33:52');
INSERT INTO `sys_file` VALUES ('138', '0', '/files/5e060f14-ca15-4110-b4e6-f0bc68c08f5f.png', '2017-12-01 13:59:09');
INSERT INTO `sys_file` VALUES ('139', '0', '/files/b4ab97bd-ddd8-4e3f-816f-612fa5caf587.png', '2017-12-01 14:01:31');
INSERT INTO `sys_file` VALUES ('140', '0', '/files/fb7c7f58-741c-484c-b54f-1f2885ac565a.jpg', '2017-12-01 14:05:10');
INSERT INTO `sys_file` VALUES ('141', '0', '/files/7aaae833-c390-452d-b4af-80f59c3bd931.png', '2017-12-01 14:06:22');
INSERT INTO `sys_file` VALUES ('142', '0', '/files/22e9fad5-1deb-41e2-bd89-9c890d8773fd.png', '2017-12-01 14:07:51');
INSERT INTO `sys_file` VALUES ('143', '0', '/files/59c50522-6c5e-44aa-aa7e-80ea8fc47f9f.png', '2017-12-01 14:11:25');
INSERT INTO `sys_file` VALUES ('144', '0', '/files/442bdcac-136f-44e7-825f-8f151e7c017a.png', '2017-12-01 14:11:33');
INSERT INTO `sys_file` VALUES ('145', '0', '/files/8c0d84cf-341b-4ba7-b1fa-f907b737eb9a.png', '2017-12-01 14:12:24');
INSERT INTO `sys_file` VALUES ('146', '0', '/files/1068cf1f-5b47-4f3f-862d-7ec53d2b9b2f.png', '2017-12-01 14:14:41');
INSERT INTO `sys_file` VALUES ('147', '0', '/files/306fb7a6-7a40-427a-934f-ad1d4fed6e9a.jpg', '2017-12-01 16:12:00');
INSERT INTO `sys_file` VALUES ('148', '0', '/files/d2169dd6-e31b-4f65-be58-5b0e2fff8678.png', '2017-12-01 16:12:09');
INSERT INTO `sys_file` VALUES ('149', '0', '/files/6c606191-6ed3-43e4-a91d-055826ef8ee6.png', '2017-12-01 17:21:44');

-- ----------------------------
-- Table structure for `sys_log`
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `operation` varchar(50) DEFAULT NULL COMMENT '用户操作',
  `time` int(11) DEFAULT NULL COMMENT '响应时间',
  `method` varchar(200) DEFAULT NULL COMMENT '请求方法',
  `params` varchar(5000) DEFAULT NULL COMMENT '请求参数',
  `ip` varchar(64) DEFAULT NULL COMMENT 'IP地址',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7391 DEFAULT CHARSET=utf8 COMMENT='系统日志';

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('7034', '-1', '获取用户信息为空', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:51:44');
INSERT INTO `sys_log` VALUES ('7035', '-1', '获取用户信息为空', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:54:04');
INSERT INTO `sys_log` VALUES ('7036', '-1', '获取用户信息为空', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:54:08');
INSERT INTO `sys_log` VALUES ('7037', '-1', '获取用户信息为空', '登录', '1', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:55:04');
INSERT INTO `sys_log` VALUES ('7038', '-1', '获取用户信息为空', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:55:05');
INSERT INTO `sys_log` VALUES ('7039', '-1', '获取用户信息为空', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:55:05');
INSERT INTO `sys_log` VALUES ('7040', '-1', '获取用户信息为空', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:55:05');
INSERT INTO `sys_log` VALUES ('7041', '-1', '获取用户信息为空', '登录', '4', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:55:05');
INSERT INTO `sys_log` VALUES ('7042', '-1', '获取用户信息为空', '登录', '3', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:55:47');
INSERT INTO `sys_log` VALUES ('7043', '1', 'admin', '登录', '4', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 16:56:57');
INSERT INTO `sys_log` VALUES ('7044', '1', 'admin', '请求访问主页', '32', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 16:56:58');
INSERT INTO `sys_log` VALUES ('7045', '1', 'admin', '登录', '4', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 17:04:56');
INSERT INTO `sys_log` VALUES ('7046', '1', 'admin', '请求访问主页', '9', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 17:04:56');
INSERT INTO `sys_log` VALUES ('7047', '1', 'admin', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 17:06:06');
INSERT INTO `sys_log` VALUES ('7048', '1', 'admin', '请求访问主页', '9', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 17:06:06');
INSERT INTO `sys_log` VALUES ('7049', '1', 'admin', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 17:09:09');
INSERT INTO `sys_log` VALUES ('7050', '1', 'admin', '请求访问主页', '3', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 17:09:09');
INSERT INTO `sys_log` VALUES ('7051', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-11-30 17:26:51');
INSERT INTO `sys_log` VALUES ('7052', '1', 'admin', '请求访问主页', '20', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 17:26:51');
INSERT INTO `sys_log` VALUES ('7053', '1', 'admin', '添加菜单', '0', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-11-30 17:27:03');
INSERT INTO `sys_log` VALUES ('7054', '1', 'admin', '添加菜单', '4', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-11-30 17:27:47');
INSERT INTO `sys_log` VALUES ('7055', '1', 'admin', '添加菜单', '0', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-11-30 17:28:02');
INSERT INTO `sys_log` VALUES ('7056', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-11-30 17:29:02');
INSERT INTO `sys_log` VALUES ('7057', '1', 'admin', '请求访问主页', '5', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 17:29:06');
INSERT INTO `sys_log` VALUES ('7058', '1', 'admin', '编辑菜单', '5', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-11-30 17:29:18');
INSERT INTO `sys_log` VALUES ('7059', '1', 'admin', '编辑菜单', '3', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-11-30 17:29:27');
INSERT INTO `sys_log` VALUES ('7060', '1', 'admin', '更新菜单', '9', 'com.bootdo.system.controller.MenuController.update()', null, '127.0.0.1', '2017-11-30 17:29:32');
INSERT INTO `sys_log` VALUES ('7061', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 17:29:35');
INSERT INTO `sys_log` VALUES ('7062', '1', 'admin', '编辑菜单', '3', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-11-30 17:30:09');
INSERT INTO `sys_log` VALUES ('7063', '1', 'admin', '请求访问主页', '3', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 17:30:19');
INSERT INTO `sys_log` VALUES ('7064', '1', 'admin', '添加菜单', '4', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-11-30 17:30:31');
INSERT INTO `sys_log` VALUES ('7065', '1', 'admin', '编辑菜单', '4', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-11-30 17:30:41');
INSERT INTO `sys_log` VALUES ('7066', '1', 'admin', '编辑菜单', '4', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-11-30 17:31:49');
INSERT INTO `sys_log` VALUES ('7067', '1', 'admin', '更新菜单', '3', 'com.bootdo.system.controller.MenuController.update()', null, '127.0.0.1', '2017-11-30 17:31:55');
INSERT INTO `sys_log` VALUES ('7068', '1', 'admin', '删除菜单', '16', 'com.bootdo.system.controller.MenuController.remove()', null, '127.0.0.1', '2017-11-30 17:32:07');
INSERT INTO `sys_log` VALUES ('7069', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-11-30 17:32:31');
INSERT INTO `sys_log` VALUES ('7070', '1', 'admin', '保存菜单', '5', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-11-30 17:33:50');
INSERT INTO `sys_log` VALUES ('7071', '1', 'admin', '请求访问主页', '3', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 17:33:54');
INSERT INTO `sys_log` VALUES ('7072', '1', 'admin', '添加菜单', '4', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-11-30 17:34:46');
INSERT INTO `sys_log` VALUES ('7073', '1', 'admin', '保存菜单', '3', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-11-30 17:35:41');
INSERT INTO `sys_log` VALUES ('7074', '1', 'admin', '请求访问主页', '3', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-11-30 17:35:44');
INSERT INTO `sys_log` VALUES ('7075', '1', 'admin', '登录', '12', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 09:34:02');
INSERT INTO `sys_log` VALUES ('7076', '1', 'admin', '请求访问主页', '20', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:34:02');
INSERT INTO `sys_log` VALUES ('7077', '1', 'admin', '编辑角色', '3', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-01 09:34:48');
INSERT INTO `sys_log` VALUES ('7078', '1', 'admin', '编辑角色', '3', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-01 09:34:54');
INSERT INTO `sys_log` VALUES ('7079', '1', 'admin', '更新角色', '29', 'com.bootdo.system.controller.RoleController.update()', null, '127.0.0.1', '2017-12-01 09:35:01');
INSERT INTO `sys_log` VALUES ('7080', '1', 'admin', '请求访问主页', '6', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:35:04');
INSERT INTO `sys_log` VALUES ('7081', '1', 'admin', '登录', '1', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 09:36:03');
INSERT INTO `sys_log` VALUES ('7082', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:36:03');
INSERT INTO `sys_log` VALUES ('7083', '1', 'admin', '添加菜单', '10', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 09:36:47');
INSERT INTO `sys_log` VALUES ('7084', '1', 'admin', '保存菜单', '5', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 09:37:41');
INSERT INTO `sys_log` VALUES ('7085', '1', 'admin', '请求访问主页', '3', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:37:53');
INSERT INTO `sys_log` VALUES ('7086', '1', 'admin', '编辑角色', '2', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-01 09:38:09');
INSERT INTO `sys_log` VALUES ('7087', '1', 'admin', '更新角色', '167', 'com.bootdo.system.controller.RoleController.update()', null, '127.0.0.1', '2017-12-01 09:38:14');
INSERT INTO `sys_log` VALUES ('7088', '1', 'admin', '请求访问主页', '3', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:38:22');
INSERT INTO `sys_log` VALUES ('7089', '1', 'admin', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 09:38:42');
INSERT INTO `sys_log` VALUES ('7090', '1', 'admin', '请求访问主页', '3', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:38:42');
INSERT INTO `sys_log` VALUES ('7091', '1', 'admin', '请求访问主页', '5', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:43:41');
INSERT INTO `sys_log` VALUES ('7092', '1', 'admin', '删除菜单', '4', 'com.bootdo.system.controller.MenuController.remove()', null, '127.0.0.1', '2017-12-01 09:45:52');
INSERT INTO `sys_log` VALUES ('7093', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:45:55');
INSERT INTO `sys_log` VALUES ('7094', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 09:49:43');
INSERT INTO `sys_log` VALUES ('7095', '1', 'admin', '请求访问主页', '21', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:49:44');
INSERT INTO `sys_log` VALUES ('7096', '1', 'admin', '请求访问主页', '6', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 09:50:39');
INSERT INTO `sys_log` VALUES ('7097', '1', 'admin', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 10:05:56');
INSERT INTO `sys_log` VALUES ('7098', '1', 'admin', '请求访问主页', '5', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:05:56');
INSERT INTO `sys_log` VALUES ('7099', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:06:03');
INSERT INTO `sys_log` VALUES ('7100', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 10:06:54');
INSERT INTO `sys_log` VALUES ('7101', '1', 'admin', '请求访问主页', '19', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:06:54');
INSERT INTO `sys_log` VALUES ('7102', '1', 'admin', '添加菜单', '4', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:07:46');
INSERT INTO `sys_log` VALUES ('7103', '1', 'admin', '删除菜单', '7', 'com.bootdo.system.controller.MenuController.remove()', null, '127.0.0.1', '2017-12-01 10:07:51');
INSERT INTO `sys_log` VALUES ('7104', '1', 'admin', '删除菜单', '5', 'com.bootdo.system.controller.MenuController.remove()', null, '127.0.0.1', '2017-12-01 10:07:54');
INSERT INTO `sys_log` VALUES ('7105', '1', 'admin', '删除菜单', '4', 'com.bootdo.system.controller.MenuController.remove()', null, '127.0.0.1', '2017-12-01 10:07:58');
INSERT INTO `sys_log` VALUES ('7106', '1', 'admin', '添加菜单', '0', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:09:05');
INSERT INTO `sys_log` VALUES ('7107', '1', 'admin', '保存菜单', '5', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:09:49');
INSERT INTO `sys_log` VALUES ('7108', '1', 'admin', '编辑角色', '2', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-01 10:09:55');
INSERT INTO `sys_log` VALUES ('7109', '1', 'admin', '更新角色', '23', 'com.bootdo.system.controller.RoleController.update()', null, '127.0.0.1', '2017-12-01 10:10:00');
INSERT INTO `sys_log` VALUES ('7110', '1', 'admin', '请求访问主页', '3', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:10:03');
INSERT INTO `sys_log` VALUES ('7111', '1', 'admin', '添加菜单', '4', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:10:40');
INSERT INTO `sys_log` VALUES ('7112', '1', 'admin', '保存菜单', '5', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:11:42');
INSERT INTO `sys_log` VALUES ('7113', '1', 'admin', '添加菜单', '3', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:11:51');
INSERT INTO `sys_log` VALUES ('7114', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:12:29');
INSERT INTO `sys_log` VALUES ('7115', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:12:38');
INSERT INTO `sys_log` VALUES ('7116', '1', 'admin', '保存菜单', '5', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:13:05');
INSERT INTO `sys_log` VALUES ('7117', '1', 'admin', '编辑菜单', '4', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-12-01 10:13:14');
INSERT INTO `sys_log` VALUES ('7118', '1', 'admin', '更新菜单', '4', 'com.bootdo.system.controller.MenuController.update()', null, '127.0.0.1', '2017-12-01 10:13:32');
INSERT INTO `sys_log` VALUES ('7119', '1', 'admin', '添加菜单', '3', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:14:22');
INSERT INTO `sys_log` VALUES ('7120', '1', 'admin', '保存菜单', '5', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:14:45');
INSERT INTO `sys_log` VALUES ('7121', '1', 'admin', '编辑角色', '1', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-01 10:15:13');
INSERT INTO `sys_log` VALUES ('7122', '1', 'admin', '更新角色', '175', 'com.bootdo.system.controller.RoleController.update()', null, '127.0.0.1', '2017-12-01 10:15:22');
INSERT INTO `sys_log` VALUES ('7123', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:15:28');
INSERT INTO `sys_log` VALUES ('7124', '1', 'admin', '编辑用户', '10', 'com.bootdo.system.controller.UserController.edit()', null, '127.0.0.1', '2017-12-01 10:18:18');
INSERT INTO `sys_log` VALUES ('7125', '1', 'admin', '添加用户', '0', 'com.bootdo.system.controller.UserController.add()', null, '127.0.0.1', '2017-12-01 10:18:38');
INSERT INTO `sys_log` VALUES ('7126', '1', 'admin', '添加用户', '1', 'com.bootdo.system.controller.UserController.add()', null, '127.0.0.1', '2017-12-01 10:19:34');
INSERT INTO `sys_log` VALUES ('7127', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 10:23:34');
INSERT INTO `sys_log` VALUES ('7128', '1', 'admin', '请求访问主页', '21', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:23:34');
INSERT INTO `sys_log` VALUES ('7129', '1', 'admin', '删除菜单', '7', 'com.bootdo.system.controller.MenuController.remove()', null, '127.0.0.1', '2017-12-01 10:24:15');
INSERT INTO `sys_log` VALUES ('7130', '1', 'admin', '删除菜单', '5', 'com.bootdo.system.controller.MenuController.remove()', null, '127.0.0.1', '2017-12-01 10:24:19');
INSERT INTO `sys_log` VALUES ('7131', '1', 'admin', '删除菜单', '4', 'com.bootdo.system.controller.MenuController.remove()', null, '127.0.0.1', '2017-12-01 10:24:22');
INSERT INTO `sys_log` VALUES ('7132', '1', 'admin', '编辑菜单', '9', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-12-01 10:24:31');
INSERT INTO `sys_log` VALUES ('7133', '1', 'admin', '更新菜单', '7', 'com.bootdo.system.controller.MenuController.update()', null, '127.0.0.1', '2017-12-01 10:24:36');
INSERT INTO `sys_log` VALUES ('7134', '1', 'admin', '请求访问主页', '5', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:24:40');
INSERT INTO `sys_log` VALUES ('7135', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:24:53');
INSERT INTO `sys_log` VALUES ('7136', '1', 'admin', '请求访问主页', '5', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:25:07');
INSERT INTO `sys_log` VALUES ('7137', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 10:26:09');
INSERT INTO `sys_log` VALUES ('7138', '1', 'admin', '请求访问主页', '19', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:26:09');
INSERT INTO `sys_log` VALUES ('7139', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 10:27:27');
INSERT INTO `sys_log` VALUES ('7140', '1', 'admin', '请求访问主页', '19', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:27:27');
INSERT INTO `sys_log` VALUES ('7141', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 10:30:43');
INSERT INTO `sys_log` VALUES ('7142', '1', 'admin', '请求访问主页', '21', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:30:43');
INSERT INTO `sys_log` VALUES ('7143', '1', 'admin', '添加菜单', '4', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:32:57');
INSERT INTO `sys_log` VALUES ('7144', '1', 'admin', '保存菜单', '6', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:33:57');
INSERT INTO `sys_log` VALUES ('7145', '1', 'admin', '编辑角色', '4', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-01 10:34:03');
INSERT INTO `sys_log` VALUES ('7146', '1', 'admin', '更新角色', '25', 'com.bootdo.system.controller.RoleController.update()', null, '127.0.0.1', '2017-12-01 10:34:08');
INSERT INTO `sys_log` VALUES ('7147', '1', 'admin', '编辑菜单', '7', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-12-01 10:34:19');
INSERT INTO `sys_log` VALUES ('7148', '1', 'admin', '更新菜单', '6', 'com.bootdo.system.controller.MenuController.update()', null, '127.0.0.1', '2017-12-01 10:34:28');
INSERT INTO `sys_log` VALUES ('7149', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:34:34');
INSERT INTO `sys_log` VALUES ('7150', '1', 'admin', '编辑角色', '1', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-01 10:34:52');
INSERT INTO `sys_log` VALUES ('7151', '1', 'admin', '登录', '1', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 10:35:02');
INSERT INTO `sys_log` VALUES ('7152', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:35:02');
INSERT INTO `sys_log` VALUES ('7153', '1', 'admin', '添加菜单', '3', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:36:11');
INSERT INTO `sys_log` VALUES ('7154', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:37:38');
INSERT INTO `sys_log` VALUES ('7155', '1', 'admin', '编辑菜单', '6', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-12-01 10:37:46');
INSERT INTO `sys_log` VALUES ('7156', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:37:55');
INSERT INTO `sys_log` VALUES ('7157', '1', 'admin', '保存菜单', '5', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:38:46');
INSERT INTO `sys_log` VALUES ('7158', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:38:53');
INSERT INTO `sys_log` VALUES ('7159', '1', 'admin', '保存菜单', '2', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:39:30');
INSERT INTO `sys_log` VALUES ('7160', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:39:37');
INSERT INTO `sys_log` VALUES ('7161', '1', 'admin', '保存菜单', '2', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:40:24');
INSERT INTO `sys_log` VALUES ('7162', '1', 'admin', '添加菜单', '3', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:40:28');
INSERT INTO `sys_log` VALUES ('7163', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:41:32');
INSERT INTO `sys_log` VALUES ('7164', '1', 'admin', '编辑角色', '1', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-01 10:41:37');
INSERT INTO `sys_log` VALUES ('7165', '1', 'admin', '更新角色', '10', 'com.bootdo.system.controller.RoleController.update()', null, '127.0.0.1', '2017-12-01 10:41:42');
INSERT INTO `sys_log` VALUES ('7166', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:41:46');
INSERT INTO `sys_log` VALUES ('7167', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 10:42:20');
INSERT INTO `sys_log` VALUES ('7168', '1', 'admin', '请求访问主页', '19', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:42:20');
INSERT INTO `sys_log` VALUES ('7169', '1', 'admin', '添加菜单', '9', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:50:39');
INSERT INTO `sys_log` VALUES ('7170', '1', 'admin', '保存菜单', '6', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:54:00');
INSERT INTO `sys_log` VALUES ('7171', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:54:05');
INSERT INTO `sys_log` VALUES ('7172', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:54:42');
INSERT INTO `sys_log` VALUES ('7173', '1', 'admin', '添加菜单', '3', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:54:47');
INSERT INTO `sys_log` VALUES ('7174', '1', 'admin', '保存菜单', '3', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:56:30');
INSERT INTO `sys_log` VALUES ('7175', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:56:37');
INSERT INTO `sys_log` VALUES ('7176', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:57:16');
INSERT INTO `sys_log` VALUES ('7177', '1', 'admin', '添加菜单', '4', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-01 10:57:33');
INSERT INTO `sys_log` VALUES ('7178', '1', 'admin', '保存菜单', '6', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-01 10:58:26');
INSERT INTO `sys_log` VALUES ('7179', '1', 'admin', '编辑角色', '3', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-01 10:58:35');
INSERT INTO `sys_log` VALUES ('7180', '1', 'admin', '更新角色', '21', 'com.bootdo.system.controller.RoleController.update()', null, '127.0.0.1', '2017-12-01 10:58:40');
INSERT INTO `sys_log` VALUES ('7181', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 10:58:55');
INSERT INTO `sys_log` VALUES ('7182', '1', 'admin', '请求访问主页', '20', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 10:58:55');
INSERT INTO `sys_log` VALUES ('7183', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 11:12:18');
INSERT INTO `sys_log` VALUES ('7184', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:12:18');
INSERT INTO `sys_log` VALUES ('7185', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 11:23:41');
INSERT INTO `sys_log` VALUES ('7186', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:23:41');
INSERT INTO `sys_log` VALUES ('7187', '1', 'admin', '编辑菜单', '10', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-12-01 11:25:31');
INSERT INTO `sys_log` VALUES ('7188', '1', 'admin', '编辑菜单', '5', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-12-01 11:25:48');
INSERT INTO `sys_log` VALUES ('7189', '1', 'admin', '更新菜单', '9', 'com.bootdo.system.controller.MenuController.update()', null, '127.0.0.1', '2017-12-01 11:25:53');
INSERT INTO `sys_log` VALUES ('7190', '1', 'admin', '编辑菜单', '6', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-12-01 11:26:39');
INSERT INTO `sys_log` VALUES ('7191', '1', 'admin', '更新菜单', '3', 'com.bootdo.system.controller.MenuController.update()', null, '127.0.0.1', '2017-12-01 11:26:44');
INSERT INTO `sys_log` VALUES ('7192', '1', 'admin', '编辑菜单', '5', 'com.bootdo.system.controller.MenuController.edit()', null, '127.0.0.1', '2017-12-01 11:26:59');
INSERT INTO `sys_log` VALUES ('7193', '1', 'admin', '请求访问主页', '13', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:37:22');
INSERT INTO `sys_log` VALUES ('7194', '1', 'admin', '登录', '9', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 11:43:08');
INSERT INTO `sys_log` VALUES ('7195', '1', 'admin', '请求访问主页', '29', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:43:08');
INSERT INTO `sys_log` VALUES ('7196', '1', 'admin', '请求访问主页', '14', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:46:14');
INSERT INTO `sys_log` VALUES ('7197', '1', 'admin', '请求访问主页', '18', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:46:14');
INSERT INTO `sys_log` VALUES ('7198', '1', 'admin', '请求访问主页', '5', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:49:02');
INSERT INTO `sys_log` VALUES ('7199', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:50:43');
INSERT INTO `sys_log` VALUES ('7200', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 11:57:56');
INSERT INTO `sys_log` VALUES ('7201', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:57:56');
INSERT INTO `sys_log` VALUES ('7202', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 11:59:40');
INSERT INTO `sys_log` VALUES ('7203', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 11:59:40');
INSERT INTO `sys_log` VALUES ('7204', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 12:00:18');
INSERT INTO `sys_log` VALUES ('7205', '1', 'admin', '请求访问主页', '30', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 12:00:18');
INSERT INTO `sys_log` VALUES ('7206', '1', 'admin', '登录', '9', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 12:01:13');
INSERT INTO `sys_log` VALUES ('7207', '1', 'admin', '请求访问主页', '33', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 12:01:14');
INSERT INTO `sys_log` VALUES ('7208', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 12:05:05');
INSERT INTO `sys_log` VALUES ('7209', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 12:05:06');
INSERT INTO `sys_log` VALUES ('7210', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 12:48:19');
INSERT INTO `sys_log` VALUES ('7211', '1', 'admin', '请求访问主页', '26', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 12:48:19');
INSERT INTO `sys_log` VALUES ('7212', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 12:50:21');
INSERT INTO `sys_log` VALUES ('7213', '1', 'admin', '请求访问主页', '28', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 12:50:22');
INSERT INTO `sys_log` VALUES ('7214', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 12:52:26');
INSERT INTO `sys_log` VALUES ('7215', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 12:52:26');
INSERT INTO `sys_log` VALUES ('7216', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:15:38');
INSERT INTO `sys_log` VALUES ('7217', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:15:38');
INSERT INTO `sys_log` VALUES ('7218', '1', 'admin', '请求访问主页', '7', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:15:58');
INSERT INTO `sys_log` VALUES ('7219', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:18:06');
INSERT INTO `sys_log` VALUES ('7220', '1', 'admin', '请求访问主页', '27', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:18:06');
INSERT INTO `sys_log` VALUES ('7221', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:22:21');
INSERT INTO `sys_log` VALUES ('7222', '1', 'admin', '请求访问主页', '20', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:22:21');
INSERT INTO `sys_log` VALUES ('7223', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:23:39');
INSERT INTO `sys_log` VALUES ('7224', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:23:39');
INSERT INTO `sys_log` VALUES ('7225', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:30:26');
INSERT INTO `sys_log` VALUES ('7226', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:30:26');
INSERT INTO `sys_log` VALUES ('7227', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:31:12');
INSERT INTO `sys_log` VALUES ('7228', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:31:12');
INSERT INTO `sys_log` VALUES ('7229', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:32:40');
INSERT INTO `sys_log` VALUES ('7230', '1', 'admin', '请求访问主页', '26', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:32:40');
INSERT INTO `sys_log` VALUES ('7231', '1', 'admin', '请求访问主页', '7', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:33:37');
INSERT INTO `sys_log` VALUES ('7232', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:54:47');
INSERT INTO `sys_log` VALUES ('7233', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:54:47');
INSERT INTO `sys_log` VALUES ('7234', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:56:09');
INSERT INTO `sys_log` VALUES ('7235', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:56:10');
INSERT INTO `sys_log` VALUES ('7236', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 13:59:00');
INSERT INTO `sys_log` VALUES ('7237', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 13:59:00');
INSERT INTO `sys_log` VALUES ('7238', '1', 'admin', '登录', '9', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 14:01:17');
INSERT INTO `sys_log` VALUES ('7239', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 14:01:17');
INSERT INTO `sys_log` VALUES ('7240', '1', 'admin', '登录', '9', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 14:04:54');
INSERT INTO `sys_log` VALUES ('7241', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 14:04:54');
INSERT INTO `sys_log` VALUES ('7242', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 14:06:14');
INSERT INTO `sys_log` VALUES ('7243', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 14:06:14');
INSERT INTO `sys_log` VALUES ('7244', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 14:07:41');
INSERT INTO `sys_log` VALUES ('7245', '1', 'admin', '请求访问主页', '20', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 14:07:41');
INSERT INTO `sys_log` VALUES ('7246', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 14:14:27');
INSERT INTO `sys_log` VALUES ('7247', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 14:14:27');
INSERT INTO `sys_log` VALUES ('7248', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:04:05');
INSERT INTO `sys_log` VALUES ('7249', '1', 'admin', '请求访问主页', '26', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:04:05');
INSERT INTO `sys_log` VALUES ('7250', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:05:33');
INSERT INTO `sys_log` VALUES ('7251', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:05:33');
INSERT INTO `sys_log` VALUES ('7252', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:09:01');
INSERT INTO `sys_log` VALUES ('7253', '1', 'admin', '请求访问主页', '27', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:09:01');
INSERT INTO `sys_log` VALUES ('7254', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:10:30');
INSERT INTO `sys_log` VALUES ('7255', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:10:30');
INSERT INTO `sys_log` VALUES ('7256', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:11:22');
INSERT INTO `sys_log` VALUES ('7257', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:11:22');
INSERT INTO `sys_log` VALUES ('7258', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:20:09');
INSERT INTO `sys_log` VALUES ('7259', '1', 'admin', '请求访问主页', '26', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:20:09');
INSERT INTO `sys_log` VALUES ('7260', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:38:21');
INSERT INTO `sys_log` VALUES ('7261', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:38:21');
INSERT INTO `sys_log` VALUES ('7262', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:40:33');
INSERT INTO `sys_log` VALUES ('7263', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:40:34');
INSERT INTO `sys_log` VALUES ('7264', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:42:05');
INSERT INTO `sys_log` VALUES ('7265', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:42:05');
INSERT INTO `sys_log` VALUES ('7266', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:47:24');
INSERT INTO `sys_log` VALUES ('7267', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:47:24');
INSERT INTO `sys_log` VALUES ('7268', '1', 'admin', '请求访问主页', '5', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:48:47');
INSERT INTO `sys_log` VALUES ('7269', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:51:07');
INSERT INTO `sys_log` VALUES ('7270', '1', 'admin', '请求访问主页', '26', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:51:07');
INSERT INTO `sys_log` VALUES ('7271', '1', 'admin', '请求访问主页', '7', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:54:53');
INSERT INTO `sys_log` VALUES ('7272', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 16:58:05');
INSERT INTO `sys_log` VALUES ('7273', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:58:05');
INSERT INTO `sys_log` VALUES ('7274', '1', 'admin', '请求访问主页', '6', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 16:59:22');
INSERT INTO `sys_log` VALUES ('7275', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:00:30');
INSERT INTO `sys_log` VALUES ('7276', '1', 'admin', '请求访问主页', '28', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:00:30');
INSERT INTO `sys_log` VALUES ('7277', '1', 'admin', '登录', '9', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:05:09');
INSERT INTO `sys_log` VALUES ('7278', '1', 'admin', '请求访问主页', '30', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:05:09');
INSERT INTO `sys_log` VALUES ('7279', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:07:09');
INSERT INTO `sys_log` VALUES ('7280', '1', 'admin', '请求访问主页', '30', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:07:09');
INSERT INTO `sys_log` VALUES ('7281', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:08:26');
INSERT INTO `sys_log` VALUES ('7282', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:08:26');
INSERT INTO `sys_log` VALUES ('7283', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:15:08');
INSERT INTO `sys_log` VALUES ('7284', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:15:08');
INSERT INTO `sys_log` VALUES ('7285', '1', 'admin', '请求访问主页', '6', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:16:39');
INSERT INTO `sys_log` VALUES ('7286', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:19:12');
INSERT INTO `sys_log` VALUES ('7287', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:19:12');
INSERT INTO `sys_log` VALUES ('7288', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:21:21');
INSERT INTO `sys_log` VALUES ('7289', '1', 'admin', '请求访问主页', '26', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:21:21');
INSERT INTO `sys_log` VALUES ('7290', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:25:32');
INSERT INTO `sys_log` VALUES ('7291', '1', 'admin', '请求访问主页', '21', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:25:33');
INSERT INTO `sys_log` VALUES ('7292', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:29:49');
INSERT INTO `sys_log` VALUES ('7293', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:29:50');
INSERT INTO `sys_log` VALUES ('7294', '1', 'admin', '请求访问主页', '9', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:30:19');
INSERT INTO `sys_log` VALUES ('7295', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:31:59');
INSERT INTO `sys_log` VALUES ('7296', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:32:00');
INSERT INTO `sys_log` VALUES ('7297', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:33:07');
INSERT INTO `sys_log` VALUES ('7298', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:33:07');
INSERT INTO `sys_log` VALUES ('7299', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:34:03');
INSERT INTO `sys_log` VALUES ('7300', '1', 'admin', '请求访问主页', '26', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:34:03');
INSERT INTO `sys_log` VALUES ('7301', '1', 'admin', '请求访问主页', '6', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:34:29');
INSERT INTO `sys_log` VALUES ('7302', '1', 'admin', '请求访问主页', '8', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:37:55');
INSERT INTO `sys_log` VALUES ('7303', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:44:05');
INSERT INTO `sys_log` VALUES ('7304', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:44:05');
INSERT INTO `sys_log` VALUES ('7305', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:49:19');
INSERT INTO `sys_log` VALUES ('7306', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:49:19');
INSERT INTO `sys_log` VALUES ('7307', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:50:56');
INSERT INTO `sys_log` VALUES ('7308', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:50:56');
INSERT INTO `sys_log` VALUES ('7309', '1', 'admin', '登录', '35', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 17:59:00');
INSERT INTO `sys_log` VALUES ('7310', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 17:59:00');
INSERT INTO `sys_log` VALUES ('7311', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 18:04:19');
INSERT INTO `sys_log` VALUES ('7312', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 18:04:19');
INSERT INTO `sys_log` VALUES ('7313', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 18:05:59');
INSERT INTO `sys_log` VALUES ('7314', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 18:05:59');
INSERT INTO `sys_log` VALUES ('7315', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-01 18:07:37');
INSERT INTO `sys_log` VALUES ('7316', '1', 'admin', '请求访问主页', '21', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-01 18:07:37');
INSERT INTO `sys_log` VALUES ('7317', '1', 'admin', '登录', '12', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 14:30:07');
INSERT INTO `sys_log` VALUES ('7318', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 14:30:07');
INSERT INTO `sys_log` VALUES ('7319', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:10:41');
INSERT INTO `sys_log` VALUES ('7320', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:10:41');
INSERT INTO `sys_log` VALUES ('7321', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:18:59');
INSERT INTO `sys_log` VALUES ('7322', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:18:59');
INSERT INTO `sys_log` VALUES ('7323', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:19:55');
INSERT INTO `sys_log` VALUES ('7324', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:19:55');
INSERT INTO `sys_log` VALUES ('7325', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:27:50');
INSERT INTO `sys_log` VALUES ('7326', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:27:50');
INSERT INTO `sys_log` VALUES ('7327', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:29:02');
INSERT INTO `sys_log` VALUES ('7328', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:29:02');
INSERT INTO `sys_log` VALUES ('7329', '1', 'admin', '请求访问主页', '6', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:29:58');
INSERT INTO `sys_log` VALUES ('7330', '1', 'admin', '请求访问主页', '6', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:30:22');
INSERT INTO `sys_log` VALUES ('7331', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:35:16');
INSERT INTO `sys_log` VALUES ('7332', '1', 'admin', '请求访问主页', '26', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:35:16');
INSERT INTO `sys_log` VALUES ('7333', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:39:35');
INSERT INTO `sys_log` VALUES ('7334', '1', 'admin', '请求访问主页', '21', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:39:35');
INSERT INTO `sys_log` VALUES ('7335', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:46:22');
INSERT INTO `sys_log` VALUES ('7336', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:46:22');
INSERT INTO `sys_log` VALUES ('7337', '1', 'admin', '登录', '6', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:48:47');
INSERT INTO `sys_log` VALUES ('7338', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:48:47');
INSERT INTO `sys_log` VALUES ('7339', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 15:50:07');
INSERT INTO `sys_log` VALUES ('7340', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 15:50:07');
INSERT INTO `sys_log` VALUES ('7341', '1', 'admin', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 16:31:45');
INSERT INTO `sys_log` VALUES ('7342', '1', 'admin', '请求访问主页', '6', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 16:31:45');
INSERT INTO `sys_log` VALUES ('7343', '1', 'admin', '添加菜单', '6', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 16:31:55');
INSERT INTO `sys_log` VALUES ('7344', '1', 'admin', '保存菜单', '6', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 16:33:20');
INSERT INTO `sys_log` VALUES ('7345', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 16:33:34');
INSERT INTO `sys_log` VALUES ('7346', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 16:34:19');
INSERT INTO `sys_log` VALUES ('7347', '1', 'admin', '添加菜单', '4', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 16:34:24');
INSERT INTO `sys_log` VALUES ('7348', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 16:35:21');
INSERT INTO `sys_log` VALUES ('7349', '1', 'admin', '添加菜单', '3', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 16:35:32');
INSERT INTO `sys_log` VALUES ('7350', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 16:36:08');
INSERT INTO `sys_log` VALUES ('7351', '1', 'admin', '添加菜单', '3', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 16:36:23');
INSERT INTO `sys_log` VALUES ('7352', '1', 'admin', '保存菜单', '5', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 16:37:20');
INSERT INTO `sys_log` VALUES ('7353', '1', 'admin', '编辑角色', '5', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-02 16:37:25');
INSERT INTO `sys_log` VALUES ('7354', '1', 'admin', '更新角色', '28', 'com.bootdo.system.controller.RoleController.update()', null, '127.0.0.1', '2017-12-02 16:37:39');
INSERT INTO `sys_log` VALUES ('7355', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 16:37:44');
INSERT INTO `sys_log` VALUES ('7356', '1', 'admin', '登录', '1', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 16:38:08');
INSERT INTO `sys_log` VALUES ('7357', '1', 'admin', '请求访问主页', '4', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 16:38:08');
INSERT INTO `sys_log` VALUES ('7358', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 16:38:55');
INSERT INTO `sys_log` VALUES ('7359', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 16:38:55');
INSERT INTO `sys_log` VALUES ('7360', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 16:52:42');
INSERT INTO `sys_log` VALUES ('7361', '1', 'admin', '请求访问主页', '25', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 16:52:43');
INSERT INTO `sys_log` VALUES ('7362', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 16:55:55');
INSERT INTO `sys_log` VALUES ('7363', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 16:55:55');
INSERT INTO `sys_log` VALUES ('7364', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 16:57:44');
INSERT INTO `sys_log` VALUES ('7365', '1', 'admin', '请求访问主页', '22', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 16:57:44');
INSERT INTO `sys_log` VALUES ('7366', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 17:00:10');
INSERT INTO `sys_log` VALUES ('7367', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 17:00:10');
INSERT INTO `sys_log` VALUES ('7368', '1', 'admin', '登录', '8', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 17:04:38');
INSERT INTO `sys_log` VALUES ('7369', '1', 'admin', '请求访问主页', '23', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 17:04:38');
INSERT INTO `sys_log` VALUES ('7370', '1', 'admin', '请求访问主页', '8', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 17:05:55');
INSERT INTO `sys_log` VALUES ('7371', '1', 'admin', '添加菜单', '5', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 17:23:21');
INSERT INTO `sys_log` VALUES ('7372', '1', 'admin', '保存菜单', '6', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 17:24:07');
INSERT INTO `sys_log` VALUES ('7373', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 17:24:15');
INSERT INTO `sys_log` VALUES ('7374', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 17:24:58');
INSERT INTO `sys_log` VALUES ('7375', '1', 'admin', '添加菜单', '3', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 17:25:07');
INSERT INTO `sys_log` VALUES ('7376', '1', 'admin', '保存菜单', '3', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 17:26:01');
INSERT INTO `sys_log` VALUES ('7377', '1', 'admin', '添加菜单', '5', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 17:26:10');
INSERT INTO `sys_log` VALUES ('7378', '1', 'admin', '保存菜单', '4', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 17:26:52');
INSERT INTO `sys_log` VALUES ('7379', '1', 'admin', '编辑角色', '3', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-02 17:26:57');
INSERT INTO `sys_log` VALUES ('7380', '1', 'admin', '删除菜单', '6', 'com.bootdo.system.controller.MenuController.remove()', null, '127.0.0.1', '2017-12-02 17:27:13');
INSERT INTO `sys_log` VALUES ('7381', '1', 'admin', '添加菜单', '2', 'com.bootdo.system.controller.MenuController.add()', null, '127.0.0.1', '2017-12-02 17:27:22');
INSERT INTO `sys_log` VALUES ('7382', '1', 'admin', '保存菜单', '3', 'com.bootdo.system.controller.MenuController.save()', null, '127.0.0.1', '2017-12-02 17:28:06');
INSERT INTO `sys_log` VALUES ('7383', '1', 'admin', '编辑角色', '2', 'com.bootdo.system.controller.RoleController.edit()', null, '127.0.0.1', '2017-12-02 17:28:10');
INSERT INTO `sys_log` VALUES ('7384', '1', 'admin', '更新角色', '28', 'com.bootdo.system.controller.RoleController.update()', null, '127.0.0.1', '2017-12-02 17:28:15');
INSERT INTO `sys_log` VALUES ('7385', '1', 'admin', '登录', '7', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-02 17:28:38');
INSERT INTO `sys_log` VALUES ('7386', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-02 17:28:38');
INSERT INTO `sys_log` VALUES ('7387', '1', 'admin', '登录', '13', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-03 10:48:21');
INSERT INTO `sys_log` VALUES ('7388', '1', 'admin', '请求访问主页', '24', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-03 10:48:21');
INSERT INTO `sys_log` VALUES ('7389', '1', 'admin', '登录', '2', 'com.bootdo.system.controller.LoginController.ajaxLogin()', null, '127.0.0.1', '2017-12-03 11:24:14');
INSERT INTO `sys_log` VALUES ('7390', '1', 'admin', '请求访问主页', '6', 'com.bootdo.system.controller.LoginController.index()', null, '127.0.0.1', '2017-12-03 11:24:14');

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
  `name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(200) DEFAULT NULL COMMENT '菜单URL',
  `perms` varchar(500) DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  `type` int(11) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` varchar(50) DEFAULT NULL COMMENT '菜单图标',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=123 DEFAULT CHARSET=utf8 COMMENT='菜单管理';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '0', '基础管理', '', '', '0', 'fa fa-bars', '0', '2017-08-09 22:49:47', null);
INSERT INTO `sys_menu` VALUES ('2', '3', '系统菜单', 'sys/menu/', 'sys:menu:menu', '1', 'fa fa-th-list', '2', '2017-08-09 22:55:15', null);
INSERT INTO `sys_menu` VALUES ('3', '0', '系统管理', null, null, '0', 'fa fa-desktop', '1', '2017-08-09 23:06:55', '2017-08-14 14:13:43');
INSERT INTO `sys_menu` VALUES ('6', '3', '用户管理', 'sys/user/', 'sys:user:user', '1', 'fa fa-user', '0', '2017-08-10 14:12:11', null);
INSERT INTO `sys_menu` VALUES ('7', '3', '角色管理', 'sys/role', 'sys:role:role', '1', 'fa fa-paw', '1', '2017-08-10 14:13:19', null);
INSERT INTO `sys_menu` VALUES ('12', '6', '新增', '', 'sys:user:add', '2', '', '0', '2017-08-14 10:51:35', null);
INSERT INTO `sys_menu` VALUES ('13', '6', '编辑', '', 'sys:user:edit', '2', '', '0', '2017-08-14 10:52:06', null);
INSERT INTO `sys_menu` VALUES ('14', '6', '删除', null, 'sys:user:remove', '2', null, '0', '2017-08-14 10:52:24', null);
INSERT INTO `sys_menu` VALUES ('15', '7', '新增', '', 'sys:role:add', '2', '', '0', '2017-08-14 10:56:37', null);
INSERT INTO `sys_menu` VALUES ('20', '2', '新增', '', 'sys:menu:add', '2', '', '0', '2017-08-14 10:59:32', null);
INSERT INTO `sys_menu` VALUES ('21', '2', '编辑', '', 'sys:menu:edit', '2', '', '0', '2017-08-14 10:59:56', null);
INSERT INTO `sys_menu` VALUES ('22', '2', '删除', '', 'sys:menu:remove', '2', '', '0', '2017-08-14 11:00:26', null);
INSERT INTO `sys_menu` VALUES ('24', '6', '批量删除', '', 'sys:user:batchRemove', '2', '', '0', '2017-08-14 17:27:18', null);
INSERT INTO `sys_menu` VALUES ('25', '6', '停用', null, 'sys:user:disable', '2', null, '0', '2017-08-14 17:27:43', null);
INSERT INTO `sys_menu` VALUES ('26', '6', '重置密码', '', 'sys:user:resetPwd', '2', '', '0', '2017-08-14 17:28:34', null);
INSERT INTO `sys_menu` VALUES ('27', '91', '系统日志', 'common/log', 'common:log', '1', 'fa fa-warning', '0', '2017-08-14 22:11:53', null);
INSERT INTO `sys_menu` VALUES ('28', '27', '刷新', null, 'sys:log:list', '2', null, '0', '2017-08-14 22:30:22', null);
INSERT INTO `sys_menu` VALUES ('29', '27', '删除', null, 'sys:log:remove', '2', null, '0', '2017-08-14 22:30:43', null);
INSERT INTO `sys_menu` VALUES ('30', '27', '清空', null, 'sys:log:clear', '2', null, '0', '2017-08-14 22:31:02', null);
INSERT INTO `sys_menu` VALUES ('48', '77', '代码生成', 'common/generator', 'common:generator', '1', 'fa fa-code', '3', null, null);
INSERT INTO `sys_menu` VALUES ('49', '0', '博客管理', '', '', '0', 'fa fa-rss', '6', null, null);
INSERT INTO `sys_menu` VALUES ('50', '49', '文章列表', 'blog/bContent', 'blog:bContent:bContent', '1', 'fa fa-file-image-o', '1', null, null);
INSERT INTO `sys_menu` VALUES ('51', '50', '新增', '', 'blog:bContent:add', '2', '', null, null, null);
INSERT INTO `sys_menu` VALUES ('55', '7', '编辑', '', 'sys:role:edit', '2', '', null, null, null);
INSERT INTO `sys_menu` VALUES ('56', '7', '删除', '', 'sys:role:remove', '2', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('57', '91', '运行监控', '/druid/index.html', '', '1', 'fa fa-caret-square-o-right', '1', null, null);
INSERT INTO `sys_menu` VALUES ('58', '50', '编辑', '', 'blog:bContent:edit', '2', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('59', '50', '删除', '', 'blog:bContent:remove', '2', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('60', '50', '批量删除', '', 'blog:bContent:batchRemove', '2', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('61', '2', '批量删除', '', 'sys:menu:batchRemove', '2', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('62', '7', '批量删除', '', 'sys:role:batchRemove', '2', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('68', '49', '发布文章', '/blog/bContent/add', 'blog:bContent:add', '1', 'fa fa-edit', '0', null, null);
INSERT INTO `sys_menu` VALUES ('71', '1', '文件管理', '/common/sysFile', 'common:sysFile:sysFile', '1', 'fa fa-folder-open', '2', null, null);
INSERT INTO `sys_menu` VALUES ('72', '77', '计划任务', 'common/job', 'common:taskScheduleJob', '1', 'fa fa-hourglass-1', '4', null, null);
INSERT INTO `sys_menu` VALUES ('77', '0', '系统工具', '', '', '0', 'fa fa-gear', '4', null, null);
INSERT INTO `sys_menu` VALUES ('78', '1', '数据字典', '/common/sysDict', 'common:sysDict:sysDict', '1', 'fa fa-book', '1', null, null);
INSERT INTO `sys_menu` VALUES ('79', '78', '增加', '/common/sysDict/add', 'common:sysDict:add', '2', null, '2', null, null);
INSERT INTO `sys_menu` VALUES ('80', '78', '编辑', '/common/sysDict/edit', 'common:sysDict:edit', '2', null, '2', null, null);
INSERT INTO `sys_menu` VALUES ('81', '78', '删除', '/common/sysDict/remove', 'common:sysDict:remove', '2', '', '3', null, null);
INSERT INTO `sys_menu` VALUES ('83', '78', '批量删除', '/common/sysDict/batchRemove', 'common:sysDict:batchRemove', '2', '', '4', null, null);
INSERT INTO `sys_menu` VALUES ('84', '0', '办公管理', '', '', '0', 'fa fa-laptop', '5', null, null);
INSERT INTO `sys_menu` VALUES ('85', '84', '通知公告', 'oa/notify', 'oa:notify:notify', '1', 'fa fa-pencil-square', null, null, null);
INSERT INTO `sys_menu` VALUES ('86', '85', '新增', 'oa/notify/add', 'oa:notify:add', '2', 'fa fa-plus', '1', null, null);
INSERT INTO `sys_menu` VALUES ('87', '85', '编辑', 'oa/notify/edit', 'oa:notify:edit', '2', 'fa fa-pencil-square-o', '2', null, null);
INSERT INTO `sys_menu` VALUES ('88', '85', '删除', 'oa/notify/remove', 'oa:notify:remove', '2', 'fa fa-minus', null, null, null);
INSERT INTO `sys_menu` VALUES ('89', '85', '批量删除', 'oa/notify/batchRemove', 'oa:notify:batchRemove', '2', '', null, null, null);
INSERT INTO `sys_menu` VALUES ('90', '84', '我的通知', 'oa/notify/selfNotify', '', '1', 'fa fa-envelope-square', null, null, null);
INSERT INTO `sys_menu` VALUES ('91', '0', '系统监控', '', '', '0', 'fa fa-video-camera', '5', null, null);
INSERT INTO `sys_menu` VALUES ('92', '91', '在线用户', 'sys/online', '', '1', 'fa fa-user', null, null, null);
INSERT INTO `sys_menu` VALUES ('97', '0', '分销管理', '', 'fx:fx', '0', 'fa fa-group', '1', null, null);
INSERT INTO `sys_menu` VALUES ('98', '97', '会员管理', 'fx/userInfo', 'fx:userInfo:userInfo', '1', 'fa fa-user', '1', null, null);
INSERT INTO `sys_menu` VALUES ('99', '98', '添加', 'fx/userInfo/add', 'fx:userInfo:add', '2', '', null, null, null);
INSERT INTO `sys_menu` VALUES ('100', '98', '编辑', 'fx/userInfo/edit', 'fx:userInfo:edit', '2', '', '2', null, null);
INSERT INTO `sys_menu` VALUES ('101', '98', '删除', '', 'fx:userInfo:remove', '2', '', '3', null, null);
INSERT INTO `sys_menu` VALUES ('102', '98', '批量删除', '', 'fx:userInfo:batchRemove', '2', '', '4', null, null);
INSERT INTO `sys_menu` VALUES ('103', '97', '分类管理', 'fx/goodsCategory', 'fx:goodsCategory:goodsCategory', '1', '', '2', null, null);
INSERT INTO `sys_menu` VALUES ('104', '103', '添加', 'fx/goodsCategory/add', 'fx:goodsCategory:add', '2', '', '1', null, null);
INSERT INTO `sys_menu` VALUES ('105', '103', '修改', 'fx/goodsCategory/edit', 'fx:goodsCategory:edit', '2', '', '2', null, null);
INSERT INTO `sys_menu` VALUES ('106', '103', '删除', '', 'fx:goodsCategory:remove', '2', '', '3', null, null);
INSERT INTO `sys_menu` VALUES ('107', '103', '批量删除', '', 'fx:goodsCategory:batchRemove', '2', '', '4', null, null);
INSERT INTO `sys_menu` VALUES ('108', '97', '商品管理', '/fx/goodsInfo', 'fx:goodsInfo:goodsInfo', '1', '', '3', null, null);
INSERT INTO `sys_menu` VALUES ('109', '108', '添加', '/fx/goodsInfo/add', 'fx:goodsInfo:add', '2', '', '1', null, null);
INSERT INTO `sys_menu` VALUES ('110', '108', '编辑', 'fx:goodsInfo:add/edit', 'fx:goodsInfo:edit', '2', '', '2', null, null);
INSERT INTO `sys_menu` VALUES ('111', '108', '删除', 'fx/goodsInfo/remove', 'fx:goodsInfo:remove', '2', '', '3', null, null);
INSERT INTO `sys_menu` VALUES ('112', '108', '批量删除', 'fx/goodsInfo/batchRemove', 'fx:goodsInfo:batchRemove', '2', '', '4', null, null);
INSERT INTO `sys_menu` VALUES ('113', '97', '分销规则', '/fx/distributionRuleSetup', 'fx:distributionRuleSetup:distributionRuleSetup', '1', '', '4', null, null);
INSERT INTO `sys_menu` VALUES ('114', '113', '添加', '/fx/distributionRuleSetup/add', 'fx:distributionRuleSetup:add', '2', '', '1', null, null);
INSERT INTO `sys_menu` VALUES ('115', '113', '删除', '/fx/distributionRuleSetup/remove', 'fx:distributionRuleSetup:remove', '2', '', '2', null, null);
INSERT INTO `sys_menu` VALUES ('116', '113', '编辑', '/fx/distributionRuleSetup/edit', 'fx:distributionRuleSetup:edit', '2', '', '3', null, null);
INSERT INTO `sys_menu` VALUES ('117', '113', '批量删除', '/fx/distributionRuleSetup/batchRemove', 'fx:distributionRuleSetup:batchRemove', '2', '', '4', null, null);
INSERT INTO `sys_menu` VALUES ('118', '97', '提现管理', '/fx/userWithdraw', 'fx:userWithdraw:userWithdraw', '1', '', '0', null, null);
INSERT INTO `sys_menu` VALUES ('119', '118', '编辑', '/fx/userWithdraw/edit', 'fx:userWithdraw:edit', '2', '', '0', null, null);
INSERT INTO `sys_menu` VALUES ('120', '118', '删除', '/fx/userWithdraw/remove', 'fx:userWithdraw:remove', '2', '', '1', null, null);
INSERT INTO `sys_menu` VALUES ('122', '118', '批量删除', '/fx/userWithdraw/batchRemove', 'fx:userWithdraw:batchRemove', '2', '', '3', null, null);

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `role_sign` varchar(100) DEFAULT NULL COMMENT '角色标识',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `user_id_create` bigint(255) DEFAULT NULL COMMENT '创建用户id',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '超级用户角色', 'admin', '拥有最高权限', '2', '2017-08-12 00:43:52', '2017-08-12 19:14:59');
INSERT INTO `sys_role` VALUES ('48', '钻石会员', null, '消费1w块', null, null, null);
INSERT INTO `sys_role` VALUES ('49', '白金会员', null, '消费5000以上', null, null, null);
INSERT INTO `sys_role` VALUES ('52', '白银会员', null, '消费两千以上', null, null, null);
INSERT INTO `sys_role` VALUES ('56', '普通用户', null, '普通用户', null, null, null);

-- ----------------------------
-- Table structure for `sys_role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3217 DEFAULT CHARSET=utf8 COMMENT='角色与菜单对应关系';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('367', '44', '1');
INSERT INTO `sys_role_menu` VALUES ('368', '44', '32');
INSERT INTO `sys_role_menu` VALUES ('369', '44', '33');
INSERT INTO `sys_role_menu` VALUES ('370', '44', '34');
INSERT INTO `sys_role_menu` VALUES ('371', '44', '35');
INSERT INTO `sys_role_menu` VALUES ('372', '44', '28');
INSERT INTO `sys_role_menu` VALUES ('373', '44', '29');
INSERT INTO `sys_role_menu` VALUES ('374', '44', '30');
INSERT INTO `sys_role_menu` VALUES ('375', '44', '38');
INSERT INTO `sys_role_menu` VALUES ('376', '44', '4');
INSERT INTO `sys_role_menu` VALUES ('377', '44', '27');
INSERT INTO `sys_role_menu` VALUES ('378', '45', '38');
INSERT INTO `sys_role_menu` VALUES ('379', '46', '3');
INSERT INTO `sys_role_menu` VALUES ('380', '46', '20');
INSERT INTO `sys_role_menu` VALUES ('381', '46', '21');
INSERT INTO `sys_role_menu` VALUES ('382', '46', '22');
INSERT INTO `sys_role_menu` VALUES ('383', '46', '23');
INSERT INTO `sys_role_menu` VALUES ('384', '46', '11');
INSERT INTO `sys_role_menu` VALUES ('385', '46', '12');
INSERT INTO `sys_role_menu` VALUES ('386', '46', '13');
INSERT INTO `sys_role_menu` VALUES ('387', '46', '14');
INSERT INTO `sys_role_menu` VALUES ('388', '46', '24');
INSERT INTO `sys_role_menu` VALUES ('389', '46', '25');
INSERT INTO `sys_role_menu` VALUES ('390', '46', '26');
INSERT INTO `sys_role_menu` VALUES ('391', '46', '15');
INSERT INTO `sys_role_menu` VALUES ('392', '46', '2');
INSERT INTO `sys_role_menu` VALUES ('393', '46', '6');
INSERT INTO `sys_role_menu` VALUES ('394', '46', '7');
INSERT INTO `sys_role_menu` VALUES ('598', '50', '38');
INSERT INTO `sys_role_menu` VALUES ('632', '38', '42');
INSERT INTO `sys_role_menu` VALUES ('737', '51', '38');
INSERT INTO `sys_role_menu` VALUES ('738', '51', '39');
INSERT INTO `sys_role_menu` VALUES ('739', '51', '40');
INSERT INTO `sys_role_menu` VALUES ('740', '51', '41');
INSERT INTO `sys_role_menu` VALUES ('741', '51', '4');
INSERT INTO `sys_role_menu` VALUES ('742', '51', '32');
INSERT INTO `sys_role_menu` VALUES ('743', '51', '33');
INSERT INTO `sys_role_menu` VALUES ('744', '51', '34');
INSERT INTO `sys_role_menu` VALUES ('745', '51', '35');
INSERT INTO `sys_role_menu` VALUES ('746', '51', '27');
INSERT INTO `sys_role_menu` VALUES ('747', '51', '28');
INSERT INTO `sys_role_menu` VALUES ('748', '51', '29');
INSERT INTO `sys_role_menu` VALUES ('749', '51', '30');
INSERT INTO `sys_role_menu` VALUES ('750', '51', '1');
INSERT INTO `sys_role_menu` VALUES ('1064', '54', '53');
INSERT INTO `sys_role_menu` VALUES ('1095', '55', '2');
INSERT INTO `sys_role_menu` VALUES ('1096', '55', '6');
INSERT INTO `sys_role_menu` VALUES ('1097', '55', '7');
INSERT INTO `sys_role_menu` VALUES ('1098', '55', '3');
INSERT INTO `sys_role_menu` VALUES ('1099', '55', '50');
INSERT INTO `sys_role_menu` VALUES ('1100', '55', '49');
INSERT INTO `sys_role_menu` VALUES ('1101', '55', '1');
INSERT INTO `sys_role_menu` VALUES ('1856', '53', '28');
INSERT INTO `sys_role_menu` VALUES ('1857', '53', '29');
INSERT INTO `sys_role_menu` VALUES ('1858', '53', '30');
INSERT INTO `sys_role_menu` VALUES ('1859', '53', '27');
INSERT INTO `sys_role_menu` VALUES ('1860', '53', '57');
INSERT INTO `sys_role_menu` VALUES ('1861', '53', '71');
INSERT INTO `sys_role_menu` VALUES ('1862', '53', '48');
INSERT INTO `sys_role_menu` VALUES ('1863', '53', '72');
INSERT INTO `sys_role_menu` VALUES ('1864', '53', '1');
INSERT INTO `sys_role_menu` VALUES ('1865', '53', '7');
INSERT INTO `sys_role_menu` VALUES ('1866', '53', '55');
INSERT INTO `sys_role_menu` VALUES ('1867', '53', '56');
INSERT INTO `sys_role_menu` VALUES ('1868', '53', '62');
INSERT INTO `sys_role_menu` VALUES ('1869', '53', '15');
INSERT INTO `sys_role_menu` VALUES ('1870', '53', '2');
INSERT INTO `sys_role_menu` VALUES ('1871', '53', '61');
INSERT INTO `sys_role_menu` VALUES ('1872', '53', '20');
INSERT INTO `sys_role_menu` VALUES ('1873', '53', '21');
INSERT INTO `sys_role_menu` VALUES ('1874', '53', '22');
INSERT INTO `sys_role_menu` VALUES ('1875', '49', '12');
INSERT INTO `sys_role_menu` VALUES ('1876', '49', '13');
INSERT INTO `sys_role_menu` VALUES ('1877', '49', '14');
INSERT INTO `sys_role_menu` VALUES ('1878', '49', '24');
INSERT INTO `sys_role_menu` VALUES ('1879', '49', '25');
INSERT INTO `sys_role_menu` VALUES ('1880', '49', '26');
INSERT INTO `sys_role_menu` VALUES ('1881', '49', '61');
INSERT INTO `sys_role_menu` VALUES ('1882', '49', '20');
INSERT INTO `sys_role_menu` VALUES ('1883', '49', '21');
INSERT INTO `sys_role_menu` VALUES ('1884', '49', '22');
INSERT INTO `sys_role_menu` VALUES ('1885', '49', '74');
INSERT INTO `sys_role_menu` VALUES ('1886', '49', '75');
INSERT INTO `sys_role_menu` VALUES ('1887', '49', '76');
INSERT INTO `sys_role_menu` VALUES ('1888', '49', '6');
INSERT INTO `sys_role_menu` VALUES ('1889', '49', '2');
INSERT INTO `sys_role_menu` VALUES ('1890', '49', '73');
INSERT INTO `sys_role_menu` VALUES ('2072', '52', '77');
INSERT INTO `sys_role_menu` VALUES ('2073', '52', '49');
INSERT INTO `sys_role_menu` VALUES ('2074', '52', '3');
INSERT INTO `sys_role_menu` VALUES ('2075', '52', '72');
INSERT INTO `sys_role_menu` VALUES ('2076', '52', '48');
INSERT INTO `sys_role_menu` VALUES ('2084', '56', '68');
INSERT INTO `sys_role_menu` VALUES ('2085', '56', '60');
INSERT INTO `sys_role_menu` VALUES ('2086', '56', '59');
INSERT INTO `sys_role_menu` VALUES ('2087', '56', '58');
INSERT INTO `sys_role_menu` VALUES ('2088', '56', '51');
INSERT INTO `sys_role_menu` VALUES ('2089', '56', '50');
INSERT INTO `sys_role_menu` VALUES ('2090', '56', '49');
INSERT INTO `sys_role_menu` VALUES ('2243', '48', '72');
INSERT INTO `sys_role_menu` VALUES ('2247', '63', '-1');
INSERT INTO `sys_role_menu` VALUES ('2248', '63', '84');
INSERT INTO `sys_role_menu` VALUES ('2249', '63', '85');
INSERT INTO `sys_role_menu` VALUES ('2250', '63', '88');
INSERT INTO `sys_role_menu` VALUES ('2251', '63', '87');
INSERT INTO `sys_role_menu` VALUES ('2252', '64', '84');
INSERT INTO `sys_role_menu` VALUES ('2253', '64', '89');
INSERT INTO `sys_role_menu` VALUES ('2254', '64', '88');
INSERT INTO `sys_role_menu` VALUES ('2255', '64', '87');
INSERT INTO `sys_role_menu` VALUES ('2256', '64', '86');
INSERT INTO `sys_role_menu` VALUES ('2257', '64', '85');
INSERT INTO `sys_role_menu` VALUES ('2258', '65', '89');
INSERT INTO `sys_role_menu` VALUES ('2259', '65', '88');
INSERT INTO `sys_role_menu` VALUES ('2260', '65', '86');
INSERT INTO `sys_role_menu` VALUES ('2262', '67', '48');
INSERT INTO `sys_role_menu` VALUES ('2263', '68', '88');
INSERT INTO `sys_role_menu` VALUES ('2264', '68', '87');
INSERT INTO `sys_role_menu` VALUES ('2265', '69', '89');
INSERT INTO `sys_role_menu` VALUES ('2266', '69', '88');
INSERT INTO `sys_role_menu` VALUES ('2267', '69', '86');
INSERT INTO `sys_role_menu` VALUES ('2268', '69', '87');
INSERT INTO `sys_role_menu` VALUES ('2269', '69', '85');
INSERT INTO `sys_role_menu` VALUES ('2270', '69', '84');
INSERT INTO `sys_role_menu` VALUES ('2271', '70', '85');
INSERT INTO `sys_role_menu` VALUES ('2272', '70', '89');
INSERT INTO `sys_role_menu` VALUES ('2273', '70', '88');
INSERT INTO `sys_role_menu` VALUES ('2274', '70', '87');
INSERT INTO `sys_role_menu` VALUES ('2275', '70', '86');
INSERT INTO `sys_role_menu` VALUES ('2276', '70', '84');
INSERT INTO `sys_role_menu` VALUES ('2277', '71', '87');
INSERT INTO `sys_role_menu` VALUES ('2278', '72', '59');
INSERT INTO `sys_role_menu` VALUES ('2279', '73', '48');
INSERT INTO `sys_role_menu` VALUES ('2280', '74', '88');
INSERT INTO `sys_role_menu` VALUES ('2281', '74', '87');
INSERT INTO `sys_role_menu` VALUES ('2282', '75', '88');
INSERT INTO `sys_role_menu` VALUES ('2283', '75', '87');
INSERT INTO `sys_role_menu` VALUES ('2284', '76', '85');
INSERT INTO `sys_role_menu` VALUES ('2285', '76', '89');
INSERT INTO `sys_role_menu` VALUES ('2286', '76', '88');
INSERT INTO `sys_role_menu` VALUES ('2287', '76', '87');
INSERT INTO `sys_role_menu` VALUES ('2288', '76', '86');
INSERT INTO `sys_role_menu` VALUES ('2289', '76', '84');
INSERT INTO `sys_role_menu` VALUES ('2292', '78', '88');
INSERT INTO `sys_role_menu` VALUES ('2293', '78', '87');
INSERT INTO `sys_role_menu` VALUES ('2294', '78', null);
INSERT INTO `sys_role_menu` VALUES ('2295', '78', null);
INSERT INTO `sys_role_menu` VALUES ('2296', '78', null);
INSERT INTO `sys_role_menu` VALUES ('2308', '80', '87');
INSERT INTO `sys_role_menu` VALUES ('2309', '80', '86');
INSERT INTO `sys_role_menu` VALUES ('2310', '80', '-1');
INSERT INTO `sys_role_menu` VALUES ('2311', '80', '84');
INSERT INTO `sys_role_menu` VALUES ('2312', '80', '85');
INSERT INTO `sys_role_menu` VALUES ('2328', '79', '72');
INSERT INTO `sys_role_menu` VALUES ('2329', '79', '48');
INSERT INTO `sys_role_menu` VALUES ('2330', '79', '77');
INSERT INTO `sys_role_menu` VALUES ('2331', '79', '84');
INSERT INTO `sys_role_menu` VALUES ('2332', '79', '89');
INSERT INTO `sys_role_menu` VALUES ('2333', '79', '88');
INSERT INTO `sys_role_menu` VALUES ('2334', '79', '87');
INSERT INTO `sys_role_menu` VALUES ('2335', '79', '86');
INSERT INTO `sys_role_menu` VALUES ('2336', '79', '85');
INSERT INTO `sys_role_menu` VALUES ('2337', '79', '-1');
INSERT INTO `sys_role_menu` VALUES ('2338', '77', '89');
INSERT INTO `sys_role_menu` VALUES ('2339', '77', '88');
INSERT INTO `sys_role_menu` VALUES ('2340', '77', '87');
INSERT INTO `sys_role_menu` VALUES ('2341', '77', '86');
INSERT INTO `sys_role_menu` VALUES ('2342', '77', '85');
INSERT INTO `sys_role_menu` VALUES ('2343', '77', '84');
INSERT INTO `sys_role_menu` VALUES ('2344', '77', '72');
INSERT INTO `sys_role_menu` VALUES ('2345', '77', '-1');
INSERT INTO `sys_role_menu` VALUES ('2346', '77', '77');
INSERT INTO `sys_role_menu` VALUES ('3174', '1', '92');
INSERT INTO `sys_role_menu` VALUES ('3175', '1', '57');
INSERT INTO `sys_role_menu` VALUES ('3176', '1', '30');
INSERT INTO `sys_role_menu` VALUES ('3177', '1', '29');
INSERT INTO `sys_role_menu` VALUES ('3178', '1', '28');
INSERT INTO `sys_role_menu` VALUES ('3179', '1', '72');
INSERT INTO `sys_role_menu` VALUES ('3180', '1', '48');
INSERT INTO `sys_role_menu` VALUES ('3181', '1', '68');
INSERT INTO `sys_role_menu` VALUES ('3182', '1', '60');
INSERT INTO `sys_role_menu` VALUES ('3183', '1', '59');
INSERT INTO `sys_role_menu` VALUES ('3184', '1', '58');
INSERT INTO `sys_role_menu` VALUES ('3185', '1', '51');
INSERT INTO `sys_role_menu` VALUES ('3186', '1', '62');
INSERT INTO `sys_role_menu` VALUES ('3187', '1', '56');
INSERT INTO `sys_role_menu` VALUES ('3188', '1', '55');
INSERT INTO `sys_role_menu` VALUES ('3189', '1', '15');
INSERT INTO `sys_role_menu` VALUES ('3190', '1', '26');
INSERT INTO `sys_role_menu` VALUES ('3191', '1', '25');
INSERT INTO `sys_role_menu` VALUES ('3192', '1', '24');
INSERT INTO `sys_role_menu` VALUES ('3193', '1', '14');
INSERT INTO `sys_role_menu` VALUES ('3194', '1', '13');
INSERT INTO `sys_role_menu` VALUES ('3195', '1', '12');
INSERT INTO `sys_role_menu` VALUES ('3196', '1', '61');
INSERT INTO `sys_role_menu` VALUES ('3197', '1', '22');
INSERT INTO `sys_role_menu` VALUES ('3198', '1', '21');
INSERT INTO `sys_role_menu` VALUES ('3199', '1', '20');
INSERT INTO `sys_role_menu` VALUES ('3200', '1', '83');
INSERT INTO `sys_role_menu` VALUES ('3201', '1', '81');
INSERT INTO `sys_role_menu` VALUES ('3202', '1', '80');
INSERT INTO `sys_role_menu` VALUES ('3203', '1', '79');
INSERT INTO `sys_role_menu` VALUES ('3204', '1', '71');
INSERT INTO `sys_role_menu` VALUES ('3205', '1', '27');
INSERT INTO `sys_role_menu` VALUES ('3206', '1', '91');
INSERT INTO `sys_role_menu` VALUES ('3207', '1', '77');
INSERT INTO `sys_role_menu` VALUES ('3208', '1', '50');
INSERT INTO `sys_role_menu` VALUES ('3209', '1', '49');
INSERT INTO `sys_role_menu` VALUES ('3210', '1', '7');
INSERT INTO `sys_role_menu` VALUES ('3211', '1', '6');
INSERT INTO `sys_role_menu` VALUES ('3212', '1', '2');
INSERT INTO `sys_role_menu` VALUES ('3213', '1', '3');
INSERT INTO `sys_role_menu` VALUES ('3214', '1', '78');
INSERT INTO `sys_role_menu` VALUES ('3215', '1', '1');
INSERT INTO `sys_role_menu` VALUES ('3216', '1', '-1');

-- ----------------------------
-- Table structure for `sys_task`
-- ----------------------------
DROP TABLE IF EXISTS `sys_task`;
CREATE TABLE `sys_task` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cron_expression` varchar(255) DEFAULT NULL COMMENT 'cron表达式',
  `method_name` varchar(255) DEFAULT NULL COMMENT '任务调用的方法名',
  `is_concurrent` varchar(255) DEFAULT NULL COMMENT '任务是否有状态',
  `description` varchar(255) DEFAULT NULL COMMENT '任务描述',
  `update_by` varchar(64) DEFAULT NULL COMMENT '更新者',
  `bean_class` varchar(255) DEFAULT NULL COMMENT '任务执行时调用哪个类的方法 包名+类名',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `job_status` varchar(255) DEFAULT NULL COMMENT '任务状态',
  `job_group` varchar(255) DEFAULT NULL COMMENT '任务分组',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建者',
  `spring_bean` varchar(255) DEFAULT NULL COMMENT 'Spring bean',
  `job_name` varchar(255) DEFAULT NULL COMMENT '任务名',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_task
-- ----------------------------
INSERT INTO `sys_task` VALUES ('2', '0/10 * * * * ?', 'run1', '1', '', '4028ea815a3d2a8c015a3d2f8d2a0002', 'com.bootdo.common.task.WelcomeJob', '2017-05-19 18:30:56', '1', 'group1', '2017-05-19 18:31:07', null, '', 'welcomJob');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `name` varchar(100) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `dept_id` int(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(100) DEFAULT NULL COMMENT '手机号',
  `status` tinyint(255) DEFAULT NULL COMMENT '状态 0:禁用，1:正常',
  `user_id_create` bigint(255) DEFAULT NULL COMMENT '创建用户id',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '超级管理员', '33808479d49ca8a3cdc93d4f976d1e3d', '6', 'admin@example.com', '123456', '1', '1', '2017-08-15 21:40:39', '2017-08-15 21:41:00');
INSERT INTO `sys_user` VALUES ('2', 'test', '临时用户', '6cf3bb3deba2aadbd41ec9a22511084e', '6', 'test@bootdo.com', null, '1', '1', '2017-08-14 13:43:05', '2017-08-14 21:15:36');
INSERT INTO `sys_user` VALUES ('36', 'ldh', '刘德华', 'bfd9394475754fbe45866eba97738c36', '6', 'ldh@bootdo.com', null, '1', null, null, null);
INSERT INTO `sys_user` VALUES ('123', 'zxy', '张学友', '35174ba93f5fe7267f1fb3c1bf903781', '6', 'zxy@bootdo', null, '0', null, null, null);
INSERT INTO `sys_user` VALUES ('124', 'wyf', '吴亦凡', 'e179e6f687bbd57b9d7efc4746c8090a', '6', 'wyf@bootdo.com', null, '1', null, null, null);
INSERT INTO `sys_user` VALUES ('130', 'lh', '鹿晗', '7924710cd673f68967cde70e188bb097', '9', 'lh@bootdo.com', null, '1', null, null, null);
INSERT INTO `sys_user` VALUES ('131', 'lhc', '令狐冲', 'd515538e17ecb570ba40344b5618f5d4', '6', 'lhc@bootdo.com', null, '0', null, null, null);
INSERT INTO `sys_user` VALUES ('132', 'lyf', '刘亦菲', '7fdb1d9008f45950c1620ba0864e5fbd', '13', 'lyf@bootdo.com', null, '1', null, null, null);
INSERT INTO `sys_user` VALUES ('133', 'my', '马云', '40545c12927485fc6ebf65a146246aa0', '9', 'my@bootdo.com', null, '1', null, null, null);
INSERT INTO `sys_user` VALUES ('134', 'lyh', '李彦宏', 'dc26092b3244d9d432863f2738180e19', '8', 'lyh@bootdo.com', null, '1', null, null, null);
INSERT INTO `sys_user` VALUES ('135', 'wjl', '王健林', '3967697dfced162cf6a34080259b83aa', '6', 'wjl@bootod.com', null, '1', null, null, null);
INSERT INTO `sys_user` VALUES ('136', 'gdg', '郭德纲', '3bb1bda86bc02bf6478cd91e42135d2f', '9', 'gdg@bootdo.com', null, '1', null, null, null);

-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=utf8 COMMENT='用户与角色对应关系';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('73', '30', '48');
INSERT INTO `sys_user_role` VALUES ('74', '30', '49');
INSERT INTO `sys_user_role` VALUES ('75', '30', '50');
INSERT INTO `sys_user_role` VALUES ('76', '31', '48');
INSERT INTO `sys_user_role` VALUES ('77', '31', '49');
INSERT INTO `sys_user_role` VALUES ('78', '31', '52');
INSERT INTO `sys_user_role` VALUES ('79', '32', '48');
INSERT INTO `sys_user_role` VALUES ('80', '32', '49');
INSERT INTO `sys_user_role` VALUES ('81', '32', '50');
INSERT INTO `sys_user_role` VALUES ('82', '32', '51');
INSERT INTO `sys_user_role` VALUES ('83', '32', '52');
INSERT INTO `sys_user_role` VALUES ('84', '33', '38');
INSERT INTO `sys_user_role` VALUES ('85', '33', '49');
INSERT INTO `sys_user_role` VALUES ('86', '33', '52');
INSERT INTO `sys_user_role` VALUES ('87', '34', '50');
INSERT INTO `sys_user_role` VALUES ('88', '34', '51');
INSERT INTO `sys_user_role` VALUES ('89', '34', '52');
INSERT INTO `sys_user_role` VALUES ('97', '36', '48');
INSERT INTO `sys_user_role` VALUES ('106', '124', '1');
INSERT INTO `sys_user_role` VALUES ('110', '1', '1');
INSERT INTO `sys_user_role` VALUES ('111', '2', '1');
INSERT INTO `sys_user_role` VALUES ('113', '131', '48');
INSERT INTO `sys_user_role` VALUES ('117', '135', '1');
INSERT INTO `sys_user_role` VALUES ('120', '134', '1');
INSERT INTO `sys_user_role` VALUES ('121', '134', '48');
INSERT INTO `sys_user_role` VALUES ('122', '133', '1');
INSERT INTO `sys_user_role` VALUES ('123', '130', '1');
INSERT INTO `sys_user_role` VALUES ('124', null, '48');
