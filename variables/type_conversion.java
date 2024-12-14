class type_conversion {
    public static void main(String args[]){
        // TYPE CONVERSION

        // Byte to Int
        byte b = 127;
        int a = b;
        System.out.println(a);

        
        // TYPE CASTING

        // Int to Byte
        int x = 259;
        byte y = (byte) x;  // 259 % 256 (range of byte) = 3
        System.out.println(y);

        // Float to Int
        float f = 256.8f;
        int i_f = (int) f;
        System.out.println(i_f); 
    
    }    
}
