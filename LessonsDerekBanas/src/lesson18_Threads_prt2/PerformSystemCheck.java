package lesson18_Threads_prt2;

import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable{
	
	private String checkWhat;
	ReentrantLock lock = new ReentrantLock();
	
	
	public PerformSystemCheck(String checkWhat){
		this.checkWhat = checkWhat;
	}
	
	synchronized public void run(){
		// Or lock.lock();
		System.out.println("Checking" + this.checkWhat);
		// look.unlock();
	}
}
