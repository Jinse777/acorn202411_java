package test.main;

/*
 * [Static]
 * 
 * -Static 예약어를 붙여서 필드나 메소드를 정의하면 클래스와 함께 static 영역에 만들어 진다.
 * -Static 필드나 메소드를 사용할때는 클래스 명에 . 찍어서 사용하면 된다.
 *  
 * MyUtil.version // Static 필드참조
 * MyUtil.send() // Static 메소드 호출
 * 
 * 스태틱은 대신 필드가 딱 한개만 만들어짐. car에서는 뭐 엄청많이 만들 수 있었잖아. 근데 스태틱은 딱 필드 하나. 
 */

import test.mypac.MyUtil;
import test.mypac.YourUtil;

public class MainClass07 {
	public static void main(String[] args) {
		
		//myutil 클래스의 static 메소드 호출
		MyUtil.send();
		
		//myutil 클래스의 static 필드 참조
		String a= MyUtil.version;
		
		//YourUtil.remove();
		String b = YourUtil.color;
	}

}
