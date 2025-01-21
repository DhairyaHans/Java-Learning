public class inh_basics{
    public static void main(String[] args){
        Calc obj = new Calc();
        int r1 = obj.add(10, 9);
        int r2 = obj.sub(27, 10);

        System.out.print(r1+ " " + r2 + "\n");

        AdvCal advObj = new AdvCal();
        r1 = advObj.add(10, 9);
        r2 = advObj.sub(27, 10);
        int r3 = advObj.multi(10, 9);
        int r4 = advObj.div(27, 10);
        System.out.println();
        System.out.print(r1+ " " + r2+ " " + r3+ " " + r4 + "\n");

        VeryAdvCalc veryAdvObj = new VeryAdvCalc();
        r1 = veryAdvObj.add(10, 9);
        r2 = veryAdvObj.sub(27, 10);
        r3 = veryAdvObj.multi(10, 9);
        r4 = veryAdvObj.div(27, 10);
        double r5 = veryAdvObj.power(4, 3);
        System.out.println();
        System.out.print(r1+ " " + r2+ " " + r3+ " " + r4 + " " + r5 + "\n");
    }
}
