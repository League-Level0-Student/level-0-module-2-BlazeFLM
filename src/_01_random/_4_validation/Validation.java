//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {
			int num = randomMaker.nextInt(5);
			if (num == 0) {
				System.out.println("Nice jacket");
			}
			if (num == 1) {
				System.out.println("Nice dress");
			}
			if (num == 2) {
				System.out.println("Nice shirt");
			}
			if (num == 3) {
				System.out.println("Nice shoes");
			}
			if (num == 4) {
				System.out.println("Nice hair");
			}
		}
		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
