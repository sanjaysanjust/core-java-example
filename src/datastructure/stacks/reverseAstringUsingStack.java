package datastructure.stacks;

public class reverseAstringUsingStack {
	
	public static void main(String[] args) throws StackEmptyException {
		reverseAstringUsingStack rss= new reverseAstringUsingStack();
		String str = "ABCSDERFS";
		char[] rev_char_array = rss.reverseString(str);
		System.out.println(rev_char_array);
	}

	private  char[] reverseString(String str) throws StackEmptyException {
		
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		StackImplUsingLL su = new StackImplUsingLL();
		
		for(int i= 0;i<charArray.length;i++) {
			su.push(charArray[i]);
		}
		su.lenngth();
		char[] charArraynew = new char[str.length()];
		for(int i= 0;i<charArray.length-1;i++) {
			charArraynew[i] = su.popChar();
		}
		su.lenngth();
		return charArraynew;
	}

}
