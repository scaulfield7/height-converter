package converter.height;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.#");
    double heightInFeet;
    double heightInInches;
    double heightInCm;
    double totalHeightInInches;
    double heightConvertedToCm;
    double heightConvertedToFeet;
    double remainingHeightConvertedToInches;

    public Converter(){

    }
    public void convertToFeetAndInches(){
        System.out.print("Enter the height. First enter the number of feet: ");
        heightInFeet = input.nextDouble();
        System.out.print("Then enter the number of inches: ");
        heightInInches = input.nextDouble();
        totalHeightInInches = heightInFeet*12 + heightInInches;
        heightConvertedToCm = totalHeightInInches*2.54;
        System.out.println(df.format(heightInFeet) + "'" + df.format(heightInInches) + "\" equals " + df.format(heightConvertedToCm) + "cm.");
    }

    public void convertToCm(){
        System.out.print("Enter the height in centimetres: ");
        heightInCm = input.nextDouble();
        totalHeightInInches = heightInCm/2.54;
        remainingHeightConvertedToInches = totalHeightInInches%12;
        heightConvertedToFeet = (totalHeightInInches - remainingHeightConvertedToInches)/12;
        System.out.println(df.format(heightInCm) + "cm equals " + df.format(heightConvertedToFeet) + "'" + df.format(Math.round(remainingHeightConvertedToInches)) + "\".");
    }
}
