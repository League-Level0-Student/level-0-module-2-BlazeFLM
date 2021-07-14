package _04_spot_the_error;

import java.util.Random;

public class FixTheRandom {

	// This program is supposed to get a random number between 5 and 10 and print a different message for each number.
	// BUT it's not working. If you don't believe me, try running it.
	// Change ONE line of code to fix this program.
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int number = random.nextInt(10 - 5 + 1)+5;
		
		if (number == 5) {
			System.out.println("FIVE");
		} else if (number == 6) {
			System.out.println("SIX");
		} else if (number == 7) {
			System.out.println("SEVEN");
		} else if (number == 8) {
			System.out.println("EIGHT");
		} else if (number == 9) {
			System.out.println("NINE");
		} else if (number == 10) {
			System.out.println("TEN");
		}
	}
	
	
}
