SELECT * FROM library_management_system.course;

CREATE TABLE course(
course_id INT primary key auto_increment,
course_name VARCHAR(50),
course_code INT
);

INSERT INTO course(course_name, course_code)
VALUES
("JAVA", 101),
("C++", 102),
("Python", 103),
("JavaScript", 104),
("SQL", 105);