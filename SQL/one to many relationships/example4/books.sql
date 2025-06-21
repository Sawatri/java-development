SELECT * FROM authorbook.books;

USE AUTHORBOOK;
CREATE TABLE books(
book_id INT Primary Key,
author_id INT,
book_title VARCHAR(50),
FOREIGN KEY(author_id) REFERENCES author(author_id));

SELECT b.book_title, a.author_name
FROM books b
join author a where b.author_id = a.author_id;

SELECT b.book_title
FROM books b
where b.author_id=3;

INSERT INTO books(book_id, author_id, book_title)
VALUES
(1, 1, "Intro to Algorithms"),
(2, 3, "Java"),
(3, 2, "C++"),
(4, 2, "Programming Principles"),
(5, 1, "JavaScript"),
(6, 1, "Python");
