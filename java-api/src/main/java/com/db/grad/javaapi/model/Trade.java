package com.db.grad.javaapi.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trade")
public class Trade {


	@Id
	private int tradeid;
	private int bookid;
	private int counterpartyid;
	private int securityid;
	private int quantity;
	private String status;
	private float price;
	private String buy_sell;
	private Date trade_date;
	private Date settlement_date;
	
	public Trade(int tradeid, int bookid, int counterpartyid, int securityid, int quantity, String status, float price,
			String buy_sell, Date trade_date, Date settlement_date) {
		super();
		this.tradeid = tradeid;
		this.bookid = bookid;
		this.counterpartyid = counterpartyid;
		this.securityid = securityid;
		this.quantity = quantity;
		this.status = status;
		this.price = price;
		this.buy_sell = buy_sell;
		this.trade_date = trade_date;
		this.settlement_date = settlement_date;
	}


	public Trade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTradeid() {
		return tradeid;
	}

	public void setTradeid(int tradeid) {
		this.tradeid = tradeid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getCounterpartyid() {
		return counterpartyid;
	}

	public void setCounterpartyid(int counterpartyid) {
		this.counterpartyid = counterpartyid;
	}

	public int getSecurityid() {
		return securityid;
	}

	public void setSecurityid(int securityid) {
		this.securityid = securityid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBuy_sell() {
		return buy_sell;
	}

	public void setBuy_sell(String buy_sell) {
		this.buy_sell = buy_sell;
	}

	public Date getTrade_date() {
		return trade_date;
	}

	public void setTrade_date(Date trade_date) {
		this.trade_date = trade_date;
	}

	public Date getSettlement_date() {
		return settlement_date;
	}

	public void setSettlement_date(Date settlement_date) {
		this.settlement_date = settlement_date;
	}
	
	
}
