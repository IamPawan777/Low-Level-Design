package Creational.Builder;

class User{
    private int id;
    private String name;
    private int age;
    private float fees;

    private User(UserBuilder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.age=builder.age;
        this.fees=builder.fees;
    } 

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", fees=" + fees + "]";
    }

    static class UserBuilder{
        private int id;                 // required
        private String name;            // optional
        private int age;                // optional
        private float fees;             // optional

        public UserBuilder(int id) {    
            this.id = id;
        }

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }
        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder setFees(float fees) {
            this.fees = fees;
            return this;
        }
        public User build(){
            return new User(this);
        }  
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder(101)
                            // .setId(2)
                            .setName("Harry")
                            .setAge(21)
                            .setFees(12.21f)
                            .build();

        System.out.println(user.toString());
    }
}
