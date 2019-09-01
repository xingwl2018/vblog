-- auto Generated on 2019-08-30 21:52:06 
-- DROP TABLE IF EXISTS `v_role_auth`; 
CREATE TABLE `v_role_auth`(
    `role_id` BIGINT (15) NOT NULL DEFAULT 0 COMMENT 'roleId',
    `auth_id` BIGINT (15) NOT NULL DEFAULT 0 COMMENT 'authId',
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `is_del` SMALLINT (5) NOT NULL DEFAULT -1 COMMENT 'isDel',
    `create_time` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createTime',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`v_role_auth`';