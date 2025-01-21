class A extends Object{
    A(){
        super();
        System.out.println("In A");
    }

    A(int n){
        super();
        System.out.println("In A INT");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("In B");
    }

    B(int n){
        super(n);
        System.out.println("In B INT");
    }
}

class C extends A{
    C(){
        super();
        System.out.println("In C");
    }

    C(int n){
        this();
        System.out.println("In C INT");
    }
}



public class SuperClass {
    public static void main(String[] args){
        B obj = new B();
        B obj_1 = new B(10);
        C objC = new C(10);
    }
}
