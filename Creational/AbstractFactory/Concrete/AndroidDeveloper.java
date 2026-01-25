package Creational.AbstractFactory.Concrete;

import Creational.AbstractFactory.Interface.*;

public class AndroidDeveloper implements Developer{
    public void salary(){
        System.out.println("Android Developer Salary: 50K");
    }
}