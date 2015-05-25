drop database if exists recruitmentboard;

create database recruitmentboard;

use recruitmentboard;

create table user_table
(
user_id int auto_increment,
user_username varchar(50) not null,
user_userpass varchar(50) not null,
user_userpn varchar(50) not null,
user_age int not null,
user_school varchar(50) not null,
primary key(user_id),
unique key(user_username)
);

create table hr_table
(
hr_id int auto_increment,
hr_hrname varchar(50) not null,
hr_hrpass varchar(50) not null,
hr_hrpn varchar(50) not null,
hr_comp varchar(50) not null,
primary key(hr_id),
unique key(hr_hrname)
);

create table pos_table
(
pos_id int auto_increment,
pos_posname varchar(50) not null,
pos_postext varchar(255),
pos_possalary varchar(50) not null,
pos_pospubtime datetime not null,
hr_id int not null,
primary key(pos_id),
foreign key(hr_id) references hr_table(hr_id)
);

create table app_table
(
app_id int auto_increment,
app_apptime datetime not null,
user_id int not null,
pos_id int not null,
primary key(app_id),
foreign key(user_id) references user_table(user_id),
foreign key(pos_id) references pos_table(pos_id)
);

create table reptype_table
(
reptype_id int auto_increment,
reptype_rtype varchar(50) not null,
primary key(reptype_id),
unique key(reptype_rtype)
);

create table reply_table
(
reply_id int auto_increment,
reply_replytime datetime,
app_id int not null,
hr_id int not null,
reptype_id int not null,
primary key(reply_id),
unique key(app_id),
foreign key(app_id) references app_table(app_id),
foreign key(hr_id) references hr_table(hr_id),
foreign key(reptype_id) references reptype_table(reptype_id)
);

# 回复类型
insert into reptype_table ( reptype_rtype )
	values ( '未处理' );
insert into reptype_table ( reptype_rtype )
	values ( '已拒绝' );
insert into reptype_table ( reptype_rtype )
	values ( '可面试' );
	
# USER
insert into user_table ( user_username , user_userpass , user_userpn , user_age , user_school )
	values ( 'lilzhang' , '123456' , '13123456789' , 25 , '古德里安装甲兵学院' );
insert into user_table ( user_username , user_userpass , user_userpn , user_age , user_school )
	values ( 'young' , 'doge' , '15000123456' , 25 , 'SUES' );
	
# HR
insert into hr_table ( hr_hrname , hr_hrpass , hr_hrpn , hr_comp )
	values ( 'wayne' , 'qwert' , '1506666666' , 'dp.com' );
insert into hr_table ( hr_hrname , hr_hrpass , hr_hrpn , hr_comp )
	values ( 'amway888' , '888' , '98765' , 'amway' );