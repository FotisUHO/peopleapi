drop table if exists  people;

create table people(
    id BIGINT AUTO_INCREMENT  PRIMARY KEY,
    name varchar(250) not null,
    age int not null,
    balance double not null,
    email varchar(250) not null,
    address varchar(250) not null
);