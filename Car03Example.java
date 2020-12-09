package practice;

public class Car03Example {
	public static void main(String[] args) {	
		
	Car03 myCar = new Car03();
	
	System.out.println(myCar.company);
	System.out.println(myCar.color);
	System.out.println(myCar.model);
	System.out.println(myCar.maxSpeed);
	
	Car03 myCar02 = new Car03("자가용");
	System.out.println(myCar02.company);
	System.out.println(myCar02.color);
	System.out.println(myCar02.model);
	System.out.println(myCar02.maxSpeed);
	
	Car03 myCar03 = new Car03("자가용","빨강");
	System.out.println(myCar03.company);
	System.out.println(myCar03.color);
	System.out.println(myCar03.model);
	System.out.println(myCar03.maxSpeed);
	
	Car03 myCar04 = new Car03("자가용","빨강",60);
	System.out.println(myCar04.company);
	System.out.println(myCar04.color);
	System.out.println(myCar04.model);
	System.out.println(myCar04.maxSpeed);
}
}
