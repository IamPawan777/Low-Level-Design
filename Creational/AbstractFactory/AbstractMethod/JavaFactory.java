package Creational.AbstractFactory.AbstractMethod;

import Creational.AbstractFactory.Concrete.JavaDeveloper;
import Creational.AbstractFactory.Concrete.JavaTester;
import Creational.AbstractFactory.Interface.Developer;
import Creational.AbstractFactory.Interface.AbstractFactory;
import Creational.AbstractFactory.Interface.Tester;

public class JavaFactory implements AbstractFactory {
    public Developer getDeveloper(){
        return new JavaDeveloper();
    }
    public Tester getTester(){
        return new JavaTester();
    }
}
