

public class Dev {
    

    static class Computer{
        public void code(){
        
        }
    }

    static class Laptop extends Computer {
        public void code(){
            System.out.println("Code Compile Run!!");
        }
    }

    static class Desktop extends Computer{
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
