DROP TABLE IF EXISTS employees;

DROP SCHEMA IF EXISTS account CASCADE;
CREATE SCHEMA account;
DROP SEQUENCE IF EXISTS account.employee_id;
CREATE SEQUENCE account.employee_id;

CREATE TABLE IF NOT EXISTS account.employees
(
    employee_id INTEGER PRIMARY KEY ,
    name VARCHAR(60) NOT NULL ,
    hourly_wage DOUBLE PRECISION DEFAULT 0.0 ,
    registered_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO
    account.employees(employee_id ,name ,hourly_wage)
VALUES
    (1 ,'Alice' ,900)
  , (2 ,'Bob' ,950)
  , (3 ,'Carol' ,1000)
  , (4 ,'Eve' ,NULL)
;

DROP TABLE IF EXISTS timecards;
DROP SCHEMA IF EXISTS attendance CASCADE;
CREATE SCHEMA attendance;
DROP SEQUENCE IF EXISTS attendance.timecard_id;
CREATE SEQUENCE attendance.timecard_id;

CREATE TABLE IF NOT EXISTS attendance.timecards
(
    timecard_id INTEGER PRIMARY KEY ,
    employee_id INTEGER ,
    registered_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
    FOREIGN KEY (employee_id) REFERENCES account.employees (employee_id)
);

DROP TABLE IF EXISTS jobs;
CREATE TABLE attendance.jobs
(
    timecard_id INTEGER NOT NULL ,
    start_time TIMESTAMP DEFAULT current_timestamp
);