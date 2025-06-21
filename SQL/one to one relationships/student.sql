CREATE DATABASE 1TO1;

SELECT * FROM 1to1.sutdent;

USE 1TO1;
CREATE TABLE sutdent(
student_id INT Primary Key auto_increment,
student_name VARCHAR(30),
age INT,
roll_no VARCHAR(30));

INSERT INTO student(student_name, age, roll_no)
VALUES
("Aimen", 15, "2k25F10"),
("Yusra", 17, "2k25F11"),
("Nida", 16, "2k25F12"),
("Shifa", 14, "2k25F13"),
("Annie", 19, "2k25f14");
