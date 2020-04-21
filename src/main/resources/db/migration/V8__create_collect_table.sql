create table `collect`
(
    id bigint auto_increment,
    user_id bigint null,
    idea_id bigint null,
    constraint collect_pk
        primary key (id)
);

