import java.util.*;
class AArrayFunctions{
	public void display(ArrayList<Integer> array){
		System.out.println("Array is:"+array);

	}
	public void display1(int idx,int tar_diff){
		System.out.println("idx is:"+idx);
		System.out.println("Min diff is:"+tar_diff);


	}

	public void evenOdd(int[] array){//Array List takes Datatype in object from it do not take primitive data type
		ArrayList<Integer> Even = new ArrayList<Integer>();
		ArrayList<Integer> Odd = new ArrayList<Integer>();
		for(int i = 0;i<array.length;i++){
			if(array[i] % 2 == 0){
				Even.add(array[i]);
			}
			else{
				Odd.add(array[i]);
			}
		}
		display(Even);
		display(Odd);
		
	}
	public void diff(int[] array) {
    		int tar_diff = Integer.MAX_VALUE; // Start with a large difference
    		int i = 0;
    		int j = array.length - 1;
    		int idx1 = -1, idx2 = -1; // To store indices of the pair with smallest difference

    	while (i < j) {
        	int diff = Math.abs(array[i] - array[j]); // Compute absolute difference
        	if (diff < tar_diff) {
            	tar_diff = diff;
            	idx1 = i;
            	idx2 = j;
        }

        // Move pointers based on values to try to minimize the difference
        if (array[i] < array[j]) {
            i++; // Move the left pointer forward
        } else {
            j--; // Move the right pointer backward
        }
    }

    display1(idx1, idx2, tar_diff); // Call display function with updated parameters
}
	



}