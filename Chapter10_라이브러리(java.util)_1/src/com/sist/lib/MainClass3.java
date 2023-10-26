package com.sist.lib;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 *  Random => 임의의 수를 추출할때 사용
 *            -------- 자바 JVM에서
 *            => Math.random() => double
 *  => int nextInt(int bound)
 *                -----------
 *                 100 => 0~99 + 1
 *         nextInt(100)+1
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A~Z 알파벳을 임의로 10개
		Random r=new Random();
//		for(int i=1;i<=10;i++)
//		{
//			char c=(char)(r.nextInt(26)+65); // 0~25 => 65~90
//			System.out.print(c+" ");
//		}
		
//		for(int i=1;i<=6;i++)
//		{
//			int lotto=r.nextInt(45)+1; // 0~44 + 1 => 1~45
//			System.out.print(lotto+" ");
//		}
		
//		int day=r.nextInt(7)+7; // 0~6 + 7 => 7~13까지
//		for(int i=1;i<=day;i++)
//		{
//			int rr=r.nextInt(31)+1;
//			if(rr>=24) // 오늘 날짜보다 크거나 같은거
//			{
//				System.out.print(rr+" "); // 예약가능한날짜
//			}
//			
//		}
		
		int day=r.nextInt(7)+7; // 0~6 + 7 => 7~13까지
		Set set=new HashSet();
		for(int i=1;i<=day;i++)
		{
			int rr=r.nextInt(31)+1;
			System.out.print(rr+" "); // 예약가능한날짜
			set.add(rr);
			
		}
		
		System.out.println("\n=======최종결과=======");
		for(Object o:set)
		{
			System.out.println(o+" ");
		}
	}

}
