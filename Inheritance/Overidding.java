package Inheritance;

public class Overidding {
    static class Calculator{

         public Calculator() {
            
        }

        public int add(int n1,int n2){
            return n1+n2;
        }  
        
    }
    static class StringCalculator extends Calculator {
        @Override
        public int add(int n1, int n2) {
            return n1 + n2+1;
        }
    }
     public static void main(String[] args) {
        Calculator calc = new Calculator();
        StringCalculator c  = new StringCalculator();
        System.out.println(calc.add(5, 7));
        System.out.println(c.add(5, 7));

     }
}
