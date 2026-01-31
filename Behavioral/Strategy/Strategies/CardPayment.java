package Behavioral.Strategy.Strategies;

public class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("2. Card Payment successfully => "+amount);
    }    
}
