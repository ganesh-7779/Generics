package com.brigdelabz;

public class FindMaxUsingGeneric {

	public int findMaxInteger(Integer num1, Integer num2, Integer num3) {
		int max = num1;
		if (num1.compareTo(max) > 0) {
			max = num1;
		}
		if (num2.compareTo(max) > 0) {
			max = num2;
		}
		if (num3.compareTo(max) > 0) {
			max = num3;
		}
		return max;
	}

	public static void main(String[] args) {
		FindMaxUsingGeneric obj = new FindMaxUsingGeneric();
		int max = obj.findMaxInteger(12, 30, 25);
		System.out.println(max);

	}
}
