package practice;

import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
		//���� 5��� �Է� �� ���� ������. �迭 �̿�
		
		int score[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0; i<score.length; i++)
		{
			System.out.println("������ �Է��ϼ���");
			score[i]= scanner.nextInt();
			sum += score[i];
			System.out.println(sum);
		}
		
	}

}
