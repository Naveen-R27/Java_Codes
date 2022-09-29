package javaprog;

public class Client implements Runnable {

	private concurrqueue crq;

	public Client(concurrqueue cq) {
		this.crq = cq;
	}

	@Override
	public void run() {

		boolean stopcon = (crq.getQueuSize() == 0);
		while (!stopcon) {
			for (int i = 0; i < crq.getQueuSize(); i++) {
				System.out.println("Client wants to dequeue the items " + crq.dequeueItem());

				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stopcon = crq.getQueuSize() == 0;
			}
			System.out.println("Client Process exiting...");
		}
	}

	// TODO Auto-generated method stub

}
