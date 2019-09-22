
package assignment2;
import java.util.Scanner;
public class problem2s {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your weight in kilograms: ");
	double weight = input.nextDouble();
	System.out.println("Please enter your height in centimeters: ");
	double height = input.nextDouble();
	
	double bmi = weight / Math.pow(height/100.0, 2);
	
	System.out.println("Your BMI is: " + bmi);
	
	
	
}
}
