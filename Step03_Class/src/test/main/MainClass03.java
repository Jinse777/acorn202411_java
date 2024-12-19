package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *Car 객체를 3개 만들어서
		 *임의의 자동차이름과 가격을 필드에 각각 대입하는 코드를 작성해 보세요.
		 */
		Car c1= new Car();
	    Car c2= new Car();
	    Car c3= new Car();
	    
	    c1.name="BMW 6GT"; c1.price=9000;
	    c2.name="gv70"; c2.price=7000;
	    c3.name="tiguan"; c3.price=3500;
	    
	}

}
