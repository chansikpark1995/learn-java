package practice;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("����ȸ�� : "+myCar.company);
		System.out.println("�𵨸� : "+myCar.model);
		System.out.println("���� : "+myCar.color);
		System.out.println("�ְ��ӵ� : "+myCar.maxSpeed);
		System.out.println("�ӵ� : "+myCar.speed);
		
		myCar.speed = 60; // Car Ŭ���� �ۿ��� �ʵ� ����.������ ���� �� ���������� ���� ����
		System.out.println("�ӵ� : "+myCar.speed);
	}
}