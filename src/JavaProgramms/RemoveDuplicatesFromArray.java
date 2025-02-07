package JavaProgramms;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4};
		int[] temp = new int[arr.length];
		int index =0;
		for (int i = 0; i < arr.length; i++) {
			boolean isSame = false;
			for (int j = 0; j < index; j++) {
				if(arr[i]==temp[j])
				{
					isSame = true;
					break;
				}
			}
			if(!isSame )
			{ 
				temp[index++] = arr[i];
			}
			
		}
		
		for (int i = 0; i < index; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
