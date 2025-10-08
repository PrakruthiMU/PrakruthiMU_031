package com;

public class Class_test 
{
	Class_test(int a, int b)
	{
		System.out.println("a="+a+"b="+b);
	}
	Class_test(int a, float b)
	{
		System.out.println("a="+a+",b="+b);
	}
	public static void main(String[] args) {
		{
			byte a = 1;
			byte b = 5;
			Class_test test = new Class_test(a,b);
		}
	}
}
