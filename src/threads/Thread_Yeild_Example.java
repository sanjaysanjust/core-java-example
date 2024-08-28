package threads;

public class Thread_Yeild_Example {

	public static void main(String[] args) {
		T3 t3 = new T3();
		// Till here we have only main thread created
		t3.start();
		// Here two threads will be there, Parent thread will get more chance to execute
		// here, as child thread will be yielded and other threads will get more chance
		// to execute
		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");
		}

	}

}

// Yeild method pauses the current executing thread execution and give chance to other threads of same priority.

class T3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}

}

// Note : Some processors will not provide proper support for yeild method, Though we use yeild method in the child class we can expect varied output.