package JavaProgramms;

public class ReverseEachWordintheSentence {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog.";

		String[] words = sentence.split(" ");
		String reversedWordSentence = " ";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			for (int j = word.length()-1; j >= 0; j--) {
				reversedWordSentence += word.charAt(j);
			}
reversedWordSentence += " ";
		}
System.out.println(reversedWordSentence);
	}

}
