DROP TABLE IF EXISTS Userd;
DROP TABLE IF EXISTS Book;
DROP TABLE IF EXISTS Counter_Party;
DROP TABLE IF EXISTS Security;
DROP TABLE IF EXISTS Trade;
DROP TABLE IF EXISTS Book_User;

CREATE TABLE Userd (
userid INT primary key,
name VARCHAR(250) NOT NULL,
email VARCHAR(250),
role VARCHAR(250)
);

CREATE TABLE Book (
bookid INT primary key, 
book_name VARCHAR(250) NOT NULL
);

CREATE TABLE Counter_Party (
counterpartyid INT primary key , 
counter_party_name  VARCHAR(250) 
);

CREATE TABLE Security (
securityid INT primary key, 
isin VARCHAR(250), 
cusip VARCHAR(250), 
issuer VARCHAR(250), 
maturity_date DATE,
coupon FLOAT, 
type VARCHAR(250), 
facevalue INT, 
status VARCHAR(250)
);

CREATE TABLE Trade (
tradeid INT primary key, 
bookid INT, FOREIGN KEY (bookid) REFERENCES Book(bookid),
counterpartyid INT  , FOREIGN KEY (counterpartyid) REFERENCES Counter_Party(counterpartyid),
securityid INT , FOREIGN KEY (securityid) REFERENCES Security(securityid), 
quantity INT,
status VARCHAR(250),
price FLOAT,
buy_sell  VARCHAR(250),
trade_date DATE,
settlement_date DATE
);

CREATE TABLE Book_User (
bookid INT , 
FOREIGN KEY (bookid) REFERENCES Book(bookid),
userid INT,
FOREIGN KEY (userid) REFERENCES Userd(userid)
);