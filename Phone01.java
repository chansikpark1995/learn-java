package ch07;


/*상속 -p310,  - ch07.DmbPhone01.java  참고     ch07.Phone01.java참고
 - 이미 개발된 클래스를 재사용하여
   새로운 클래스를 만들기에 중복되는 코드를 줄임

 - 부모 클래스의 한번의 수정으로 
   모든 자식 클래스까지 수정되는 효과가 있어 
    유지보수 시간이 줄어든다 */

//phone관련 data 및 기능 제공하는 클래스
public class Phone01 {
	//field- [접근제어자] [속성] 타입 필드명[=value];
   private String model;
   private String color;
	
   //constructor - [접근제어자] 클래스명([argumentlist]){}
   public Phone01() { }
   public Phone01(String model, String color) {
	   this.model = model;
	   this.color = color;   
   }
	
   //method - [접근제어자] [속성] 리턴타입  메서드명([argumentlist]){}
   public void powerOn(){
      System.out.println("전원이 켜졌습니다.");
   }
   
   public void powerOff(){   
      System.out.println("전원이 꺼졌습니다.");
   }
   
   public void bell() {
      System.out.println("원래의 벨소리 딩동댕");
   }
   
   public void sendVoice(String msg) {
      System.out.println(msg+"메시지를 전송중");
   }
   
   public void receiveVoice(String msg) {
      System.out.println(msg+"메시지를 받았습니다.");
   }
   
}

















