package com.tro.omar.SecureRESTapi.invoice;

import java.util.Date;

public class Invoice {
	
	private int no;
	private Date createDate;
	private String discription;
	private String name;
	
	
	
	public Invoice() {
		super();
	}
	
	public Invoice(int no, Date createDate, String discription, String name) {
		super();
		this.no = no;
		this.createDate = createDate;
		this.discription = discription;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
