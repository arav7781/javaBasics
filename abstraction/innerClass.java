package abstraction;

class A{
    public void display() {
        System.out.println("Display method in class A");
    }
    class B{
        public void display() {
            System.out.println("Display method in class B");
        }
    }
}
class C{
    public void display() {
        System.out.println("Display method in class C");
    }
    static class D{
        public void display() {
            System.out.println("Display method in class D");
        }
    }
}
public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.display(); // Calling the display method of class A
        A.B obj1 = obj.new B(); // Creating an instance of the inner class B
        obj1.display(); // Calling the display method of the inner class B 

        C obj2  = new C();
        obj2.display(); // Calling the display method of class C
        C.D objr = new C.D(); // Creating an instance of the static inner class D
        objr.display(); // Calling the display method of the static inner class D
    }
}
