package com.example.kafkaDemo.model;

public class Order {
	private String id;
	private double amount;
	protected String getId() {
		return id;
	}
	protected double getAmount() {
		return amount;
	}
	protected void setId(String id) {
		this.id = id;
	}
	protected void setAmount(double amount) {
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
