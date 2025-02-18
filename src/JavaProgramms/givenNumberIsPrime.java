package JavaProgramms;

public class givenNumberIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("the given number is a prime");
		}
	}

}
