package datastructure.arrays;

public class Array_Examples {
	public static void main(String[] args) {
		int[] no = { 2, 4, 3, 5, 6, 7, 6, 5 };
		printArray(no);
		int[] newArray = removeEvenNo(no);
		printArray(newArray);
		printArray(no);
		int[] reversedArray = reverseArray(no);
		System.out.println("Reversed Array");
		printArray(no);

		int value = findMinimumValue(no);
		System.out.println("Minimum ValueFrom Array");
		System.out.println(value);

		int[] arr = { 2, 0, 3, 0, 6, 7, 0, 5 };
		printArray(arr);
		int[] resArr = moveZerosToEnd(arr, arr.length);
		System.out.println("Array After Zeroes Movement to Last");
		printArray(resArr);

		int[] arr1 = { 2, 0, 3, 0, 6, 7, 0, 5 };
		System.out.println("Resize Array Code.");
		printArray(arr1);
		System.out.println("Array Length ===>" + arr1.length);
		arr1 = resize(arr1, arr1.length * 2);
		System.out.println("Array Length after Resize ===>" + arr1.length);
		printArray(arr1);

		int[] arr2 = { 2, 1, 3, 8, 6, 7, 5 };
		System.out.println("Find Missing Number Example.");
		int value1 = findMissingNumber(arr2);
		System.out.println("Missing Number =====>" + value1);
		System.out.println("\n");

		System.out.println("Check String For palindrome");
		String str = "madam";
		boolean bool_val = isPlaindrome(str);
		System.out.println("Is String Plindrome =====>" + bool_val);

	}

	private static boolean isPlaindrome(String str) {
		char[] chr_str = str.toCharArray();
		int end = str.length()-1;
		int start = 0;
		while (start < end) {
			if (chr_str[start] != chr_str[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	private static int findMissingNumber(int[] arr2) {
		int lengthofArray = arr2.length + 1;
		int sum = lengthofArray * (lengthofArray + 1) / 2;
		for (int num : arr2) {
			sum = sum - num;
		}
		return sum;
	}

	private static int[] resize(int[] arr, int newsize) {
		int[] temp = new int[newsize];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		return temp;
	}

	private static int[] moveZerosToEnd(int[] arr, int length) {
		int j = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
		return arr;
	}

	private static int findMinimumValue(int[] no) {
		int min = no[0];
		for (int i = 1; i < no.length; i++) {
			if (no[i] < min) {
				min = no[i];
			}
		}
		return min;
	}

	private static int[] reverseArray(int[] no) {
		int[] tempArr = no;
		int start = 0;
		int end = no.length - 1;
		while (start < end) {
			int temp = tempArr[start];
			tempArr[start] = tempArr[end];
			tempArr[end] = temp;
			start++;
			end--;
		}
		// tempArr[no.length-1]=9;
		return tempArr;
	}

	private static void printArray(int[] no) {

		for (int i = 0; i < no.length; i++) {
			System.out.print(no[i] + "");
		}
		System.out.println("\n");
	}

	private static int[] removeEvenNo(int[] no) {
		int odCnt = 0;
		for (int i = 0; i < no.length; i++) {
			if (no[i] % 2 != 0) {
				odCnt++;
			}
		}
		int[] newNo = new int[odCnt];
		int cnt = 0;
		for (int i1 = 0; i1 < no.length; i1++) {
			if (no[i1] % 2 != 0) {
				newNo[cnt] = no[i1];
				cnt++;
			}

		}
		return newNo;
	}

}
