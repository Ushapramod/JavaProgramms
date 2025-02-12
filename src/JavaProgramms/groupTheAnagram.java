package JavaProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupTheAnagram {

	public static void main(String[] args) {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			char[] wordsToCharArray = word.toCharArray();
			Arrays.sort(wordsToCharArray);
			String sortedWord = new String(wordsToCharArray);
map.putIfAbsent(sortedWord, new ArrayList<>());
map.get(sortedWord).add(word);
		}
		
		List<List<String>> sortedAnagram = new ArrayList<List<String>>(map.values());
		
		System.out.println(sortedAnagram);

	}

}
