package lessonb18_Threads_prt2;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadsPart2 {

	public static void main(String[] args) {
		
		addThreadsToPool();
	
	}
	
	public static void addThreadsToPool(){
		
		ScheduledThreadPoolExecutor eventPool =new ScheduledThreadPoolExecutor(5);
	
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
			eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calender"), 10, 12, TimeUnit.SECONDS);
		
		System.out.println("Number of Threads: " + Thread.activeCount());
		
		Thread[] listOfThreads = new Thread[Thread.activeCount()];
		
		Thread.enumerate(listOfThreads);
		
		listOfThreads[2].setPriority(7); // 10 is highest	
		
		for (Thread i : listOfThreads) {
			System.out.println(i.getName());
			System.out.println(i.getPriority());
		}

		eventPool.shutdown();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		System.out.println("Den kommer ej hit");
		}
		
	}
}
