package javaprog;

import java.util.concurrent.ConcurrentLinkedQueue;

public class concurrqueue implements Runnable {
	
	private ConcurrentLinkedQueue<String> con = new ConcurrentLinkedQueue<String>();

	public String dequeueItem() {
		if(!con.isEmpty()) {
			System.out.println("Queue size" + con.size());
			return con.remove();
		}
		else {
			return null;
		}
	}
	
	private void enqueitem(String item)
	{
		System.out.println("Enque the item in the queue" +item);
		con.add(item);
	}
	
	public int getQueuSize()
	{
		
		if(!con.isEmpty()) {
			return con.size();
		}
		else {
			return 0;
		}
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		 {
			enqueitem("String" + i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		
	}

	
}
