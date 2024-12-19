package test.main;

import java.io.PrintStream;

public class MainClass08 {
	
	//static 필드
	public static String myname="김구라";
			
	//non stactic 필드
	public String yourname="에이콘";
	
	public static void main(String[] args) {
		
		//system 클래스의 out 이라는 static 필드에는 콘솔창에 출력하는 기능을 가지고 있는 printstream type
		//의 참조값이 들어 있다. 
		PrintStream a =System.out;
		a.println("후");
		
		
		System.out.println(MainClass08.myname);
		System.out.println(myname);
		
		//yourname 은 static 필드가 아니라 참조가 안된다.
		//System.out.println(MainClass08.yourname);
		
		// 여기는 static 메소드 안쪽이기 때문에 this.을 사용할수가없지
		// System.out.println(this.yourname);
		
		
		long time = System.currentTimeMillis();
		//long type을 리턴해주는 스태틱 메소드 1970년 1웡 1일 0 시를 기준으로 현재까지 경과한 시간을 1/1000초 단위로 계산해서 리턴해주는 메소드
		
	
		
		
		
	}

}
