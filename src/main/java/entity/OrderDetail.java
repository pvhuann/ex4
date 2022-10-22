/*
 *  (C) Copyright 2020 IUH. All rights reserved.
 * 
 *  @author: VinhHien
 *  @date: Oct 22, 2020
 *  @version: 1.0
 */

package entity;

public class OrderDetail {
	private int quantity;
	private String color;
	private double price;
	private double discount;
	private double lineTotal;
	private Product product;

	public OrderDetail() {
	}

	/**
	 * @param quantity
	 * @param color
	 * @param productID
	 * @param price
	 * @param discount
	 */
	public OrderDetail(int quantity, String color, Product product, double price, double discount) {
		this.quantity = quantity;
		this.color = color;
		this.product = product;
		this.price = price;
		this.discount = discount;
		this.lineTotal = quantity * price * (1 - discount);
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the lineTotal
	 */
	public double getLineTotal() {
		return lineTotal;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "OrderDetail [quantity=" + quantity + ", color=" + color + ", product=" + product + ", lineTotal="
				+ lineTotal + ", price=" + price + ", discount=" + discount + "]";
	}

}
