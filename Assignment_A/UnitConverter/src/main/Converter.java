package main;
import java.util.Scanner;
/*
 * Team Synergy
 * Project A (Unit Converter Application)
 * Jose Gomez
 * 
 */
public class Converter {
	public static void main(String[] args) {
		
		
		//User input
		System.out.println("Start of Application");
		int menuSelection = 0;
		
		while(menuSelection != 3) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("\nPlease select an option"
					+ "\n 1. Volume Conversions"
					+ "\n 2. Distance Conversions"
					+ "\n 3. Quit");
			
			int temp = sc.nextInt();
			menuSelection = temp;
			
			
			
			//Unit input for Volume conversions
			if(temp == 1) {
				
				//User information
				System.out.println("Available conversions:"
						+ "\n Cups <--> Teaspoons"
						+ "\n US Gallons <--> Imperial Gallons" );
			
				//Scanner input for first unit
				Scanner scanUnit1 = new Scanner(System.in);
				System.out.println("\nPlease type in first desired unit"
						+ "\n From Unit: ");
				String userUnit1 = scanUnit1.nextLine();
				
				
			
				//Second Scanner for second unit
				Scanner scanUnit2 = new Scanner(System.in);
				System.out.println("Please type in second desired unit"
						+"\n To unit: ");
				String userUnit2 = scanUnit2.nextLine();
				
				
				
				//Call method collectQuantity to identify user input
				collectQuantity(userUnit1, userUnit2);
				
			}
			
			//Unit input for Distance conversions
			else if(temp == 2){
				
				//User information
				System.out.println("Available conversions:"
						+ "\n Miles <--> Kilometers" );
			
				//Scanner input for first unit
				Scanner scanUnit1 = new Scanner(System.in);
				System.out.println("\nPlease type in first desired unit"
						+ "\n From Unit: ");
				String userUnit1 = scanUnit1.nextLine();
				
			
				//Second Scanner for second unit
				Scanner scanUnit2 = new Scanner(System.in);
				System.out.println("Please type in second desired unit"
						+"\n To unit: ");
				String userUnit2 = scanUnit2.nextLine();
				
				
				//Call method collectQuantity to identify user input
				collectQuantity(userUnit1, userUnit2);
				
				
			}else 
			System.out.println("End of Program");
		}		
	}
	
	private static void collectQuantity(String unit1, String unit2) {
		
		double userAnswer = 0;
		int caseTemp = 0;
		String cupsTemp = "cups";
		String teaspoonsTemp = "teaspoons";
		String milesTemp = "miles";
		String kilometersTemp = "kilometers";
		String usGalTemp = "us gallons";
		String imperialGalTemp = "imperial gallons";
		
		if(cupsTemp.equalsIgnoreCase(unit1) && teaspoonsTemp.equalsIgnoreCase(unit2)) 
			caseTemp = 1;
		
		else if(teaspoonsTemp.equalsIgnoreCase(unit1) && cupsTemp.equalsIgnoreCase(unit2))
			caseTemp = 2;
		
		else if(milesTemp.equalsIgnoreCase(unit1) && kilometersTemp.equalsIgnoreCase(unit2))
			caseTemp = 3;
		
		else if(kilometersTemp.equalsIgnoreCase(unit1) && milesTemp.equalsIgnoreCase(unit2))
			caseTemp = 4;
		
		else if(usGalTemp.equalsIgnoreCase(unit1) && imperialGalTemp.equalsIgnoreCase(unit2))
			caseTemp = 5;
		
		else if(imperialGalTemp.equalsIgnoreCase(unit1) && usGalTemp.equalsIgnoreCase(unit2))
			caseTemp = 6;
		else
			System.out.println("No matches for your entry. Please try again.");
			
			
		switch(caseTemp) {
		
		case 1:
			System.out.println("You have selected: Cups to Teaspoons");
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Please provide the amount of " + cupsTemp);
			double userQty1 = sc1.nextDouble();
			userAnswer = cupsToTeaspoonsC1(userQty1);
			System.out.println(userAnswer + " Teaspoons");
			break;
			
		case 2:
			System.out.println("You have selected: Teaspoons to Cups");
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Please provide the amount of " + teaspoonsTemp);
			double userQty2 = sc2.nextDouble();
			userAnswer = teaspoonsToCupsC2(userQty2);
			System.out.println(userAnswer + " Cups");
			break;
			
		case 3:
			System.out.println("You have selected: Miles to Kilometers");
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Please provide the amount of " + milesTemp);
			double userQty3 = sc3.nextDouble();
			userAnswer = milesToKilometersC3(userQty3);
			System.out.println(userAnswer + " Kilometers");
			break;
			
		case 4:
			System.out.println("You have selected: Kilometers to Miles");
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Please provide the amount of " + usGalTemp);
			double userQty4 = sc4.nextDouble();
			userAnswer = kilometersToMilesC4(userQty4);
			System.out.println(userAnswer + " Miles");
			break;
			
		case 5:
			System.out.println("You have selected: Us Gallons to Imperial Gallons");
			Scanner sc5 = new Scanner(System.in);
			System.out.println("Please provide the amount of " + usGalTemp);
			double userQty5 = sc5.nextDouble();
			userAnswer = usGalToImperialGalC5(userQty5);
			System.out.println(userAnswer + " Imperial Gallons");
			break;
			
		case 6:
			System.out.println("You have selected: Imperial Gallons to Us Gallons");
			Scanner sc6 = new Scanner(System.in);
			System.out.println("Please provide the amount of " + imperialGalTemp);
			double userQty6 = sc6.nextDouble();
			userAnswer = imperialGalToUsGalC6(userQty6);
			System.out.println(userAnswer + " US Gallons");
			break;
		}
			
		
	}
	
	
	public static double cupsToTeaspoonsC1(double qty) {
		
		double answer = qty * 48;
		return answer;
	}
	
	public static double teaspoonsToCupsC2(double qty) {
		
		double answer = qty / 48;
		return answer;
	}
	
	public static double milesToKilometersC3(double qty) {
		
		double answer = qty * 1.6;
		return answer;
	}
	
	public static double kilometersToMilesC4(double qty) {
		
		double answer = qty / 1.6;
		return answer;
	}
	
	public static double usGalToImperialGalC5(double qty) {
		
		double answer = qty * 0.83;
		return answer;
	}
	public static double imperialGalToUsGalC6(double qty) {
		
		double answer = qty / 0.83;
		return answer;
	}

		
}
