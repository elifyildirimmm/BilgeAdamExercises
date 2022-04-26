package com.bilgeAdam.week03.gun.sali;

import java.util.Scanner;

public class Points {

	public static void main(String[] args) {
		
		methodRankPoints(205.5);
	}
	
	public static void methodRankPoints(double points) {
		if(points >=200.5) {
			System.out.println("Rank:A ");
		}else if(points>=122.4) {
			System.out.println("Rank:B");
		}else {
			System.out.println("Rank:C");
		}
		
	}
}
