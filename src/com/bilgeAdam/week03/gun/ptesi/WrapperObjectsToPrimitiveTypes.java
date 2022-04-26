package com.bilgeAdam.week03.gun.ptesi;

public class WrapperObjectsToPrimitiveTypes {

	public static void main(String[] args) {
		
		//creates object of wrapper class // wrapper classtan obje oluşturma
		Integer aObj= Integer.valueOf(23);
		int a= aObj.intValue();//converts into primitive types //wrapper class değişkenini ilkel tip değişkenine çevirdik
			System.out.println("The value of a: "+a);
			
			
			
			//UnBoxing
			Integer a1Obj=Integer.valueOf(23);
			
			int a1= a1Obj;//converts into primitive types 
		
	}

}
