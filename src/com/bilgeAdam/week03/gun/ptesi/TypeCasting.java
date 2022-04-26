package com.bilgeAdam.week03.gun.ptesi;

public class TypeCasting {

	public static void main(String[] args) {
		//widening
		int myInt=9;
		double myDouble= myInt; //otomatik casting : int to double
		
		//narrowing
		double myDouble2=9.78d;
		int myInt2=(int)myDouble2;//manuel casting: double to int
		
		System.out.println(myInt2);
		System.out.println(myDouble2);
		//---------------------------------
		//Type conversion from int to String
		int num = 10;
		System.out.println("The integer value is: "+num);
		String data=String.valueOf(num);//convers int to string type
		System.out.println("The string value is: "+data);
		
		//Type conversion from String to int
		String data2="10";
		System.out.println("The string value is: "+data2);
		
		int num2=Integer.parseInt(data2);//converts string variable to int // string değeri int değere dönüştürülüyor
		System.out.println("The integer value is : "+num2);
	}

}
