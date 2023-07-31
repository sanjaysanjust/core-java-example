package datastructure;

public class DoublyLinkedListExample {
	static DoublyLinkedListNode head;
	static DoublyLinkedListNode tail;
	public static int length;

	public DoublyLinkedListExample() {
		head = null;
		tail = null;
		length = 0;
	}

	public static boolean isEmpty() {
		return length == 0;
	}

	public static int length() {
		return length;
	}

	public static void main(String[] args) {
		insertLast(10);
		insertLast(20);
		insertLast(30);
		insertLast(40);
		insertLast(50);
		int l = length();
		System.out.println("Length Of A DLL ===>" + l);
		displayForward();
		System.out.println("\n");
		displayBackword();
		
		System.out.println("\n");
		insertNodeAtBegining(5);
		
		System.out.println("\n");
		displayForward();
		System.out.println("\n");
		insertNodeAtEnd(55);
		System.out.println("\n");
		displayForward();
		System.out.println("\n");
		int l1 = length();
		System.out.println("Length Of A DLL ===>" + l1);
		DoublyLinkedListNode deletedNode = deleteFirstNode();
		System.out.println("\n");
		System.out.println("Deleted Node ===>"+deletedNode.data);
		
		DoublyLinkedListNode deletedNode1 = deleteFirstNode();
		System.out.println("\n");
		System.out.println("Deleted Node ===>"+deletedNode1.data);
		displayForward();
		int l3 = length();
		System.out.println("Length Of A DLL ===>" + l3);
		
		DoublyLinkedListNode deletedNode2 = deleteLastNode();
		System.out.println("\n");
		System.out.println("Deleted Node ===>"+deletedNode2.data);
		displayForward();
		int l4 = length();
		System.out.println("Length Of A DLL ===>" + l4);
		
		DoublyLinkedListNode deletedNode3 = deleteLastNode();
		System.out.println("\n");
		System.out.println("Deleted Node ===>"+deletedNode3.data);
		displayForward();
		int l5 = length();
		System.out.println("Length Of A DLL ===>" + l5);
	}

	private static DoublyLinkedListNode deleteLastNode() {
		if(isEmpty()) {
			return null;
		}
		DoublyLinkedListNode temp = tail;
		if(head == tail) {
			head = null;
		}else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
		return temp;
	}

	private static DoublyLinkedListNode deleteFirstNode() {
		if(isEmpty()) {
			return null;
		}
		DoublyLinkedListNode temp = head;
		if(head == tail) {
			tail= null;
		}else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next.previous = null;
		temp.next = null;
		length --;
		return temp;
	}

	private static void insertNodeAtEnd(int i) {

		DoublyLinkedListNode newNode = new DoublyLinkedListNode(i);
		if (isEmpty()) {
			head= newNode;
		}else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail=tail.next;
		length++;
	}

	private static void insertNodeAtBegining(int i) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(i);
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;

	}

	private static void displayBackword() {
		if (tail == null) {
			return;
		}
		DoublyLinkedListNode temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " ==>");
			temp = temp.previous;
		}
		System.out.print("null");

	}

	private static void displayForward() {
		if (head == null) {
			return;
		}
		DoublyLinkedListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ==>");
			temp = temp.next;
		}
		System.out.print("null");

	}

	private static void insertLast(int i) {
		DoublyLinkedListNode newnode = new DoublyLinkedListNode(i);
		if (isEmpty()) {
			head = newnode;
		} else {
			tail.next = newnode;

		}
		newnode.previous = tail;
		tail = newnode;
		length++;
	}

}
