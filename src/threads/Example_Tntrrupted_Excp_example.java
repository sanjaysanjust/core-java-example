package threads;

public class Example_Tntrrupted_Excp_example {
public static void main(String[] args) {
	Thread5 t5 = new Thread5();
	t5.start();
	t5.interrupt();// This line of code interrupt the thread which has entered the sleep state.
	System.out.println("Main Thread Done");
}
}

class Thread5 extends Thread{
	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("I am Lazy Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("I got interrupted");
				
			}
		}
	}
}