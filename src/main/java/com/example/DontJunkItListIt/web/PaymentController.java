package com.example.DontJunkItListIt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DontJunkItListIt.service.PaymentServiceInterface;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentServiceInterface paymentService;
	
	@PostMapping("/validate")
    public ResponseEntity<String> validateCreditCardNumber(@RequestBody String creditCardNumber) {
        boolean isValid = paymentService.validateCreditCardNumber(creditCardNumber);

        if (isValid) {
            return new ResponseEntity<>("Credit card is valid", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Credit card is invalid", HttpStatus.BAD_REQUEST);
        }
    }

}
