package com.sample;

import javax.swing.JOptionPane;

public class Answers {

	public static class Odpowiedz {
		public String value;
		
		public Odpowiedz(String v) {
			value = v;
			JOptionPane.showMessageDialog(null,
				    "Twoj statek to: " + value);
		}
	}
}