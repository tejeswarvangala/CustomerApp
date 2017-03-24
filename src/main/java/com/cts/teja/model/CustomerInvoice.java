package com.cts.teja.model;

import java.sql.Date;

public class CustomerInvoice {
	private int id;
	private int customerId;
	private String category;
	private String paymentStatus;
	private int price;
	private Date dueDate;
	private int approvalIndicator;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public int getApprovalIndicator() {
		return approvalIndicator;
	}
	public void setApprovalIndicator(int approvalIndicator) {
		this.approvalIndicator = approvalIndicator;
	}

}
