class AddCalc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}

class MethodOverloading {
    public static void main(String args[]){
        AddCalc cd = new AddCalc();
        System.out.println(cd.add(5.8, 88));
    } 
}
