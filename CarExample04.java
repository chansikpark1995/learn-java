package practice;

public class CarExample04 {
	public static void main(String[] args) {
		
		Car04 myCar = new Car04();
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			
			System.out.println("����մϴ�.");
			myCar.run();
			}
		
		if(myCar.isLeftGas()) {
			
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
			myCar.run();
		}
		else {
			System.out.println("gas�� �����ϼ���.");
			
			}
		}
	}

