package StrategyPattern.ConcretePaymentStrategy;

import StrategyPattern.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(){
        System.out.println("Processing the credit card payment:.....");
    }
}
