package practice;

public class Car05Example {
	public static void main(String[] args) {
	Car05 myCar = new Car05("포르쉐");
	Car05 newCar = new Car05("벤츠");
	myCar.run();
	newCar.run();
	
	double result1 = 10 * 10 * Car05.pi;
	System.out.println(result1);
	
	int result2 = Car05.plus(10, 5);
	int result3 = Car05.minus(9, 8);
	System.out.println("플러스"+result2+" 마이너스"+result3);
	}
}
