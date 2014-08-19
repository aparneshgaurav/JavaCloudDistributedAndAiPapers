package Threads;

public class ThreadExecutionNotGuaranteedDemo {
public static void main(String args[]){
	Runnable threadTaskClassNotGuranteed=new ThreadTaskClassNotGuaranteed();
	Thread thread=new Thread(threadTaskClassNotGuranteed);

	thread.start();

	System.out.println("I am in the main stack");
}
}

// OUTPUT
/*
I am in the main stack
Hi,i am the task in the new separate stack invoked by the new thread
*/