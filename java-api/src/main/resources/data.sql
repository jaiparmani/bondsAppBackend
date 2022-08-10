INSERT INTO BOOK (bookid, book_name) VALUES (1, 'Government Bonds'),
                                              (2, 'Corporate Bonds'),
                                              (3, 'Municipal Bonds');

INSERT INTO Security (securityid, ISIN, CUSIP, issuer, maturity_date, coupon, type, face_value, status) VALUES
                    (1, 54567, 987651, 'Apple', '2004-02-01', 2, 'corporate', 100, 'ACTIVE' ),
                    (2, 62378, 143219, 'Dell', '2007-08-21', 1.3, 'corporate', 50, 'ACTIVE' ),
                    (3, 62379, 654321, 'Government', '2002-01-01', 1.9, 'government', 10, 'ACTIVE' ),
                    (4, 62300, 432198, 'Samsung', '2005-03-31', 3.6, 'corporate', 100, 'ACTIVE' ),
                    (5, 12457, 432198, 'Muncipal', '2009-05-10', 1.5, 'municipal', 250, 'ACTIVE' );

INSERT INTO USERD (userid, name, email, role,password) VALUES (1, 'Jitesh', 'jitesh@gmail.com', 'customer','1234'),
                                        (2, 'Jaimin', 'jaimin@gmail.com', 'customer','2345'),
                                        (3, 'Himanshu', 'himanshu@gmail.com', 'customer','5354'),
                                        (4, 'Jai', 'jai@gmail.com', 'operation','345435'),
                                        (5, 'Divya', 'divya@gmail.com', 'operation','34321'),
                                        (6, 'Dipashri', 'dipashri@gmail.com', 'operation','6867');
INSERT INTO COUNTER_PARTY (counterpartyid, counter_party_name) VALUES (1, 'Farhan'),
                                   (2, 'Harshwardhan'),
                                   (3, 'Deep'),
                                   (4, 'Raunak'),
                                   (5, 'Rushikesh');
INSERT INTO Trade (tradeid,  securityid, counterpartyid, bookid, quantity, status, price, buy_sell, trade_date, settlement_date) VALUES
                     (1,1,1,1, 3, 'SETTLED', 270, 'sell', '2008-11-11', '2008-11-12'),
                     (2,2,1,1, 3, 'SETTLED', 270, 'buy', '2008-11-11', '2008-11-12'),
                     (3,3,1,2, 3, 'SETTLED', 270, 'sell', '2008-11-11', '2008-11-12'),
                     (4,2,1,3, 3, 'SETTLED', 270, 'buy', '2008-11-11', '2008-11-12'),
                     (5,3,1,1, 3, 'SETTLED', 270, 'sell', '2022-01-11', '2022-08-13'),
                     (6,4,1,1, 3, 'SETTLED', 270, 'buy', '2020-11-11', '2023-10-12'),
                     (7,5,4,2, 3, 'UNSETTLED', 250, 'sell', '2009-10-11', '2009-10-12'),
                     (8,2,1,3, 3, 'SETTLED', 250, 'buy', '2008-11-11', '2008-11-12'),
                     (9,3,2,2, 3, 'SETTLED', 220, 'sell', '2012-11-11', '2012-11-12'),
                     (10,1,3,1, 3, 'SETTLED', 220, 'buy', '2021-11-11', '2022-11-12');


insert into book_user(bookid, userid) values (1, 1), (2, 1), (3, 2), (1,2),
                                     (2,2),
                                     (3,4),
                                     (1,5),
                                     (3,5),
                                     (2,3);;
                     

--INSERT INTO Trade (trade_id,  SC_ID, CP_ID, BOOK_ID, quantity, status, price, buy_sell, trade_date, settlement_date) VALUES
--                     (1,1,1,1, 3, 'SETTLED', 270, 'sell', '2008-11-11', '2008-11-12'),
--                     (2,2,1,1, 3, 'SETTLED', 270, 'buy', '2008-11-11', '2008-11-12');

-- select * from security where securityid in (select securityid from trade where bookid in (select bu.bookid from book_user bu join userd u on u.userid = bu.userid));