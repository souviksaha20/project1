package com.khozemaProducts.models;

import java.util.ArrayList;

public class Category {

	private String name;
	private ArrayList<String> subCategories;
	private ArrayList<Product> products;
	
	public Category() {
		this("");
	}
	public Category(String name) {
		this.name = name;
		products = new ArrayList<Product>();
		setSubCategories(new ArrayList<String>());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public ArrayList<String> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(ArrayList<String> subCategories) {
		this.subCategories = subCategories;
	}
	
	
}
