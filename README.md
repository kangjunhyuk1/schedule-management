# schedule-management
https://www.notion.so/10d123cc96b58039a6e8f7f3cc3c964a?v=1ac78e13de8449c7a00427dd0e9932d2&pvs=4(api)
[https://lucid.app/documents#/home?folder_id=recent](https://lucid.app/lucidchart/d1c25ae9-4eab-439d-be3b-904fc36974fc/edit?page=0_0#)(ERD)
/*create*/

create database Schedule_management;

create table users (
	id int not NULL auto_increment primary KEY,
    password varchar(15) not null,
    name varchar(6) not Null,
    email varchar(100) null
	);


create table schedules(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id int,
    name varchar(10) NOT NULL,
    color varchar(100) null,
    title varchar(100) NOT NULL,
    creation_date datetime NULL,
    foreign key (user_id) references users (user_id)
    );
    
/*insert*/

insert into users (password, name, email)
values ('tast123', '강준혁', 'abv@gmail.com');

insert into schedules_calendar (name, color, title, date)
values ('오늘 할 일', 'red', '장보기', now());

/*전체 일정 Select*/

SELECT *
from schedules;

/*선택 일정 Select*/

SELECT *
from schedules
where calendar_id = 1;

/*Update*/
update schedules s, users u
set s.name = '내일 할 일'
where u.password;

/*Delete*/

delete from schedules s
where s.color
