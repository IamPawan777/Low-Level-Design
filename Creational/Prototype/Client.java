package Creational.Prototype;

class User implements Cloneable{
    int id;
    String name;
    float salary;
    User(int id, String name, float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "User -> [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }   
      
}

public class Client{
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User(11, "Pawan", 12.33f);
        System.out.println(user);

        User user2 = (User)user.clone();   
        System.out.println(user2);
    }
}

