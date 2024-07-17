package com.testjbk1;

public class Product {
	private int id;
	private String name;
    private	String catagory;
	private double price;
	public Product(int id, String name, String catagory, double price) {
		super();
		this.id = id;
		this.name = name;
		this.catagory = catagory;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", catagory=" + catagory + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
