package threads;

public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("Current Thread : " + Thread.currentThread().getName());

		T2 t2 = new T2();
		Thread t = new Thread(t2);
		//Till here will have only one thread i.,e main thread
		t.start();
		//Here, Two threads will be created, After this line of code whatever the code we write will be executed by main thread.
		System.out.println("After second thread creation");

	}

}

class T2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside child thread");
		System.out.println("Child Thread name : " + Thread.currentThread().getName());
	}

}