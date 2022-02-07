package com.mouritech.springframework.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="seller")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sellerid")
	private Long sellerId;
	
	@Column(name = "sellername")
	@NotNull
	private String sellerName;
	
	@Column(name = "sellermail")
	@NotNull
	private String sellerMail;
		
	@Column(name = "sellermob")
	@NotNull
	private Long sellerMobNo;
	
	@Column(name = "sellercity")
	@NotNull
	private String sellerCity;
	
	@Column (name = "sellercategory")
	@NotNull
	private String sellerCategory;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public Order(String orderDate, float orderValue) { super(); this.orderDate =
	 * orderDate; this.orderValue = orderValue; }
	 */
	
	public Seller(Long sellerId, String sellerName, String sellerMail, Long sellerMobNo, String sellerCity,
			String sellerCategory) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerMail = sellerMail;
		this.sellerMobNo = sellerMobNo;
		this.sellerCity = sellerCity;
		this.sellerCategory = sellerCategory;
	}

	
	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerMail() {
		return sellerMail;
	}

	public void setSellerMail(String sellerMail) {
		this.sellerMail = sellerMail;
	}

	public Long getSellerMobNo() {
		return sellerMobNo;
	}

	public void setSellerMobNo(Long sellerMobNo) {
		this.sellerMobNo = sellerMobNo;
	}

	public String getSellerCity() {
		return sellerCity;
	}

	public void setSellerCity(String sellerCity) {
		this.sellerCity = sellerCity;
	}

	public String getSellerCategory() {
		return sellerCategory;
	}

	public void setSellerCategory(String sellerCategory) {
		this.sellerCategory = sellerCategory;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerMail=" + sellerMail
				+ ", sellerMobNo=" + sellerMobNo + ", sellerCity=" + sellerCity + ", sellerCategory=" + sellerCategory
				+ "]";
	}
	
	

	
	
	
}