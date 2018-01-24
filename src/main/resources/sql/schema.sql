-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
  `user_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` VARCHAR(50) NOT NULL COMMENT '用户名',
  `user_phone` BIGINT NOT NULL COMMENT '手机号',
  `score` INT NOT NULL COMMENT '积分',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  KEY `idx_user_phone`(`user_phone`)
)ENGINE=INNODB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='用户表';


-- 插入初始数据
INSERT INTO
  user(user_name, user_phone, score)
VALUES
  ('阿坚', 18768128888, 0),
  ('小明', 18968129999, 0);