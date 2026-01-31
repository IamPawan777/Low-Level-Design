package Behavioral.Strategy.Strategies;

class WalletPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("3. Wallet Payment Successfully => "+amount);
    }
}