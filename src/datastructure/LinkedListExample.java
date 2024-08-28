package datastructure;

public class LinkedListExample {
	private static ListNode head;
	private static ListNode head2;
	private static ListNode a;
	private static ListNode b;

	public static void main(String[] args) {
		LinkedListExample lle = new LinkedListExample();
		lle.head = new ListNode(05);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(10);
		lle.head.next = second;
		second.next = third;
		third.next = fourth;
		
		lle.head2 = new ListNode(10);
		ListNode second_head2 = new ListNode(10);
		ListNode third_head2 = new ListNode(30);
		ListNode fourth_head2 = new ListNode(50);
		lle.head2.next = second_head2;
		second_head2.next = third_head2;
		third_head2.next = fourth_head2;
		dispaly(lle);
		int len = length(lle.head);
		System.out.println("Length Of the list ==========>" + len);
		insertFirst(1);
		dispaly(lle);
		int len1 = length(lle.head);
		System.out.println("Length Of the list ==========>" + len1);
		insertFirst(0);
		dispaly(lle);
		int len2 = length(lle.head);
		System.out.println("Length Of the list ==========>" + len2);
		insertLast(100);
		dispaly(lle);
		insertToPosition(50, 7);
		dispaly(lle);
		ListNode deletedNode = deleteFirst();
		System.out.println("Deelted Node ==>" + deletedNode.data);
		dispaly(lle);
		ListNode deletedLastNode = deleteLast();
		System.out.println("Delted Last Node ==>" + deletedLastNode.data);
		dispaly(lle);

		ListNode deletedNodeFromPosition = deleteFromPosition(3);
		System.out.println("Delted Last Node ==>" + deletedNodeFromPosition.data);
		dispaly(lle);

		boolean isFound = findElement(80);
		System.out.println(isFound);
		if (isFound) {
			System.out.println("Data Found ==>");
		} else {
			System.out.println("Data Not Found ==>");
		}

		dispaly(lle);

		ListNode node = reverseSinglyLinkedList(head);
		System.out.print("Reverse Order List");
		dispalyReverseOrder(node);

		
		dispaly(lle);
		ListNode middleNode = getMiddleNode(head2);
		System.out.print("Middle Node Value");
		System.out.println(middleNode.data);
		
		removeDuplicateFromSortedLL(head2);
		System.out.print("After Duplicate Removal, Node Value");
		dispalyReverseOrder(head2);
		
		insertNodeInSortedLL(head2,60);
		System.out.print("After Insertion of a node");
		dispalyReverseOrder(head2);
		
		
		lle.a = new ListNode(10);
		ListNode a_second = new ListNode(20);
		ListNode a_third = new ListNode(30);
		ListNode a_fourth = new ListNode(40);
		lle.a.next = a_second;
		a_second.next = a_third;
		a_third.next = a_fourth;
		
		lle.b = new ListNode(15);
		ListNode b_second = new ListNode(25);
		ListNode b_third = new ListNode(35);
		ListNode b_fourth = new ListNode(45);
		lle.b.next = b_second;
		b_second.next = b_third;
		b_third.next = b_fourth;
		
		ListNode sortedNodeList =  mergeTwoSortedLL(a,b);
		System.out.print("After Merge of a node");
		dispalyReverseOrder(sortedNodeList);
		
	}
	

	private static ListNode mergeTwoSortedLL(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode temp = dummy;
		while(a != null && b != null) {
			if(a.data <= b.data) {
				temp.next = a;
				a= a.next;
			}else {
				temp.next = b;
				b = b.next;
			}
			temp=temp.next;
		}
		
		if(a == null) {
			temp.next = b;
		}
		if(b == null) {
			temp.next = a;
		}
		return dummy.next;
	}


	private static void insertNodeInSortedLL(ListNode head,int value) {
		ListNode newNode = new ListNode(value);
		
		if(head == null) {
			head =newNode;
		}
		ListNode current = head;
		ListNode temp =null;
		while(current != null && current.data< newNode.data){
			temp = current;
			current = current.next;
		}
		
		temp.next = newNode;
		newNode.next = current;		
	}

	private static void removeDuplicateFromSortedLL(ListNode head) {
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
		
	}

	private static int length(ListNode head2) {
		int count = 0;
		if (head2 == null) {
			return 1;
		}
		ListNode current = head2;
		while (current != null) {
			count++;
			current = current.next;

		}
		return count;
	}

	private static void dispaly(LinkedListExample lle) {
		ListNode current = lle.head;
		while (current != null) {
			System.out.print("===>" + current.data);
			current = current.next;
		}
		System.out.print("===>" + null);
		System.out.println();
	}

	private static void dispalyReverseOrder(ListNode node) {
		ListNode current = node;
		while (current != null) {
			System.out.print("===>" + current.data);
			current = current.next;
		}
		System.out.print("===>" + null);
		System.out.println();
	}

	private static void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	private static void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}

		ListNode current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	private static void insertToPosition(int value, int position) {
		ListNode newNode = new ListNode(value);
		if (position == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}
		ListNode previous = head;
		int count = 1;
		while (count < position - 1) {
			previous = previous.next;
			count++;

		}
		ListNode current = previous.next;
		newNode.next = current;
		previous.next = newNode;
	}

	private static ListNode deleteFirst() {
		if (head == null) {
			return null;
		}
		ListNode tempNode = head;
		head = head.next;
		tempNode.next = null;
		return tempNode;
	}

	private static ListNode deleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}

		previous.next = null;
		return current;
	}

	private static ListNode deleteFromPosition(int position) {
		if (position == 1) {
			return head;
		} else {

			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			// ListNode temp = previous.next;
			// temp.next = null;

			ListNode current = previous.next;
			previous.next = current.next;
			return current;
		}
	}

	private static boolean findElement(int i) {
		ListNode current = head;
		while (current != null) {
			if (current.data == i) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	private static ListNode reverseSinglyLinkedList(ListNode head) {
		ListNode current = head;
		ListNode previuos = null;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previuos;
			previuos = current;
			current = next;
		}
		return previuos;
	}

	private static ListNode getMiddleNode(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode slwPtr = head;
		ListNode fstPtr = head;

		while (fstPtr != null && fstPtr.next != null) {
			slwPtr = slwPtr.next;
			fstPtr = fstPtr.next.next;
		}
		return slwPtr;
	}
}
