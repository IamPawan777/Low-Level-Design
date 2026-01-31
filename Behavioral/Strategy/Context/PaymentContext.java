package Behavioral.Strategy.Context;

import Behavioral.Strategy.Strategies.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void getPayment(int amount){
        paymentStrategy.pay(amount);
    }
}
