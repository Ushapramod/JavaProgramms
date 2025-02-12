package JavaProgramms;

public class StringPAlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "madame";
		String reveredWord = "";
		for (int i = word.length()-1; i >= 0; i--) {
			reveredWord += word.charAt(i);
		}
		
		if(word.equals(reveredWord))
		{
			System.out.println("The given word is Palindrome");
		}
		else {
			System.out.println("The given word is not Palindrome");
		}
	}

}
