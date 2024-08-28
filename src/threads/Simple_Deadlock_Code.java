package threads;

public class Simple_Deadlock_Code {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Dead Lock aquiring");
		Thread.currentThread().join();
		System.out.println("END");
	}

}
