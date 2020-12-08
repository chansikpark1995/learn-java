package ch01_02;

//p82
//+연산에서의 문자열 자동 타입 변환
public class Ex08 {

	public static void main(String[] args) {
		int n1 = 10;
		System.out.println(  n1);//10
		
		//문자열을 연결하는 연결연산자 + 사용시
		//처음에 문자열을 만나면 그 뒤의 것들은 문자열화 된다
		//"int n1 = "+10 -> "int n1 = "+"10"-> "int n1 = 10"
		System.out.println("int n1 = "+n1);//"int n1 = 10"
		
		//숫자+"년도"
		System.out.println(2020+"년도"); //2020년도
		
		//숫자2000+숫자21+"년도" -> (2000+21)+"년도"->2021+"년도"
		System.out.println(2000+21+"년도");//2021년도
		
		//"작년은 "+숫자연산
		//"작년은 "+(2020-1) -> "작년은 "+2019 
		//->"작년은 "+"2019" -> "작년은 2019"
		System.out.println("작년은 "+(2020-1));//작년은 2019
		//The operator - is undefined for the argument type(s) String, int
		//연산자가 선언(정의)x
		//println메서드의 arqument의 개수는 한개여야한다
		
	}

}











