class Human{
    private String name;
    private int age;

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

public class encapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h.getName() + " : " + h.getAge());
    }
}