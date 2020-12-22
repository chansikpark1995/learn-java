package ch07;

//this	 : 자신의 객체를 가리키는 참조 변수
//super  : 부모의 객체를 가리키는 참조 변수

//this() : 자신의 또 다른 생성자를 호출-p241
//super() : 부모의 생성자를 호출
//공통점 : Constructor call must be the first statement in a constructor
public class Ex03_this_super {

	public static void main(String[] args) {
		//Son03 son = new Son03();//아들객체생성해서 test()호출
		//조상클래스의 객체가 자동으로 생성된다 -> default constructor() call
		
		Son03 son = new Son03(100);
		son.test();
	}

}

class GrandFather03{
	GrandFather03(){ 
		System.out.println("GrandFather03-생성자야"); 
	}
	
	GrandFather03(int a){ 
		System.out.println("GrandFather03생성자야-파라미터1개짜리"); 
	}
}

class Father03 extends GrandFather03{
	//default constructor
	Father03(){ 
		super();
		System.out.println("Father03-생성자야"); 
	}
	
	//constructor overload
	Father03(int a){ 
		super(100);
		System.out.println("Father03생성자-파라미터1개짜리");  
	}
}

class Son03 extends Father03{
	
	Son03(int a){
		//super();//생략된 상태
		super(100);//super class의 파라미터1개짜리 constructor call
		System.out.println("Son03생성자-파라미터1개짜리");  
	}
	
	Son03(){
		super();
		System.out.println("Son03-생성자야");  
		//super();//반드시 첫 번째 문장에서  부모의 생성자를 호출
		//Constructor call must be the first statement in a constructor
	}
	
	//일반 method
	void test() { 
		//this(); //자신의 생성자를 호출=> 일반 method에서는 cannot call
		//Constructor call must be the first statement in a constructor
		//super();//부모의 생성자를 호출=> 일반 method에서는 cannot call
		//Constructor call must be the first statement in a constructor
		System.out.println("Son03-test()"); 
	}
}










