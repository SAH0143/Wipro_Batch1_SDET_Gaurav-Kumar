package com.math.operations;

// 1. Create a package com.math.operations and write a class to perform addition and subtraction.

class Calculate{
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
}

class AddSub {
	public static void main(String[] args) {
		Calculate cl = new Calculate();
		
		System.out.println("Sum of a & b is :" + cl.add(356, 8590));
		System.out.println("Diffrence of a & b is :" + cl.add(35006, 8590));	
	}
}
