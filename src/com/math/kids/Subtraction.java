package com.math.kids;
import java.util.Scanner;

public class Subtraction {
	private static int num01;
	private static int num02;
	private static int ans;
	private static int personAns;
	private static int score;
	private static boolean answerType;
	static MinMaxChanger minmax = new MinMaxChanger();
	static RandomInt randomint= new RandomInt();
	static RandomMessage randommsg = new RandomMessage();
	
	public void questioneerSubtraction() { //main subtraction method
		Scanner mainScanner = new Scanner(System.in);
		boolean looper = true;
		
		while (looper == true) { //main subtraction looper
				num01  = randomint.randInt(minmax.minimumChangerSubtraction(score), minmax.maximumChangerSubtraction(score));
				num02 = randomint.randInt(minmax.minimumChangerSubtraction(score), minmax.maximumChangerSubtraction(score));
				
				if (num01 < num02) {
					System.out.println("What is " + num02+ " - " + num01+ "? ");
					personAns = mainScanner.nextInt();
					ans = num02 - num01;
				} else {
					System.out.println("What is " + num01 + " - " + num02 + "? ");
					personAns = mainScanner.nextInt();
					ans = num01 - num02;
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
					System.out.println("Reloading Subtraction..");
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
}

