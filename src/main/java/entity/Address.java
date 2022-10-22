package entity;

/*
 *  (C) Copyright 2020 IUH. All rights reserved.
 * 
 *  @author: VinhHien
 *  @date: Oct 21, 2020
 *  @version: 1.0
 */

public class Address {
	private String city;
	private String state;
	private String street;
	private int zipCode;
	
	public Address() {
	}

	/**
	 * @param city
	 * @param state
	 * @param street
	 * @param zipCode
	 */
	public Address(String city, String state, String street, int zipCode) {
		this.city = city;
		this.state = state;
		this.street = street;
		this.zipCode = zipCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", street=" + street + ", zipCode=" + zipCode + "]";
	}
	
}
