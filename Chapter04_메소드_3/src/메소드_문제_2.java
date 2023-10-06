// 정수 한개 입력 => 3의 배수 여부 확인

import java.util.Scanner;

public class 메소드_문제_2 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		return scan.nextInt();
	}
	static String check(int num)
	{
		String res=num+"은 3의 배수가 아닙니다.";
		if(num%3==0)
			res=num+"은 3의 배수입니다.";
		return res;
	}
	static void print(String a)
	{
		System.out.println(a);
	}
	static void process()
	{
		int num=userInput();
		String a=check(num);
		print(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
