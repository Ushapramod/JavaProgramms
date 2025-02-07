package JavaProgramms;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int[] arr = {8,4,5,6};
		boolean isSorted = true;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1])
			{
				isSorted = false;
			}
		}
System.err.println(isSorted);
	}

}
