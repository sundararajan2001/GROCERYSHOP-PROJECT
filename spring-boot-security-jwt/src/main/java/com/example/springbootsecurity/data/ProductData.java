package com.example.springbootsecurity.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="product")
public class ProductData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productId")
	private Long productId;
	@Column(name="productName")
	private String productName;
	@Column(name="productQuantity")
	private Integer productQuantity;
	@Column(name="productPrice")
	private Double productPrice;
	@Column(name="createdAt")
	private Date createdAt;
	@Column(name="updatedAt")
	private Date updatedAt;
//	@ManyToOne(fetch = FetchType.LAZY , optional = false)
//	 @JoinColumn(name = "userId" , nullable = false) 
//	 private UserData userData;
//	public UserData getUserData() {
//		return userData;
//	}
//	public void setUserData(UserData userData) {
//		this.userData = userData;
//	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
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
