package Behavioral.Observer;

import Behavioral.Observer.Observers.EmailObserver;
import Behavioral.Observer.Observers.SMSObserver;
import Behavioral.Observer.Subjects.Station;

public class Client {
    public static void main(String[] args) {
        Station station=new Station();
        station.addObserver(new SMSObserver());
        station.addObserver(new EmailObserver());

        station.setMsg();

    }
}
