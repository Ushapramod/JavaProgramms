package JavaProgramms;

import java.util.Arrays;

public class SortTheArrayInAscendingOredr {

	public static void main(String[] args) {
		int[] arr = {6,5,4,3,2,1};
		int temp=0;
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
System.out.println(Arrays.toString(arr));
	}

}
