package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

/*
 *  throws => 선언 => 예외회피
 *  => method뒤에 붙어있다 => 라이브러리에 주로 사용하는 문장
 *                        ------- 자동완성기 이용
 *  => throw이용할 수 있다, try~catch 이용
 *     예외처리의 중심은 try~catch
 *  ------------------------------------------------
 *  주의점
 *    void method() throws Exception, IOException, SQLException
 *    {
 *    }
 *    
 *    ==>
 *    void main() throws
 *    {
 *    }
 *    void main() 
 *    {
 *      try
 *      {
 *      } catch()
 *    }
 *    
 *    ==> 가장 큰 예외처리로도 가능하다
 *    void main() throws Exception
 *    {
 *    }
 *    void main() 
 *    {
 *      try
 *      {
 *      } catch(Exception ex)
 *    }
 *      
 */
public class MainClass1 {
	// 코딩이 많은 경우에 => throws (이미 만들어진 소스)
	// 시작 => try
	public void method() throws Exception,IOException,SQLException
	{
		int i=Integer.parseInt("10 ");
		System.out.println(i);
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		MainClass1 m=new MainClass1();
		//m.method();
		//System.out.println("프로그램 종료!"); // throws로 예외처리를 하는 경우 "프로그램 종료!"를 수행 안함
		
		try
		{
			m.method();
		}catch(Exception ex)
		{
			System.out.println("프로그램 종료!");
		}

	}

}
