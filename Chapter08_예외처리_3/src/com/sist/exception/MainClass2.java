package com.sist.exception;
/*
 *   throws => 라이브러리에서 제공 => 결정(try~catch)
 *   => 복잡한 소스가 있는 경우 => 소스추가를 할 때 : throws를 가끔 사용
 *   => 예외처리 클래스
 *      Throwable / Exception
 *      --------- 예외의 최상위 클래스
 *      => 자동완성기
 *   => 예외처리 : 수정이 가능한 에러
 *      => 네트워크 : IP,Web Site
 *      => IO : 파일 경로명 / 파일명
 *      => SQL : 오라클문장 (SELECT, DELETE, UPDATE, INSERT)
 *         => DML(데이터조작)
 *   => throw
 *   
 */
public class MainClass2 {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try
		{
			int i=10;
			if(i%2==0)
			{
				throw new Exception(i+"는 홀수가 아닙니다.");
				// 밑에 소스 코딩을 할 수 없다
				// throw => 사용자 정의 예외처리
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
