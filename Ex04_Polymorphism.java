package ch07;

//Polymorphism(다형성) -p332
//https://www.w3schools.com/java/java_polymorphism.asp

//여기에서는 임시로  하나의 소스file안에   여러 개의 class를 선언

class Animal{
	public void sound(String s) {System.out.println(s+" -sound");}
}

class Mammal extends Animal{
	@Override
	public void sound(String s) {System.out.println(s+" :Mammal sound");}   
}


class Puppy extends Mammal{
	@Override
	public void sound(String s) {System.out.println(s+" :Puppy sound");}
}

class Bird extends Animal{
	@Override
	public void sound(String s) {System.out.println(s+" : Bird sound");}
}

public class Ex04_Polymorphism {

	public static void main(String[] args) {
		//클래스명  참조변수=new 클래스명();
		Animal animal = new Animal();//동물객체생성해서 sound() call
		animal.sound("동물");
		
		Puppy animal2 = new Puppy(); //animal = new Puppy();
		animal2.sound("멍멍");		//Puppy의 sound()
	    
	    Bird animal3 = new Bird(); //animal = new Bird();
	    animal3.sound("짹짹");		//Bird의  sound()
	    
	    System.out.println("---------------------------");
	    //다형성(Polymorphism) :
	    //하나의 참조변수 animal에   
	    //참조변수타입(Animal)의  subclass의 instance가 저장될 수 있다
	    
	    //계층추적★★★★ : 단일상속+다형성
	    //특정 method를 호출(call)하는데
	    //부모클래스에도 존재하고
	    //자식클래스에도 존재하면
	    //마지막에 만나는 자식의 클래스의 method를 run한다
	    //=> 자식의 클래스에서 overriding한  method가 run
	    animal = new Puppy();
	    animal.sound("강아지"); 	//Animal의 sound()를 call했지만  Puppy의 sound()가 run
	    //강아지 :Puppy sound
	    //강아지 :Puppy sound
	    //?
	    
	    animal = new Bird();
	    animal.sound("새"); 	//Animal의 sound()했지만  Bird의 sound()가 run
	}

}










