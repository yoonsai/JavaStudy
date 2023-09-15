/*
 * 알파벳을 입력받아서 대문자냐 소문자냐 숫자냐 다른문자냐
 */

import java.util.Scanner;
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		char a=scan.next().charAt(0);
		
		if(a>='A' && a<='Z')
			System.out.println(a+"는 알파벳 대문자입니다.");
		if(a>='a' && a<='z')
			System.out.println(a+"는 알파벳 소문자입니다.  ");
		if(a>='0' && a<='9')
			System.out.println(a+"는 숫자입니다.");
		if(!(a>='A' && a<='Z' || a>='a' && a<='z' || a>='0' && a<='9'))
			System.out.println(a+"는 대문자, 소문자, 숫자가 아닙니다.");
	}

}
