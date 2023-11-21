package com.example.DontJunkItListIt.service;

public interface PaymentServiceInterface {

    /**
     * Validate the credit card number using the Luhn algorithm.
     *
     * @param creditCardNumber The credit card number to be validated.
     * @return True if the credit card number is valid, false otherwise.
     */
    boolean validateCreditCardNumber(String creditCardNumber);
}

