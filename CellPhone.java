package sec01.exam01;

public class CellPhone {
	
	String model;
	String color;
	
	void powerOn() {System.out.println("���� Ŵ");}
	void powerOff() {System.out.println("���� ��");}
	void bell() {System.out.println("�� �︲");}
	void sendVoice(String message){System.out.println("�� : "+message);}
	void receiveVoice(String message) {System.out.println("��� : "+message);}
	void hangUp() {System.out.println("��ȭ ����");}

}
