#ename 칼럼수를 검색.

SELECT COUNT(ename)
FROM emp;

#comm 칼럼수를 검색. 주의! null칼럼은 카운트하지 않는다.
SELECT COUNT(comm)
FROM emp;

#모든 칼럼을 검색.
SELECT COUNT(*)
FROM emp;

SELECT COUNT(empno)
FROM emp;

#sal 의 총합.
SELECT SUM(sal)
FROM emp;

#총합을 구하는 sum()함수는 null이 있더라도, 총합을 구해준다.
#comm의 총합.
SELECT SUM(comm)
FROM emp;

SELECT sal, comm, sal + IFNULL(comm,0)
FROM emp;

#sal의 평균과 comm의 평균 구하기.
#주의 ! avg함수는 null을 포함하지 않는다. 
SELECT  AVG(sal), AVG(comm), AVG(IFNULL(comm,0))  #null값을 되도록이면 안 넣어주는게 좋다, 생각할게 많아져. comm의 null값을 모두 0으로 만들어준 뒤에.
# 평균avg : 전체 합을 count로 나눠주는 것. 생각해야함. 
FROM emp;

#sal을 가장 많이 받는 사람의 사원번호, 월급 출력.
SELECT empno, MAX(sal)
FROM emp;

#sal를 가장 적게 받는 사람의 사원번호, 월급 출력.
SELECT empno, MIN(sal)
FROM emp;

#부서별 급여의 총합 출력.
SELECT deptno, sal
FROM emp
ORDER BY deptno ASC;

#부서별 인원 수, 월급의 평균, 월급의 합 출력.
SELECT deptno, COUNT(deptno), round(AVG(sal),1), SUM(sal)
FROM emp
GROUP BY deptno;  # Group by 절 : 그룹함수를 쓰게 되면, 특정 부서의 특정 값을 지정해서 도출할 수 있다.


#직업별 최대 급여를 구하시오.
SELECT job, MAX(sal) maxsal  #select 값은 항상 랜덤하게 나옴. 오름차순으로 할 건지, 내림차순으로 할 건지 미정 상태.
FROM emp
GROUP BY deptno
ORDER BY maxsal desc;

#급여가 1000이상인 사원들의, 부서별 평균 급여의 반올림 값을 부서번호로 내림차순 정렬 출력.
SELECT deptno, ROUND(AVG(sal))
FROM emp
WHERE sal >= 1000
GROUP BY deptno
ORDER BY deptno DESC;

#급여가 2000 이상인 사원들의 부서별 평균 급여의 반올림 값을, 오름차순 정렬 출력.
SELECT  deptno, ROUND(AVG(sal)) avgsal
FROM emp
WHERE sal >= 2000
GROUP BY deptno
ORDER BY avgsal ASC;

#각 부서별 같은 직업(job)을 하는 사람의 인원수를 구해, 부서번호, 직업(job), 인원수를 부서번호에 대해, 오름차순 정렬 출력.
SELECT deptno, job, COUNT(*) jobcount
FROM emp
GROUP BY deptno, job
ORDER BY deptno ASC, jobcount DESC;  # select 이후에 항상 '어떻게 정렬할 것인가'에 대한 생각을 해주셔야 한다는 것. 최소한 이 정도는.
# 정렬이 안 되있으니까, '정렬'을 해야겠다는 생각을 하는 것이 올바르다. 개념 챙겨~~~!!!!

# 급여가 1000 이상인 사원들의 부서별 평균 급여 출력.
# 단, 부서별 평균 급여가 2000 이상인 부서만 출력할 것.
SELECT deptno, AVG(sal) avgsal
FROM emp
WHERE sal >= 1000
GROUP BY deptno
HAVING avgsal >= 2000
ORDER BY deptno ASC;
#select절의 맨 마지막은 늘 order by 절 ! 정렬 !!


# limit a, b : a는 시작 위치. b는 길이.
# limit 0, 10 : 처음부터 10개를 가져옴.
# limit 10, 20 : 11부터 20개를 가져옴. 
# limit절은 사용하지 않을 수가 없다. 무조건 사용하게 됨. 하지만 이건 표준sql이 아님. MariDB에만 있는 녀석. 다른 DB에는 없음.
SELECT empno, ename, job
FROM emp
Order by hiredate DESC
LIMIT 0,5

SELECT empno, ename, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno


# join
SELECT *
FROM emp, dept
WHERE dept.deptno = emp.deptno;
# 두 테이블을 join.


SELECT empno, ename, emp.deptno, dname, loc
FROM emp, dept
WHERE dept.deptno = emp.deptno;


SELECT *
FROM emp, dept;


SELECT ename, dept.deptno, dname
FROM emp, dept
WHERE dept.deptno = emp.deptno


#테이블에 alisas를 붙이는 경우.
SELECT ename, d.deptno, dname
FROM emp e, dept d
where d.deptno = e.deptno

#join ~ on 표현식
SELECT ename, d.DEPTNO, dname
FROM emp e JOIN IN dept d
ON d.deptno = e.`deptno;`


SELECT ename, d.deptno, dname
FROM emp e JOIN dept d
USING(deptno)

#급여가 3000에서 5000 사이의 사원 이름과 부서명을 출력.
SELECT ename, dname
FROM emp e, dept d
WHERE sal >= 3000 AND sal <= 5000 AND d.deptno = e.deptno

SELECT ename, dname
FROM emp e, dept d
WHERE sal BETWEEN 3000 AND 5000 AND d.deptno = e.deptno


#부서명이 'ACCOUNTING' 인 사원의 이름, 입사일, 부서번호, 부서명 출력.
SELECT ename, hiredate, deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND dname = 'ACCOUNTING'


#커미션이 null이 아닌 사원의 이름, 입사일, 부서명 출력.
#단, 입사일이 2020년 11월 20일 형식으로 출력.
SELECT ename, date_format(hiredate, '%Y년 m월 d일'), dname
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO AND comm IS NOT NULL 

#부서명이 'ACCOUNTING' 인 사원의 이름, 입사일, 부서번호, 부서명을 출력.
#단, 입사일은 2020년 11월 20일 형식으로 출력.
SELECT ename, DATE_FORMAT(hiredate, '%Y년 %m월 %d일'), e.DEPTNO, dname
FROM emp e, dept d
WHERE d.DEPTNO = e.deptno AND dname = 'ACCOUNTING';


SELECT * FROM emp;

insert INTO emp(empno, ename, job, mgr, hiredate, sal, comm)
VALUES(8000, 'ERIC','CLERK',7900, '1983-02-25',500,NULL);

#사원번호, 부서번호, 부서명을 출력하세요.
#단, 사원이 근무하지 않는 부서명도 같이 출력해보세요.

SELECT empno, e.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno;

SELECT empno, e.deptno, dname
FROM emp e LEFT JOIN dept d
ON d.deptno = e.deptno;


#1. emp 테이블과 dept 테이블을 join하여, 부서번호, 부서명, 이름, 급여를 출력.

SELECT d.DEPTNO, dname, ename, sal
FROM emp e, dept d
WHERE d.deptno = e.deptno;



#2. 사원이 이름이 'ALLEN'인 사원의 부서명 출력.

SELECT dname
FROM emp e, dept d
WHERE d.deptno = e.DEPTNO AND ename = 'ALLEN'



#3. 모든 사원의 이름, 부서번호, 부서명, 급여를 출력. 단, emp테이블에 없는 부서도 출력.

SELECT ename, d.deptno, dname, sal
FROM emp e LEFT JOIN dept d
ON d.deptno = e.deptno;

#4. 사원의 이름과 급여, 급여의 등급을 출력. emp 테이블과 salgrade 테이블을 join해야 함.

SELECT ename, sal, grade
FROM emp e, salgrade s
WHERE sal BETWEEN losal AND hisal


#5. 사원의 이름과 부서명, 급여의 등급을 출력. emp 테이블과 salgrade 테이블을 join해야 함.

SELECT ename, dname, grade
FROM emp e, dept d, salgrade s
WHERE d.deptno = e.deptno AND sal BETWEEN losal AND hisal


# 'SMITH'가 근무하는 부서명을 서브 쿼리(sub query)를 이용하여 출력.
SELECT ename, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND ename = 'SMITH'


# 'ALLEN'과 같은 부서에서 근무하는 사원의 이름과 부서 번호를 출력.

SELECT ename, deptno
FROM emp
WHERE deptno = (SELECT deptno
FROM emp
WHERE ename = 'ALLEN');






















































































































































































































