package com.math.kids;
import java.util.Scanner;

public class MainLoader {
	static AdditionClass addition = new AdditionClass(); 
	static SubtractionClass subtraction = new SubtractionClass();
	static DivisionClass division = new DivisionClass();
	static MultiplicationClass multiplication = new MultiplicationClass();
	static int code = 999;
	
	public static void main(String args[ ]) {
		System.out.println("Random Math Java has Sucessfully loaded!");
		
		typeLoader();
	}
	
public static void typeLoader() {
		int mainMenu = 0;
		boolean menuLooper = true;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while (menuLooper == true) {
			System.out.println("Where would you like to go?");
			System.out.println("1 for Addition");
			System.out.println("2 for Subtration");
			System.out.println("3 for Division");
			System.out.println("4 for Multiplication");
			System.out.println("5 for Randomizer");
			mainMenu = input.nextInt();
			
			if (mainMenu == 1) {
				System.out.println("Loading Addition..");
				addition.questioneerAddition();
				
			} else if (mainMenu == 2) {
				int userInput;
				System.out.println("Loading Subtration..");
				System.out.println("Error this is at beta testing level..");
				System.out.println("Code to Unlock (Integer): ");
				userInput = input.nextInt();
				if (userInput == code) {
					subtraction.questioneerSubtraction();
				} else {
					System.out.println("Incorrect Code");
					System.out.println("Reloading Main Menu..");
				}
				
				
			} else if (mainMenu == 3) {
				int userInput;
				System.out.println("Loading Division..");
				System.out.println("Error this is at beta testing level..");
				System.out.println("Code to Unlock (Integer): ");
				userInput = input.nextInt();
				if (userInput == code) {
					division.questioneerDivision();
				} else {
					System.out.println("Incorrect Code");
					System.out.println("Reloading Main Menu..");
				}
				
			} else if (mainMenu == 4) {
				System.out.println("Loading Multiplication..");
				multiplication.questioneerMultiplication();
				
			} else if (mainMenu == 5) {
				int userInput;
				System.out.println("Loading Randomizer..");
				System.out.println("Error this is at beta testing level..");
				System.out.println("Code to Unlock (Integer): ");
				userInput = input.nextInt();
				if (userInput == code) {
					RandomizerClass.chooserRandomizer();
				} else {
					System.out.println("Incorrect Code");
					System.out.println("Reloading Main Menu..");
				}
				
			} else {
				System.out.println("Sorry but this is not an area you can go to..");
				System.out.println("Reloading Main Menu..");
				
			}
		}
	}
}
