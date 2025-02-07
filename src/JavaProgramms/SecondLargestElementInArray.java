package JavaProgramms;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int[] arr = {4,5,6};
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
System.out.println(arr[1]);
	}

}
