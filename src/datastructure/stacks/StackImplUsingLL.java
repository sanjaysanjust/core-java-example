package datastructure.stacks;
import datastructure.ListNode;

public class StackImplUsingLL {
	private ListNode top;
	private int length;
	
	public StackImplUsingLL() {
		top=null;
		length = 0;
	}
	
	public void push(int data) {
		ListNode temp =new ListNode(data);
		temp.next = top;
		top=temp;
		length++;
	}
	
	public boolean isempty() {
		if(length == 0) {
			return true;
		}
		return false;
	}
	
	public int pop() throws StackEmptyException {
		if(isempty()) {
			throw new StackEmptyException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	public char popChar() throws StackEmptyException {
		if(isempty()) {
			throw new StackEmptyException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return (char) result;
	}
	public void lenngth() {
		System.out.println("Length Of the stack : "+ length);
	}
	
	public static void main(String[] args) throws StackEmptyException {
		StackImplUsingLL si= new StackImplUsingLL();
		si.push(0);
		si.push(1);
		si.lenngth();
		int val = si.pop();
		System.out.println("Poped Element :"+ val);
		si.lenngth();
		int val1 = si.pop();
		System.out.println("Poped Element :"+ val1);
		si.lenngth();
		si.pop();
	}
	

}
