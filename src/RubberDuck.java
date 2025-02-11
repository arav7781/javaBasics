public class RubberDuck extends Duck {
    /**
     *
     */
    public RubberDuck() {
        quackBehaviour = new Squeek();
        swimBehaviour = new Floating();
    }
    @Override
    public void display() {
            System.out.println("I'm a rubber duck");
    }

}
