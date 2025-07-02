package exception;

public class multipleTryCatch {
    public static void main(String[] args) {
        int j;
        int i = 0;
        int[] marks = new int[5];
        try{
            
           
            try{
                int k = marks[7];
                System.out.println(k);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            j = 18/i;
        }
        catch(ArithmeticException e){
            System.out.println("Galat hai "+ e);
        }
        
    }

}
