package com.khozemaProducts.models;

public class Product {
	
	private String name;
	private String description;
	private double price;
	private int quantity;
	private String imageUrl;
	
	public Product() {}
	
	public Product(String name, String description, double price, int quantity, String imageUrl) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.imageUrl = imageUrl;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
