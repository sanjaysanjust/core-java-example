package datastructure.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Array_Example2 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 6, 7 };
		int[] result = twoSum(arr, 13);
		for (int i : result) {
			System.out.println(i);
		}
		System.out.println(isPalindrome(-454));
		System.out.println("********");
		String[] arrstr = { "flower", "flow", "flawless" };
		String prefix = longestCommonPrefix(arrstr);
		System.out.println("Longest Prefix ===>" + prefix);
		System.out.println("Valid Parenthesys ===>"+valid_parenthesis("()"));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i <= nums.length - 2; i++) {
			int val = nums[i] + nums[i + 1];
			System.out.println("val ===>" + val);
			if (val == target) {
				result[0] = nums[i];
				result[1] = nums[i + 1];
				return result;
			}
		}
		return result;
	}

	public int[] twoSum1(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			}
			numMap.put(nums[i], i);
		}

		return new int[] {}; // No solution found
	}

	public static boolean isPalindrome(int x) {
		int tmp = x;
		int sum = 0;
		while (x > 0) {
			int rem = x % 10;
			System.out.println(rem);
			sum = (sum * 10) + rem;
			x = x / 10;
			System.out.println("x ===>" + x);
		}

		if (sum == tmp) {
			return true;
		}
		return false;
	}

//	 public static boolean isStringPalindrome(String x) {
//	        String tmp = x;
//	        int sum = 0;
//	        str_length = x.length()-1
//	        while(x.length()>0){
//	            int rem = x%10;
//	            System.out.println(rem);
//	            sum = (sum*10)+rem;
//	            x= x/10;
//	            System.out.println("x ===>"+x);
//	        }
//	        
//	        if(sum == tmp)
//	        {
//	            return true;
//	        }
//	        return false;
//	    }

	public static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		String s1 = strs[0];
		String s2 = strs[strs.length - 1];
		System.out.println(s1);
		System.out.println(s2);
		int idx = 0;
		while (idx < s1.length() && idx < s2.length()) {
			System.out.println(idx);
			if (s1.charAt(idx) == s2.charAt(idx)) {
				idx++;
			} else {
				break;
			}
		}
		return s1.substring(0, idx);
	}

	public static boolean valid_parenthesis(String str) {
		
		
		Stack<Character> stk = new Stack();
		
        for (int i=0;i<str.length();i++) {
        	
        	char c =str.charAt(i);
        	System.out.println("CCCCC ===>"+c);
        	System.out.println(stk.isEmpty());
        	if(!stk.isEmpty()) {
        		System.out.println("If not empty");
        		try {
					if(isCheckParenthesys((char)stk.peek(),c));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        			return true;
        		
        	}else {
        		System.out.println("Inside else");
        		stk.add(c);
        	}
        }
        
        return false;
}

	private static boolean isCheckParenthesys(char cur,char last) {
		System.out.println(cur);
		System.out.println(last);
		// TODO Auto-generated method stub
		return (cur == '(' && last == ')') ||
	               (cur == '{' && last == '}') ||
	               (cur == '[' && last == ']');
	}
}
