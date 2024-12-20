package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		Calc c1= new Calc() {

			@Override
			public double execute(double num1, double num2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		Calc c3 = (a, b) ->{
			//return 예약어 이전에 coding 된 내용이 없음
			return 0;
		};
		// return 예약어 이전에 coding 된 내용이 없으면 {}생략 가능 
		Calc c4 = (a,b) -> 0; //리턴할 값만 명시하면 되기 때문에 return 예약어도 사용하지 않는다. 
		
		//매개변수에 전달된 두 숫자를 더한 값을 리턴하는 동작
		Calc plus = (a, b) -> a+b;
	}

}
