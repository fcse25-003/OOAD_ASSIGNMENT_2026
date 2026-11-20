CREATE TABLE Customer (
    customerId INT PRIMARY KEY,
    firstName VARCHAR(50),
    surname VARCHAR(50),
    address VARCHAR(100),
    phoneNumber VARCHAR(20)
);

INSERT INTO Customer VALUES
(1,'Olga','Mosarwa','Lobatse','74730087'),
(2,'John','Smith','Gaborone','71234567'),
(3,'Mary','Jones','Francistown','72345678'),
(4,'Peter','Brown','Palapye','73456789'),
(5,'Sarah','Wilson','Maun','74567890'),
(6,'David','Taylor','Kasane','75678901'),
(7,'James','White','Serowe','76789012'),
(8,'Emma','Green','Molepolole','77890123'),
(9,'Lucas','Black','Jwaneng','78901234'),
(10,'Grace','Young','Lobatse','79012345'),
(11,'Brian','Molefe','Selebi Phikwe','70112233'),
(12,'Lebo','Mokoena','Mahalapye','70223344');


CREATE TABLE Account (
    accountNumber VARCHAR(20) PRIMARY KEY,
    balance DOUBLE,
    branch VARCHAR(50),
    customerId INT,
    FOREIGN KEY (customerId)
    REFERENCES Customer(customerId)
);

INSERT INTO Account VALUES
('S001',1500,'Lobatse Branch',1),
('S002',2000,'Gaborone Branch',2),
('S003',3000,'Francistown Branch',3),
('S004',2500,'Palapye Branch',4),
('S005',1800,'Maun Branch',5),
('S006',3200,'Kasane Branch',6),
('S007',2700,'Serowe Branch',7),
('S008',2100,'Molepolole Branch',8),
('S009',4000,'Jwaneng Branch',9),
('S010',3500,'Lobatse Branch',10),
('S011',2900,'Selebi Phikwe Branch',11),
('S012',3600,'Mahalapye Branch',12);


CREATE TABLE Transaction (
    transactionId INT PRIMARY KEY,
    accountNumber VARCHAR(20),
    amount DOUBLE,
    transactionType VARCHAR(20),
    transactionDate DATE,
    FOREIGN KEY (accountNumber)
    REFERENCES Account(accountNumber)
);

INSERT INTO Transaction VALUES
(1,'S001',500,'Deposit','2026-11-01'),
(2,'S002',300,'Withdrawal','2026-11-02'),
(3,'S003',1000,'Deposit','2026-11-03'),
(4,'S004',200,'Withdrawal','2026-11-04'),
(5,'S005',700,'Deposit','2026-11-05'),
(6,'S006',150,'Withdrawal','2026-11-06'),
(7,'S007',900,'Deposit','2026-11-07'),
(8,'S008',400,'Withdrawal','2026-11-08'),
(9,'S009',600,'Deposit','2026-11-09'),
(10,'S010',250,'Withdrawal','2026-11-10'),
(11,'S011',800,'Deposit','2026-11-11'),
(12,'S012',350,'Withdrawal','2026-11-12');
