package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class i0 {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the no");
        try {
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println(e);
        }
       

    }

  


}
