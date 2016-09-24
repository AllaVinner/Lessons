package lessonb21_SwingEventHandler;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;

public class Events extends JFrame{
	
	private JButton button1;
	private JTextField textField1;
	private JTextArea textArea1;
	private int buttonClicked;
	
	
	
	
	public static void main(String[] args) {
		new Events();
	}

	public Events(){
	
		this.setSize(400,400);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int xPos= (dim.width/2)-(this.getWidth()/2);
		int yPos= (dim.height/2)-(this.getHeight()/2);
		this.setLocation(xPos, yPos);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Event Frame");
		
		JPanel thePanel = new JPanel();
		button1 = new JButton("Click Here");
		
		ListenForButton lForButton = new ListenForButton();
		
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		textField1 =new JTextField("", 15);
		
		ListenForKeys lForKeys = new ListenForKeys();
		
		textField1.addKeyListener(lForKeys);
		thePanel.add(textField1);
		textArea1 = new JTextArea(15,20);
		textArea1.setText("Tracking Events\n");
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		thePanel.add(scrollbar1);
		
		thePanel.add(scrollbar1);
		
		this.add(thePanel);
		
		ListenForWindow lForWindow = new ListenForWindow();
		this.addWindowListener(lForWindow);
		
		ListenForMouse lForMouse = new ListenForMouse();
		thePanel.addMouseListener(lForMouse);
		this.setVisible(true);
	}
	
	//Implements listener
	
	private class ListenForButton implements ActionListener{
		
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == button1){
				buttonClicked++;
				textArea1.append("Button pressed" + buttonClicked + "Times\n");	
			
				//e.getSource().toString();
			}
		}
	}
	
	private class ListenForKeys implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			textArea1.append("Key Hit: " + e.getKeyChar()+ "\n");
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
		
	}
	
	private class ListenForWindow implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {
			textArea1.append("Windows is active");
			
		}
		
		@Override
		//this.dispose();
		public void windowClosed(WindowEvent e) {
			
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			textArea1.append("Windows is not active");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			textArea1.append("is minimized");
		}

		@Override
		public void windowOpened(WindowEvent e) {
			textArea1.append("created");
			
		}
		
	}
	
	private class ListenForMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			textArea1.append("Mouse Panel pos: " + e.getX() + " " + e.getY()+ "\n");
			textArea1.append("Mouse Panel pos: " + e.getXOnScreen() + " " + e.getYOnScreen()+ "\n");
			textArea1.append("Mouse Button" + e.getButton() +"\n");
			textArea1.append("Mouse Clicks" + e.getClickCount() +"\n");
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
