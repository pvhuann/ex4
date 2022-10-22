/*
 *  (C) Copyright 2020 IUH. All rights reserved.
 * 
 *  @author: VinhHien
 *  @date: Oct 21, 2020
 *  @version: 1.0
 */

package entity;

public class Phone {
	private String number;
	private String type;
	
	public Phone() {
	}

	/**
	 * @param number
	 * @param type
	 */
	public Phone(String number, String type) {
		this.number = number;
		this.type = type;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + ", type=" + type + "]";
	}
	
}
