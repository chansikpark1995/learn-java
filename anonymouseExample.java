package anonymouse;

public class anonymouseExample {
	public static void main(String[] args) {
		anonymouse anony = new anonymouse();
		anony.field.wake(); // 실행클래스의 anony객체가 anonymouse클래스의 field객체가 가진 메소트를 끌고온다.
		anony.method1();
		
	}
}
