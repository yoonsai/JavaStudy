/*
 *  => 알파벳을 입력받아서 => 대문자인지 소문자, 숫자인지 기타인지 확인 => 출력
 */
import java.util.Scanner;
public class 메소드_문제_4 {
	static char userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		return scan.next().charAt(0);
	}
	static String check(char a)
	{
		String s="";
		if(a>='A' && a<='Z')
			s=a+"는 대문자 입니다.";
		else if(a>='a' && a<='z')
			s=a+"는 소문자 입니다.";
		else if(a>='0' && a<='9')
			s=a+"는 숫자입니다.";
		else
			s=a+"는 기타 문자입니다.";
		return s;
	}
	static void print(String a)
	{
		System.out.println(a);
	}
	static void process()
	{
		char c=userInput();
		String check=check(c);
		print(check);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
