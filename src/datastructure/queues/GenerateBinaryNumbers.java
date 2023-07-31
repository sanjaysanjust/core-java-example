package datastructure.queues;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
	public static void main(String[] args) {
		GenerateBinaryNumbers gbn = new GenerateBinaryNumbers();
		String[] bin_arr_str= gbn.gen_bnary(10);
		System.out.println(bin_arr_str.length);
		for(String s : bin_arr_str) {
			System.out.println(s);
		}
	}

	private String[] gen_bnary(int number) {
		String[] bin_array = new String[number];
		Queue<String> qstr= new LinkedList<String>();
		qstr.offer("1");
		for(int i=0;i<number;i++) {
			bin_array[i]=qstr.poll();
			String s1 = bin_array[i]+"0";
			String s2 = bin_array[i]+"1";
			qstr.offer(s1);
			qstr.offer(s2);
		}
		return bin_array;
	}

}
