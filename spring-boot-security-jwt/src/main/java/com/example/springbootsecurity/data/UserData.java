package com.example.springbootsecurity.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerData")
public class UserData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customerId")
	private Long customerId;
	@Column(name="customerName")
	private String customerName;
	@Column(name="customerRole")
	private String customerRole;
	@Column(name="customerNum")
	private Long customerNum;
	@Column(name="createdAt")
	private Date createdAt;
	@Column(name="updatedAt")
	private Date updatedAt;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerRole() {
		return customerRole;
	}
	public void setCustomerRole(String customerRole) {
		this.customerRole = customerRole;
	}
	public Long getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(Long customerNum) {
		this.customerNum = customerNum;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	

}
