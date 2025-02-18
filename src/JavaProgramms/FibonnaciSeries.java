package JavaProgramms;

public class FibonnaciSeries {
public static void main(String[] args) {
	int number = 10;
	int a =1;
	int b=2;
	int c=0;
	for (int i = 1; i <= number; i++) {
		c=a+b;
		a=b;b=c;
		System.out.println(c);
	}
	
}
}
