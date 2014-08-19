package Threads;

public class A implements Runnable{
	Thread t;
	A(){
		t = new Thread(this,"A");
		System.out.println("inside a constructor");
		t.start();
	}

	@Override
	public void run() {
      System.out.println("Hi , this is the method functionality envoked at class A level ");
	}

}
