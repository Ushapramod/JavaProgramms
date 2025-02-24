package JavaProgramms;

import java.util.*;

import java.util.*;

public class Practise {

	public static void main(String[] args) {
int[] arr= {1,2,2,1,3,3,4,4,5,5};
int[] temp=new int[arr.length];
int index =0;

for (int i = 0; i < arr.length; i++) {
	
	boolean isSame= false;
	
	for (int j = 0; j < index; j++) {
		if(arr[i]==temp[j])
		{ isSame=true;}
		
	}

	if(!isSame)
	{
		temp[index++] += arr[i];
	}
	System.out.println("hi usha");
	System.out.println("hi usha");
	
	System.out.println("hi usha");
	
	System.out.println("hi usha");
	
	
}

System.out.println(Arrays.toString(temp));
	}

}
