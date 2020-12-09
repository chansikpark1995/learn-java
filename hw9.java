package ch01_02;

import java.util.Scanner;

public class hw9 {
	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		int high = 0;
		int low = 100;
		int sum = 0;
		int avg = 0;
		for(int i=0;i<score.length;i++) {
			System.out.println("성적을 입력하세요 : ");
			score[i] = sc.nextInt();
			if(high<score[i])
			{
				high = score[i];
			}
			else if(low>score[i]) {
				low = score[i];
			}
			sum +=score[i];
			avg = sum/score.length;
		}
		System.out.println("최고점수 : "+high);
		System.out.println("최저점수 : "+low);
		System.out.println("총점 : "+sum );
		System.out.println("평균 : "+avg);
	}

}
