/*
 *  달력 만들기
 *  -------
 *  절차적 언어 ===== 구조적 프로그램 ===== 객체지향 프로그램
 *                 =>메소드
 *                 =>지역변수
 *                   매개변수 전송, 리턴형
 */
import java.util.Scanner;
public class 메소드_4 {
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	static int week(int year, int month, int day)
	{
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			lastday[1]=29;
		}
		else 
			lastday[1]=28;
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		total++;
		
		int week=total%7;
		System.out.printf("%d년 %d월\n",year,month);
		return week;
		
	}
	static void print(int year,int month,int week)
	{
		char[] strWeek= {'일','월','화','수','목','금','토'};
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			lastday[1]=29;
		}
		else 
			lastday[1]=28;
		for(char i:strWeek)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				System.out.println();
				week=0;
			}
		}
	}
	static void process()
	{
		int year=userInput("년도");
		int month=userInput("월");
		int day=userInput("일");
		int week=week(year, month, day);
		print(year,month,week);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
