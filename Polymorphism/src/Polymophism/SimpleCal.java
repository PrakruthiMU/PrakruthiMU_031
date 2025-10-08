package Polymophism;

class SimpleCal1 {
int add(int a, int b) {
	return a+b;
}
	int add(int a , int b, int c) {
	return a+b+c;
	}
	double add(double a, double b) {
		return a+b;
	}
}
	public class SimpleCal {
		public static void main(String[] args) {
			SimpleCal1 calc =new SimpleCal1();
			System.out.println("Sum of 2 ints:" + calc.add(5, 10));
			System.out.println("Sum of 3 ints:" + calc.add(5, 10,15));
			System.out.println("Sum of 2 Doubles:" + calc.add(5.5, 6.5));
		}	
		}

		
