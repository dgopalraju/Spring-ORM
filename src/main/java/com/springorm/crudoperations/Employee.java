package com.springorm.crudoperations;

import java.util.Date;

public class Employee {
	private Integer eid;
	private String ename;
	private String email;
	private Date createdOn;
	private String createdBy;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", createdOn=" + createdOn
				+ ", createdBy=" + createdBy + "]";
	}

	public Employee(Integer eid, String ename, String email, Date createdOn, String createdBy) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
