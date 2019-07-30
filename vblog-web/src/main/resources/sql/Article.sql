-- auto Generated on 2019-07-28 17:59:48 
-- DROP TABLE IF EXISTS `article`; 
CREATE TABLE `article`(
    `title` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '标题',
    `submit` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '摘要',
    `is_top` SMALLINT (5) NOT NULL DEFAULT -1 COMMENT '是否置顶',
    `category_id` BIGINT (15) NOT NULL DEFAULT -1 COMMENT '分类id',
    `is_review` SMALLINT (5) NOT NULL DEFAULT -1 COMMENT '是否审核',
    `tag` BIGINT (15) NOT NULL DEFAULT -1 COMMENT '标签',
    `user_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '用户名',
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `is_del` SMALLINT (5) NOT NULL DEFAULT -1 COMMENT '是否删除',
    `create_time` DATETIME NOT NULL COMMENT 'createTime',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '文章';