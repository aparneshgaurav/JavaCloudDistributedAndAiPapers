package Threads;

public class ThreadTaskClassGuaranteed implements Runnable{

	@Override
	public void run() {
		try{
		Thread.sleep(1000);	
		//the unit of time is miliseconds
		}
		catch(Exception e){
			e.printStackTrace();
		}
		task();
	}
    public void task(){
    	System.out.println("Hi,i am the task in the new separate stack invoked by the new thread");
    	System.out.println("");
    }
}
