package lesson25_SwingListComponent;

import javax.swing.*;
import java.awt.event.*;

public class ListComponent extends JFrame {

	JButton button1;
	String infoOnComponent ="";
	JList favoriteMovies, favoriteColor;
	DefaultListModel defListModel = new DefaultListModel();
	JScrollPane scroller;
	
	public static void main(String[] args) {
		new ListComponent();

	}

	
	public ListComponent(){
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("My third fram");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		String [] movies ={"Matrix", "Lord","die you"};
		favoriteMovies = new JList(movies);
		favoriteMovies.setFixedCellHeight(30);
		favoriteMovies.setFixedCellWidth(150);
		favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		String[] colors = {"GReen", "Red", "Orange", "Blue"};
		
		for (String color : colors) {
			defListModel.addElement(color);
		}
		defListModel.add(2, "Purple");
		favoriteColor = new JList(defListModel);
		favoriteColor.setVisibleRowCount(4);
		scroller = new JScrollPane(favoriteColor,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		favoriteColor.setFixedCellHeight(30);
		favoriteColor.setFixedCellWidth(150);
		thePanel.add(favoriteMovies);
		thePanel.add(scroller);
		
		
		
		this.add(thePanel);
		this.setVisible(true);
	}
	
	private class ListenForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1){
				if(defListModel.contains("Black")){infoOnComponent += "Black is Here\n";}
				if(defListModel.isEmpty()){infoOnComponent += "is emty \n";}
				
				infoOnComponent += "Elements in the list" + defListModel.size() + "\n";
				infoOnComponent += "Last elemetn" + defListModel.lastElement() + "\n";
				infoOnComponent += "first element " + defListModel.firstElement() + "\n";
				infoOnComponent += "In a index 1" + defListModel.get(2) + "\n";
				
				defListModel.remove(1);
				defListModel.removeElement("Blue");
		
				Object[] arrayOfList = defListModel.toArray();
				
				for (Object color : arrayOfList) {
					infoOnComponent += color + "\n";
				}
				
				JOptionPane.showMessageDialog(ListComponent.this, infoOnComponent);
				
				infoOnComponent = "";
			}
			
		}
		
	}
	
}
