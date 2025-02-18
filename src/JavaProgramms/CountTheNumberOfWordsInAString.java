package JavaProgramms;

public class CountTheNumberOfWordsInAString {

	public static void main(String[] args) {
		String word = "I am a QA engineer";
		String removedSpacesFromWord=word.replace(" ", "");
int length = removedSpacesFromWord.length();

System.out.println(length);
	}

}
