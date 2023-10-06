/*
 * 정수 한개를 입력받아서 => 짝수/홀수 확인 => 출력
 */
import java.util.Scanner;
public class 메소드_문제_1 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		return scan.nextInt();
	}
	static String check(int num)
	{
		String a=num+"은 홀수입니다.";
		if(num%2==0)
		{ 
			a=num+"은 짝수입니다.";
		}
		return a;
	}
	static void print(String a)
	{
		System.out.println(a);
	}
	static void process()
	{
		int num=userInput();
		String check=check(num);
		print(check);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
