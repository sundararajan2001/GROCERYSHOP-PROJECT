package com.example.springbootsecurity.data;

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
@Table(name="cart")
public class CartData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cartId")
	private Long cartId;
	@Column(name="cartQuantity")
	private Integer cartQuantity; 
	 public Integer getCartQuantity() {
		return cartQuantity;
	}

	public void setCartQuantity(Integer cartQuantity) {
		this.cartQuantity = cartQuantity;
	}

	 @ManyToOne(fetch = FetchType.LAZY , optional = false)
	 @JoinColumn(name = "userId" , nullable = false) 
	 private UserData userData;
	 @ManyToOne(fetch = FetchType.LAZY , optional = false)
	 @JoinColumn(name = "productId" , nullable = false) 
	 private ProductData productData;

	public ProductData getProductData() {
		return productData;
	}

	public void setProductData(ProductData productData) {
		this.productData = productData;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

}
