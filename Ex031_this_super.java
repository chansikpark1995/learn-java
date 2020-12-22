package ch07;


//this	 : 자신의 객체를 가리키는 참조 변수
//super  : 부모의 객체를 가리키는 참조 변수
public class Ex031_this_super {

	public static void main(String[] args) {
		Daughter031 daughter = new Daughter031();
		daughter.getWealth();
	}

}

class Mom031 extends GrandMom031{
	String wealth = "땅100평";
}	 

class Daughter031 extends Mom031{
	
	void qqq() {
		wealth= "0평";
	}
	
	void getWealth() {
		System.out.println("엄마의 재산조회1 :"+super.wealth);
		
		super.wealth = "땅10평"; //엄마의 재산변경
		System.out.println("엄마의 재산조회2 :"+super.wealth);
		
		this.wealth = super.wealth+"+건물5채 +땅5000평";//내가 재산을 증식
		System.out.println("my wealth="+this.wealth);
	}
}



//Object class는  모든 class 최상위  class이다=> 조상클래스
//class GrandMom031 extends Object{ //묵시적으로  Object클래스를 상속받고 있다
class GrandMom031 {

	@Override
	public String toString() {
		return super.toString();
		//super class인 Object의 toString()를 호출한다
	}
	
}












