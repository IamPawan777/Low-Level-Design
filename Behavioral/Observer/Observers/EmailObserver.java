package Behavioral.Observer.Observers;

public class EmailObserver implements Observer {
    public void updates(String msg){
        System.out.println("This is Email messege -> "+msg);
    }
}
