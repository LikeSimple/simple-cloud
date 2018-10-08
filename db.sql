


create table authority
(
	id char(22) not null
		primary key,
	name varchar(30) not null comment '权限名（SCOPE_AUTH_NAME）',
	description varchar(50) null comment '权限描述',
	create_time datetime default CURRENT_TIMESTAMP not null,
	update_time datetime null
)
;

create table corporation
(
	id char(22) not null
		primary key,
	name varchar(100) not null comment '公司名称',
	type varchar(20) null comment '公司类型（本部，子公司，分公司，办事处）',
	node_level char(20) default '0' not null comment '节点层级',
	create_time datetime default CURRENT_TIMESTAMP not null,
	update_time datetime null
)
;

create table department
(
	id char(22) not null
		primary key,
	corporation_id char(22) null,
	name varchar(50) not null comment '部门名称',
	node_level char(20) default '0' not null comment '节点层级',
	create_time datetime default CURRENT_TIMESTAMP null,
	update_time datetime null,
	constraint department_corporation_id_fk
		foreign key (corporation_id) references corporation (id)
)
comment '公司部门'
;

create table `group`
(
	id char(22) not null
		primary key,
	name varchar(30) not null comment '用户组名',
	description varchar(50) null comment '用户组描述',
	create_time datetime default CURRENT_TIMESTAMP not null,
	update_time datetime null
)
comment '用户组'
;

create table group_authority
(
	group_id char(22) not null,
	authority_id char(22) not null,
	primary key (group_id, authority_id),
	constraint group_authority_authority_id_fk
		foreign key (authority_id) references authority (id),
	constraint group_authority_group_id_fk
		foreign key (group_id) references `group` (id)
)
;

create table oauth_client_details
(
	client_id varchar(255) not null
		primary key,
	resource_ids varchar(255) null,
	client_secret varchar(255) null,
	scope varchar(255) null,
	authorized_grant_types varchar(255) null,
	web_server_redirect_uri varchar(255) null,
	authorities varchar(255) null,
	access_token_validity int null,
	refresh_token_validity int null,
	additional_information text null,
	archived tinyint(1) default '0' null,
	trusted tinyint(1) default '0' null,
	autoapprove varchar(255) default 'false' null,
	create_time timestamp default CURRENT_TIMESTAMP null,
	update_time datetime null
)
;

create table position
(
	id char(22) not null
		primary key,
	department_id char(22) not null,
	name varchar(50) not null comment '岗位名称',
	node_level char(20) default '0' not null,
	create_time datetime default CURRENT_TIMESTAMP not null,
	update_time datetime null,
	constraint position_department_id_fk
		foreign key (department_id) references department (id)
)
comment '岗位'
;

create table user
(
	id char(22) not null
		primary key,
	username varchar(30) not null comment '登录用户名,内容规范见另行定义',
	password char(80) not null comment 'bcrypt加密',
	locked tinyint(1) default '0' not null comment '用户锁定标志',
	enabled tinyint(1) default '1' not null comment '账号启动标志',
	account_expire datetime null comment '账号过期时间，不指定为永久有效',
	credential_expire datetime null comment '密码凭证过期时间，不指定为永久有效',
	create_time datetime default CURRENT_TIMESTAMP not null,
	update_time datetime null,
	constraint user_details_username_uindex
		unique (username)
)
;

create table user_group
(
	user_id char(22) not null,
	group_id char(22) not null,
	primary key (user_id, group_id),
	constraint user_group_group_id_fk
		foreign key (group_id) references `group` (id),
	constraint user_group_user_id_fk
		foreign key (user_id) references user (id)
)
;

create table user_position
(
	user_id char(22) not null,
	position_id char(22) not null,
	primary key (user_id, position_id),
	constraint user_position_position_id_fk
		foreign key (position_id) references position (id),
	constraint user_position_user_id_fk
		foreign key (user_id) references user (id)
)
comment '用户岗位'
;

create table user_profile
(
	user_id char(22) not null
		primary key,
	real_name varchar(50) null comment '真实姓名',
	avatar varchar(150) null comment '用户头像',
	sex char null comment '性别
F-->Female
M-->Male
T-->TransGender',
	age int default '-1' not null comment '年龄',
	mobile varchar(50) null comment '手机',
	email varchar(60) null comment '电子邮箱',
	create_time datetime default CURRENT_TIMESTAMP not null,
	update_time datetime null,
	constraint user_profile_user_id_fk
		foreign key (user_id) references user (id)
)
comment '用户档案'
;

