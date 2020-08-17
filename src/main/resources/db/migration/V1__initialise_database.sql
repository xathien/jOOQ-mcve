DROP SCHEMA IF EXISTS mcve CASCADE;

CREATE SCHEMA mcve;

CREATE TABLE mcve.test (
  id    INT NOT NULL AUTO_INCREMENT,
  group_value INT,
  wrapped_value UUID,
  
  CONSTRAINT pk_test PRIMARY KEY (id) 
);
