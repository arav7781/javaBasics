package Threads;





public class multipleThreads {

    static class  A extends Thread{
        public void run(){
            for(int i = 0;i<100;i++){
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
            }
        }
    }
    static class B extends Thread{
        public void run(){
            for(int i = 0;i<100;i++){
                System.out.println("hii");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
               
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

    }

}
