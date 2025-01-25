
/*
// final class cannot be inherited
final class Calc {
    public void show(){
        System.out.println("Calc show method");
    }

    public int add(int n1, int n2){
        return n1 + n2;
    }
}

// Error, cannot inherit from final class
class AdvCalc extends Calc{
    public void show(){
        System.out.println("AdvCalc show method");
    }

    public int sub(int n1, int n2){
        return n1 - n2;
    }
}
*/

/*
// final method cannot be overridden
class A{
    final public void show(){
        System.out.println("A show method");
    }
}

class B extends A{
    // Error: cannot override final method
    // public void show(){
    //     System.out.println("B show method");
    // }
}
*/

public class final_keywrd {
    public static void main(String[] args) {

        // final keyword is used to declare a constant variable
        final float pi = 3.14f;
        // pi = 3.14159f; // Error: cannot assign a value to final variable pi
        System.out.println(pi);
    }
}
