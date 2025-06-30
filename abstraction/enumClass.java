package abstraction;



public class enumClass {
    enum laptop{
        Lenovo(5000), XPS(3000),MacBook(5000),predator(7000);
        private int price;
        private laptop(){
    
        }
        private laptop(int price){
            this.price = price;
        }
    
        public int getprice(){
            return price;
        }
    }

    public static void main(String[] args) {
        laptop lap = laptop.Lenovo;
        // System.out.println(lap);
        System.out.println(lap.price);

    }
}
