package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		//+연산 하기 
		int sum =10+1;
		int sum2 = num1+num2;
		int sum3 = 10+ num2;
		//정수기리 연산하면 결과는 정무만 나온다. 		
		int result1 = 5 / 3;
		int result2 = num1 / num2;
		//연산의 결과로 실수 값을 얻어내고 싶으면 적어도 하나는 실수여야 한다.		
		double result3 = 5 / 3.0;
		
		//type casting (형 변환)
		
		int a=10;
		/*
		 * a 자체는 int type 이지만 (byte) 연산자로 casting 하면
		 * 대입연산자의 우측에는 byte type 이 있다고 간주되어서 문법이 성립한다.
		 * 대신 a 안에 들어있는 값이 byte 범위안에 들어있다는것이 확실할때에만 
		 * casting 해야지 오류가 없다.
		 */
		byte b=(byte)a;
	    //int type 인 a를 byte type 으로 둔갑시켜서 변수 b에 집어넣는것
	}

}