create table purchase_apply
(
    id bigint auto_increment,
    pur_id bigint null comment '购买者id',
    patent_id bigint null,
    admin_id bigint null,
    create_id bigint null,
    constraint purchase_apply_pk
        primary key (id)
);

