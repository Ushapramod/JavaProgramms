package JavaProgramms;

public class RemoveDuplicatesInAString {

	public static void main(String[] args) {
		String word = "programming";
		String[] arr = word.split("");
		
		String newWord ="";
		
		for (int i = 0; i < arr.length; i++) {
			if(newWord.contains(arr[i]))
					{
				continue;
					}
			
			else {
				newWord +=arr[i];
			}
		}
		
		
System.out.println(newWord);
	}

}
