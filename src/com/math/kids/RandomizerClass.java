package com.math.kids;
import java.util.Scanner;
import java.util.Random;

public class RandomizerClass {
	private static int num01;
	private static int num02;
	private static int ans;
	private static int personAns;
	private static int score;
	private static int saying;
	private static int area;
	private static boolean answerType;
	static MinMaxChangerClass minmax = new MinMaxChangerClass();
	
	public static int randInt(int min, int max) { //random int generator
	    Random rand = new Random();
	    
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static void chooserRandomizer() { //main randomizer method
		area = randInt(1, 4);
		
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
		num01 = randInt(minmax.minimumChangerAddition(score), minmax.maximumChangerAddition(score));
		num02= randInt(minmax.minimumChangerAddition(score), minmax.maximumChangerAddition(score));
		ans = num01 + num02;
		
		System.out.println("Addition Area");
		System.out.println("What is " + num01 + " + " + num02 + "?");
		personAns = mainScanner.nextInt();
		
		if (personAns == ans) {
			scoreAdder();
			answerType = true;
			
			System.out.println("Present Score: " + score);
			
			randomMessage();
			chooserRandomizer();
		} else {
			System.out.println("Final Score: " + score);
			System.out.println("Incorrect");
			answerType = false;
			score = scoreReset();
			
			randomMessage();
			
			System.out.println("Reloading Randomizer..");
			
			chooserRandomizer();
		}
		mainScanner.close();
	}
	
	public static void questioneerSubtraction() { //subtraction questions
		Scanner mainScanner = new Scanner(System.in);
		num01 = randInt(minmax.minimumChangerSubtraction(score), minmax.maximumChangerSubtraction(score));
		num02= randInt(minmax.minimumChangerSubtraction(score), minmax.maximumChangerSubtraction(score));
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
			
			randomMessage();
			chooserRandomizer();
		} else {
			System.out.println("Final Score: " + score);
			System.out.println("Incorrect");
			answerType = false;
			score = scoreReset();
			
			randomMessage();
			
			System.out.println("Reloading Randomizer..");
			
			chooserRandomizer();
		}
		mainScanner.close();
	}
	
	public static void questioneerDivision() { //division questions
		Scanner mainScanner = new Scanner(System.in);
		boolean looper = true;
		
		while (looper == true) { //main division looper
				num01  = randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
				num02 = randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
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
					randomMessage();
				} else {
					System.out.println("Final Score: " + score);
					System.out.println("Incorrect");
					answerType = false;
					score = scoreReset();
					randomMessage();
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
				num01  = randInt(minmax.minimumChangerMultiplication(score), minmax.maximumChangerMultiplication(score));
				num02 = randInt(minmax.minimumChangerMultiplication(score), minmax.maximumChangerMultiplication(score));
				ans = num01 - num02;
		
				System.out.println("What is " + num01 + " * " + num02 + "? ");
				personAns = mainScanner.nextInt();
		
				if (personAns == ans) {
					scoreAdder();
					System.out.println("Present Score: " + score);
					answerType = true;
					randomMessage();
				} else {
					System.out.println("Final Score: " + score);
					System.out.println("Incorrect");
					answerType = false;
					score = scoreReset();
					randomMessage();
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
				num01  = randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
				num02 = randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
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
	
	public static void randomMessage() { //random message if answer incorrect or correct
		saying = randInt(1,6);
		if (answerType == true) {
			switch (saying) {
				case 1: 
					System.out.println("Correct! You should be feeling proud.");
					break;
				case 2:
					System.out.println("Hm, seems like you know a bit of everything.");
					break;
				case 3:
					System.out.println("Have you been doing your homework, because you know a bit of this.");
					break;
				case 4:
					System.out.println("Wow, you got it correct!");
					break;
				case 5:
					System.out.println("Spectacular, keep up the work.");
					break;
				case 6:
					System.out.println("Please keep doing this good, you're doing so well!");
					break;
				default:
					break;
			}
		} else if (answerType == false){
			switch (saying) {
			case 1: 
				System.out.println("Come on, get your game up..");
				break;
			case 2:
				System.out.println("You were doing so well.");
				break;
			case 3:
				System.out.println("Why did you suddenly fail?");
				break;
			case 4:
				System.out.println("You will do better next time.");
				break;
			case 5:
				System.out.println("Maybe paying attention to math class could get you a better score.");
				break;
			case 6:
				System.out.println("Well, try your best next time..");
				break;
			default:
				break;
			}
		}
	}
}
