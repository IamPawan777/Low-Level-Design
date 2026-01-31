package Behavioral.Strategy;

import Behavioral.Strategy.Context.PaymentContext;
import Behavioral.Strategy.Strategies.CardPayment;
import Behavioral.Strategy.Strategies.UpiPayment;

public class Client {
    public static void main(String[] args) {
        PaymentContext obj=new PaymentContext(new CardPayment());
        obj.getPayment(200);
    }
}
