package Creational.AbstractFactory;

import Creational.AbstractFactory.AbstractMethod.AndroidFactory;
import Creational.AbstractFactory.Interface.*;
import Creational.AbstractFactory.Interface.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory androidFactory = new AndroidFactory();
        Developer developer = androidFactory.getDeveloper();
        Tester tester = androidFactory.getTester();
        developer.salary();
        tester.testSoftware();
    }
}
