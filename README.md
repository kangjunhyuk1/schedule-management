# schedule-management
https://www.notion.so/10d123cc96b58039a6e8f7f3cc3c964a?v=1ac78e13de8449c7a00427dd0e9932d2&pvs=4    (api)
[https://lucid.app/documents#/home?folder_id=recent](https://lucid.app/lucidchart/d1c25ae9-4eab-439d-be3b-904fc36974fc/edit?page=0_0#)(ERD)
/*create*/

create database Schedule_management;


create table schedules(
                          id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
                          password varchar(100) null, 
                          name varchar(10) NOT NULL,
                          color varchar(100) null,
                          title varchar(100) NOT NULL,
                          creation_at datetime NULL,
                          modified_at datetime null,
                          primary key (id) 

);

/*insert*/

insert into schedules (name, color, title, creation_at)
values ('오늘 할 일', 'red', '장보기', now());

/*전체 일정 Select*/

SELECT *
from schedules;

/*선택 일정 Select*/

SELECT *
from schedules
where id = 1;

/*Update*/
update schedules s
set s.name = '내일 할 일';

/*Delete*/

delete from schedules s
where s.color
