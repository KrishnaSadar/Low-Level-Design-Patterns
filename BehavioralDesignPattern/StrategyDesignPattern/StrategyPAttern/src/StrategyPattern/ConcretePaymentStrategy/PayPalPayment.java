package StrategyPattern.ConcretePaymentStrategy;

import StrategyPattern.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment(){
        System.out.println("Processing the Paypal Payment:.....");
    }
}
