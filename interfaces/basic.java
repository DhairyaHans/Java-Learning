interface A{
    
    // Variables in interface are by default public, static and final 
    int age = 15;
    String name = "John";

    // Methods in interface are by default public and abstract
    void show();
    void config();
}

interface X{
    void run();
}

// Interface can extend another interface
interface Y extends X{

}

// Class B implements interface A
// Class B must implement all the methods of interface A
// Else class B must be declared as abstract
// A Class can implement multiple interfaces
class B implements A,X{
    public void show(){
        System.out.println("Show");
    }
    public void config(){
        System.out.println("Config");
    }
    public void run(){
        System.out.println("Run");
    }
}


class BasicInterface{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
        System.out.println("Name: " + A.name);
    }
}