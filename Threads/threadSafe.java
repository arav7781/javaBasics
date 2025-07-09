package Threads;

public class threadSafe {
    private static int count = 0;    
    
    static class A implements Runnable{
        public void run(){
            for(int i = 0;i<10000;i++){
                count++;
            }
           

    }

    static class B implements Runnable{
        public void run(){
            
            for(int i = 0;i<10000;i++){
                count++;
            }
            
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable obj1 = new A();
        Runnable obj2 = new A();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        // t1.join(); one way is join use krlo so that main thread wait for execution of these thread then main apna kaam krega 
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);

    }
}
}
