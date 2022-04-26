package com.bilgeAdam.week03.gun.sali;

import java.util.Scanner;

public class ciftmitekmi {

	public static void main(String[] args) {
		System.out.println("Lutfen sayi giriniz");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		System.out.println(CiftmiTekmi(a));
		scanner.close();
	}
	public static boolean CiftmiTekmi(int a) {
		if(a%2==0) 
			return true;
		else 
			return false;
		
		
	}
}
