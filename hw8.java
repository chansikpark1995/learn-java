package ch01_02;

public class hw8 {
	public static void main(String[] args) {
		int[][] array = {
				{95,86},{83,92,96},{78,83,93,87,88}
		};
		/*
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++)
		{	
			for(int j=0; j<array[i].length; j++)
				{
				sum += array[i][j];
				avg = sum/array[i].length;
				System.out.println((i+1)+"번째 합 : "+sum);
				System.out.println((i+1)+"번째 평균 : "+(double)avg);
			}
		}*/
		
		int[][] array2 = {{95,86},{83,92,96},{78,83,93,87,88}};
		for(int h=0; h<array2.length; h++)
		{	
			for(int g=0; g<array2[h].length; g++)
				{
				System.out.println(array2[h][g]);
				}
		}
		
	}
}
