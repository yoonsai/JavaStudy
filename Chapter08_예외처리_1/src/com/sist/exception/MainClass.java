package com.sist.exception;
/*
 *   8장 => 예외처리
 *        --------- 에러 => 사전에 에러를 방지하는 목적
 *                     => 비정상 종료를 방지하고 정상상태를 유지한다
 *                     => 예외처리 => 에러 발생시 에러를 건너뛰는 목적
 *   에러발생 요인
 *   ------
 *   = 사용자 (잘못된 입력) => 유효성 검사 => javaScript
 *                     => if
 *   = 개발자 (실수) => 배열, 인덱스, 정수변환...,형변환
 *   ------------------
 *   1) 사전에 차단 (if) => 예외처리
 *   2) 예외처리
 *     --------
 *        = 에러(Error) : 소스상에서 수정이 불가능한 에러
 *                       메모리 저장공간이 부족하다 => 못잡는 에러
 *        = 예외(Exception) : 소스상에서 수정이 가능한 에러
 *          예) 파일경로명, IP, 0으로 나눈다
 *             배열 인덱스가 틀리다
 *             int[] arr=new int[2];
 *             arr[2]=10; // 0,1
 *   ==> 예외처리 방법
 *       ---------
 *       = 예외복구 => try~catch
 *       = 에외회피 => throws
 *       = 임의발생 => throw
 *       = 지원하지 않는 발생
 *   ==> 예외의 종류 (상속도)
 *       - 계층구조를 알아야함
 *         Object : 모든 클래스의 상위 클래스
 *           |
 *         Throwable : 예외의 최상위 클래스
 *           |
 *    -----------------------------------
 *       |                            |
 *     Error                        Exception
 *     -----                        ---------
 *     처리가 불가능                    처리가 가능 (소스변경)
 *     메모리 부족                     => 0으로 나누는 경우
 *     윈도우 충돌                     => 배열 인덱스 범위를 벗어나는 경우
 *     톰캣이 자동이 안됨                => 형변환, 파일명..IP
 *     오라클에 연결이 안됨 
 *     ---------------
 *     
 *             Exception : 예외처리의 최상위 클래스 
 *             ----------
 *                  |
 *     ----------------------------------------------------------
 *     |                                                 |
 *    CheckException 클래스는 아님)                    UnCheckException
 *    컴파일시에 예외처리를 했는지 확인                      => 확인이 없기 때문에 필요시
 *    => 라이브러리 중에 반드시 예외처리를 하는 것
 *    = java.io
 *       => 파일명이 틀린경우
 *          FileNOtFoundException
 *          IOException
 *    = java.net
 *       => URL주소, IP가 틀린경우
 *       => MalformedURLException
 *    = java.sql
 *       => 오라클 URL : SQLException
 *         
 *     
 *     => ClassNotFoundException
 *     
 *     
 *     
 *     UnCheckException
 *     ----------------
 *     RuntimeException => 예외를 확인할 수 없다
 *     -----------------
 *     | 실행시 에러
 *       예) 1~100사이의 정수 입력...
 *       NumberFormatException : 문자열로 받아서 정수로 변경시 오류
 *            => 웹에서 가장 많이 발생
 *            => http://localhost/main/main.jsp?page=10
 *            => 웹에서는 데이터전송을 URL을 이용해서 전송
 *               자바는 메소드의 매개변수를 이용해서 전송
 *       
 *       ArrayIndexOfOutBoundsException : 배열의 인덱스범위를 벗어난 경우
 *       
 *       NullPointException : null인 클래스를 사용한 경우
 *                           ------- 주소가 없는 ㄱㅇ우
 *       
 *       ArithmeticException : 0으로 나누는 경우
 *       ==> 게ㅓ
 */
import javax.swing.*;
class A
{
	public void aaa()
	{
		System.out.println("A:aaa()");
	}
}
class B extends A
{
	public void aaa()
	{
		System.out.println("B:aaa()");
	}
}
public class MainClass extends JFrame{
	JButton b1,b2;
	public MainClass() {
		b1=new JButton("로그인");
		b1=new JButton("취소");
		add("North",b2);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a=new A();
		//B b=(B)a; //ClassCastException 
		//A a=new B();
		//B b=(B)a;
		
		//Thread.sleep(100);
		//System.out.println(Integer.parseInt(" 10")); //NumberFormatException
//		int[] arr=new int[2];
//		arr[2]=100;
//		System.out.println(arr[2]); //ArrayIndexOutOfBoundsException
	}

}
