

public class lambdaExpression {
    @FunctionalInterface
    interface A{
        void show(int i);
    }
    
    public static void main(String[] args) {
        A obj = (int i) -> {
            System.out.println("In Show " + i);
        };
        obj.show(10);
    }
}
