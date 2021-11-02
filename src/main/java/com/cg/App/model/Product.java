package com.cg.App.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long  productId;
	@Column(name = "prodName", nullable = false, length = 255)
	private String prodName;
	@Column(name = "price", nullable = false, length = 255)
	private double price;
	@Column(name = "batchno", nullable = false, length = 255)
	private long batchNo;
	@Column(name = "mfgName", nullable = false, length = 255)
	private String manufacturerName;
	//add date of packing and expiry date
	public Product(long productId, String prodName, double price, long batchNo, String manufacturerName) {
		super();
		this.productId = productId;
		this.prodName = prodName;
		this.price = price;
		this.batchNo = batchNo;
		this.manufacturerName = manufacturerName;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(long batchNo) {
		this.batchNo = batchNo;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", prodName=" + prodName + ", price=" + price + ", batchNo="
				+ batchNo + ", manufacturerName=" + manufacturerName + "]";
	}
	
	
}
