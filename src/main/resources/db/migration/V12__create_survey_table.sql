create table survey
(
    id bigint auto_increment,
    ent_id bigint null comment '企业id',
    title varchar(50) null,
    content varchar(2048) null,
    num int null,
    create_id bigint null,
    constraint survey_pk
        primary key (id)
);

