package Creational.AbstractFactory.AbstractMethod;

import Creational.AbstractFactory.Concrete.AndroidDeveloper;
import Creational.AbstractFactory.Concrete.AndroidTester;
import Creational.AbstractFactory.Interface.Developer;
import Creational.AbstractFactory.Interface.AbstractFactory;
import Creational.AbstractFactory.Interface.Tester;

public class AndroidFactory implements AbstractFactory {
    public Developer getDeveloper(){
        return new AndroidDeveloper();
    }
    public Tester getTester(){
        return new AndroidTester();
    } 
}
