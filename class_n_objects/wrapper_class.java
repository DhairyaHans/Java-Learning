class WrapperClass{
    public static void main(String[] args){
        int num = 8;

        // Boxing
        Integer num1 = new Integer(num);

        // Auto Boxing
        Integer num2 = num;
    
        // Get the value of Integer Object
        // Unboxing
        int num3 = num2.intValue();

        System.out.println(num3);

        // Auto Unboxing
        int num4 = num1;

        System.out.println(num4);

    }

}