package com.test.auto;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int num = 123;
		
		String reverseNum = "";
		
		while (num > 0) {
			int reminder = num % 10;
			reverseNum = reverseNum + reminder;
			num = num / 10;
		}
		System.out.println("reverse num :: "+reverseNum);
	}

}
