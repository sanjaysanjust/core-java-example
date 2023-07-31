package datastructure.queues;

import datastructure.ListNode;

public class QueueExample {
	private ListNode front;
	private ListNode rear;
	private int length;

	public static void main(String[] args) throws EmptyQueueException {

		QueueExample qe = new QueueExample();
		try {
			qe.enqueue(10);
			qe.enqueue(20);
			System.out.println(qe.length());
			qe.dequeue();
			System.out.println(qe.length());
			qe.dequeue();
			System.out.println(qe.length());
			
			  qe.dequeue(); System.out.println(qe.length());
			 
			qe.enqueue(30);
			System.out.println(qe.length());
			/*	1
			 * qe.dequeue(); System.out.println(qe.length());
			 */
			qe.print();
		}catch (EmptyQueueException e) {
			System.out.println("ADSSLDKDK");
		}
		

	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {

		return length == 0;
	}

	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;

		}
		rear = temp;
		length++;
	}
	
	public int dequeue() throws EmptyQueueException {		
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		int data = front.data;
		front= front.next;
		if(front == null) {
			rear = null;
		}
		length--;
		return data;
	}
	public void print() {
		if(isEmpty()) {
			return;
		}
		ListNode current=front;
		while(current != null) {
			System.out.print(current.data+"-->");
			current= current.next;
		}
		System.out.println("\n");
	}

}
