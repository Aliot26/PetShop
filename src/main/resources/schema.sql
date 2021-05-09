create table category
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
);

create table product
(
    id          bigint auto_increment
        primary key,
    name        varchar(255) null,
    price       int          null,
    category_id bigint       null,
    constraint FK1mtsbur82frn64de7balymq9s
        foreign key (category_id) references category (id)
);
