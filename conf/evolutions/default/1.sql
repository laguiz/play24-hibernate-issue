# Users schema
 
# --- !Ups
 
CREATE TABLE User (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO User VALUES (null, 'Foo');
INSERT INTO User VALUES (null, 'Bar');

# --- !Downs
 
DROP TABLE User;
