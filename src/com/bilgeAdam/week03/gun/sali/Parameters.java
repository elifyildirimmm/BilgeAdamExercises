package com.bilgeAdam.week03.gun.sali;

public class Parameters {

	public static void main(String[] args) {
		System.out.println("3 + 2 = "+add(3,2));
		System.out.println("3 x 2 = "+multiply(3,2));
		System.out.println("3'un karesi = "+ quadrat(3));
	}

	private static int quadrat(int a) {
		
		return multiply(a,a);
	}

	private static int multiply(int a, int b) {
		
		return a * b;
	}

	private static int add(int a, int b) {
		
		return a + b;
	}

}
