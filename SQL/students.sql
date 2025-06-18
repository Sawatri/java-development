SELECT * FROM library_management_system.student;

CREATE TABLE student(
rollno INT primary key auto_increment,
name VARCHAR(50),
age INT
);

INSERT INTO student(name, age)
VALUES
("Aslam", 21),
("Bilal", 22),
("Ali", 23),
("Yasir", 21);

SELECT * FROM Library_management_system.student;


