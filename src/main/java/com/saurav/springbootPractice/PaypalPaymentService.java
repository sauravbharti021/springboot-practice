package com.saurav.springbootPractice;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount){
        System.out.println("Paypal");
        System.out.println("Amount is -> "+amount);
    }
}
