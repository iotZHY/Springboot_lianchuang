create table comment
(
    id bigint auto_increment,
    user_id bigint null,
    idea_id bigint null,
    content varchar(1024) null,
    create_date bigint null,
    constraint comment_pk
        primary key (id)
);

