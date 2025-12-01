package com.mphasis;

import java.io.Serializable;

public class Bottle implements Serializable {
	
	private int id;
	private String brand;
	private double cost;
	private String colour;
	public Bottle() {
		super();
		
	}
	public Bottle(int id, String brand, double cost, String colour) {
		super();
		this.id = id;
		this.brand = brand;
		this.cost = cost;
		this.colour = colour;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Bottle [id=" + id + ", brand=" + brand + ", cost=" + cost + ", colour=" + colour + "]";
	}
	
	
}
