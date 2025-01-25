abstract class A{
    public abstract void show();
    public abstract void display();
}

class AbstractAnonymousInnerClass{
    public static void main(String[] args){
        // Abstract Anonymous Inner Class
        A obj = new A(){
            public void show(){
                System.out.println("Implementing Abstract Method in Anonymous Inner Class");
            }

            public void display(){
                System.out.println("Implementing Abstract Method in Anonymous Inner Class");
            }
        };

        obj.show();
    }
}