package JavaProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CheckIfStringContainsOnlyDigits {

	public static void main(String[] args) {
		
		String numbers = "123456";
		boolean isOnlyDigits = true;
		
		for (int i = 0; i < numbers.length(); i++) {
			if(!Character.isDigit(numbers.charAt(i)))
			{
				isOnlyDigits=false;
			}
			
		}
	}
}
