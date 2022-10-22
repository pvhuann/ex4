/*
 *  (C) Copyright 2020 IUH. All rights reserved.
 * 
 *  @author: VinhHien
 *  @date: Oct 21, 2020
 *  @version: 1.0
 */

package entity;

import java.util.Date;
import java.util.List;

public class Customer {
	
	private String customerId;
	private String firstName;
	private String lastName;
	private Address address;
	private Date registrationDate;
	private String email;
	private List<Phone> phones;

	public Customer() {
	}
	
	/**
	 * @param _id
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param registrationDate
	 * @param email
	 */
	public Customer(String customerId, String firstName, String lastName, Address address, Date registrationDate,
			String email) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.registrationDate = registrationDate;
		this.email = email;
	}


	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phones
	 */
	public List<Phone> getPhones() {
		return phones;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Customer [_id=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", registrationDate=" + registrationDate + ", email=" + email + ", phones=" + phones + "]";
	}
	
}
