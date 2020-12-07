package practice;

import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
		//점수 5명분 입력 후 총점 나오게. 배열 이용
		
		int score[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0; i<score.length; i++)
		{
			System.out.println("점수를 입력하세요");
			score[i]= scanner.nextInt();
			sum += score[i];
			System.out.println(sum);
		}
		
	}

}
