package week1.assignments.optional;

public class MyCalculator {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		int c = 10;
		Calculator calc = new Calculator();
		
		System.out.println(a + "+" + b + "+" + c + " : " + calc.add(a, b, c));
		System.out.println(a + "-" + b + " : " + calc.subtract(a, b));
		System.out.println(a + "*" + b + " : " + calc.multiply(a, b));
		System.out.println(a + "/" + b + " : " + calc.divide(a, b));
	}
}