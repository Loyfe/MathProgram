package com.math.kids;
import java.util.Scanner;

public class Division {
	private static int num01;
	private static int num02;
	private static int ans;
	private static int personAns;
	private static int score;
	private static boolean answerType;
	static MinMaxChanger minmax = new MinMaxChanger();
	static RandomInt randomint= new RandomInt();
	static RandomMessage randommsg = new RandomMessage();
	
	public void questioneerDivision() { //main division method
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
		} 
		mainScanner.close();
	}
	
	public static void divisionChecker() { //checks if division question works
		boolean checkerLoop = true;
		
		while (checkerLoop == true) {
			if (num01 % num02 != 0) {
				System.out.println("num01 & num02 remainder: " + num01 % num02);
				System.out.println("num01 & num02 divided: " + num01 / num02);
				num01  = randomint.randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
				num02 = randomint.randInt(minmax.minimumChangerDivision(score), minmax.maximumChangerDivision(score));
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
}

