class Calculator{
    
    int num; // Instance Variable

    public int addNums(int n1, int n2){ 
        // n1 and n2 are Local Variables
        return n1+n2;
    }
}

class Terminologies{
    public static void main(String args[]){
        Calculator obj = new Calculator(); 
        // obj is a 'Reference Variable'
        int r1 = obj.addNums(10, 20);
        System.out.println(r1);
    }
}