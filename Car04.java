package practice;

public class Car04 {
	
	int gas;
	
	void setGas(int gas){
		this.gas = gas;	
		
	}
	
	boolean isLeftGas(){
		if(gas==0) {
			return false;
		}
		else{
		return true;
		}
	}
	void run() {
		
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ� (gas �ܷ� : "+gas+")");
				gas--;
			}
			else {
				System.out.println("����ϴ� (gas �ܷ� : "+gas+")");
				return;
			}
		}
	}
}
