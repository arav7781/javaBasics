public class toString {
    static class Laptop{
        private String model;
        private int price;

        Laptop(){

        }

        Laptop(String model,int price){
            this.model = model;
            this.price = price;
        }

        public String getModel(){
            return model;
        }

        public int getPrice(){
            return price;
        }
        public String toString(){
            return "model: "+getModel()+" price: "+getPrice();
        }
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("lenovo",1000);
        Laptop l2 = new Laptop("lenovo",1000);//even though attributes are same these are returning false
        // System.out.println(l1 == l2);
        // System.out.println(l1.equals(l2));
        // System.out.println(l1);

        System.out.println(l1.toString());
    }
    
}
