package com.example.product;

public class product {
	
	private String productNumber;
	private String productName;
	private double yearFirstReleased,price;
	
	public product(String productNumber, String productName, double yearFirstReleased, double price) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.yearFirstReleased = yearFirstReleased;
		this.price = price;
	}
	
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getYearFirstReleased() {
		return yearFirstReleased;
	}
	public void setYearFirstReleased(double yearFirstReleased) {
		this.yearFirstReleased = yearFirstReleased;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [productNumber=" + productNumber + ", productName=" + productName + ", yearFirstReleased=" + yearFirstReleased
				+ ", price=" + price + "]";
	}	
	
}