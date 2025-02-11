package JavaProgramms;

import java.util.HashMap;

public class TwoArrayAnagram {

	public static void main(String[] args) {
		char[] array1 = { 'a', 'b', 'c', 'd', 'e' };
		char[] array2 = { 'e', 'd', 'c', 'b', 'a' ,'i'};

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < array1.length; i++) {
			char c = array1[i];
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < array2.length; i++) {
			char c = array2[i];
			map.put(c, map.getOrDefault(c, 0) - 1);
		}
		
	boolean isAnagram = true;
	
	for(int count:map.values())
	{
		if(count != 0)
		{
			isAnagram = false;
		}
	}
System.out.println(isAnagram);
	}

}
