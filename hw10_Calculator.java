package ch01_02;

import java.util.Scanner;

public class hw10_Calculator {
	public static int Cal(){
		
	int sum;
	int a = 0;
	int b = 0;
	int result;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("숫자를 입력 : ");
	a = sc.nextInt();
	System.out.println("숫자를 입력 : ");
	b = sc.nextInt();
	
	sum = a+b;
	
	result = sum;
	return result;

	}
	
	public static int Cal02() {
		int min;
		int c = 0;
		int d = 0;
		int result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력 : ");
		c = sc.nextInt();
		System.out.println("숫자를 입력 : ");
		d = sc.nextInt();
		
		min = c-d;
		
		result = min;
		return result;
		
		
	}

	public static void main(String[] args) {
		System.out.println(Cal());
		System.out.println(Cal02());
	}
	
}
