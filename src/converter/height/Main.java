package converter.height;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	    char conversion;
		Converter converter = new Converter();
		System.out.println("Enter \"c\" to convert from feet and inches to centimetres. Enter \"f\" to convert from centimetres to feet and inches.");
		conversion = input.next().charAt(0);

		if(conversion == 'c'){
			converter.convertToCm();
		}else if(conversion == 'f'){
			converter.convertToFeetAndInches();
		}
		else{
			while(conversion != 'c' && conversion != 'f'){
				System.out.println("Try again! Enter \"c\" to convert to centimetres, or \"f\" to convert to feet and inches.");
				conversion = input.next().charAt(0);
				if(conversion == 'c') {
					converter.convertToCm();
				}else if(conversion == 'f'){
					converter.convertToFeetAndInches();
				}
			}
		}
    }
}
