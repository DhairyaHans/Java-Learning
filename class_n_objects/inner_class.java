class A{
    int count;

    public void show(){
        System.out.println("Show Method of Class A");
    }

    class B{
        public void display(){
            System.out.println("Display Method of Class B");
        }
    }

    static class C{
        public void print(){
            System.out.println("Print Method of Static Class C");
        }
    }
}

class InnerClass{
    public static void main(String[] args){
        A obj = new A();
        obj.show();

        // To create an object of Inner Class, we need to create an object of Outer Class 
        A.B obj1 = obj.new B();
        obj1.display();

        // Static Inner Class can be created without creating an object of Outer Class
        A.C obj2 = new A.C();
        obj2.print();
    }
}