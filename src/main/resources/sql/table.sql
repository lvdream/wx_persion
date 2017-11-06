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
  DEFAULT CHARSET = utf8;