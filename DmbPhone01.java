package ch07;

/*메소드 재정의 (오버라이딩 / Overriding)-p317
 - 부모 클래스의 메소드가 자식 클래스에서 사용하기에 부적합할 경우 자식 클래스에서 수정하여 사용

*메소드 재정의 방법
 - 부모 메소드와 동일한 시그니처 가져야 함
 - 접근 제한 더 강하게 재정의할 수 없음
 - 새로운 예외(exception)를 throws 할 수 없음

- 메소드가 재정의될 경우 부모 객체 메소드가 숨겨지며, 
   자식 객체에서 메소드 호출하면 재정의된 자식 메소드가 호출됨
*/

//DmbPhone class는  기존의 Phone을 확장한 class 
public class DmbPhone01 extends Phone01 {
	//이 클래스에는 Phone01으로 부터 물려받은 field와 method가 존재
	
	//field- [접근제어자] [속성] 타입 필드명[=value];
	private int channel = 1;
	
	//constructor - [접근제어자] 클래스명([argumentlist]){}
	
	//method - [접근제어자] [속성] 리턴타입  메서드명([argumentlist]){}
    public void changeChannel(int channel) {
      this.channel = channel;
      System.out.printf("채널이 %d 로 변경되었습니다",channel);
    }
    
    //method override : 필요하면  super class로 부터 물려받은 method를 수정할 수 있다
    //오버라이드 조건 : 리턴유형, method이름,매개변수리스트은 변경x
    //접근제한자는 부모의 제한범위와 같거나 넓어야 한다
    //exception(예외처리)은 나중에..
    //@를  annotaion : 알려준다. 조건을 충족하는지 check
    @Override
    public void bell() {
        System.out.println("dang dang dang~");
    }
    
}










