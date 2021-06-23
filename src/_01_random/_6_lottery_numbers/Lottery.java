package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {

		Random ran = new Random();

		String lotto = "";
		for (int i = 0; i < 6; i++) {
			int num = ran.nextInt(100);
		lotto = lotto + num + " ";//"22 " + 24 + " " -> "22 24 "
		
		}
		JOptionPane.showMessageDialog(null, lotto);
		
	}
}
