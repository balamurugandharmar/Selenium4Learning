package week1.day1;

public class Calculator {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		Maths maths = new Maths();
		
		System.out.println(a + "+" + b + " : " + maths.add(a, b));
		System.out.println(a + "-" + b + " : " + maths.subtract(a, b));
		System.out.println(a + "*" + b + " : " + maths.multiply(a, b));
		System.out.println(a + "/" + b + " : " + maths.divide(a, b));
	}

}
