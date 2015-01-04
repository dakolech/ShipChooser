package com.sample;

import javax.swing.JOptionPane;

public class UserInterface {

	public static class Pytanie {
		public String typ;
		//public Object[] options;
		public String tresc;
		public String tytul;
		
		public Pytanie (String t, String tr) {
			typ = t;
			tresc = tr;
			tytul = "ShipChooser";
			
			/*
			Object[] options = {"Yes, please",
                    "No, thanks",
                    "No eggs, no ham!"};
			int n = JOptionPane.showOptionDialog(null,
			    "Would you like some green eggs to go "
			    + "with that ham?",
			    "A Silly Question",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    options,
			    options[0]);
			System.out.println(n);*/
		}
		
		public int zadajPytanie () {
			int n = -1;
			if (typ == "bin") {
				Object[] options = {"Nie","Tak"};
				n = JOptionPane.showOptionDialog(null,
					    tresc,
					    tytul,
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.QUESTION_MESSAGE,
					    null,
					    options,
					    options[0]);				
			} else if (typ == "cena") {
				Object[] options = {"Tani","Sredni","Drogi"};
				n = JOptionPane.showOptionDialog(null,
					    tresc,
					    tytul,
					    JOptionPane.YES_NO_CANCEL_OPTION,
					    JOptionPane.QUESTION_MESSAGE,
					    null,
					    options,
					    options[0]);				
			} else if (typ == "iloscLudzi") {
				Object[] options = {"Malo","Srednio","Duzo"};
				n = JOptionPane.showOptionDialog(null,
					    tresc,
					    tytul,
					    JOptionPane.YES_NO_CANCEL_OPTION,
					    JOptionPane.QUESTION_MESSAGE,
					    null,
					    options,
					    options[0]);				
			} else if (typ == "rozmiar") {
				Object[] options = {"Maly","Sredni", "Duzy", "Ogromny"};
				n = JOptionPane.showOptionDialog(null,
					    tresc,
					    tytul,
					    JOptionPane.YES_NO_CANCEL_OPTION,
					    JOptionPane.QUESTION_MESSAGE,
					    null,
					    options,
					    options[0]);				
			}
			return n;
		}
	}

}