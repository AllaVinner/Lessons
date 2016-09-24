package lessonb17_Threads;

public class GetTheMail implements Runnable {

	private int startTime;
	
	 public GetTheMail(int startTime){
		this.startTime = startTime;
	 }
	
	 public void run() {
		
		 try {
			Thread.sleep(1000*startTime);
		} catch (InterruptedException e) {
		}
		 
		 System.out.println("Checking mail");
		 
		 
	}
	 
	 
	 
	 
}
