/*
 *  (C) Copyright 2020 IUH. All rights reserved.
 * 
 *  @author: VinhHien
 *  @date: Oct 22, 2020
 *  @version: 1.0
 */

package entity;

import java.util.Date;
import java.util.List;


public class Order {
	
	private String orderId;
	private Date orderDate;
	private Date shippedDate;
	private double orderTotal;
	
	private OrderStatus orderStatus;
	private Address shippingAddress;
	private Customer customer;
	private Staff staff;
	private List<OrderDetail> orderDetails;

	public Order() {
	}

	public Order(Date shippedDate, OrderStatus orderStatus) {
		super();
		this.shippedDate = shippedDate;
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the shippedDate
	 */
	public Date getShippedDate() {
		return shippedDate;
	}

	/**
	 * @param shippedDate the shippedDate to set
	 */
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	/**
	 * @return the orderTotal
	 */
	public double getOrderTotal() {
		return orderTotal;
	}

	/**
	 * @param orderTotal the orderTotal to set
	 */
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	/**
	 * @return the orderStatus
	 */
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the shippingAddress
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the staff
	 */
	public Staff getStaff() {
		return staff;
	}

	/**
	 * @param staff the staff to set
	 */
	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	/**
	 * @return the orderDetails
	 */
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	/**
	 * @param orderDetails the orderDetails to set
	 */
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", shippedDate=" + shippedDate
				+ ", orderTotal=" + orderTotal + ", orderStatus=" + orderStatus + ", shippingAddress=" + shippingAddress
				+ ", customer=" + customer + ", staff=" + staff + ", orderDetails=" + orderDetails + "]";
	}
	
	
	
}
