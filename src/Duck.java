public abstract class Duck {
    QuackBehaviour quackBehaviour;
    abstract public void display();
    public void setQuackBehaviour(QuackBehaviour behaviour) {
        quackBehaviour = behaviour;
    }
    public void performQuack() {
        quackBehaviour.quack();
    }
}
