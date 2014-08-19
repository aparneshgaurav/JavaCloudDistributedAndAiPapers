package Threads;

public class B implements Runnable{
	Thread t;
	B(){
		t = new Thread(this,"B");
		System.out.println("inside b constructor");
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Hi , this is the method functionality envoked at class B level ");
	}

}