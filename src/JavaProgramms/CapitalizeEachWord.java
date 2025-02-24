package JavaProgramms;

public class CapitalizeEachWord {

	public static void main(String[] args) {
		String sentence = "hi i am a tester";
		//output = HiIAmATester
		
		String[] words = sentence.split(" ");
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < words.length; i++) {
			buffer.append(words[i].substring(0,1).toUpperCase())
			.append(words[i].substring(1))
			.append(" ");
			
		}
		System.out.println(buffer);
	}

}
