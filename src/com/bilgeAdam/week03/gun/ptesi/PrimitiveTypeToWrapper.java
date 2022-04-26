package com.bilgeAdam.week03.gun.ptesi;

public class PrimitiveTypeToWrapper {

	public static void main(String[] args) {
		
//		int a=5;
//		Integer aObj = Integer.valueOf(a); //converts into wrapper class
//		
//		if(aObj instanceof Integer) {
//			System.out.println("Integer nesnesi yaratildi.");
//		}
		double a=5.0;
		Double aObj = Double.valueOf(a); 
		
		if(aObj instanceof Double) {
			System.out.println("Double nesnesi yaratildi.");
		}
		
		//autoboxing
		int a1=5;
		//converts into wrapper class
		Integer a1Obj=a1;
		
		double b1=6.5;
		Double b1Obj=b1;
		
		
	}

}
