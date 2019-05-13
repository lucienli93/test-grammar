package test;

import java.io.Serializable;

public class Fruit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4365301348727373764L;
	private String name;
	private transient String color;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static class Builder {
		private String name;
		private String color;
		private int price;
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}
		public Builder setPrice(int price) {
			this.price = price;
			return this;
		}
		public Builder() {
			
		}
		
		public Fruit build() {
			return new Fruit(this);
		}
		@Override
		public String toString() {
			return ("name: " + this.name + ", color: " + this.color + ", price: " + this.price);
		}
	}
	private Fruit(Builder builder) {
		this.color = builder.color;
		this.name = builder.name;
		this.price = builder.price;
	}
	
}
