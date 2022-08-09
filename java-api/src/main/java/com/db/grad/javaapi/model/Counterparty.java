/**
 * 
 */
package com.db.grad.javaapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dell
 *
 */
@Entity
@Table(name="Counter_Party")
public class Counterparty {

	@Id
	private int counterpartyid;
	private String counter_party_name;
	public Counterparty(int counterpartyid, String counter_party_name) {
		super();
		this.counterpartyid = counterpartyid;
		this.counter_party_name = counter_party_name;
	}
	public int getCounterpartyid() {
		return counterpartyid;
	}
	public void setCounterpartyid(int counterpartyid) {
		this.counterpartyid = counterpartyid;
	}
	public String getCounter_party_name() {
		return counter_party_name;
	}
	public void setCounter_party_name(String counter_party_name) {
		this.counter_party_name = counter_party_name;
	}
	
}
