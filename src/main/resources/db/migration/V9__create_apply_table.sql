create table patent_apply
(
    id bigint auto_increment,
    name varchar(50) null,
    summary varchar(200) null,
    detail varchar(2048) null,
    user_id bigint null,
    create_date bigint null,
    is_succeed bool null,
    progress int null,
    admin_id bigint null,
    constraint patent_apply_pk
        primary key (id)
);

