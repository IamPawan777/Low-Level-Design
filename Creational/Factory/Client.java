package Creational.Factory;

import Creational.Factory.Classes.DeveloperFactory;
import Creational.Factory.Interface.Developer;

public class Client {
        public static void main(String[] args) throws Exception {
            Developer salary = DeveloperFactory.getSalary("android developer");
            salary.salary();
        }
}
