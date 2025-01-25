abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}


abstract class FlyingCar{
    public abstract void fly();
    public abstract void drive();

    public void music(){
        System.out.println("Playing Music in flying Car");
    }
}

abstract class F1Car extends FlyingCar{
    public void drive(){
        System.out.println("Driving the Flying Car");
    }
}

// Concrete Class
class FlyingF1Car extends F1Car{
    public void fly(){
        System.out.println("Flying the Flying Car");
    }
}

class AbstractClass{
    public static void main(String[] args){
        
        // Can't create an Object of Abstract Class
        // Car obj1 = new Car();
        // obj1.drive();
        // obj1.playMusic();

        // But We can reference the Abstract Class Object 
        Car obj2 = new WagonR();
        obj2.drive();
        obj2.playMusic();

        // Can't Create an Object of Abstract Class
        // F1Car obj3 = new F1Car();

        FlyingF1Car obj4 = new FlyingF1Car();
        obj4.fly();
        obj4.drive();
        obj4.music();

    }
}