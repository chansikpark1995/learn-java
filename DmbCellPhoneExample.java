package sec01.exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);
		System.out.println("�� : "+ dmbCellPhone.model);
		System.out.println("���� : "+ dmbCellPhone.color);
		System.out.println("ä�� : "+ dmbCellPhone.channel);
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.ChangeChannelDmb(15);
		dmbCellPhone.turnOffDmb();
		
	}

}
