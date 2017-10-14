package com.math.kids;
import java.util.Scanner;
import java.util.Random;

public class AdditionClass {
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
	
	public void questioneerAddition() { //main addition method
		Scanner mainScanner = new Scanner(System.in);
		boolean looper = true;
		
		while (looper == true) { //main addition looper
				num01  = randInt(minmax.minimumChangerAddition(score), minmax.maximumChangerAddition(score));
				num02 = randInt(minmax.minimumChangerAddition(score), minmax.maximumChangerAddition(score));
				ans = num01 + num02;
		
				System.out.println("What is " + num01 + " + " + num02 + "? ");
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
					System.out.println("Reloading Addition..");
				}
		}
		mainScanner.close();
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
					System.out.println("Hm, seems like you know a bit of addition.");
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
