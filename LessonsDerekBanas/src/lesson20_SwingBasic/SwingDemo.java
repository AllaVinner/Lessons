package lesson20_SwingBasic;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class SwingDemo extends JFrame {
	/*
	 * Handles:¨
	 * JFrame
	 * JPanel
	 * JLabel
	 * JButton
	 * JTextField
	 * JTextArea
	 * JScrollPane
	 */
	public static void main(String[] args) {
		
		new SwingDemo();

	}

	public SwingDemo(){
		
		// The JFrame methods
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int xPos= (dim.width/2)-(this.getWidth()/2);
		int yPos= (dim.height/2)-(this.getHeight()/2);
		this.setLocation(xPos, yPos);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My fyrst frame!");
		
		
		// JPannel stuff
			// JLabell methods
		
		JPanel myPanel = new JPanel();

		JLabel label1 = new JLabel("Tell me something");		
		label1.setText("New Text");
		label1.setToolTipText("Does not do much"); //Suppose to work
		myPanel.add(label1);
		
			// JButton methods
		JButton button1 = new JButton("Send");
		button1.setBorderPainted(true);
		button1.setContentAreaFilled(true);
		button1.setText("New Button");
		button1.setToolTipText("It is a button sas");
		myPanel.add(button1);
		
			// JTextField methods
		JTextField textField1 = new JTextField("The Text field of my life", 15);
		textField1.setColumns(10);
		textField1.setText("Skriv här istället");
		textField1.setToolTipText("funkar ändå inte");
		myPanel.add(textField1);
		
			//JTextArea methods
		JTextArea textArea1 = new JTextArea(15,20);
		textArea1.setText("Massa text");
		textArea1.setLineWrap(false);
		textArea1.setWrapStyleWord(true);
		int numOfLines = textArea1.getLineCount();
		textArea1.append("Number of lines: " + numOfLines);
		
			// JScrollPane method. Have to be initilized to use JTextArea
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		myPanel.add(scrollbar1);
		
		this.add(myPanel);
		this.setVisible(true);
		
		textField1.requestFocus();
	}
}
