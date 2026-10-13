package com.zepto.order;

public class Order {

	private Long orderId;
	private Long customerId;
	private String orderStatus;
	private double totalAmount;
	private String paymentStatus;
	private String paymentMethod;
	private String deliveryAddress;
	private String deliveryPartnerId;
	private String orderDate;
	private String estimatedDeliveryTime;
	public Order(Long orderId, Long customerId, String orderStatus, double totalAmount, String paymentStatus,
			String paymentMethod, String deliveryAddress, String deliveryPartnerId, String orderDate,
			String estimatedDeliveryTime) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderStatus = orderStatus;
		this.totalAmount = totalAmount;
		this.paymentStatus = paymentStatus;
		this.paymentMethod = paymentMethod;
		this.deliveryAddress = deliveryAddress;
		this.deliveryPartnerId = deliveryPartnerId;
		this.orderDate = orderDate;
		this.estimatedDeliveryTime = estimatedDeliveryTime;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getDeliveryPartnerId() {
		return deliveryPartnerId;
	}
	public void setDeliveryPartnerId(String deliveryPartnerId) {
		this.deliveryPartnerId = deliveryPartnerId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getEstimatedDeliveryTime() {
		return estimatedDeliveryTime;
	}
	public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
		this.estimatedDeliveryTime = estimatedDeliveryTime;
	}
	
}
