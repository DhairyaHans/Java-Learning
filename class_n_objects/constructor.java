class Human{
    private String name;
    private int age;

    public Human(){ // Default constructor
        name = "John";
        age = 25;
    }

    public Human(int age, String name){ // Parameterized constructor
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class constructor {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h.getName() + " : " + h.getAge());
    }
}