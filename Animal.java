package practice.sec03.exam02;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨 쉼");
	}
	public abstract void sound(); //어떤 소리인지는 자식클래스에서 채운다.
}
