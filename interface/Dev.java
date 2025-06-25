

public class Dev {
    interface Computer{
        void code();
    }
    

    static class Laptop implements Computer {
        public void code(){
            System.out.println("Code Compile Run!!");
        }
    }

    static class Desktop implements Computer{
        public void code(){
            System.out.println("Code Compile Run:faster!!");
        }
    }

    static class Developer {
        public void devApp(Computer comp){
            comp.code();
            System.out.println("App Developed Successfully!!");
        }
    }
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer developer = new Developer();
        developer.devApp(desktop);
    }
}
