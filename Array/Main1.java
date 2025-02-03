//Main1.java
class Main1{
	public static void main(String args[]){
		UserInput1 ui = new UserInput1();
		AArrayFunctions functions = new AArrayFunctions();
		int[] array = ui.arrayInput();
		functions.evenOdd(array);
		functions.diff(array);
	}


}