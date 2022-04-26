package com.bilgeAdam.week03.gun.ptesi;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=3;
		int balance=1500;
		int select;
		int amount;
		
		while(true) {
			count--;
			System.out.println("Lutfen kullanici adinizi giriniz:");
			String userName= scanner.nextLine();
			System.out.println("Lutfen sifrenizi giriniz:");
			String password=scanner.nextLine();
			
			if(!userName.equals("user")|| !password.equals("123")) {
				System.out.println("hatali giris yaptiniz.");
				
			
			if(count==0) {
				System.out.println("Hesap kartiniz bloke olmustur.Bankanizla iletisime gecin.");
				break;
			}else {
				System.out.println("Kalan hakkiniz: " + count);
			}
				
			}else {
				System.out.println("Bankamiza hosgeldiniz.");
				while(true) {
					System.out.println("1- Para Yatirma\n"+ "2- Para Cekme\n" + "3- Bakiye Sorgula\n"+"4- Cikis Yap");
					System.out.println("Lutfen bir secim yapiniz");
					select=scanner.nextInt();
					switch (select) {
					case 1: 
						System.out.println("Lutfen yatirmak istediginiz tutari giriniz:");
						amount=scanner.nextInt();
						balance=balance+amount;
						System.out.println("Hesabiniza "+amount+" TL para yatirilmistir. "+" Guncel bakiye: "+ balance);
						break;
					case 2:
						System.out.println("Lutfen cekeceginiz tutari giriniz:");
						amount=scanner.nextInt();
						if(amount>balance) {
							System.out.println("Yetersiz Bakiye");
						}else {
							balance-=amount;
							System.out.println("Hesabinizdan "+amount+" TL para cekilmistir. "+" Guncel bakiye: "+ balance);
						}
						break;
					case 3:
						System.out.println("Hesabinizda toplam "+balance+" TL para vardir.");
					break;
					case 4:
					System.out.println("Sistemden cikiliyor...");
					System.exit(0);
					
						default:
							System.out.println("Gecersiz islem yapildi");
							break;
					}
				}
			}
			
			
		}
		
		
		
	}

}
