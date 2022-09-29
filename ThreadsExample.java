package javaprog;



class myTh1 extends Thread{
	
	public void run() {
		System.out.println("===========Thread1===========  "+10*100+currentThread().getName());
		
	}
}

class myTh2 extends Thread{
	public void run() {
		System.out.println("===========Thread2==========");
		System.out.println("Running Thread "+ currentThread().getName());
	}
}

class myTh3 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<3;i++) {
			System.out.println("********Thread3********** ");
		
		
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {}
	}
	}
}


public class ThreadsExample {
	public static void main(String[] args) throws InterruptedException {
		myTh1 th1 = new myTh1();
		myTh2 th2 = new myTh2();
		Runnable r = new myTh3();
		
		Thread th3 = new Thread(r);
		
		Thread t4 = new Thread(new Runnable(){
			public void run() {
				int i =0;
				for(int j=0;j<3;j++) {
					i+=j;
					
				}
				System.out.println("**********Thread4******** "+ i);
			}
		});
		th2.setPriority(10);
		//th1.setPriority(5);
		//th3.setPriority(4);
		//th3.currentThread()
		t4.start();
		t4.join(); // join() method makes the Thread tto complete first by putting other Threads to halt.
		
		th1.start();
		
		th3.start();
		th3.join();
		th2.start();
		
	}

}
