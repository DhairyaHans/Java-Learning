class Computer{
    public void playMusic(){
        System.out.println("Music Playing");
    }

    public String runjob(int cpus){
        if(cpus>10)
            return "Success";
        return "Failed";
    }
}

class MethodsClass {
    public static void main(String args[]){
        Computer obj = new Computer();
        obj.playMusic();
        System.out.println(obj.runjob(6));
    }
}
