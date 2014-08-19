package Threads;

public class RunningMultipleThreads {
	public static void main(String args[]) throws InterruptedException{
		System.out.println("starting spawning of threads");
		new A();
		new B();
		System.out.println("end of spawning of threads");
	}
}
