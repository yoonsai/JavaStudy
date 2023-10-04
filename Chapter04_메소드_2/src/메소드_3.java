/*
 * 암호화 시저스 => AES
 */
import java.util.Scanner;
public class 메소드_3 {
	// 매개변수 전송법
	// 입력값 => 리턴형 (O), 매개변수 (x)	
	static String userInput()
	{
		return 메소드_2.userInput();
		
	}
	// 암호화 => 리턴형(o), 매개변수(o 입력값)
	static String encode(String msg)
	{
		String result="";
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			result+=(char)(c+3);
		}
		return result;
	}
	// 복호화 => 리턴형(x) => void, 매개변수(o 암호화된 내용)
	static void decode(String eo) // en이라고 해도 main의 en과 다름
	{
		for(int i=0;i<eo.length();i++)
		{
			char c=eo.charAt(i);
			System.out.print((char)(c-3));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg=userInput();
		System.out.println(msg);
		String en=encode(msg);
		System.out.println(en);
		decode(en);
	}

}
