package lesson17_Threads;

import java.util.*; //Get date and locale
import java.text.DateFormat; 



public class GetTimeThread extends Thread{
	public void run(){
		
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormat;
		DateFormat dateFormat;
		String timeOutput;
		String dateOutput;
		
		for (int i = 0; i < 20; i++) {
			rightNow = new Date();
			currentLocale = new Locale("DE");
			
			timeFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
			
			timeOutput = timeFormat.format(rightNow);
			dateOutput = dateFormat.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}
