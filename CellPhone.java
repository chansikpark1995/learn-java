package sec01.exam01;

public class CellPhone {
	
	String model;
	String color;
	
	void powerOn() {System.out.println("전원 킴");}
	void powerOff() {System.out.println("전원 끔");}
	void bell() {System.out.println("벨 울림");}
	void sendVoice(String message){System.out.println("나 : "+message);}
	void receiveVoice(String message) {System.out.println("상대 : "+message);}
	void hangUp() {System.out.println("전화 끊음");}

}
