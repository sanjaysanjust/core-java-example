package threads;

public class ThreadEx1 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Current Thread : " + Thread.currentThread().getName());

		T1 t1 = new T1();

		// Till here will have only one thread i.,e main thread

		t1.start();
		// Here, Two threads will be created, After this line of code whatever the code
		// we write will be executed by main thread.
		System.out.println("After second thread creation");

	}
}

class T1 extends Thread {

	@Override
	public void run() {
		System.out.println("Child Thread name : " + Thread.currentThread().getName());
		System.out.println("Inside child thread");

	}

}