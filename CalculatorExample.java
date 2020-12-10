package practice;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1;
		result1 = myCalc.plus(5,6);
		
		System.out.println("result1의 값은 " + result1);
		
		double result2; 
		result2 = myCalc.divide(5,6);
		System.out.println("result2의 값은 " + result2);
	}
	
}
