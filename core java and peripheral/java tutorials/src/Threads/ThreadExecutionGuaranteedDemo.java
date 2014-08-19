package Threads;

public class ThreadExecutionGuaranteedDemo {
	public static void main(String args[]){
		Runnable threadTaskClassGuranteed=new ThreadTaskClassGuaranteed();
		Thread thread=new Thread(threadTaskClassGuranteed);

		thread.start();

		System.out.println("I am in the main stack");
	}

}

//OUTPUT (the second statement in the output appears after 2 seconds)
/*
I am in the main stack 
Hi,i am the task in the new separate stack invoked by the new thread
 */
