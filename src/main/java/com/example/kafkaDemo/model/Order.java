package com.example.kafkaDemo.model;

public class Order {
	private String id;
	private double amount;
	public String getId() {
		return id;
	}
	public double getAmount() {
		return amount;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Order(String id, double amount) {
		super();
		this.id = id;
		this.amount = amount;
	}
	public Order() {}
	@Override
	public String toString() {
		return "Order [id=" + id + ", amount=" + amount + "]";
	}
	
}
