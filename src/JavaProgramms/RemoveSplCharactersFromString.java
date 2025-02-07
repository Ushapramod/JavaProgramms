package JavaProgramms;

public class RemoveSplCharactersFromString {

	public static void main(String[] args) {
		String price = "89,333.00";
		String newPrice = price.replaceAll("[,\\.]", "");
		System.out.println(newPrice);
	}

}
