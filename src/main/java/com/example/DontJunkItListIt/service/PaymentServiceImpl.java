package com.example.DontJunkItListIt.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentServiceInterface {

	 @Override
	    public boolean validateCreditCardNumber(String creditCardNumber) {
	        // Implement Luhn algorithm for credit card number validation
	        if (creditCardNumber == null || !creditCardNumber.matches("^\\d+$")) {
	            return false; // Invalid format
	        }

	        int sum = 0;
	        boolean doubleDigit = false;

	        for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
	            int digit = Character.getNumericValue(creditCardNumber.charAt(i));

	            if (doubleDigit) {
	                digit *= 2;
	                if (digit > 9) {
	                    digit -= 9;
	                }
	            }

	            sum += digit;
	            doubleDigit = !doubleDigit;
	        }

	        return sum % 10 == 0;
	    }
}
