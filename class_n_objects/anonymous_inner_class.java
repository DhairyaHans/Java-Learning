class A{
    public void show(){
        System.out.println("Inside the Show of Class A");
    }
}

class AnonymousInnerClass{
    public static void main(String[] args){
        // Anonymous Inner Class
        // Implementation is specific to the object
        A obj = new A(){
            public void show(){
                System.out.println("Inside the Show of Anonymous Inner Class");
            }
        };

        obj.show();

        A obj2 = new A();
        obj2.show();
    }
}