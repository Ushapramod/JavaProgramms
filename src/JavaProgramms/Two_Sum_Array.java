package JavaProgramms;

import java.util.HashMap;

public class Two_Sum_Array {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 8;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int result = target-arr[i];
			if(map.containsKey(result))
			{
				System.out.println("The first number is "+arr[i]+" and the second number is "+result);
			}
			map.put(arr[i], i);
		}
		
	}

}
