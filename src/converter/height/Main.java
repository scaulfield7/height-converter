package converter.height;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String conversion;
		Converter converter = new Converter();
		System.out.println("Enter \"c\" to convert from feet and inches to centimetres. Enter \"f\" to convert from centimetres to feet and inches.");
		conversion = input.next();

		if(conversion.equals("c")){
			converter.convertToCm();
		}
		else if(conversion.equals("f")){
			converter.convertToFeetAndInches();
		}
    }
}
