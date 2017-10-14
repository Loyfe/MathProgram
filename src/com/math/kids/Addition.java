package com.math.kids;
import java.util.Scanner;

public class Addition {
	private static int num01;
	private static int num02;
	private static int ans;
	private static int personAns;
	private static int score;
	private static boolean answerType;
	static MinMaxChanger minmax = new MinMaxChanger();
	static RandomInt randomint = new RandomInt();
	static RandomMessage randommsg = new RandomMessage();
	
	public void questioneerAddition() { //main addition method
		Scanner mainScanner = new Scanner(System.in);
		boolean looper = true;
		
		while (looper == true) { //main addition looper
				num01  = randomint.randInt(minmax.minimumChangerAddition(score), minmax.maximumChangerAddition(score));
				num02 = randomint.randInt(minmax.minimumChangerAddition(score), minmax.maximumChangerAddition(score));
				ans = num01 + num02;
		
				System.out.println("What is " + num01 + " + " + num02 + "? ");
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
}
