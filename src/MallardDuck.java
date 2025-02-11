public class MallardDuck extends Duck {
    /**
     *
     */
    public MallardDuck(){
        quackBehaviour = new quack();
        swimBehaviour = new SwimwithLegs();
    }
    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");

    }
}
