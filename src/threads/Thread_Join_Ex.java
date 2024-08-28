package threads;

//join() method will be used by a thread in order to execute the code in sequence
public class Thread_Join_Ex {
	public static void main(String[] args) throws InterruptedException {
		
		Marriage marriage = new Marriage();
		//Till here One thread
		marriage.start();
		// Here, Two threads
		marriage.join();
		System.out.println("Marriage Happened");
	}
	

}

class Venue extends Thread{
	
	
	public void run() {
		
		venue_detail();
	}
	public void venue_detail() {
		System.out.println("Venue decided");
		
	}
}
class Marriage_date extends Thread{
	
	
	public void run() {
		Venue venue = new Venue();
		venue.start();
		try {
			venue.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		marriage_card();
	}
	public void marriage_card() {
		System.out.println("marriage_date Decided");
		
	}
}

class Marriage extends Thread{
	
	
	public void run() {
		Marriage_date date = new Marriage_date();
		date.start();
		try {
			date.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		marriage();
	}
	public void marriage() {
		System.out.println("marriage card decided");
		
	}
}