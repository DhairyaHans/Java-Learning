enum Status{
    Running, Stopped, Waiting, Completed
}

// Defining enum with constructor and fields
enum Laptop{
    Dell(30000), HP(40000), Lenovo, Acer(100000);

    private int price;

    Laptop (){
        price = 50000;
    }

    Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Status status = Status.Running;
        System.out.println("Current status: " + status);

        switch(status){
            case Running:
                System.out.println("Process is running");
                break;
            case Stopped:
                System.out.println("Process is stopped");
                break;
            case Waiting:
                System.out.println("Process is waiting");
                break;
            case Completed:
                System.out.println("Process is completed");
                break;
        }

        Laptop lap = Laptop.Dell;
        System.out.println("Laptop: " + lap + ", Price: " + lap.getPrice());

    }
}
 