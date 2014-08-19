package Threads;

public class ThreadTaskClassNotGuaranteed implements Runnable{
	@Override
	public void run() {
		task();
	}
	public void task(){
		System.out.println("Hi,i am the task in the new separate stack invoked by the new thread");
		System.out.println("");
	}
}
