class Counter{
    int count;
    // synchronized keyword is used to make sure that only one thread can access this method at a time
    public synchronized void increment(){
        count += 1;
    }
}

class RaceCondition{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome, Race Condition");

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i=1; i<=1000; i+=1)
            {
                c.increment();   
            }
        };
        Runnable obj2 = () -> {
            for(int i=1; i<=1000; i+=1)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();  // wait for t1 to finish
        t2.join();  // wait for t2 to finish

        System.out.println("Count: " + c.count);

    }
}