CREATE TABLE users (
                       id VARCHAR(36) PRIMARY KEY,
                       name VARCHAR(50) NOT NULL,
                       nickname VARCHAR(50) NOT NULL,
                       password VARCHAR(20) NOT NULL,
                       balance DECIMAL(6,2) NOT NULL
);