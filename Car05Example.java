package practice;

public class Car05Example {
	public static void main(String[] args) {
	Car05 myCar = new Car05("������");
	Car05 newCar = new Car05("����");
	myCar.run();
	newCar.run();
	
	double result1 = 10 * 10 * Car05.pi;
	System.out.println(result1);
	
	int result2 = Car05.plus(10, 5);
	int result3 = Car05.minus(9, 8);
	System.out.println("�÷���"+result2+" ���̳ʽ�"+result3);
	}
}
