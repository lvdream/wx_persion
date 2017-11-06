DROP TABLE IF EXISTS `mstb_wx_user`;
CREATE TABLE IF NOT EXISTS `mstb_wx_user` (
  `mw_id`          INT(7)       NOT NULL AUTO_INCREMENT
  COMMENT '序号',
  `mw_openid`      VARCHAR(100) NOT NULL
  COMMENT '微信id',
  `mw_nickname`    VARCHAR(50)  NOT NULL
  COMMENT '昵称',
  `wx_remark`      VARCHAR(20)
  COMMENT '备注',
  `wx_sex`         VARCHAR(4)
  COMMENT '性别',
  `wx_country`     VARCHAR(10)
  COMMENT '国家',
  `wx_province`    VARCHAR(16)
  COMMENT '省份',
  `wx_city`        VARCHAR(16)
  COMMENT '城市',
  `wx_district`    VARCHAR(16)
  COMMENT '区',
  `wx_address`     VARCHAR(100)
  COMMENT '位置',
  `wx_headimgurl`  VARCHAR(200)
  COMMENT '头像',
  `wx_scene`       VARCHAR(7)            DEFAULT '0'
  COMMENT '场景',
  `wx_score`       INT(9)                DEFAULT '0'
  COMMENT '积分',
  `wx_subscribe`   VARCHAR(20)
  COMMENT '关注时间',
  `wx_tagid`       VARCHAR(10)
  COMMENT '标签ID',
  `wx_create_time` VARCHAR(20) COMMENT '创建时间',
  PRIMARY KEY (`mw_id`),
  UNIQUE KEY `mw_openid` (`mw_openid`)
)
  ENGINE = innodb
  COMMENT '微信用户表'
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `mstb_where_main`;
CREATE TABLE IF NOT EXISTS `mstb_where_main` (
  `mwm_id`         INT         NOT NULL AUTO_INCREMENT
  COMMENT '序号',
  `mw_id`          INT         NOT NULL
  COMMENT '用户序号',
  `mwm_box_name`   VARCHAR(50) NOT NULL
  COMMENT '容器名',
  `mwm_remark`     VARCHAR(20)
  COMMENT '备注',
  `mwm_address`    VARCHAR(100)
  COMMENT '位置',
  `mwm_imgaes`     VARCHAR(200)
  COMMENT '容器照片',
  `mwm_create_time` VARCHAR(20) COMMENT '创建时间',
  `mwm_update_time` VARCHAR(20) COMMENT '更新时间',
  PRIMARY KEY (`mwm_id`)
)
  ENGINE = innodb
  COMMENT '在哪主表_容器'
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `mstb_where_sub`;
CREATE TABLE IF NOT EXISTS `mstb_where_sub` (
  `mws_id`          INT         NOT NULL AUTO_INCREMENT
  COMMENT '序号',
  `mwm_id`          INT         NOT NULL
  COMMENT '容器序号',
  `mw_id`           INT         NOT NULL
  COMMENT '用户序号',
  `mws_item_name`   VARCHAR(50) NOT NULL
  COMMENT '物品名称',
  `mws_remark`      VARCHAR(20)
  COMMENT '备注',
  `mws_address`     VARCHAR(100)
  COMMENT '位置',
  `mws_imgaes`      VARCHAR(200)
  COMMENT '容器照片',
  `mws_create_time` VARCHAR(20) COMMENT '创建时间',
  `mws_update_time` VARCHAR(20) COMMENT '更新时间',
  PRIMARY KEY (`mws_id`)
)
  ENGINE = innodb
  COMMENT '在哪主表_物品'
  DEFAULT CHARSET = utf8;

