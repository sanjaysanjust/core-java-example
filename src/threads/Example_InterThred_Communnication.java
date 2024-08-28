package threads;

public class Example_InterThred_Communnication {

	public static void main(String[] args) throws InterruptedException {
		B b = new B();
		b.start();
		// Thread.sleep(10000); This line of code may make the main thread wait for ever
		// as it gives chance to child thread and chaild thread notification will not be
		// reached to main thread. For this situation instead of b.wait(), we should use
		// b.wait(10000). So after 10 seconds main thread will come out of its waiting
		// state and executes the remaiaining part of the code.
		synchronized (b) {
			System.out.println("Main Thread trying to get the total value");
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Total Sum : " + b.total);

		}

	}

}

class B extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation");
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread tries to notify the waiting threa");
			this.notify();
		}

	}
}
