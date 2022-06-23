-- https://dev.mysql.com/doc/refman/8.0/en/replace.html

REPLACE INTO Category(id, name, code, status, description)
VALUES(13,'Helsa', 'AE', 1, 'Etiam pretium iaculis justo. In hac habitasse platea dictumst.');

-- https://dev.mysql.com/doc/refman/8.0/en/insert-on-duplicate.html

INSERT INTO Category(id, name, code, status, description)
VALUES(13,'Helsa', 'AE', 1, 'Etiam pretium iaculis justo. In hac habitasse platea dictumst.') ON DUPLICATE KEY
UPDATE name='Helsa',
       code ='AE',
       status=1,
       description='Etiam pretium iaculis justo. In hac habitasse platea dictumst.';