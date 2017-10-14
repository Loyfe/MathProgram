package com.math.kids;
import java.util.Scanner;

public class MainLoader {
	static Addition addition = new Addition(); 
	static Subtraction subtraction = new Subtraction();
	static Division division = new Division();
	static Multiplication multiplication = new Multiplication();
	
	static boolean menuLooper;
	static int mainMenu;
	
	public static void main(String args[ ]) {
		System.out.println("Random Math Java has Sucessfully loaded!");
		
		typeLoader();
		
		System.out.println("System Error, Reloading Whole Program");
		
		typeLoader();
	}
	
public static void typeLoader() {
		mainMenu = 0;
		menuLooper = true;
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
				Randomizer.chooserRandomizer();
				
			} else {
				System.out.println("Sorry but this is not an area you can go to..");
				System.out.println("Reloading Main Menu..");
				
			}
		}
		input.close();
	}
}
