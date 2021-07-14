package com.brigdelabz;

public class  FindMaxUsingGeneric  <T extends Comparable<T>>{
T num1,num2,num3;

public FindMaxUsingGeneric (T num1,T num2,T num3){
	this.num1=num1;
	this.num2=num2;
	this.num3=num3;
}
	public static <T extends Comparable<T>> T findMax(T num1,T num2,T num3) {
		T maxOfDataType = num1;
		if (num1.compareTo(maxOfDataType) > 0) {
			maxOfDataType = num1;
		}
		if (num2.compareTo(maxOfDataType) > 0) {
			maxOfDataType = num2;
		}
		if (num3.compareTo(maxOfDataType) > 0) {
			maxOfDataType = num3;
		}
		return maxOfDataType;
	}

	public static void main(String[] args) {

		System.out.println("Solving Problem by using Generic");
		int maxInteger = findMax(12,30,15);
		System.out.println(maxInteger);
		Float maxFloat = findMax(12.12f, 30.9f, 25.8f);
		System.out.println(maxFloat);
		String maxString = findMax("Apple","Peach","Banana");
		System.out.println(maxString);
	}

}
