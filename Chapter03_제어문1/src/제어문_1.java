/*
 * 변수 => 저장(데이터)
 * 연산자 => 결과값, 사용처, 형식
 * 제어문 => 흐름 (동작), 사용처, 형식
 * 1. 제어문의 종류
 *    = 조건문
 *      = 단일 조건문
 *        형식)
 *             if(조건문) => 조건문(비교연산자,논리연산자,부정연산자)
 *             {
 *                 조건문이 true일 경우에 수행할 문장
 *             }
 *             if(조건문1)
 *             {
 *                 조건문이 true일 경우에 수행할 문장
 *             }
 *             if(조건문2) 
 *             {
 *                 조건문이 true일 경우에 수행할 문장
 *             }
 *             if(조건문3) 
 *             {
 *                 조건문이 true일 경우에 수행할 문장
 *             }
 *             => 명령문을 제어한다(수행(x),수행)
 *             => 단점은 속도가 느리다
 *      = 선택 조건문
 *              if(조건문) => 조건문(비교연산자,논리연산자,부정연산자)
 *             {
 *                 조건문이 true일 경우에 수행할 문장
 *             }
 *             else
 *             {
 *                 조건문이 false일 경우에 수행할 문장
 *             }
 *      = 다중 조건문 : 한번만 수행할때 주로 사용
 *             => 계산기 : +,-,*,/
 *             if(조건문)
 *             {
 *                 조건문이 true일 경우에 수행할 문장 ==> 종료
 *                 false면 밑에 있는 조건문으로 이동
 *             }
 *             else if(조건문)
 *             {
 *                 조건문이 true일 경우에 수행할 문장 ==> 종료
 *                 false면 밑에 있는 조건문으로 이동
 *             }
 *             else if(조건문)
 *             {
 *                 조건문이 true일 경우에 수행할 문장 ==> 종료
 *                 false면 밑에 있는 조건문으로 이동
 *             }
 *             else
 *             {
 *                 /else문장은 생략가능
 *                 해당 조건이 없는 경우
 *             }
 *             
 *             
 *             예) score=80
 *                if(score>=90)
 *                  A
 *                if(score>=80)
 *                  B
 *                if(score>=70)
 *                  C
 *                if(score>=60)
 *                  D
 *                if(score<60)
 *                  F
 *                => 결과값 B C D
 *                --------------------틀린 문장 => 다중으로 바꿔줘야함 
 *                int a=15
 *                if(a%3==0)
 *                else if(a%5==0)
 *                else if(a%7==0)
 *                --------------------틀린 문장 => 단일로 바꿔줘야함
 *   = 선택문
 *   = 반복문
 *   = 반복제어문   
 *   
 *   // 단일 조건문 : 조건식 ( 비교연산자,논리연산자,부정연산자)
 *   // 1. 정수 1개를 입력받아서 짝수/홀수
 */

import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner는 클래스 => 키보드로 입력해서 저장 => 엔터 메모리에 저장
		/*
		 * 기능(메소드)
		 * 정수 : nextInt()
		 * 문자열 : next()
		 * 실수 : nextDouble()
		 * 논리 : nextBoolean()
		 * 문자는 X => System.in => 정수
		 * 웹/윈도우 (char(X))
		 * 
		 */
		// Scanner클래스 저장 => 클래스를 저장 (new)
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a=scan.nextInt();
		if(a%2==0) {
			System.out.println(a+"는 짝수다.");
		}
		if(a%2!=0) {
			System.out.println(a+"는 홀수다.");
		}
		
		
	}

}
