package Behavioral.Observer.Subjects;

import Behavioral.Observer.Observers.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifieObserver();
}
