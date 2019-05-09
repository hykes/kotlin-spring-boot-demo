
CREATE TABLE IF NOT EXISTS `kotlin_users` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` VARCHAR(64) NOT NULL COMMENT '用户名称',
  `company_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '公司ID',
  `status` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '状态。-1:已删除;0:停用;1:已启用',
  `extra_json` VARCHAR(1024) DEFAULT NULL COMMENT '扩展信息',
  `created_at` DATETIME NOT NULL COMMENT '创建时间',
  `updated_at` DATETIME NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) COMMENT='用户表';


