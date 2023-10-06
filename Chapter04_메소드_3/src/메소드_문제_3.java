/*
 * 국어,영어,수학 점수를 입력 => 총점 , 평균 출력
 */

import java.util.Scanner;

public class 메소드_문제_3 {
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"점수 입력:");
		return scan.nextInt();
	}
	static int sum(int a,int b, int c)
	{
		return a+b+c;
	}
	static double avg(int a)
	{
		return a/3.0;
	}
	static char grade(double avg)
	{
		char c='A';
		if(avg>=90)
		{
			c='A';
		}
		else if(avg>=80)
		{
			c='B';
		}
		else if(avg>=70)
		{
			c='C';
		}
		else if(avg>=80)
		{
			c='D';
		}
		else
			c='F';
		return c;
	}
	static void print(int sum, double avg,char grade)
	{
		System.out.println("합계:"+sum);
		System.out.printf("평균:%.2f",avg);
		System.out.println("\n학점:"+grade);
	}
	static void process()
	{
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int sum=sum(kor,eng,math);
		double avg=avg(sum);
		char grade=grade(avg);
		print(sum,avg,grade);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
