/*
 * 알파벳을 입력 받아서 => 대문자, 소문자인지 확인
 * 1개, 2개
 */
import java.util.Scanner;
public class 메소드_6 {
	static char alphaInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳을 입력:");
		return scan.next().charAt(0);
		// 자바 단점 => char를 받아서 처리하는 기능이 없다
		// => string으로 받아서 char를 분리
	}
	static void result(char c)
	{
		// 결과값을 자체 처리 => void
		if(c>='A' && c<='Z')
			System.out.println(c+"는 대문자 입니다.");
		else if(c>='a' && c<='z')
			System.out.println(c+"는 소문자 입니다.");
		else
			System.out.println(c+"는 알파벳이 아닙니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a=alphaInput();
		result(a);
	}

}
