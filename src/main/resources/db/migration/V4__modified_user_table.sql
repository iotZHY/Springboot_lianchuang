alter table user
    add type int not null comment '0为管理员
1为企业用户
2为普通用户';

alter table user
    add email varchar(50) null;

alter table user
    add birthday date null;

alter table user
    add profession varchar(50) null;
