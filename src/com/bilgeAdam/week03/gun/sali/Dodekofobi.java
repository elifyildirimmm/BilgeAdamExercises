package com.bilgeAdam.week03.gun.sali;

import java.util.Random;
import java.util.Scanner;

public class Dodekofobi {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Lutfen hangi sayiya dek rastgele numara uretilmesi istediginizi giriniz: ");
		int upperBound=in.nextInt();
		in.close();
		System.out.println("Cekilen sayi: "+ getRandomNumber(upperBound));

	}
	private static int getRandomNumber(int upperBound) {
		Random rnd=new Random();
		int randomNumber =-1;
		do {
			randomNumber=rnd.nextInt(upperBound+1);
		}while(randomNumber==12);
		
		return randomNumber;
		
	}

}
