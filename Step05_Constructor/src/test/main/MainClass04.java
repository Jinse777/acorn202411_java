package test.main;

import java.io.File;

public class MainClass04 {
	public static void main(String[] args) throws FileNotFoundException {
	
		File f=new File("src/test/mypac/memo.txt");
		
	
		Scanner scan=new Scanner(F);
		
		String line=scan.nextline();
		System.out.println("memo. txt 파일의 첫번쨰 줄"+line);
		
	}

}
