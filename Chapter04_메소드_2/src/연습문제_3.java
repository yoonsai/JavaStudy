/*
 * 3. 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
      =>년도 입력 메소드
      =>윤년 처리 
      =>출력
 */
import java.util.Scanner;
public class 연습문제_3 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		return scan.nextInt();
	}
//	static void yearCheck(int a)
//	{
//		if(a%4==0 && a%100!=0 || a%400==0)
//		{
//			System.out.println(a+"년도는 윤년입니다.");
//		}
//		else
//			System.out.println(a+"년도는 윤년이 아닙니다.");
//	}
	static boolean yearCheck(int a)
	{
		boolean bCheck=false;
		if(a%4==0 && a%100!=0 || a%400==0)
			bCheck=true;
		return bCheck;
	}
	static void print()
	{
		int year=userInput(); 
		boolean bCheck=yearCheck(year);
		if(bCheck==true)
			System.out.println(year+"년도는 윤년입니다.");
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int year=userInput();
		//yearCheck(year);
		print();
	}

}
