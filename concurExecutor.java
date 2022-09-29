package javaprog;

import java.util.concurrent.Executor;

public class concurExecutor implements Executor {
	
	public static void main(String[] args) {
		Executor ex = new concurExecutor();
		concurrqueue c = new concurrqueue();
		
		ex.execute(c);
		ex.execute(new Client(c));
	}

	@Override
	public void execute(Runnable r) {
		
		new Thread(r).start();
		// TODO Auto-generated method stub
		
	}

}
