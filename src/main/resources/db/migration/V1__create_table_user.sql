create table user
(
	id bigint auto_increment,
	userName varchar(50) null,
	password varchar(30) null,
	constraint user_pk
		primary key (id)
);

