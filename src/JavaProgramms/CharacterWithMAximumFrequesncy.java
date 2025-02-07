package JavaProgramms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharacterWithMAximumFrequesncy {

	public static void main(String[] args) {
		String name = "ushaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		char[] arr = name.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];

			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		int maxCount = 0;
		char repetedChar = ' ';

		for(char c :arr)
		{
			if(map.get(c)>maxCount)
			{
				maxCount =map.get(c);
				repetedChar = c;
				
			}
		}
		System.out.println(maxCount+" "+repetedChar);
	}

}
