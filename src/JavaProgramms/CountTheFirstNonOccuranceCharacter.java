package JavaProgramms;

import java.util.HashMap;
import java.util.Map;

public class CountTheFirstNonOccuranceCharacter {

	public static void main(String[] args) {
		String name = "swiss";
		char[] arr = name.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c:arr)
		{
			if(map.get(c)==1)
			{
				System.out.println("The first non occurance character is "+c);
				break;
			}
		}
		
	}

}
