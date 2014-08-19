package Threads;

public class MultipleThreadsDemo implements Runnable{
	public static void main(String args[]){
		Runnable multipleThreadsDemo=new MultipleThreadsDemo();
		Thread firstThread=new Thread(multipleThreadsDemo);
		firstThread.setName("firstThreadName");
		Thread secondThread=new Thread(multipleThreadsDemo);
		secondThread.setName("secondThreadName");
		Thread thirdThread=new Thread(multipleThreadsDemo);
		thirdThread.setName("thirdThreadName");
		

		firstThread.start();
		secondThread.start();
		thirdThread.start();

	}

	@Override
	public void run() {
		//use larger count like 45 instead of 5
		for(int i=0;i<45;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String threadName=Thread.currentThread().getName();
			System.out.println("Hi, i am the "+threadName);
		}
	}
}

// OUTPUT

/*Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the firstThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the secondThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
Hi, i am the thirdThreadName
*/
