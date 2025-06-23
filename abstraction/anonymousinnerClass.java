package abstraction;

class A{
    public void show(){
        System.out.println("Show method in class A");
    }
}
public class anonymousinnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("Show method in anonymous inner class");
            }
        };
        obj.show();
    }
}
