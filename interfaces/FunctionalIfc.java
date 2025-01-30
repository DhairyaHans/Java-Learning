// A Functional Interface has only one abstract method
@FunctionalInterface
interface A{
    void show();
}

// We can omit the @FunctionalInterface annotation,
// in case... we know that the interface has only one abstract method
// But, it is a good practice to use it, 
// as it will give an error if we add more than one abstract method
@FunctionalInterface
interface X{
    int add(int a, int b);
}

// class B implements A{
//     public void show(){
//         System.out.println("Hello");
//     }
// }

class FunctionalIfc{
    public static void main(String[] args) {
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("Hello");
        //     }
        // };

        // Using Lambda Expression
        A obj = () -> System.out.println("Hello from Lambda Expression");
        obj.show();

        // X obj1 = new X(){
        //     public int add(a, b){
        //         return a+b;
        //     }
        // }
        // int result = obj1.add(10, 20);
        // System.out.println("Sum - "+ result)

        // When you have only one statement in the method, 
        // and that statement is a return statement,    
        // you can remove the return keyword
        X obj1 = (a, b) -> a+b;
        System.out.println(obj1.add(10, 20));
    } 
}