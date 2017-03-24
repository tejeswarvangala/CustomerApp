package com.cts.teja.model;

import java.util.Date;

public class SearchCriteria {
	
	private String customerFname;
	private String customerLname;
	private Date dob;
	private Date doj;
	private String category;
	
	public String getCustomerFname() {
		return customerFname;
	}
	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}
	public String getCustomerLname() {
		return customerLname;
	}
	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
