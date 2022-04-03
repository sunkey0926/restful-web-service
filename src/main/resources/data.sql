insert into user values(90001, sysdate(), 'test_user1', 'test_pass1', '123456-123456');
insert into user values(90002, sysdate(), 'test_user2', 'test_pass2', '123456-123456');
insert into user values(90003, sysdate(), 'test_user3', 'test_pass3', '123456-123456');

insert into post values(100001, 'test description 1', 90001);
insert into post values(100002, 'test description 2', 90001);
insert into post values(100003, 'test description 3', 90001);