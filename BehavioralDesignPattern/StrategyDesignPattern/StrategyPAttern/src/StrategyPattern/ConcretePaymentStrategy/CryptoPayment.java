package StrategyPattern.ConcretePaymentStrategy;

import StrategyPattern.PaymentStrategy;

public class CryptoPayment  implements PaymentStrategy {
    @Override
    public void processPayment(){
        System.out.println("Processing the CryptoPayement:....");
    }
}
