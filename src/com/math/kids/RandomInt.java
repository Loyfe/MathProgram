package com.math.kids;

import java.util.Random;

public class RandomInt {
	
	public int randInt(int min, int max) { //random int generator
	    Random rand = new Random();
	    
	    int randomInt = rand.nextInt((max - min) + 1) + min;

	    return randomInt;
	}
}
