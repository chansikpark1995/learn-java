

package practice;

import java.util.Scanner;

public class hw { public static void main(String arg[])
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세용 : ");
		int score = scanner.nextInt();
		
		char grade;
		
		if(score>=90)
		{
			grade = 'A';
			System.out.println(grade+"임니당");
		}
		else if(score<90 && score>=80)
		{
			grade = 'B';
			System.out.println(grade+"임니다");
		}
		else if(score<80 && score>=70) 
		{
			grade = 'c';
			System.out.println(grade+"네요..");
		}
		else if(score<70 && score>=60) 
		{
			grade = 'D';
			System.out.println("반성하세요.");
		}
	}
		
	}



