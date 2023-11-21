package com.example.DontJunkItListIt.entity;

import jakarta.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

    private String creditCardNumber;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Payment(Long paymentId, String creditCardNumber) {
		super();
		this.paymentId = paymentId;
		this.creditCardNumber = creditCardNumber;
	}

	public Payment(String creditCardNumber) {
		super();
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", creditCardNumber=" + creditCardNumber + "]";
	}

    
}

