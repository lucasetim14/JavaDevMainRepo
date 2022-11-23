package com.etim.opandnum;

public class OperatorsnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		binLShifty(2);
//		binLShifty(9);
//		binLShifty(17);
//		binLShifty(88);
//		binRShifty(150);
//		binRShifty(225);
//		binRShifty(1555);
//		binRShifty(32456);
//		bWise(0,0,0);
//		postfixOp(5);
		andOne(1);
		
		
	}

//	public static void binLShifty(int x) {
//		
//		System.out.println(Integer.toBinaryString(x));
//		x = x<<1;
//		System.out.println("The outcome will be "+ x + " and " + Integer.toBinaryString(x) +" Watch");
//		System.out.println(x);
//		System.out.println(Integer.toBinaryString(x));
//	}
	public static void binRShifty(int y) {
		y = 150;
		System.out.println(Integer.toBinaryString(y));
		y = y>>2;
		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));
		
	}
	public static void bWise(int x, int y, int z) {
		x = 7;
		y = 17;
		// my prediction is that the Bitwise And will yield 1.
		z = (x|y);
		System.out.println(z);
		
		
//	}public static void postfixOp(int a) {
//		a = 5;
//		System.out.println(a);
//		a = a++;
//		System.out.println(a);
//		
//	}would not print out what i wanted
	public static void andOne(int first) {
		first = 1;
		int second = first + 1;
		int third = second++;
		int fourth = ++third;
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
	}
	

}
