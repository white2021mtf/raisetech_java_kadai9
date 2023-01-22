--DROP TABLE IF EXISTS movies;
--
--CREATE TABLE movies (
--  id int unsigned AUTO_INCREMENT,
--  name VARCHAR(100) NOT NULL,
--  director VARCHAR(100) NOT NULL,
--  PRIMARY KEY(id)
--);
--
--INSERT INTO movies (name, director) VALUES ("ショーシャンクの空に", "フランク・ダラボン");
--INSERT INTO movies (name, director) VALUES ("この世界の片隅に", "片渕須直");

DROP TABLE IF EXISTS names;

CREATE TABLE names (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO names (id, name) VALUES (1,"koyama");
INSERT INTO names (id, name) VALUES (2,"tanaka");
INSERT INTO names (id, name) VALUES (3,"suzuki");


DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  movies_name VARCHAR(100) NOT NULL,
  published_year INTEGER(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO movies (id, movies_name,published_year) VALUES (1,"トイストーリー1","1999");
INSERT INTO movies (id, movies_name,published_year) VALUES (2,"トイストーリー2","2000");
INSERT INTO movies (id, movies_name,published_year) VALUES (3,"トイストーリー3","2001");
