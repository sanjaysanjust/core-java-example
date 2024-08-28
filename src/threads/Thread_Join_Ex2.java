package threads;

//Example code for child thread wait for parent thread to perform its execution.

public class Thread_Join_Ex2{

	public static void main(String[] args) {
		Thread4.parent_thread_ref = Thread.currentThread();
		Thread4 t4 = new Thread4();
		
		t4.start();
		// Below commented code gives us dead lock situation, As both threads will wait for each other to complete the execution.
		/*try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread");
		}
	}
}

class Thread4 extends Thread {

	static Thread parent_thread_ref = null;

	@Override
	public void run() {
		try {
			parent_thread_ref.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

}