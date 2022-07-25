use kodilla_course;

INSERT INTO posts(USER_ID,BODY)
VALUES (4, "New post");

INSERT INTO posts(USER_ID,BODY)
VALUES (2, "New post");

INSERT INTO posts(USER_ID,BODY)
VALUES (1, "New post");

UPDATE posts
SET BODY = "To delete"
WHERE BODY="New post";
commit;

DELETE FROM posts
WHERE body="To delete";

