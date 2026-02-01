package Behavioral.Observer.Observers;

public class SMSObserver implements Observer{
    public void updates(String msg){
        System.out.println("This is SMS messege -> "+msg);
    }
}
