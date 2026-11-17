CREATE TABLE Customer (
    customerId INT PRIMARY KEY,
    firstName VARCHAR(50),
    surname VARCHAR(50),
    address VARCHAR(100),
    phoneNumber VARCHAR(20)
);

CREATE TABLE Account (
    accountNumber VARCHAR(20) PRIMARY KEY,
    balance DOUBLE,
    branch VARCHAR(50),
    customerId INT,
    FOREIGN KEY (customerId)
    REFERENCES Customer(customerId)
);

CREATE TABLE Transaction (
    transactionId INT PRIMARY KEY,
    accountNumber VARCHAR(20),
    amount DOUBLE,
    transactionType VARCHAR(20),
    transactionDate DATE,
    FOREIGN KEY (accountNumber)
    REFERENCES Account(accountNumber)
);