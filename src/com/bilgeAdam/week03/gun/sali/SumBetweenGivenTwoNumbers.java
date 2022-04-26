package com.bilgeAdam.week03.gun.sali;

public class SumBetweenGivenTwoNumbers {

	public static void main(String[] args) {
		int toplam2=sum(10,20);
		System.out.println(toplam2);
	}
	public static int sum(int start,int end) {
		if(end>start) {
			int toplam= end+sum(start,end-1);
			return toplam;
		}else
			return end;
		
		
		
	}
}
