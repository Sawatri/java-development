SELECT * FROM library_management_system.student_course;

USE library_management_system;
CREATE TABLE student_course(
student_id INT,
course_id INT);

INSERT INTO student_course VALUES(3,1);

SELECT s.student_id, s.name, c.course_name, c.course_code, d.dept_name, u.uni_name, y.semester
FROM student s
inner join student_course sc on sc.student_id=s.student_id
inner join course c on c.course_id=sc.course_id
inner join department d on d.dept_id = s.student_id
inner join university u on u.uni_id = d.dept_id
inner join year y on y.id = s.student_id;

-- Record searching
SELECT s.name, c.course_name, d.dept_name, u.uni_name, y.semester
From student s 
inner join student_course sc on sc.student_id = s.student_id
inner join course c on c.course_id = sc.course_id
inner join department d on d.dept_id = s.student_id
inner join university u on u.uni_id = d.dept_id
inner join year y on y.id = d.dept_id
where s.name="Bilal";

DROP TABLE student_department;