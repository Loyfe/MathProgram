package com.math.kids;
import java.util.Scanner;

public class MainLoader {
	static AdditionClass addition = new AdditionClass(); 
	static SubtractionClass subtraction = new SubtractionClass();
	static DivisionClass division = new DivisionClass();
	static MultiplicationClass multiplication = new MultiplicationClass();
	
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
				System.out.println("Loading Subtration..");
				subtraction.questioneerSubtraction();
				
			} else if (mainMenu == 3) {
				System.out.println("Loading Division..");
				System.out.println("Warning: In Early Stages");
				division.questioneerDivision();
				
			} else if (mainMenu == 4) {
				System.out.println("Loading Multiplication..");
				System.out.println("Warning: In Early Stages");
				multiplication.questioneerMultiplication();
				
			} else if (mainMenu == 5) {
				System.out.println("Loading Randomizer..");
				System.out.println("Warning: In Early Stages");
				RandomizerClass.chooserRandomizer();
				
			} else {
				System.out.println("Sorry but this is not an area you can go to..");
				System.out.println("Reloading Main Menu..");
				
			}
		}
	}
}
