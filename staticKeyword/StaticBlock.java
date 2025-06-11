package staticKeyword;

class Mobile {
    String type;
    int price;
    static String name; 

    static {
        name = "Phone"; 
    }

    Mobile(int price, String type) {
        this.price = price;
        this.type = type;
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Mobile m1 = new Mobile(200, "ios");
        System.out.println(Mobile.name); 
        m1.price = 200;
        System.out.println(m1.price);
    }
}
