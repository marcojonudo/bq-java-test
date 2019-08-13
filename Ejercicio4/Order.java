package com.ejercicio4.bq;

public class Order {
	
	private PaymentMethod paymentMethod;
	
	public Order(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	
}
