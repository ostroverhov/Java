insert into company
	(name) values
	('epam'),
	('belhard'),
	('godel'),
	('syberis');

insert into programmer
	(name,salary,mastery,language,company_id) values
	('Lena',800,'JUNIOR','java',(select id from company where name='epam')),
	('Vlad',300,'TRAINEE','c++',(select id from company where name='godel')),
	('Dima',248,'SENIOR','c#',(select id from company where name='belhard')),
	('Zhenya',400,'JUNIOR','java',(select id from company where name='epam')),
	('Vitja',2323,'LEAD','c#',(select id from company where name='syberis')),
	('Danil',800,'MIDDLE','js',(select id from company where name='epam')),
	('Jan',345,'JUNIOR','php',(select id from company where name='belhard')),
	('Vasja',546,'JUNIOR','java',(select id from company where name='godel')),
	('Nikita',800,'MIDDLE','java',(select id from company where name='syberis')),
	('Petja',346,'JUNIOR','c++',(select id from company where name='epam')),
	('Ira',670,'CHIEF','java',(select id from company where name='syberis'));