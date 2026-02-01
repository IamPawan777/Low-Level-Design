package Behavioral.Observer.Subjects;

import java.util.*;

import Behavioral.Observer.Observers.Observer;

public class Station implements Subject {
    List<Observer> observers=new ArrayList<>();
    String msg;

    public void addObserver(Observer observer) {
       observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifieObserver() {
        for(Observer x: observers)
            x.updates(msg);
    }

    public void setMsg() {
        this.msg = "Your Order Placed..!";
        notifieObserver();
    }    
}
