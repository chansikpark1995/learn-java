package ch07;

/*final 키워드– p322
- 해당 선언이 최종 상태이며 수정될 수 없음을 의미
- 클래스 및 메소드 선언 시 final 키워드를 사용하면 상속과 관련됨

*final 클래스 : final 클래스는 부모 클래스로 사용할 수 없다.
*final 메소드 : 자식 클래스에서 재정의할 수 없는 메소드이다.
*/
public class Ex02_final {

	public static void main(String[] args) {
		Son02 son = new Son02();
		son.test();
	}

}

class Father02{
	//field- [접근제어자] [속성 final static] type 필드명[=초기값]
	int a = 10;
	final int f = 1;
	
	final void qqq() {System.out.println("Father02- qqq()");}
	void aaa() {
		System.out.println("Father02- aaa()");
		//f = 888;
		//The final field Father02.f cannot be assigned
		//final 변수로 선언된 f의 초기값인 1은 변경을 할 수 없다
	}
}

final class Son02 extends Father02{
	//Father02로 부터 물려받은 a가 존재
	//Father02로 부터 물려받은 f가 존재
	int b = 123;
	
	void test() {
		//f = 999;
		//The final field Father02.f cannot be assigned
		//final 변수로 선언된 f의 초기값인 1은 변경을 할 수 없다
		System.out.println("f="+this.f);//1
		
		a = 1000; //상속받은 변수 a값을 변경
		System.out.println("this.a = "+this.a); //1000
		System.out.println("this.b = "+this.b); //123
	}
	
	
	//void qqq() {System.out.println("Son02-qqq()");}
	//Cannot override the final method from Father02
	//Father02에서 선언한 qqq()는 final method로서
	//자식 클래스인  Sun02에서 재정의할 수 없는 메소드이다.
	
	@Override
	void aaa() {System.out.println("Son02-aaa()");}
}


//class GrandSon02 extends Son02{	}
//The type GrandSon02 cannot subclass the final class Son02
//final 클래스 : final 클래스인 Sun02는    GrandSon02의 부모 클래스로 사용할 수 없다.














