package Behavioral.Observer.Observers;

public class WhatsappObserver implements Observer {
    public void updates(String msg){
        System.out.println("This is Whatsapp messege -> "+msg);
    }
}
