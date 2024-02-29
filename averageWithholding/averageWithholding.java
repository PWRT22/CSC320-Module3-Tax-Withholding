package averageWithholding;
import java.util.Scanner;

public class averageWithholding {
	public static void main(String[] args) {
		
		// Declaring the Scanner object for user input and required variables
		Scanner scnr = new Scanner(System.in);
		String name;
		double income;
		float taxWithholding;
		double taxRate;
		
		//Requesting user input for income
		System.out.println("Enter Employee Name:");
		name = scnr.nextLine();
		System.out.println("Enter weekly earnings: ");
		income = scnr.nextDouble();
		
		//Selection Structure to calculate tax withholding based on entered income
		if(income < 500) {
			taxRate = 0.10;
			taxWithholding = (float)(income * taxRate);
		} else if(income >= 500 && income < 1500) {
			taxRate = 0.15;
			taxWithholding = (float)(income * taxRate);
		} else if(income >= 1500 && income < 2500) {
			taxRate = 0.20;
			taxWithholding = (float)(income * taxRate);
		} else {
			taxRate = 0.30;
			taxWithholding = (float)(income * taxRate);
		}
		
		//Print to the screen the customer's tax withholdings based on their income
		System.out.println("Employee Name: " + name);
		System.out.println("Weekly Earnings: $" + income);
		System.out.println("Tax Rate: " + (taxRate * 100) + "%");
		System.out.println("Tax withholding: $" + taxWithholding);
	}

}
