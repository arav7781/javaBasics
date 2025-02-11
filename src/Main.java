public class Main {
    public static void main(String[] args) {
      MallardDuck md = new MallardDuck();
      System.out.println("______________");
      md.display();
      md.performQuack();
      System.out.println("______________");
      RedHeadDuck rd = new RedHeadDuck();
      System.out.println("______________");
      rd.display();
      rd.performQuack();
      rd.performSwim();
      System.out.println("______________");
      RubberDuck rub = new RubberDuck();
      System.out.println("______________");
      rub.display();
      rub.performQuack();
      rub.floatingAction();
      System.out.println("______________");

    }
}