// Every thread must have a run method, which is the entry point for that thread.
// The run method is the method that is executed when a thread is started.
// To Start a thread, we need to call the start method of the thread class.

class A extends Thread {
    public void run(){
        for(int i=1; i<=100; i+=1)
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                System.out.println(e);

            }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1; i<=100; i+=1)
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                System.out.println(e);

            }
    }
}


class ThreadsBasic{
    public static void main(String[] args){
        System.out.println("Welcome, Threads");

        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj1.getPriority());
        // obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}