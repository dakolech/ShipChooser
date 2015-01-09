package com.sample;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import com.sample.DroolsTest;

public class Answers {

	public static class Odpowiedz {
		public String value;
		public String image;
		
		public Odpowiedz(String v, String i) {
			value = v;
			image = i;
			/*ImageIcon icon = new ImageIcon("images/niszczyciel.jpg", "Niszczyciel");
			JOptionPane.showMessageDialog(
                    null,
                    "",
                    "Twoj statek to: " + value, JOptionPane.INFORMATION_MESSAGE,
                    icon);*/
			
			JFrame frame = new JFrame("Twoj statek");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();

            LayoutManager overlay = new OverlayLayout(panel);
            panel.setLayout(overlay);

            JLabel label1 = new JLabel(value);
            label1.setForeground(Color.GREEN);
            label1.setFont(new Font("SansSerif", Font.BOLD, 20));
            label1.setAlignmentX(0.5f);
            label1.setAlignmentY(0.5f);
            panel.add(label1);

            JLabel label2 = 
              new JLabel(new ImageIcon("images/"+image+".jpg", value));                   
            label2.setAlignmentX(0.5f);
            label2.setAlignmentY(0.5f);
            panel.add(label2);

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
		}
	}
}