package com.zxxz.test1;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		String str = "abcdef";
		char[] arra1 = str.toCharArray();
		char[] arra2 = Arrays.copyOf(arra1, arra1.length);
		for (int i = 0; i < arra1.length; i++) {
			for (int j = i + 1; j < arra1.length; j++) {
				System.out.println(arra1[i] + "," + arra1[j]);				
			}
		}
	}
}
