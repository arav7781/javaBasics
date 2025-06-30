interface A{
    void show();
}

public class functionalinterface {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println(" in show");
            }
        };
        obj.show();
    }
}
