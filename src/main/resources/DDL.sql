CREATE TABLE `filmforumdb`.`Untitled`  (
  `id` int NOT NULL COMMENT '编号',
  `username` varchar(255) NULL COMMENT '账号',
  `password` varchar(255) NULL COMMENT '密码',
  `phone` varchar(255) NULL COMMENT '电话',
  `QQ` varchar(255) NULL COMMENT 'QQ',
  `email` varchar(255) NULL COMMENT '邮箱',
  `sex` varchar(255) NULL COMMENT '性别',
  `regTime` datetime NULL COMMENT '注册时间',
  `loginCount` varchar(255) NULL COMMENT '登陆次数',
  PRIMARY KEY (`id`)
);