package JavaProgramms;

public class Practise {
    public static void main(String[] args) {
        int[] arr = { 9, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) { // Corrected the condition
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        // Print the array without duplicates
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
