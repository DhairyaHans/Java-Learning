class IfElse{
    public static void main(String args[]){
        
        int x = 10;
        int y = 120;
        int z = 30;

        // Basic If Else
        if(x>10)
            System.out.println("Hello");
        else
            System.out.println("World");

        // If-ElseIf-Else
        if(x>y && x>z)
            System.out.println("x: " + x);
        else if(y>z)
            System.out.println("y: " + y);
        else
            System.out.println("z: " + z);
    }
}