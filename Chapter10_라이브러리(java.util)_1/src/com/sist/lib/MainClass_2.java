package com.sist.lib;

import java.text.DecimalFormat;

/*
 *    9장 ~ 12장
 *    라이브러리 : 클래스명 (사용도)
 *              => 기능(메소드)
 *                 ---------- 리턴형/매개변수
 *                 ---------- 신뢰성이 뛰어나다 => 에러가 없다
 *                 ---------- 표준화
 *                 ---------- 자바 80%
 *                 ---------- 20%는 조립
 *                 ---------- 사용위치
 *    java.lang *** Object, String, StringBuffer 
 *                  Wrapper, Math, System
 *                  
 *    java.util *** Random
 *                 --------- 예약일, 예약시간
 *                  Date / Calendar
 *                  StringTokenizer
 *                  List / Set / Map
 *                  Scanner
 *                  
 *    java.text *** SimpleDateFormat : 날짜변경
 *                  DecimalFormat : 숫자변경
 *    java.io
 *    java.net
 *    java.sql
 *    ---------------
 *    javax.xml
 *    javax.http.setvlet
 *    ---------------
 *    org.springframework
 *    org.mybatis
 *    org.jpa..
 *    ---------------
 *    com.업체명...
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int won=3456789;
		DecimalFormat d=new DecimalFormat("#,###,###");
		System.out.println(d.format(won));
		
		String name="홍길동";
		String sex="남자";
		int age=20;
		String addr="서울";
		String tel="010-1111-1111";
		
		// 오라클 전송
		String sql="INSERT INTO member VALUES('"+name+"','"+sex+"',"+age+",'"+addr+"','"+tel+"')";
		
	}

}
