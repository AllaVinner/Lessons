package lessonb20_SwingBasic;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class SwingDemo extends JFrame {

	public static void main(String[] args) {
		
		new SwingDemo();

	}

	public SwingDemo(){
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int xPos= (dim.width/2)-(this.getWidth()/2);
		int yPos= (dim.height/2)-(this.getHeight()/2);
		this.setLocation(xPos, yPos);
		this.setVisible(true);
		
	}
}
