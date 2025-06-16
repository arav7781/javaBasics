package Inheritance;

public class OverLoading {
    static class Calculator{

         public Calculator() {
            
        }
     

        public int add(int n1,int n2){
            return n1+n2;
        }
        public int add(int n1,int n2,int n3){
            return n1+n2+n3;
        }
       
        
    }
     public static void main(String[] args) {
        Calculator calc = new Calculator();
        int r1 = calc.add(3,4);
        int r2 = calc.add(3,4,5);
        System.out.println("Sum of 3 and 4 is "+r1);
        System.out.println("Sum of 3, 4 and 5 is "+r2);

     }
}
