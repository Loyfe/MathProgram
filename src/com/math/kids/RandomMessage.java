package com.math.kids;

public class RandomMessage {
	static RandomInt randomint = new RandomInt();
	
	public void randomMessage(boolean answerType) { //random message if answer incorrect or correct
		int saying = randomint.randInt(1,10);
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
				case 7:
					System.out.println("Well then, you got it.. Correct!");
					break;
				case 8:
					System.out.println("You are doing very well!");
					break;
				case 9:
					System.out.println("Sometimes people as smart as you don't even get this far!");
					break;
				case 10:
					System.out.println("Keep going, you are doing very well!");
					break;
				default:
					System.out.println("Failure to Send Message");
					break;
			}
		} else if (answerType == false){
			switch (saying) {
			case 1: 
				System.out.println("Come on, you could do so much better, I know you can!");
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
				System.out.println("Look, next time you might surpass the score you have right now, keep trying!");
				break;
			case 6:
				System.out.println("Well, try your best next time..");
				break;
			case 7:
				System.out.println("Next time, take your time between answer to answer..");
				break;
			case 8:
				System.out.println("Sorry, you are incorrect..");
				break;
			case 9:
				System.out.println("I know you can do much better next time, make sure of that!");
				break;
			case 10:
				System.out.println("Try to double check your answer before starting, you might get an even better result!");
				break;
			default:
				System.out.println("Failure to Send Message");
				break;
			}
		}
	}
}
