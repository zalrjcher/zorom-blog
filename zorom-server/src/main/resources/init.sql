DROP TABLE IF EXISTS `zrm_user_info`;
CREATE TABLE `zrm_user_info`
(
    `id`            bigint(20)   NOT NULL AUTO_INCREMENT,
    `nick_name`     varchar(100)  NOT NULL COMMENT '昵称',
    `avatar`        varchar(200) NOT NULL DEFAULT '' COMMENT '用户头像',
    `gender`        int(1)       NOT NULL DEFAULT '0',
    `age`        int(2)       NULL comment '年龄',
    `phone`         varchar(20)      NULL comment '电话',
    `wechat`        varchar(100)     NULL comment '微信号',
    `email`        varchar(100)         NULL comment '邮箱',
    `remark`        text                NULL comment '备注',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1001
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户基本信息表';


DROP TABLE IF EXISTS `zrm_user_account`;
CREATE TABLE `zrm_user_account`
(
    `id`            varchar(32) NOT NULL,
    `uid`           bigint(20)  NOT NULL COMMENT 'user_base_info的id',
    `account` varchar(50) NOT NULL COMMENT '账号',
    `state`         int(1)   NOT NULL COMMENT '用户状态',
    `account_type`  int(1)  NOT NULL DEFAULT '1' COMMENT '账号类型',
    `register_time` datetime     NOT NULL,
    `register_ip`   varchar(50)  NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uid_account_type_unique` (`uid`, `account_type`),
    UNIQUE KEY `login_account_account_type_unique` (`account`, `account_type`),
    KEY `uid_index` (`uid`),
    KEY `login_account_index` (`account`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户账户信息表';


DROP TABLE IF EXISTS `zrm_user_password`;
CREATE TABLE `zrm_user_password`
(
    `id`            varchar(32) NOT NULL,
    `aid`           bigint(20)  NOT NULL,
    `passwd`        varchar(50) NOT NULL,
    `salt`          varchar(8)  NOT NULL,
    `password_type` int(1)  NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uid_type_unique` (`aid`, `password_type`),
    KEY `uid_index` (`aid`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户密码表';

DROP TABLE IF EXISTS `zrm_oauth_role_info`;
CREATE TABLE `zrm_oauth_role_info`
(
    `id`     bigint(20)  NOT NULL AUTO_INCREMENT,
    `name`   varchar(50) NOT NULL,
    `remark` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1001
  DEFAULT CHARSET = utf8mb4 COMMENT ='管理平台角色表';


DROP TABLE IF EXISTS `zrm_oauth_user_role`;
CREATE TABLE `zrm_oauth_user_role`
(
    `id`      bigint(20) NOT NULL AUTO_INCREMENT,
    `user_id` bigint(20) NOT NULL,
    `role_id` bigint(20) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1003
  DEFAULT CHARSET = utf8mb4 COMMENT ='管理平台用户与角色关联表';

DROP TABLE IF EXISTS `oauth_role_authority`;
CREATE TABLE `oauth_role_authority`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT,
    `resource_id` bigint(20) NOT NULL,
    `role_id`     bigint(20) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 231
  DEFAULT CHARSET = utf8mb4 COMMENT ='管理平台角色资源关联表';

DROP TABLE IF EXISTS `zrm_oauth_authority`;
CREATE TABLE `zrm_oauth_authority`
(
    `id`        bigint(20)   NOT NULL AUTO_INCREMENT,
    `parent_id` bigint(20)   NOT NULL,
    `authority` varchar(32)  NOT NULL,
    `name`      varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1030
  DEFAULT CHARSET = utf8mb4 COMMENT ='管理平台权限资源表';