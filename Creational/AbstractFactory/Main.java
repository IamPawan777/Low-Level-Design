package Creational.AbstractFactory;

interface Shop{
    public String cookFood();
}
interface Drink{
    public String colaDrink();
}

class ZomatoShop implements Shop{
    public String cookFood(){
        return "Zomato Pizza";
    }
}
class SwiggyShop implements Shop{
    public String cookFood(){
        return "Swiggy Pizza";
    }
}
class ZomatoDrink implements Drink{
    public String colaDrink(){
        return "Zomato Mazza";
    }
}
class SwiggyDrink implements Drink{
    public String colaDrink(){
        return "Swiggy Mazza";
    }
}


interface FoodFactory{
    Shop getCookFood();
    Drink getColaDrink();
}
class ZomatoFactory implements FoodFactory{
    public Shop getCookFood(){
        return new ZomatoShop();
    }
    public Drink getColaDrink(){
        return new ZomatoDrink();
    }
}
class SwiggyFactory implements FoodFactory{
    public Shop getCookFood(){
        return new SwiggyShop();
    }
    public Drink getColaDrink(){
        return new SwiggyDrink();
    }
}


public class Main {
    public static void main(String[] args) {
        FoodFactory factory = new ZomatoFactory();
        Shop cookFood = factory.getCookFood();
        Drink drinkCola = factory.getColaDrink();

        String output = cookFood.cookFood();
        String output2 = drinkCola.colaDrink();

        System.out.println(output+" "+output2);
    }
}

