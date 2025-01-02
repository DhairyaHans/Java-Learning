class Calculator{
    int a = 0;

    public int add(int x, int y){
        return x+y+a;
    }
}

class BasicJava{
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 20;

        Calculator calc = new Calculator();
        System.out.println(calc.add(num1, num2));
        calc.a = 50;
        System.out.println(calc.add(num1, num2));
    }
}