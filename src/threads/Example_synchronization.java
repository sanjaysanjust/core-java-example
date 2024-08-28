package threads;

public class Example_synchronization {

	public static void main(String[] args) {
		Display d = new Display();
		T_Number tn = new T_Number(d);
		T_Char tc = new T_Char(d);
		tn.start();
		tc.start();
	}

}

class Display {

	public synchronized void displayNumber() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void displayCharectors() {
		for (int i = 65; i < 75; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class T_Number extends Thread {
	Display d;

	public T_Number(Display d) {
		this.d = d;
	}

	@Override
	public void run() {

		d.displayNumber();

	}
}

class T_Char extends Thread {
	Display d;

	public T_Char(Display d) {
		this.d = d;
	}

	@Override
	public void run() {

		d.displayCharectors();

	}
}