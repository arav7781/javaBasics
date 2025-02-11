public abstract class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    abstract public void display();
    public void setQuackBehaviour(QuackBehaviour behaviour) {
        quackBehaviour = behaviour;
    }
    public void setSwimBehaviour(SwimBehaviour behaviour) {
        swimBehaviour = behaviour;
    }
    public void performQuack() {
        quackBehaviour.quack();
    }
    public void performSwim() {
        swimBehaviour.swim();
    }
    public void floatingAction() {
        swimBehaviour.swim();
    }
}
