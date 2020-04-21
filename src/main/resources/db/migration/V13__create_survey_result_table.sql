create table survey_result
(
    id bigint auto_increment,
    survey_id bigint null,
    result varchar(1024) null,
    user_id bigint null,
    constraint survey_result_pk
        primary key (id)
);

