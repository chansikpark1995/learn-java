package practice;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("색깔 : "+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("속도 : "+myCar.speed);
		
		myCar.speed = 60; // Car 클래스 밖에서 필드 수정.변수명 선언 후 참조변수를 통해 수정
		System.out.println("속도 : "+myCar.speed);
	}
}
