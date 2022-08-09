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
@Table(name="Userd")
public class User {

	@Id
	private int userid;
	private String name;
	private String email;
	private String role;
	
	
	public User(int userid, String name, String email, String role) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.role = role;
	}

	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
}
