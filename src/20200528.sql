CREATE TABLE member(
num INT PRIMARY KEY,
NAME VARCHAR(50),
addr VARCHAR(50));

DESC member;

INSERT INTO member (num, NAME, addr) VALUES (1,'성영한','서울');
INSERT INTO member (num, NAME) VALUES (2,'손정의');
INSERT INTO member VALUES (3,'잡스','미국');
#에러 발생 - primary key 칼럼에는 중복된 값이 들어가면 안 됨.
INSERT INTO member (num, NAME, addr) VALUES(1, '조스','미국');
INSERT INTO member (NAME, addr) VALUES ('조스','미국');

#'*' 쓰지 말 것!
SELECT * FROM member;

SELECT num FROM member;

SELECT num, NAME FROM member;

SELECT num, NAME, addr FROM member;

DELETE FROM member WHERE num = 3;

UPDATE member SET addr = '일본', NAME='손정이'  WHERE num = 2


