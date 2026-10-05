package StrategyPattern;

import StrategyPattern.ConcretePaymentStrategy.*;

public class Main {
    public static void main(String[] args){
        PaymentStrategy creditCardPayment=new CreditCardPayment();
        PaymentStrategy payPalPayment=new PayPalPayment();
        PaymentStrategy cryptoPayment=new CryptoPayment();
        PaymentStrategy stripePayment= new StripePayment();

        PaymentProcessor paymentProcessor=new PaymentProcessor(creditCardPayment);
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(payPalPayment);
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(cryptoPayment);
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(stripePayment);
        paymentProcessor.processPayment();
    }
}
