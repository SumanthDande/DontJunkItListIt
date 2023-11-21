package com.example.DontJunkItListIt.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean validateCreditCardNumber(String creditCardNumber) {

        // For simplicity, let's assume that a valid credit card number is a 16-digit number
        return creditCardNumber != null && creditCardNumber.matches("^\\d{16}$");
    }
}
