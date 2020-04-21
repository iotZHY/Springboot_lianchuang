create table `like`
(
    id bigint auto_increment,
    user_id bigint null,
    idea_id bigint null,
    constraint like_pk
        primary key (id)
);

