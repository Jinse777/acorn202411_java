package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//Generic 클래스를 Apple 로 지정해서 객체 사욯아기
		FruitBox<Apple> box1=new FruitBox<Apple>();
		box1.pack(new Apple());
		Apple a1 = box1.unPack();
		
		
		//Generic 클래스를 Orange 으로 지정해서 객체 사용하기
		FruitBox<Orange> box2=new FruitBox<Orange>();
		box2.pack(new Orange());
		Orange o1=box2.unPack();
		

		//Generic 클래스를 Melon 으로 지정해서 객체 사용하기
		FruitBox<Orange> box3=new FruitBox<Melon>();
		box2.pack(new Melon());
		Melon m1=box3.unPack();
		
	}

}
