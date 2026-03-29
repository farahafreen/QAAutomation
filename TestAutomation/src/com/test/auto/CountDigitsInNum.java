package com.test.auto;

public class CountDigitsInNum {
public static void main(String[] args) {
	int numb=14567;
	int count=0;
	while (numb>0)
	{
		numb=numb/10;
		count=count+1;
		
	}
	System.out.println("count of digit in mubers"+count);
	
}
}
