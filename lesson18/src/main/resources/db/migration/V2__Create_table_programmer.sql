create table programmer (
	id int not null auto_increment primary key,
	name varchar(255),
	salary int,
	mastery enum('TRAINEE', 'JUNIOR', 'MIDDLE', 'SENIOR', 'LEAD', 'CHIEF'),
	language varchar(255),
	company_id int,
	foreign key (company_id) references company(id)
);