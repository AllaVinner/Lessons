package lesson24_Swing;

import javax.swing.*;
import java.awt.event.*;

public class ComboBox extends JFrame {

	JComboBox favoriteShows;
	JButton button1;
	String infoOnComponents ="";
	
	public static void main(String[] args) {
		
		new ComboBox();
	}

/**
 * 
 */
public ComboBox() {
	
	this.setSize(400, 400);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setTitle("My third fram");
	
	JPanel thePanel = new JPanel();
	
	String [] shows = {"Breaking Bad", "Life of Brian", "DIe DIe DIe"};
	favoriteShows = new JComboBox(shows);
	favoriteShows.addItem("Marrige");
	thePanel.add(favoriteShows);
	
	button1 = new JButton("Get Answer");
	ListenForButtons lForButton = new ListenForButtons();
	button1.addActionListener(lForButton);
	thePanel.add(button1);
	
	this.add(thePanel);
	this.setVisible(true);
	
	favoriteShows.insertItemAt("Dexter", 1);
	favoriteShows.setMaximumRowCount(3);
	favoriteShows.removeItem("Dexter");
	favoriteShows.removeItem(1);
	
	}
	

	private class 	ListenForButtons implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1){
				favoriteShows.setEditable(true);
				infoOnComponents += "Item at 0: " + favoriteShows.getItemAt(0)+"\n";
				infoOnComponents += "Number of Shows: " + favoriteShows.getItemCount()+"\n";
				infoOnComponents += "Selected ID: " + favoriteShows.getSelectedItem();
				
				JOptionPane.showMessageDialog(ComboBox.this, infoOnComponents, "Information", JOptionPane.INFORMATION_MESSAGE);
				infoOnComponents = "";
			}
			
		}
		
	}
}
