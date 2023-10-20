package com.sist.exception;
import java.sql.DriverManager;
/*
 *  다중 catch => 에러마다 따로 처리
 *  
 *  -----------------------------------------------
 *  ==> 에러코드 => 계층 구조 확인 => 크기 (순서가 존재)
 *  try
 *  {
 *      문자열 => 정수로 변환 에러
 *  } catch(Exception e) => 먼저 오면 모든 오류가 해당됨
 *  {
 *  } catch(NumerFormatException e)
 *  {
 *  } catch(NullPointException e)
 *  
 *  -----------------------------------------------
 *  ==> 
 *  try
 *  {
 *      문자열 => 정수로 변환 에러
 *  } catch(NumerFormatException e)
 *  {
 *  } catch(NullPointException e)
 *  } catch(Exception e)
 *  {
 *  
 *  
 *             Throwable
 *             ---------
 *                 |
 *       ----------------------
 *       |                    |
 *      Error              Exception
 *                            |
 *                     -----------------
 *                     |               | 
 *                 IOException       RuntimeException
 *                 SQLException        |
 *                                   NumberFormatException
 *                                   ...
 */
// 문자열을 입력 ==> 정수변환 ==> 배열에 첨부 ==> 배열에 있는 값 / 
import java.util.*;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		String s1=scan.next();
		System.out.print("정수입력:");
		String s2=scan.next();
		
		try
		{
			int[] arr=new int[2];
			arr[0]=Integer.parseInt(s1); //String타입의 숫자를 int타입으로 변환해주는 것
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
			//Connection conn=DriverManager.getConnection("");
		}/*catch(SQLException e){
			System.out.println();
		}*/catch(NumberFormatException e){
			System.out.println("정수 변환을 할 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열의 범위를 벗어났습니다.");
			System.out.println(e.getMessage());
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
		}catch(RuntimeException e)
		{
			System.out.println("실행시 에러");
		}catch(Exception e)
		{
			System.out.println("기타 에러");
		}catch(Throwable e)
		{
			System.out.println("에러와 예외처리 잡는다");
		}
		System.out.println("정상 종료");
		//RuntimeException,Throwable
		//SQLException 
		
		
	}

}
