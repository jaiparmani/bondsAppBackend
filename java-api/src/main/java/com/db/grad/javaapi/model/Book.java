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
@Table(name="Book")
public class Book {

	@Id
	private int bookid;
	private String bookname;
	public Book(int bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
}
