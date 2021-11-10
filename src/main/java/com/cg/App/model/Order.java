package com.cg.App.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity

@Table(name = "ORDER_DETAILS")

public class Order{

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long orderId;

@Column(name="PRODUCT_ID")
private Long productId;

@Column(name="ORDERED_QUANTITY")
private Integer orderedQuantity;

@Column(name="PRICE")
private Float price;

@Column (name="DEALER_ID")
private Long dealerId;

public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Long orderId, Long productId, Float price, Integer orderedQuantity, Long dealerId) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.price = price;
		this.orderedQuantity = orderedQuantity;
		this.dealerId = dealerId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(Integer orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public Long getDealerId() {
		return dealerId;
	}

	public void setDealerId(Long dealerId) {
		this.dealerId = dealerId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId + ", price=" + price + ", orderedQuantity="
				+ orderedQuantity + ", dealerId=" + dealerId + "]";
	}	
	

}

