package converter.height;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");
		double totalHeightInInches;
	    double heightInCm;
        System.out.print("Enter the height. First enter the number of feet: ");
        double heightInFeet = input.nextDouble();
		System.out.print("Then enter the number of inches: ");
		double heightInInches = input.nextDouble();
		totalHeightInInches = heightInFeet*12 + heightInInches;
		heightInCm = totalHeightInInches*2.54;
		System.out.println(df.format(heightInFeet) + "'" + df.format(heightInInches) + "\" equals " + df.format(heightInCm) + "cm.");
    }
}
