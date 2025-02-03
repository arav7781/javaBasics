//UserInput.java
import java.util.*;
class UserInput1{
	int[] arrayInput(){
		int[] array = new int[5];
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(int i = 0;i<5;i++){
			array[i] = Sc.nextInt();
		}
		return array;
	}


}