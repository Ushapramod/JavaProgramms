package JavaProgramms;

public class MissingNumberin1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,5,6};


int n=arr.length+1;

int expectedSum = (n*(n+1)/2);

int actualSum=0;

for (int i = 0; i < arr.length; i++) {
	actualSum +=arr[i];
}

int missingElement = expectedSum-actualSum;
System.out.println(missingElement);
	}

}
