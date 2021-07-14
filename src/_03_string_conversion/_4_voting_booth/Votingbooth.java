package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Votingbooth {

	public static void main(String[] args) {
		String ask = JOptionPane.showInputDialog("How old are you in years?");
			int askInt = Integer.parseInt(ask);
			if(askInt >= 18) {
				JOptionPane.showInputDialog("Who do you think should be next president?");
			} else {
				JOptionPane.showMessageDialog(null, "No one cares what you think.");
			}
	}

}