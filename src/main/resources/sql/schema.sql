-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
  `user_id` BIGINT NOT NULL COMMENT '用户ID',
  `user_name` VARCHAR(30) NOT NULL COMMENT '用户名',
  `user_password` VARCHAR(20) NOT NULL COMMENT '密码',
  `user_email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `user_phone` BIGINT DEFAULT NULL COMMENT '手机号',
  `user_gender` varchar(5) NOT NULL DEFAULT '保密',
  `user_birthday` date NOT NULL DEFAULT '1990-01-01',
  `score` INT NOT NULL DEFAULT '0' COMMENT '积分',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY (`user_name`) USING HASH
)ENGINE=INNODB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户表';


-- 插入初始数据
INSERT INTO
  user(`user_id`, `user_name`, `user_password`)
VALUES
  (1, 'AA', '123AA'),
  (2, 'BB', '123BB'),
  (3, 'CC', '123CC');