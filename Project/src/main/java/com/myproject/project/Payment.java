package com.myproject.project;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Payment {
    public static void main(String[] args) {
        
        try {
            Stripe.apiKey = "sk_test_51JT2tzK11Ue0aOYnBqE8GcwURXjvOVE4DRAxonHFe7Q1kFpZQ5woQe2YOH9TsSdOKlMYajVcAsgy5vEigHOCkE7H00vsjNq8yx";
            
            PaymentIntentCreateParams params =
                    PaymentIntentCreateParams.builder()
                            .setAmount(1000L)
                            .setCurrency("usd")
                            .addPaymentMethodType("card")
                            .setReceiptEmail("jenny.rosen@example.com")
                            .build();
            
            PaymentIntent paymentIntent = PaymentIntent.create(params);
        } catch (StripeException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Set your secret key. Remember to switch to your live secret key in production.
// See your keys here: https://dashboard.stripe.com/apikeys
    
    
}
