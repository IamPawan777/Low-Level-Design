package Behavioral.Strategy;

interface Payment{
    void pay(int amount);
}
class Card implements Payment{
    public void pay(int amount){
        System.out.println("Card Payment System: "+200);
    }
}
class UPI implements Payment{
    public void pay(int amount){
        System.out.println("UPI Payment System: "+200);
    }
}
class Wallet implements Payment{
    public void pay(int amount){
        System.out.println("Wallet Payment System: "+200);
    }
}
class PaymentContext{
    Payment payment;
    PaymentContext(Payment payment){
        this.payment=payment;
    }
    public void pay(int amount){
        payment.pay(amount);
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentContext obj=new PaymentContext(new UPI());
        obj.pay(200);
    }
}
