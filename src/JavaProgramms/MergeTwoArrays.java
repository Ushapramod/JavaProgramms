package JavaProgramms;

public class MergeTwoArrays {

	public static void main(String[] args) {
		char[] array1 = { 'a', 'b', 'c', 'd', 'e' ,'i'};
		char[] array2 = { 'e', 'd', 'c', 'b', 'a' ,'h','k','l'};
		
		char[] temp = new char[array1.length+array2.length];

		for (int i = 0; i < array1.length; i++) {
			temp[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			temp[array1.length+i] = array2[i];
		}
System.out.println(temp);
	}

}
