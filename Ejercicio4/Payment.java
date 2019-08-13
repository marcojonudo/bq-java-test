package com.ejercicio4.bq;

public class Payment implements PaymentInterface {

	@Override
	public boolean pay(Order order) {
		switch (order.getPaymentMethod()) {
			case PAYPAL:
				return true;
			default:
				return false;
		}
	}

}
