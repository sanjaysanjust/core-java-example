package datastructure.stacks;

import java.util.Stack;

public class checkForValidParenthesis {

	public boolean checkValidParen(String str) {

		char[] charArr = str.toCharArray();
		Stack<Character> sc = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				sc.push(c);
			} else {
				if (sc.isEmpty()) {
					return false;
				}
				char top = sc.peek();
				if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']')) {
					sc.pop();
				}else {
					return false;
				}
			}
		}
		
		return sc.isEmpty();
	}

	public static void main(String[] args) {
		checkForValidParenthesis vp = new checkForValidParenthesis();
		boolean isvalid = vp.checkValidParen("{}{}{{}");
		System.out.println(isvalid);

	}

}
