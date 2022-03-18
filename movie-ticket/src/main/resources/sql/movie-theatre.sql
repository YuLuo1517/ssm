
--

create table t_film (
  id  bigint  unsigned not null primary  key auto_increment  comment '主键',

  film_id varchar(32) not null default '' comment '唯一标识',

  name varchar(40) not null default  ''  comment '电视名称',

  director varchar(30) not null default  ''  comment '导演',

  player varchar(20) not null default  '' comment '主演',

  type varchar(50) not null default ''  comment '电影类型',

  status tinyint  not null default 1  comment '电影状态 1 表示 正在热映 2 ，即将上映'

  country varchar(50) not null default '' comment '城市',

  length  int unsigned not null  comment '电影时长',

  summary varchar(200) not null comment '电影摘要',

  image_path  varchar(200) not null default  '' comment '海报地址',
)default charset=utf-8