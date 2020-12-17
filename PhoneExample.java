package practice.sec03.exam01;

public class PhoneExample {
	//Phone phone = new Phone(); 추상클래스라서 이렇게 하면 안 됨
	public static void main(String[] args) {
	SmartPhone smartphone = new SmartPhone("홍길동");
	
	smartphone.turnOn();
	smartphone.turnOff();
	smartphone.internetSearch();
	
	
}
}
