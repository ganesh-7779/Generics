package com.brigdelabz;

public class FindMaxUsingGeneric {

	public int findMaxInteger(Integer num1, Integer num2, Integer num3) {
		int maxOfInteger = num1;
		if (num1.compareTo(maxOfInteger) > 0) {
			maxOfInteger = num1;
		}
		if (num2.compareTo(maxOfInteger) > 0) {
			maxOfInteger = num2;
		}
		if (num3.compareTo(maxOfInteger) > 0) {
			maxOfInteger = num3;
		}
		return maxOfInteger;
	}

	public static void main(String[] args) {

		System.out.println("Solving Problem by using Generic");
		FindMaxUsingGeneric obj = new FindMaxUsingGeneric();
		int maxInteger = obj.findMaxInteger(12, 30, 25);
		System.out.println(maxInteger);

	}
}
