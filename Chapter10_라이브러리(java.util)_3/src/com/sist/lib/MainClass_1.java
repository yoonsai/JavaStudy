package com.sist.lib;
/*
 *  자바에서 가장 많이 사용되는 패키지
 *  => java.lang(9) / java.util(10) / java.io(11) / java.sql(12)
 *     => 웹사이트 => HTML/CSS 오픈
 *     => Spring / React => 300
 *  java.lang : Object / String / Math / Wrapper
 *  java.util : Date / StringTokenizer / List (ArrayList), Map(HashMap)
 *  
 *  => Calendar => 기본달력 (예약)
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// System.in , System.out => 자바표준입출력
		// 키보드 입력값 받기, 화면출력
		System.out.print("년 월 일 입력(2023 10 25):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		// => 요일, 입력달의 마지막날짜 => Calendar에 설정
		// set() => get()
		/*
		 *  1. 년도 설정 set(Calendar.YEAR,year)
		 *  2. 월 설정 set(Calendar.MONTH,month-1)
		 *  3. 일 설정 set(Calebdar.DATE,1) => 1일자의 요일을 구해야되서
		 *  
		 *  => Calendar = 추상클래스 
		 *                ------- 미완성 (메소드 구현이 안된상태)
		 *                new를 이용해서 메모리 할당이 불가능하다
		 *  => new를 사용하지 않고 메모리 할당이 가능(추상클래스, 인터페이스)
		 *  
		 *  
		 */
		// Calendar 객체 생성
		Calendar cal=Calendar.getInstance();
		//요청한 달의 날짜 설정
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		//요일 구하기
		int week=cal.get(Calendar.DAY_OF_WEEK)-1; // 요일
		// 1~7  -1  ==> 0~6까지
		//해당 달의 마지막일을 가지고 온다
		int lastday=cal.getMaximum(Calendar.DATE); //마지막날
		
		// 출력
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월 ");
		
		for(String w:strWeek)
		{
			System.out.print(w+"\t");
			
		}
		//System.out.println("\n");
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1) // 처음에 요일까지 공백 출력
			{
				for(int j=0;j<week;j++)
				{
					System.out.println("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		
		
	}

}
