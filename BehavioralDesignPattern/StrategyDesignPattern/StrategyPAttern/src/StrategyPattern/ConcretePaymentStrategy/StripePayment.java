package StrategyPattern.ConcretePaymentStrategy;

import StrategyPattern.PaymentStrategy;

public class StripePayment implements PaymentStrategy {
    @Override
    public void processPayment(){
        System.out.println("Processing the Stripe Payment:....");
    }
}
