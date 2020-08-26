package day03;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		//1.  스캐너 생성
		Scanner scan = new Scanner(System.in); //Scanner 사용 java.util.Scanner;를 import 해야함
		
		//2. 스캐너가 가지고 있는 입력기능을 사용해서 데이터를 입력받음
		System.out.print("이름 > ");		
		String name = scan.next();
				
		System.out.print("나이 > ");
		int age = scan.nextInt();
		
		
		System.out.print("신장 > ");
		double cm = scan.nextDouble();
		 
		
		System.out.print("자기소개 > ");
		scan.nextLine(); //위에서 남아있는 엔터값을 제거
		String intro = scan.nextLine();
		
		System.out.println("이름 : " +name + "\n나이 : "+ age + "\n신장 : "+cm);
		System.out.println("자기소개 : "+ intro);
		
		//스캐너 사용종료
		scan.close();
		
		
 	
	}
}
