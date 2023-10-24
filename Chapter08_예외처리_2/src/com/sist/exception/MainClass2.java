package com.sist.exception;
/*
 *   묶는 기술 => 객체지향(누가 잘 묶어서 사용) => 지사용
 *   
 *   1. 변수 묶는 방법
 *      = 배열 => 같은 데이터형 (메모리 크기가 동일 => 연속적 메모리 구조)
 *              => 인덱스 이용
 *      = 클래스 => 다른 데이터형 (메모리 주소(.))
 *   2. 연산자 / 제어문
 *      = 메소드 (명령문을 묶어서 사용)
 *   ------------------------- 한개의 기능 => 제품 (컴포넌트)
 *   ==> 조립 : 한개의 프로그램
 *   ==> 게시판 , 회원 , 맛집 , 채팅 , 예약 , 추천 , 결제
 *       ---------------------------------------
 *       영화 : 게시판 , 회원 , 예약 , 추천 , 결제
 *                         --------------- 수정
 *       ---------------------------------------------
 *       1. 가독성, 2.최적화 , 3.견고성
 *       ------------------------
 *       1. 테스트 : 견고한 프로그램 => 사전에 에러를 방지하는 프로그램
 *                              ------
 *                              => 예외처리
 *          견고 => 프로그램서 실수 , 사용자 입력이  잘못 된 경우
 *          ---------------------------------------
 *       2. 예외처리
 *          => 정의 : 사전에 에러를 방지
 *          => 목적 ; 비정상 종료를 방지하고 정상 종료를 할 수 있게 만든다
 *          ---
 *          ---
 *          ---
 *          --- 에러 => 건너뛴다 => catch => 에러수정을 위한 확인
 *                                       에러를 복구
 *          ---
 *          ---
 *          ---                        
 *          
 *          => 예외처리
 *             1) 에러 복구 => try-catch
 *             2) 에러 무시 => 에러 회피 => throws
 *             3) 견고한 프로그램
 *                ----------- 에러 발생 (임의 발생) => throw
 *                => 매직 =>
 *             4) 프로그램은 항상 .....
 *                모든 것을 지원하지 않는다
 *                => 사용자 정의
 *                => 예약 , 추천 , 결제 ....
 *                => 사용자 정의 데이터형 Music,Movie ...
 *                   => 기존의 데이터형을 모아서 새로운 데이터형을 제작
 *                      => class
 *                => 사용자 정의 메소드
 *                => 예외처리가 없는 경우 => 사용자 정의 예외처리
 *                ------------------------------------
 *                결제모듈 ==> 보안처리 ===> 데이터베이스
 *                ------------------------------
 *                  | 솔루션 ==> 개발 / 영업 => 운영
 *                  | 50% 내근 , 50% 외근
 *                    -----------------
 *                    인원 : 20명(솔루션)
 *                          50명(SI,신규), 150명
 *                          
 *          => 예외복구
 *             형식)
 *                 try
 *                 {
 *                    => 정상적으로 수행할 수 있는 명령문
 *                    => 평상시 코딩
 *                    문장1
 *                    문장2
 *                    ------------
 *                    문장3 ==> 에러발생 (수행하지 않고 catch로 넘어감)
 *                    문장4
 *                    문장5
 *                    ------------ 무시
 *                 }catch(예외처리 클래스)
 *                 {
 *                
 *                 } ==> 여러개 사용이 가능
 *                 finally ==> 생략(필요한 경우에만)
 *                 {
 *                    => try,catch를 수행하던 관계없이 무조건 수행하는 문장
 *                    => 1) 서버 닫기
 *                       2) 오라클 닫기
 *                       3) 파일 닫기
 *                 }                
 *                 --------------------------------------------------------------------------------------
 *                 실행
 *                 문장1
 *                 문장2 => 에러발생시 (비정상 종료됨)
 *                 try
 *                 {
 *                    문장3
 *                    문장4
 *                    문장5
 *                 }catch(Exception e) 
 *                 {
 *                    문장6
 *                 }
 *                 finally => 에러가 나든 안나든 무조건 수행(정상종료 시)
 *                 {
 *                    문장7
 *                 }
 *                 문장8
 *                 
 *                 1. 에러가 없는 경우 = 1->2->3->4->5->7->8 = try가 정상이면 catch는 수행하지 않는다 (if~else랑 동일)
 *                 2. 문장4에서 에러가 발생한 경우 = 1->2->3->6->7->8
 *                 
 *                 --------------------------------------------------------------------------------------
 *                 try
 *                 {
 *                    문장1
 *                    문장2 => C 에러 발생
 *                    문장3
 *                       int[] arr=new int[2]
 *                       arr[2]=Interger.parseInt(" 10"); => 정수변환 안되는 에러, 배열 인덱스값에 대한 에러
 *                      (2)------       (1) ----------------- 정수변환에서 먼저 오류 => 대입은 수행하지 않음 => 에러 1개
 *                                                 
 *                 }catch(A)
 *                 {
 *                    A에 대한 에러 복구
 *                    
 *                 }catch(A)   
 *                 {
 *                    B에 대한 에러 복구
 *                 }catch(A)
 *                 {
 *                    C에 대한 에러 복구 => 수행
 *                 }finally
 *                 {  
 *                    닫기 => 수행
 *                 } 
 *                 
 *                 catch절은 한 번만 수행
 */
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			System.out.print(sb.toString());
		}catch(IOException e)
		{
			//오류발생 ==> 에러확인
			/*
			 * getMassage() ==> 에러메시지만 보여줌 => null
			 * printStackTrace() => 권장
			 *      ------------
			 *          |
			 *        실행 => 순서 => 멈춘다 ==> 에러 위치 확인
			 */
			e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			}catch(IOException e) {
				
			}
		}

	}

}
