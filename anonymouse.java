package anonymouse;

public class anonymouse {
	person field = new person() {
		void work(){
			System.out.println("�����");
		}
		@Override
		void wake() {
			// TODO Auto-generated method stub
			System.out.println("6�ÿ� �Ͼ����");
			work();
		}
	};
	void method1() {
		person localVar = new person() {
			void walk() {
				System.out.println("��å��");
			}
			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("7��");
			}
		};
		localVar.wake(); // person�� �޼ҵ�
	}
}
