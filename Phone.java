package practice.sec03.exam01;

public abstract class Phone {

	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("폰 전원 킴");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끔");
	}
}
