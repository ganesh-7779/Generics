package com.brigdelabz;

public class FindMaxUsingGeneric {

	public <T extends Comparable<T>> T findMax(T num1, T num2, T num3) {
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
		FindMaxUsingGeneric obj = new FindMaxUsingGeneric();
		int maxInteger = obj.findMax(12, 30, 25);
		System.out.println(maxInteger);
		Float maxFloat = obj.findMax(12.12f, 30.9f, 25.8f);
		System.out.println(maxFloat);
		String maxString = obj.findMax("Apple","Peach","Banana");
		System.out.println(maxString);
	}

}
