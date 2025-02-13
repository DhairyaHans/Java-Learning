// Runnable is an interface that is implemented by a class to create a thread.

class A implements Runnable {
    public void run(){
        for(int i=1; i<=5; i+=1)
        {   
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                System.out.println(e);

            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1; i<=5; i+=1)
        {
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                System.out.println(e);

            }
        }
    }
}


class RunnableBasic{
    public static void main(String[] args){
        System.out.println("Welcome, Runnable");

        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // Anonymous class
        Runnable obj3 = new Runnable(){
            public void run(){
                for(int i=1; i<=5; i+=1)
                {
                    System.out.println("Hui");
                    try{
                        Thread.sleep(10);
                    }
                    catch (InterruptedException e){
                        System.out.println(e);
        
                    }
                }
            }
        };

        // Lambda Expression
        Runnable obj4 = () -> {
            for(int i=1; i<=5; i+=1)
            {
                System.out.println("Hoho");
                try{
                    Thread.sleep(10);
                }
                catch (InterruptedException e){
                    System.out.println(e);
    
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}