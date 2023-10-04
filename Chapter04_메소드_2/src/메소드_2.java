/*
 *   1. 문자열을 입력받아서 대문자 => 소문자 / 소문자를 대문자로
 */
import java.util.Scanner;
public class 메소드_2 {
	static String userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
		return scan.nextLine();
		// next() : 엔터시에 메모리 저장 => 문자열 인식 (공백)
		// => aaa aaa aaa aaa => next에 입력시 공백 직전인 aaa만 가져옴
		// nextLine() : 엔터시에 메모리에 저장
		// => aaa aaa aaa aaa => nextLine에 입력시 aaa aaa aaa aaa 가져옴
	}
	static void alphaChange(String in)
	{
		String result="";
		for(int i=0;i<in.length();i++)
		{
			char c=in.charAt(i);
			if(c>='A' && c<='Z')
			{
				result+=(char)(c+32);
			}
			else if(c>='a' && c<='z')
			{
				result+=(char)(c-32);
			}
			else
			{
				result+=c; // 있는 그대로 출력 (공백인 경우)
			}
		}
		System.out.println("결과값:"+result);
		
	}
	//반대로 출력
	static String alphaReverse(String msg)
	{
		String result="";
		for(int i=msg.length()-1;i>=0;i--)
		{
			char c=msg.charAt(i);
			result+=c;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 입력받는 기능 : 리턴형 => String, 매개변수(x)
		// 대문자 => 소문자, 소문자 => 대문자로 변경
		// 리턴형 / 매개변수(String)
		// => 결과값을 받아서 출력, 메소드 안에서 처리
		// 반대로 출력
		// => 결과값을 받아서 출력, 메소드 안에서 처리
		String i=userInput();
		alphaChange(i);
		String a=alphaReverse(i);
		System.out.println(a);
	}

}
