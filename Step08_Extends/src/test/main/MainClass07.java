package test.main;

import java.util.Scanner;

import test.auto.Car;
import test.auto.Engine;
import test.mypac.Phone;

public class MainClass07 {
	public static void main(String[] args) {
		
		Object a = 10;
		Object b = true;
		Object c =	'a';	
		Object d ="abcd";
		Object e =new Phone();
		Object f =new Scanner(System.in);
		Object g =new Car(new Engine());
		
		//Object 배열은 어떤 type 이던지 다 담을 수 있다.
		Object[] objs = new Object[5];
		
		objs[0]=10;
		objs[1]=true;
		objs[2]="kim";
		objs[3]=new Phone();
		objs[4]=new Scanner(System.in);
		
		Phone p1=(Phone)e;
		p1.call();
		
		Phone p2= (Phone)objs[3];
		p2.call();
	}    

}
             

