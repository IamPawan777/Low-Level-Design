package Creational.Factory.Classes;

import Creational.Factory.Interface.Developer;

public class DeveloperFactory {
    
    public static Developer getSalary(String DevType) throws Exception{
        // if(DevType.equalsIgnoreCase("Android Developer")){
        //     return new AndroidDeveloper();
        // }
        // else if(DevType.equalsIgnoreCase("MERN Developer")){
        //     return new MERNDeveloper();
        // }
        // else{
        //     throw new Exception("No Develoepr exist like this...!");
        // }

        // or......
        

        switch (DevType) {
            case "android developer":
                return new AndroidDeveloper();
            case "MERN Developer": 
                return new MERNDeveloper();
            default: 
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
