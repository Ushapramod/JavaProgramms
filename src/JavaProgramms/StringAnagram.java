package JavaProgramms;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class StringAnagram {

	public static void main(String[] args) {
		String str1 = "night";
		String str2 = "thing";
		
		HashMap<Character,Integer> map = new  HashMap<>();
		
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		for (int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			map.put(c,map.getOrDefault(c, 0)-1);
		}
		
		boolean isAnagram = true;
		
		for(int count:map.values())
		{
			if(count !=0)
			{
				isAnagram = false;
			}
		}
		
		System.out.println(isAnagram);
	}

}
