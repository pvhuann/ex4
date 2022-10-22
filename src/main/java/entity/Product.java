/*
 *  (C) Copyright 2020 IUH. All rights reserved.
 * 
 *  @author: VinhHien
 *  @date: Oct 22, 2020
 *  @version: 1.0
 */

package entity;

import java.util.List;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

public class Product {
	@BsonId
	private long productId;
	@BsonProperty("product_name")
	private String name;
	@BsonProperty("brand_name")
	private String brand;
	@BsonProperty("category_name")
	private String category;
	private List<String> colors;
	private double price;
	@BsonProperty("model_year")
	private int modelYear;
	
	public Product() {
	}

	public Product(long productId) {
		super();
		this.productId = productId;
	}
	
	public Product(long productId, String name, String brand, String category, List<String> colors, double price,
			int modelYear) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.colors = colors;
		this.price = price;
		this.modelYear = modelYear;
	}

	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the colors
	 */
	public List<String> getColors() {
		return colors;
	}

	/**
	 * @param colors the colors to set
	 */
	public void setColors(List<String> colors) {
		this.colors = colors;
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
	 * @return the modelYear
	 */
	public int getModelYear() {
		return modelYear;
	}

	/**
	 * @param modelYear the modelYear to set
	 */
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", category=" + category
				+ ", colors=" + colors + ", price=" + price + ", modelYear=" + modelYear + "]";
	}
	
}
