package Creational.Singleton;

// public class SingletonDesign {
//     public static class Singleton{
//         private static Singleton instance;                    // lazy initialization....

//         private Singleton(){}

//         public static Singleton getInstance(){                      
//             if(instance == null){
//                 instance = new Singleton();
//             }
//             return instance;
//         }   
//     }

//     public static void main(String[] args) {
//         Singleton obj1 = Singleton.getInstance();
//         Singleton obj2 = Singleton.getInstance();
//         System.out.println(obj1 == obj2); // This will print 'true'

//     }
// }





// // 2. Thread Safe........ Not safe in high-traffic apps
// class DataBaseConnectionManager{
    //     private static DataBaseConnectionManager instance;
    
//     private DataBaseConnectionManager(){}
    
//     public static synchronized DataBaseConnectionManager getInstance(){
//         if(instance==null){
//             instance=new DataBaseConnectionManager();
//         }
//         return instance;
//     }
// }

// class Checker{
//     public static void main(String[] args) {
//         DataBaseConnectionManager obj1 = DataBaseConnectionManager.getInstance();
//         DataBaseConnectionManager obj2 = DataBaseConnectionManager.getInstance();
//         System.out.println(obj1==obj2);
//     }
// }
                
        



// // 3. double checked locking............
// FIRST LOCK -> check instance created or not || SECOND LOCK -> single thread create instance

// public class SingletonDesign {
//     public static class Singleton{
//         private static volatile Singleton instance;

//         private Singleton(){}

//         public static Singleton getInstance(){
//             if(instance == null){
//                 synchronized(Singleton.class){
//                     if(instance == null){
//                         instance = new Singleton();
//                     }
//                 }
//             }
//             return instance;
//         }   
//     }   
//     public static void main(String[] args) {
//         Singleton obj1 = Singleton.getInstance();
//         Singleton obj2 = Singleton.getInstance();
//         System.out.println(obj1 == obj2); // This will print 'true'

//     }
// }


