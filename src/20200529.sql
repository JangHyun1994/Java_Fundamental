#emp 테이블에서 사원번호, 사원이름, 직업을 출력.
SELECT empno, ename, job
FROM emp;

#emp테이블에서 사원번호, 급여, 부서번호를 출력. 급여 많은 순서대로 출력.
SELECT empno, sal, deptno
FROM emp
ORDER BY sal; #기본값은 어센딩(ASC) / ascend, descend 오름차순, 내림차순

#emp테이블에서 사원번호, 급여, 입사일을 출력. 급여 적은 순서대로 출력.
SELECT empno, sal, hiredate
FROM emp
ORDER BY sal ASC;

#emp테이블에서 직업, 급여 출력. 직업은 오름차순 / (직업명 같은 사람들의) 급여는 내림차순 정렬하여 출력. 이해중요.
SELECT job, sal
FROM emp
ORDER BY job ASC, sal DESC  #칼럼 + 정렬순서, 칼럼 + 정렬순서. 전자 적용 후 덮어쓰기 작용으로 후자 적용.

#emp테이블에서 empno는 사원번호로, ename은 사원이름으로 칼럼 정보를 바꾸어, 출력.
#ALIAS 사용하기(칼럼에별칭붙이기)
SELECT empno AS "사원번호", ename AS "사원이름"
FROM emp;

select empno "사원 번호", ename "사원 이름"
FROM emp

select empno 사원번호, ename 사원이름
FROM emp
#빈칸 그리고 쌍따옴표.

#emp테이블에서 부서번호가 10번인 사람들의 부서번호, 그들의 급여, 10% 인상된 급여를 함께 출력하시오.
SELECT deptno, sal, sal*1.1
FROM emp
WHERE deptno = 10;

#emp테이블에서 부서번호 10번의 사람들의 부서번호, 급여, 급여+커미션 출력.
SELECT deptno, sal, sal + ifnull(comm,0)
FROM emp
WHERE deptno = 10;

#emp테이블에서 급여가 3000 이상인 사원들의 모든 정보를 출력. (비교연산자)
SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno
FROM emp
WHERE sal >= 3000;

#emp테이블에서 부서번호가 30번이 아닌 사람들의 이름과 부서번호를 출력. (비교연산자)
SELECT ename, deptno
FROM emp
WHERE deptno != 30;

#emp테이블에서 부서번호가 10번이고(그 사람들 중에서), 급여가 3000이상인 사람들의 이름과 급여를 출력.
SELECT ename, sal
FROM emp
WHERE deptno = 10 AND sal >= 3000;

#emp테이블에서 직업이 salesman이거나, manager인 사원의 사원번호와 부서번호 출력.
SELECT empno, deptno, job
FROM emp
WHERE job = "salesman" OR job = "manager";

SELECT empno, deptno, job
FROM emp
WHERE job != 'clerk' AND job != 'analyst' AND job != 'president';

#부서번호가 10번이거나 20번인 사원의 사원번호, 이름, 부서번호 출력.
SELECT empno, ename, deptno 
FROM emp
WHERE deptno = 10 OR deptno = 20;   #'or'은 full scanning 을 한다고 생각하셔야 함.

SELECT empno, ename, deptno
FROM emp
WHERE deptno IN (10,20);

SELECT empno, ename, deptno
FROM emp
WHERE deptno != 30;

#급여가 1000과 2000 사이인 사원들의 사원번호, 이름, 급여 출력.
SELECT empno, ename, sal
FROM emp
WHERE sal >=1000 AND sal <= 2000;

SELECT empno, ename, sal
FROM emp
WHERE sal BETWEEN 1000 AND 2000;

#사원 이름이 'FORD'와 'SCOTT' 사이의 사원들의 사원번호, 이름 출력.
SELECT empno, ename
FROM emp
WHERE ename >= 'ford' AND ename <= 'scott'
ORDER BY ename ASC;  #중요한팁) select의 결과는 예측이 불가하기 때문에, 항상 '배열'에 대해 생각하고 고려해서 출력조건에 넣어야 한다.
							#select절을 사용하면서, order by 절을 사용하지 않는다는 것은 굉장히 반쪽짜리 생각, 결과라는 것이다. 원리를 이해해보자. 왜 그런지.
							
SELECT empno, ename
FROM emp
WHERE ename BETWEEN 

#사원이름이 'J'로 시작하는 사원의 사원 이름, 부서 번호 출력.
SELECT ename, deptno
FROM emp
WHERE ename LIKE 'j%';  #'%'의 의미 : j로 시작하는 모든 데이터를 출력해달라.

#사원 이름에서 'j'를 포함하는 (anyone) 사원의 사원 이름, 부서 번호 출력
SELECT ename, deptno
FROM emp
WHERE ename LIKE '%j%';  # '%O%'

#사원 이름의 두 번째 글자가 'A'인 사원의 이름, 급여, 입사일 출력.
SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '_A%';

#사언 이름이 'ES'로 끝나는 사원의 이름, 급여, 입사일 출력.
SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '%ES';

#입사년도가 81년인 사원들의 입사일, 사원번호 출력.
SELECT hiredate, empno
FROM emp
WHERE hiredate LIKE '1981%';  #1981을 .....

#like 연산자 아주 많이 사용함. 검색할 때.

#커미션이 NULL인 사원의 사원 이름, 커미션 출력.
# 안된다는 걸 기억해! 그래서 'IS NULL' 사용.
SELECT ename, comm
FROM emp
WHERE comm IS NULL;

#커미션이 NULL이 아닌 사원의 사원 이름, 커미션 출력.
SELECT ename, comm
FROM emp
WHERE comm IS NOT NULL;

#문자열 연결할 때에는 concat 사용.
SELECT CONCAT(ename, '의 직업은', job, '입니다.') intro
FROM emp;

SELECT CHAR(65);

SELECT CONCAT(ename, '님') NAME
FROM emp;

SELECT LOWER(ename)
FROM emp

SELECT UPPER(ename)
FROM emp

SELECT LPAD('HI',10,'*');  #중요해!!! 많이 쓰여!!!!!! 정보보안, 개인정보 숨김, 

SELECT RPAD('123',10,'0')  #left padding / right padding

SELECT ename, LENGTH(ename)
FROM emp;  #사용 빈도가 아주 적음.
# 한글 한 개 당 3byte처리 한다.
#영문은 1byte, 한글은 3byte.
SELECT LENGTH('스 미쓰');

SELECT ename, LEFT(ename,3)
from emp;

SELECT ename, RPAD(left(ename,3),LENGTH(ename),'*')
from emp;

select ename, RIGHT(ename,3)
FROM emp;

SELECT ename, LPAD(RIGHT(ename,3),LENGTH(ename),'*')
FROM emp

SELECT ename, SUBSTRING(ename, 1, 3)
FROM emp;

SELECT FORMAT(123456.34355,3)  #회사에서 데이터베이스 개발자랑 다른 개발자랑 싸우는게 맨날 이거야 ㅋㅋㅋㅋㅋㅋㅋ

SELECT ename, IFNULL(comm, 0)
FROM emp 

SELECT ABS(-50000000);

SELECT CEIL(3.1245212354654);
SELECT CEIL(4.0000000000000000000000000000000001);

SELECT FLOOR(4.1252);

SELECT ROUND(6.74001,1)

SELECT MOD(10,3)

SELECT TRUNCATE(123123.123567,3);  #아래 결과창에서 보여주는 건, sql이 우리 개발자들을 배려해서 표시만 그렇게 해주는 것일뿐, 실제는 아니야!!! 이건 문자야!!!

SELECT CURDATE();

SELECT CURTIME();

SELECT NOW();

SELECT NOW(), ADDDATE(NOW(),INTERVAL 2 DAY)
SELECT NOW(), SUBDATE(NOW(),INTERVAL 180 HOUR)

CREATE TABLE test(
id VARCHAR(50) PRIMARY KEY,
sdate DATETIME,
edate DATETIME
);

INSERT INTO test(id, sdate, edate) 
VALUES('syh1011',NOW(), ADDDATE(NOW(), INTERVAL 2 DAY));

INSERT INTO test(id, sdate, edate) 
VALUES('syh2022',NOW(), ADDDATE(NOW(), INTERVAL 20 DAY));

INSERT INTO test(id, sdate, edate) 
VALUES('syh3033',NOW(), ADDDATE(NOW(), INTERVAL 40 DAY));


INSERT INTO test(id, sdate, edate) 
VALUES('syh4044',NOW(), ADDDATE(NOW(), INTERVAL 40 HOUR));


SELECT id, sdate, edate
FROM test;

SELECT NOW(), SUBDATE(NOW() , INTERVAL 2 HOUR );

SELECT DATEDIFF('2020-04-29','2020-05-21');

SELECT id, DATEDIFF(edate, sdate) diff
FROM test;

SELECT id, TIMESTAMPDIFF(minute, sdate, edate)
FROM test;

SELECT id, date_format(sdate,'%Y/%m/%d') sdate, 
DATE_FORMAT(edate, '%Y.%m.%d %h:%i:%s') edate , edate
FROM test;



########################################################################################