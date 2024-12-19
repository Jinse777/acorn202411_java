package test.main;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		
		
		Car car1=new Car();
		car1.drive();
		
		new Car().drive(); // 얘는 이렇게 한번만 호출하고 끝이겠지 여기에 리턴되는 참조값을 다시 쓸 방법이 없다 그 이후 시점에. 변수에 담아두고 쓰면 쓸 수 있지만
	}
}
