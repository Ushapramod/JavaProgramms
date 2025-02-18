package JavaProgramms;

import java.util.HashMap;

public class MostFrequentWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java is fun and Java is powerful";
		String[] arr = sentence.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		int count=0;
		String MostRepeatedWord="";
		for(String word:arr)
		{
			if(map.get(word)>count)
			{
				MostRepeatedWord = word;
				count=map.get(word);
			}
		}
System.out.println(MostRepeatedWord +" "+count);
	}

}
