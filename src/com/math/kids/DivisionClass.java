package com.math.kids;
import java.util.Scanner;
import java.util.Random;

public class DivisionClass {
	private static int num01;
	private static int num02;
	private static int ans;
	private static int personAns;
	private static int score;
	private static int saying;
	private static boolean answerType;
	static MinMaxChangerClass minmax = new MinMaxChangerClass();
	
	public static int randInt(int min, int max) { //random int generator
	    Random rand = new Random();
	    
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public void questioneerDivision() { //main division method
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
		} 
		mainScanner.close();
	}
	
	public static void divisionChecker() { //checks if division question works
		boolean checkerLoop = true;
		
		while (checkerLoop == true) {
			if (num01 % num02 != 0) {
				System.out.println("num01 & num02 remainder: " + num01 % num02);
				System.out.println("num01 & num02 divided: " + num01 / num02);
				num01  = randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
				num02 = randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
				ans = num01 / num02;
			} else {
				System.out.println("num01 & num02 is normal and ready to go");
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
					System.out.println("Hm, seems like you know a bit of division.");
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

