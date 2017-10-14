package com.math.kids;
import java.util.Scanner;

public class Randomizer {
	private static int num01;
	private static int num02;
	private static int ans;
	private static int personAns;
	private static int score;
	private static int area;
	private static boolean answerType;
	static MinMaxChanger minmax = new MinMaxChanger();
	static RandomInt randomint = new RandomInt();
	static RandomMessage randommsg = new RandomMessage();
	
	public static void chooserRandomizer() { //main randomizer method
		area = randomint.randInt(1, 4);
		
		switch (area) {
		case 1:
			questioneerAddition();
			break;
		case 2:
			questioneerSubtraction();
			break;
		case 3:
			questioneerDivision();
			break;
		case 4:
			questioneerMultiplication();
			break;
		default:
			System.out.println("Sorry, system error..");
			System.out.println("Reloading Choose Screen..");
			chooserRandomizer();
			break;
		} 
	}
	
	public static void questioneerAddition() { //addition questions
		Scanner mainScanner = new Scanner(System.in);
		num01 = randomint.randInt(minmax.minimumChangerAddition(score), minmax.maximumChangerAddition(score));
		num02= randomint.randInt(minmax.minimumChangerAddition(score), minmax.maximumChangerAddition(score));
		ans = num01 + num02;
		
		System.out.println("Addition Area");
		System.out.println("What is " + num01 + " + " + num02 + "?");
		personAns = mainScanner.nextInt();
		
		if (personAns == ans) {
			scoreAdder();
			answerType = true;
			
			System.out.println("Present Score: " + score);
			
			randommsg.randomMessage(answerType);
			chooserRandomizer();
		} else {
			System.out.println("Final Score: " + score);
			System.out.println("Incorrect");
			answerType = false;
			score = scoreReset();
			
			randommsg.randomMessage(answerType);
			
			System.out.println("Reloading Randomizer..");
			
			chooserRandomizer();
		}
		mainScanner.close();
	}
	
	public static void questioneerSubtraction() { //subtraction questions
		Scanner mainScanner = new Scanner(System.in);
		num01 = randomint.randInt(minmax.minimumChangerSubtraction(score), minmax.maximumChangerSubtraction(score));
		num02= randomint.randInt(minmax.minimumChangerSubtraction(score), minmax.maximumChangerSubtraction(score));
		ans = num01 - num02;
		
		System.out.println("Subtraction Area");
		
		if (num01 <= num02) {
			System.out.println("What is " + num02+ " - " + num01 + "?");
			ans = num02 - num01;
			personAns = mainScanner.nextInt();
			
		} else {
			System.out.println("What is " + num01+ " - " + num02 + "?");
			personAns = mainScanner.nextInt();
			
		}
		
		if (personAns == ans) {
			scoreAdder();
			answerType = true;
			
			System.out.println("Present Score: " + score);
			
			randommsg.randomMessage(answerType);
			chooserRandomizer();
		} else {
			System.out.println("Final Score: " + score);
			System.out.println("Incorrect");
			answerType = false;
			score = scoreReset();
			
			randommsg.randomMessage(answerType);
			
			System.out.println("Reloading Randomizer..");
			
			chooserRandomizer();
		}
		mainScanner.close();
	}
	
	public static void questioneerDivision() { //division questions
		Scanner mainScanner = new Scanner(System.in);
		boolean looper = true;
		
		while (looper == true) { //main division looper
				num01  = randomint.randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
				num02 = randomint.randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
				ans = num01 % num02;
		
				divisionChecker();
				
				if (num01 < num02) {
					System.out.println("What is " + num02+ " / " + num01+ "? ");
					personAns = mainScanner.nextInt();
					ans = num02 / num01;
				} else {
					System.out.println("What is " + num01 + " / " + num02 + "? ");
					personAns = mainScanner.nextInt();
					ans = num01 / num02;
				}
		
				if (personAns == ans) {
					scoreAdder();
					System.out.println("Present Score: " + score);
					answerType = true;
					randommsg.randomMessage(answerType);
				} else {
					System.out.println("Final Score: " + score);
					System.out.println("Incorrect");
					answerType = false;
					score = scoreReset();
					randommsg.randomMessage(answerType);
					System.out.println("Reloading Division..");
				}
				chooserRandomizer();
		} 
		mainScanner.close();
	}
	
	public static void questioneerMultiplication() { //multiplication questions
		Scanner mainScanner = new Scanner(System.in);
		boolean looper = true;
		
		while (looper == true) { //main multiplication looper
				num01  = randomint.randInt(minmax.minimumChangerMultiplication(score), minmax.maximumChangerMultiplication(score));
				num02 = randomint.randInt(minmax.minimumChangerMultiplication(score), minmax.maximumChangerMultiplication(score));
				ans = num01 - num02;
		
				System.out.println("What is " + num01 + " * " + num02 + "? ");
				personAns = mainScanner.nextInt();
		
				if (personAns == ans) {
					scoreAdder();
					System.out.println("Present Score: " + score);
					answerType = true;
					randommsg.randomMessage(answerType);
				} else {
					System.out.println("Final Score: " + score);
					System.out.println("Incorrect");
					answerType = false;
					score = scoreReset();
					randommsg.randomMessage(answerType);
					System.out.println("Reloading Multiplication..");
				}
				chooserRandomizer();
		}
		mainScanner.close();
	}
	
	public static void divisionChecker() { //checks if division question works
		boolean checkerLoop = true;
		
		while (checkerLoop == true) {
			if (num01 % num02 != 0) {
				num01  =randomint.randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
				num02 = randomint.randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
				ans = num01 / num02;
			} else {
				checkerLoop = false;
			}
		}
	}
	
	public static void scoreAdder() { //score adder
		score++;
	}
	
	public static int scoreReset() { //score reseter
		return 0;
	}
}
