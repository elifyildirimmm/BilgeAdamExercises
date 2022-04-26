package com.bilgeAdam.week03.gun.sali;

import java.util.Scanner;

public class Calculator {
	static double s1,s2;
	static char islem;
	static double result = 0 ;
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		

			
				
				System.out.println("Sayi gir:");
				s1=scanner.nextInt();
				
				System.out.println("Sayi gir:");
				s2=scanner.nextInt();
				
				System.out.println("Yapilacak islemi sec(+,-,*,/,%: ");
				islem= scanner.next().charAt(0);
				
				switch(islem) {
				case '+' :
					sum();
					break;
				case '-' :
					diff();
					break;
				case '*' :
					multiply();
					break;
				case '/' :
					divide();
					break;
				case '%':
					mod();
					break;
				default:
						System.out.println("Hatali");
					return;
					
				}
				System.out.println(s1+ " "+islem+" "+s2+ " = "+result );
	     }

		

	
	public static void sum() {
		result= s1+s2;
	}
	public static void diff() {
		result= s1-s2;
	}
	public static void multiply() {
		result= s1*s2;
	}
	public static void divide() {
		result= s1/s2;
	}
	public static void mod() {
		result= s1%s2;
	}
}
