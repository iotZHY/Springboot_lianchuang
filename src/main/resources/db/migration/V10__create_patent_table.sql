create table patent
(
    id bigint auto_increment,
    user_id bigint null,
    info varchar(100) null,
    constraint patent_pk
        primary key (id)
);

