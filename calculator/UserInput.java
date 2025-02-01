//userinput.java
import java.util.*;
class UserInput{
	int[] UserInput(){
		int[] numbers = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		numbers[0] = sc.nextInt();
		System.out.println("Enter the Second Number");
		numbers[1] = sc.nextInt();
		return numbers;//java cannot return multiple var
//so we use array.
		
	}

}

