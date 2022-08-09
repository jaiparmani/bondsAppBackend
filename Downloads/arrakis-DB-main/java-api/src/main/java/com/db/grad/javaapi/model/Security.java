/**
 * 
 */
package com.db.grad.javaapi.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Dell
 *
 */
@Entity
@Table(name="Security")
public class Security {

	@Id
	private int securityid;
	private String isin;
	private String cusip;
	
	@Temporal(TemporalType.DATE)
	private Date maturityDate;
	
	private float coupon;
	private String type;
	private int face_value;
	private String status;
	
	
	public Security() {
		super();
	}
	
	public Security(int securityid, String isin, String cusip, Date maturity_date, float coupon, String type,
			int facevalue, String status) {
		super();
		this.securityid = securityid;
		this.isin = isin;
		this.cusip = cusip;
		this.maturityDate = maturity_date;
		this.coupon = coupon;
		this.type = type;
		this.face_value = facevalue;
		this.status = status;
	}


	public int getSecurityid() {
		return securityid;
	}


	public void setSecurityid(int securityid) {
		this.securityid = securityid;
	}


	public String getIsin() {
		return isin;
	}


	public void setIsin(String isin) {
		this.isin = isin;
	}


	public String getCusip() {
		return cusip;
	}


	public void setCusip(String cusip) {
		this.cusip = cusip;
	}


	public Date getMaturity_date() {
		return maturityDate;
	}


	public void setMaturity_date(Date maturity_date) {
		this.maturityDate = maturity_date;
	}


	public float getCoupon() {
		return coupon;
	}


	public void setCoupon(float coupon) {
		this.coupon = coupon;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getFacevalue() {
		return face_value;
	}


	public void setFacevalue(int facevalue) {
		this.face_value = facevalue;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

