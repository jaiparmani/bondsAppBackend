INSERT INTO BOOK (bookid, book_name) VALUES (1, 'Government Bonds'),
                                              (2, 'Corporate Bonds'),
                                              (3, 'Municipal Bonds');

INSERT INTO Security (securityid, ISIN, CUSIP, issuer, maturity_date, coupon, type, face_value, status) VALUES
                    (1, 54567, 987651, 'Apple', '2004-02-01', 2, 'corporate', 100, 'ACTIVE' ),
                    (2, 62378, 143219, 'Dell', '2007-08-21', 1.3, 'corporate', 50, 'ACTIVE' ),
                    (3, 62379, 654321, 'Government', '2002-01-01', 1.9, 'government', 10, 'ACTIVE' ),
                    (4, 62300, 432198, 'Samsung', '2005-03-31', 3.6, 'corporate', 100, 'ACTIVE' ),
                    (5, 12457, 432198, 'Muncipal', '2009-05-10', 1.5, 'municipal', 250, 'ACTIVE' );

INSERT INTO USERD (userid, name, email, role) VALUES (1, 'Jitesh', 'jitesh@gmail.com', 'customer'),
                                        (2, 'Jaimin', 'jaimin@gmail.com', 'customer'),
                                        (3, 'Himanshu', 'himanshu@gmail.com', 'customer'),
                                        (4, 'Jai', 'jai@gmail.com', 'operation'),
                                        (5, 'Divya', 'divya@gmail.com', 'operation'),
                                        (6, 'Dipashri', 'dipashri@gmail.com', 'operation');


INSERT INTO COUNTER_PARTY (counterpartyid, counter_party_name) VALUES (1, 'Farhan'),
                                   (2, 'Harshwardhan'),
                                   (3, 'Deep'),
                                   (4, 'Raunak'),
                                   (5, 'Rushikesh');
INSERT INTO Trade (tradeid,  securityid, counterpartyid, bookid, quantity, status, price, buy_sell, trade_date, settlement_date) VALUES
                     (1,1,1,1, 3, 'SETTLED', 270, 'sell', '2008-11-11', '2008-11-12'),
                     (2,2,1,1, 3, 'SETTLED', 270, 'buy', '2008-11-11', '2008-11-12');

--INSERT INTO Trade (trade_id,  SC_ID, CP_ID, BOOK_ID, quantity, status, price, buy_sell, trade_date, settlement_date) VALUES
--                     (1,1,1,1, 3, 'SETTLED', 270, 'sell', '2008-11-11', '2008-11-12'),
--                     (2,2,1,1, 3, 'SETTLED', 270, 'buy', '2008-11-11', '2008-11-12');