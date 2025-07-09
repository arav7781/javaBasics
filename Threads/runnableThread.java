package Threads;

public class runnableThread {
    static class A implements Runnable{
        public void run(){
            for(int i = 0;i<5;i++){
                System.out.println("hello");
            }
        }
    }
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for(int i = 0;i<5;i++){
                System.out.println("hello");
            }
        };
        
        Thread t1 = new Thread(obj1);

        t1.start();
    }
}
