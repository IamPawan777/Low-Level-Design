package Behavioral.Strategy.Strategies;

public class UpiPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("1. UPI Payment successfully => "+amount);
    }    
}
