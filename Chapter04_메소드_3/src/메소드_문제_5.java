/*
 * 년 월 일을 입력받아서 요일을 출력
 */

import java.util.Scanner;

public class 메소드_문제_5 {
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	static int total(int year, int month, int day)
	{
		int sum=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			lastday[1]=29;
		}
		else
			lastday[1]=28;
		for(int i=0;i<month-1;i++)
		{
			sum+=lastday[i];
		}
		sum+=day;
		return sum;
	}
	static char week(int total)
	{
		int week=total%7;
		char[] strWeek= {'일','월','화','수','목','금','토'};
		return strWeek[week];
		
	}
	static void print(int year, int month, int day, char week)
	{
		System.out.printf("%d년 %d월 %d일은 %c요일 입니다.",year,month,day,week);
	}
	static void process()
	{
		int year=userInput("년도");
		int month=userInput("월");
		int day=userInput("일");
		int total=total(year, month, day);
		char week=week(total);
		print(year, month, day, week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
