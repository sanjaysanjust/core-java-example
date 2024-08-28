package threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Example code for producer and consumer using wait notify and notifyAll
public class Example_Prd_Con {
	private static final int BUFFER_SIZE = 5;
	  private static final Queue < Integer > buffer = new LinkedList < > ();

	  public static void main(String[] args) {
	    Thread producerThread = new Thread(new Producer(buffer));
	    Thread consumerThread = new Thread(new Consumer(buffer));

	    producerThread.start();
	    consumerThread.start();

}
}

class Producer implements Runnable {
	private  final Queue < Integer > buffer ;
	public Producer(Queue < Integer > buffer) {
		this.buffer=buffer;
	}
    public void run() {
      int value = 0;
      while (true) {
        synchronized(buffer) {
          // Wait if the buffer is full
          while (buffer.size() == 5) {
            try {
              buffer.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }

          System.out.println("Producer produced: " + value);
          buffer.add(value++);

          // Notify the consumer that an item is produced
          buffer.notify();

          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }


class Consumer implements Runnable {
	private  final Queue < Integer > buffer ;
	public Consumer(Queue < Integer > buffer) {
		this.buffer=buffer;
	}
    public void run() {
      while (true) {
        synchronized(buffer) {
          // Wait if the buffer is empty
          while (buffer.isEmpty()) {
            try {
              buffer.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }

          int value = buffer.poll();
          System.out.println("Consumer consumed: " + value);

          // Notify the producer that an item is consumed
          buffer.notify();

          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }

