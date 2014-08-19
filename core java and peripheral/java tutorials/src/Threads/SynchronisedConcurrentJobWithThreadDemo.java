package Threads;

/*    
Synchronized method means that only one thread at a time can access it.So this code 
tells that after the two threads started,run() method is being randomly shared by both
the threads,but when the synchronized method is once allotted to a thread,that thread
creates a lock on that method and does not give access to other thread until and unless
it completes through the method. 
 */

class BankAcount{
	int balance =30;

	public int getBalance(){
		return balance;
	}
	public void withdrawAmount(int amount){
		balance=balance-amount;
		System.out.println("the balance amount is "+balance);
	}
}
public class SynchronisedConcurrentJobWithThreadDemo implements Runnable {
	BankAcount account=new BankAcount();
	public static void main(String args[]){
		SynchronisedConcurrentJobWithThreadDemo job=new SynchronisedConcurrentJobWithThreadDemo();
		Thread threadOne=new Thread(job);
		Thread threadTwo=new Thread(job);

		threadOne.setName("jointAccountPartnerOne");
		threadTwo.setName("jointAccountPartnerTwo");

		threadOne.start();
		threadTwo.start();	
	}
	@Override
	public void run() {
		System.out.println(" the initial balance is 30 ");
		System.out.println();
		for(int x=0;x<10;x++){
			System.out.println();
			System.out.println("x value for "+Thread.currentThread().getName()+" is "+x);
			withdraw(10);
			if(account.getBalance()<0){
				System.out.println("overdrawn");
			}
		}
	}
	public synchronized void withdraw(int amount){
		if(account.getBalance()>=amount){
			System.out.println(Thread.currentThread().getName()+" is about to withdraw 10 rupees");
			try{
				System.out.println(Thread.currentThread().getName()+" is about to sleep");
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" woke up");
			account.withdrawAmount(amount);
		    System.out.println(Thread.currentThread().getName()+" completes withdrawal");
		    
		}
		else{
			System.out.println(" sorry not enough for "+Thread.currentThread().getName());
		}
	}
}


// OUTPUT
/*
the initial balance is 30 


x value for jointAccountPartnerOne is 0
jointAccountPartnerOne is about to withdraw 10 rupees
jointAccountPartnerOne is about to sleep
the initial balance is 30 


x value for jointAccountPartnerTwo is 0
jointAccountPartnerOne woke up
the balance amount is 20
jointAccountPartnerOne completes withdrawal
jointAccountPartnerTwo is about to withdraw 10 rupees
jointAccountPartnerTwo is about to sleep

x value for jointAccountPartnerOne is 1
jointAccountPartnerTwo woke up
the balance amount is 10
jointAccountPartnerTwo completes withdrawal

x value for jointAccountPartnerTwo is 1
jointAccountPartnerTwo is about to withdraw 10 rupees
jointAccountPartnerTwo is about to sleep         
jointAccountPartnerTwo woke up            // here partnerOne is not waking up as it cannot enter this method
the balance amount is 0
jointAccountPartnerTwo completes withdrawal
sorry not enough for jointAccountPartnerOne

x value for jointAccountPartnerOne is 2
sorry not enough for jointAccountPartnerOne

x value for jointAccountPartnerOne is 3
sorry not enough for jointAccountPartnerOne

x value for jointAccountPartnerOne is 4
sorry not enough for jointAccountPartnerOne

x value for jointAccountPartnerOne is 5
sorry not enough for jointAccountPartnerOne

x value for jointAccountPartnerOne is 6
sorry not enough for jointAccountPartnerOne

x value for jointAccountPartnerOne is 7
sorry not enough for jointAccountPartnerOne

x value for jointAccountPartnerOne is 8
sorry not enough for jointAccountPartnerOne

x value for jointAccountPartnerOne is 9
sorry not enough for jointAccountPartnerOne

x value for jointAccountPartnerTwo is 2
sorry not enough for jointAccountPartnerTwo

x value for jointAccountPartnerTwo is 3
sorry not enough for jointAccountPartnerTwo

x value for jointAccountPartnerTwo is 4
sorry not enough for jointAccountPartnerTwo

x value for jointAccountPartnerTwo is 5
sorry not enough for jointAccountPartnerTwo

x value for jointAccountPartnerTwo is 6
sorry not enough for jointAccountPartnerTwo

x value for jointAccountPartnerTwo is 7
sorry not enough for jointAccountPartnerTwo

x value for jointAccountPartnerTwo is 8
sorry not enough for jointAccountPartnerTwo

x value for jointAccountPartnerTwo is 9
sorry not enough for jointAccountPartnerTwo

*/