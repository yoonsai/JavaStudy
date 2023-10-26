package com.sist.lib;
/*
 *  332page => Date / Calendar
 *  
 *  날짜 관련(시간 포함)
 *  ----------------
 *  Date => 기능이 없다 (단지 날짜를 저장할 목적)
 *                       --------- 오라클 호환
 *  Calendar : Date에 없는 기능을 보안
 *             => 요일, 마지막날 읽기
 *             => 달력 (예약)
 *             => 월, 요일 => 1부터
 *               ----- 0번부터
 *               
 *               
 *  => Date : 일반 클래스 
 *            Date date=new Date();
 *     Calendar : 추상클래스
 *            Calendar cal=Calendar.getInstance();
 *            => getInstance(), newInstance();
 *              -----------------------------------
 *              => singleton (싱글턴) : 메모리 공간을 하나만 사용
 */
import java.util.*;
class A
{
	static A a;
	public static A newInstance()
	{
		if(a==null)
		{
			a=new A();
		}
		return a;
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A aa=new A();
//		System.out.println("aa:"+aa);
//		A bb=new A();
//		System.out.println("bb:"+bb);
		
//		A aa=A.newInstance();
//		A bb=A.newInstance();
//		A cc=A.newInstance();
//		
//		System.out.println(aa);
//		System.out.println(bb);
//		System.out.println(cc);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년 월 일 입력(2023 10 24):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt(); // 공백대로 한번에 받을 수 있음
		
		Calendar cal=Calendar.getInstance();
		//날짜 지정
		cal.set(Calendar.YEAR, day);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println(year+"연도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일 입니다.");
		System.out.println(month+"월의 마지막날은 "+lastday+"입니다.");
		
				
		
	}

}
