package JavaProgramms;

public class NumberPalindrome {
	public static void main(String[] args) {
		int number = 141; 
		int copy=number;
		int reverederNumber=0;
		
		while(number !=0)
		{
			int reminder = number%10;
			reverederNumber = reverederNumber*10+reminder;
			
			number/=10;
		}
	
	if(reverederNumber==copy)
	{
		System.out.println("The given number is palindrome");
	}
	else {
		System.out.println("The given number is not palindrome");
	}
}

}
