SELECT * FROM studentcourse.course;

INSERT INTO course(course_id, student_id, course_name)
VALUES
(1,1,"Maths"),
(2,2,"Science"),
(3,1,"Chemistry"),
(4,1,"Physics"),
(5,1,"English");


ALTER TABLE course add column student_id INT;
ALTER TABLE course add FOREIGN KEY(student_id) REFERENCES student(student_id);

SELECT s.student_name, c.course_name
FROM student s
join course c on s.student_id=c.student_id;

SELECT c.course_name
From course c where c.student_id=1;


