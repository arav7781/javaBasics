package abstraction;

abstract class Car{
    public abstract void drive();
    public abstract void stop();
    public void playMusic(){
        System.out.println("Playing music");
    }
} 

class Safari extends Car{
    public void drive(){
        System.out.println("Driving Safari");
    }
    public void stop(){
        System.out.println("Stopping Safari");
    }
    Safari(){

    }
}

public class main {
    public static void main(String[] args) {
        Car s1 = new Safari();
        s1.drive();
        s1.stop();
        s1.playMusic();
    }
    
}
