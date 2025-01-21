class A{
    public void show(){
        System.err.println("IN A Show");
    }
}

class B extends A{
    public void show(){
        System.err.println("IN B Show");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        A objA = new A();
        objA.show();

        B objB = new B();
        objB.show();
    }
}
