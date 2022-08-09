
INSERT INTO Book (bookid, book_name)
VALUES (101,'Book1');

INSERT INTO counter_Party (counterpartyid,counter_party_name) 
VALUES (501, 'Ram Jain');

INSERT INTO Security(securityid, isin, cusip ,issuer , maturity_date, coupon, type, facevalue, status)
VALUES (301, '12AlphaNumer' ,'9lettrnum', 'Deutsche Bank', '2022-08-06', 2, 'government' , 10000, TRUE);

INSERT INTO Trade (tradeid,bookid,counterpartyid, securityid, quantity, status, price, buy_sell,trade_date,settlement_date)
VALUES (402,101,501,301,1,TRUE,1000,'buy','2022-08-05','2022-08-07');