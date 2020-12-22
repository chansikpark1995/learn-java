package ch07;

//phone01을 이용하는 class 
//DmbPhone01 을 이용하는 class 
public class Ex01 {

	
	public static void main(String[] args) {
		//phone01의  model,color  임의value로 초기화
		Phone01 phone= new Phone01("삼성 갤럭시", "black");
	      
		//phone01의 모든 기능 test
		phone.powerOn();
		phone.bell();
		phone.sendVoice("안녕");
		phone.receiveVoice("반가워");
		phone.powerOff();
		System.out.println("-------------------------");
		
		//DmbPhone01의 모든 기능 test
		DmbPhone01 dmb = new DmbPhone01();
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("하이");
		dmb.changeChannel(100); //DmbPhone01의 기능사용
		dmb.powerOff();
		
	}
	
}







