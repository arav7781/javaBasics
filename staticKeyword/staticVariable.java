package staticKeyword;

class Mobile{
    String type;
    int price;
    static String name = "phone";

    Mobile(int price, String type){
        this.price = price;
        this.type = type;
    }

    private void seeType(){
        System.out.println(type);
    }

    public void getType(){
        seeType();
    }
    public void setType(String type){
        this.type = type;
    }

}

public class staticVariable {
    public static void main(String[] args) {
        Mobile m1 = new Mobile(200,"android");
        m1.getType();
        m1.setType("ios");
        m1.getType();
        System.out.println("Mobile Name:"+Mobile.name+" Mobile Type:"+m1.type);// static var is accesed using class name.
    }

    
}
