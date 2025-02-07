package JavaProgramms;

public class FindTheSmallestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6 };
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];

			}
		}
		System.out.println("The smallest elemet in an array is " + smallest);
	}

}
