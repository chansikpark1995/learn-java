package anonymouse;

public class anonymouse {
	person field = new person() {
		void work(){
			System.out.println("출근함");
		}
		@Override
		void wake() {
			// TODO Auto-generated method stub
			System.out.println("6시에 일어날거임");
			work();
		}
	};
	void method1() {
		person localVar = new person() {
			void walk() {
				System.out.println("산책함");
			}
			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("7시");
			}
		};
		localVar.wake(); // person의 메소드
	}
}
