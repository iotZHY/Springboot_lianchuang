create table idea
(
    id bigint auto_increment,
    title varchar(50) null,
    tags varchar(50) null,
    create_date bigint null,
    content varchar(1024) null,
    creator bigint null,
    constraint idea_pk
        primary key (id)
);

