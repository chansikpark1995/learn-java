package practice;

public class Car05 {

	String model;
	int speed;
	
	Car05(String model){
		this.model=model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {		
		for(int i=10; i<=50; i++) {
			setSpeed(i);
			System.out.println(this.model+"�� �޸��ϴ�. (�ü� : "+this.model+"km/h)");
		}
	}
	
	static double pi = 3.14159;
	
	static int plus(int x,int y) {
		return x+y;
	}
	
	static int minus(int x,int y)
	{
		return x-y;
	}

	
	
	
}
