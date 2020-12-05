package practice;

public class hw2 { public static void main(String[] args)
	{
		/*int lotto[] =new int[6];
		
		System.out.println("로또 번호는~");
		
		for(int i=0; i<6; i++)
		{
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0 ; j<i ; j++)
			{
				if(lotto[i] == lotto[j])
				{
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<6;i++){	
			System.out.println(lotto[i]+"입니다");
		}*/
	/*
	int a=0;
	int sum = 0;
	
	while(a<=10) {
		sum += a;
		a++;
		
	}
	System.out.println("1~10까지 합"+sum);
	
		*/
	/*
	int b;
	for(b=0;b<=30;b++)
	{	
		System.out.println("출력된 수"+b);
		if(b == 15){
			break;}*/
	/*
	int c;
	int d;
	for(c=2;c<=9;c++)
	{	System.out.println(c+"단 = ");
	for(d=1;d<=9;d++)
	{
		System.out.println(c*d);
		
		
			}
			
		}*/
	

	/*
	for(int f=0;f<5;f++){
		for(int g=0;g<f+1;g++){
		System.out.print("*");
		}
		System.out.println();

		}*/
	/*
	int h;
	int sum2 = 0;
	for(h=0;h<=100;h++)
	{if(h*3>100){
		break;
		}
	sum2 +=h*3;
	System.out.println("3의 배수의 합계 :"+sum2);
		
	}*/
	
	
	for(int x=1;x<=10;x++)
	{	
		int q = 4*x;
		for(int y=1;y<=10;y++)
		{		
			
			int w = 5*y;
			int z = (q)+(w);
			if(z==60)
			{	System.out.println("x가 "+x+" 이고");
				System.out.println("y가 "+y+" 일 때");
				break;
			}
		}
	}
	
	
	}
}
	
		
	
	
	


