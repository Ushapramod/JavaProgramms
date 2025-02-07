package JavaProgramms;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr = {4,5,6};
		int largest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
System.out.println("The largest element in an array is "+ largest);
	}

}
