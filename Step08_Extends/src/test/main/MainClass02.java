package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 *   [다형성]
 *   
 *   -java 에서 객체는 여러개의 type 을 가질 수 있다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 나온 참조값을 HamPhone type 지역변수 p1 에 담기
		HandPhone p1=new HandPhone();
		//HandPhone 객체를 생성해서 나온 참조값을 Phone type 지역변수 p2 에 담기
		Phone p2=new HandPhone();
		//HandPhone 객체를 생성해서 나온 참조값을 Object type 지역변수 p3 에 담기
		Object p3= new HandPhone();
	}

}
