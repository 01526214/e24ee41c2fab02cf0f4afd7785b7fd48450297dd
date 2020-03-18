-- insert initial test data
-- the id is hardcode to enable references between further test data
INSERT INTO owner (ID, NAME, CREATED_AT, UPDATED_AT)
VALUES (1, 'Fred', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (2, 'Julia', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (3, 'Kim', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

INSERT INTO horse (ID, NAME, DESCRIPTION, RATING, BIRTH_DATE, FORMAT, BREED, CREATED, UPDATED )
VALUES (1, 'Fred', 'Ist ein Rennpferd', 1, '2009-11-11','JPEG','ARABIAN', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (2, 'Albert', 'Ist ein Ponny', 4, '2002-11-11','PNG','PAINT', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
