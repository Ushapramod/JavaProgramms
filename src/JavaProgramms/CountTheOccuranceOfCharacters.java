
package JavaProgramms;

import java.util.HashMap;

public class CountTheOccuranceOfCharacters {
	public static void main(String[] args) {
		
	
	String name = "ushapramod";

	char[] arr = name.toCharArray();

	HashMap<Character, Integer> map = new HashMap<>();
	for (int i = 0; i < arr.length; i++) {
		char c = arr[i];
		map.put(c, map.getOrDefault(c, 0)+1);
	}
System.out.println(map);
}
}