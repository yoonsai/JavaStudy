package com.sist.exception;
/*
 *  예외처리의 기본
 *  (267page)
 *  
 *  가장 많이 사용된다 => 예외복구
 *  try~catch~finally
 *  1) 형식
 *     try{
 *        
 *        에러없이 실행이 가능한 소스
 *        //main ==> 정상수행하는 문장 => 개발자 실수, 사용자의 입력
 *        
 *     } catch(Exception ex){
 *         
 *         예외복구 ==> 다시 입력 요청 => 다음문장 실행
 *         
 *     } ==> catch는 예상되는 예외를 따라 처리 => 여러개 사용이 가능
 *     
 *  2) 동작 흐름
 *     문장1
 *     문장2
 *     try ==> 전체/부분 => 에러가 발생할 수 있는 부분
 *     {
 *        문장3
 *        문장4
 *        문장5
 *     
 *     }catch(Exception e)
 *     {
 *        문장6
 *     }
 *     문장7
 *     문장8
 *     
 *     => 문장1 => 문장 2 => 문장3 => 문장4 => 문장5 
 *     => 문장7 => 문장8
 *  ------------------------------------------------
 *     문장1
 *     문장2
 *     try ==> 전체/부분 => 에러가 발생할 수 있는 부분
 *     {
 *        문장3
 *        문장4 => int a=10/0 => 에러발생 => catch로 이동
 *        문장5
 *     
 *     }catch(Exception e)
 *     {
 *        문장6
 *     }
 *     문장7
 *     문장8
 *     
 *     => 문장1 => 문장 2 => 문장3 => 문장6 => 문장7 => 문장8
 *  -------------------------------------------------------
 *     문장1
 *     문장2 => 에러발생
 *     try ==> 전체/부분 => 에러가 발생할 수 있는 부분
 *     {
 *        문장3
 *        문장4 
 *        문장5
 *          ------------------------
 *           int a=10/0;
 *           system.out.println(a); 
 *          ------------------------
 *     
 *     }catch(Exception e)
 *     {
 *        문장6 ==> 복구 ==> 문장3번으로 이동
 *     }
 *     문장7
 *     문장8
 *     
 *     => 문장1 => 종료 ==> 비정상종료
 *     
 *     try ==> 정상으로 수행하는 문장
 *             => 개발자 실수, 사용자 입력값 : 에러발생 
 *                                      -----
 *                                        | 종료 => 종료방지를 위해서 catch
 *                                       
 */
class E
{
	int a=10;
	
	E(int a){
		a=1;
	}
	
}
class F extends E
{
	int b;
	
	F(int b){
		super(b);
		b=30;
		
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f=new F(100);
		System.out.println(f.a);
		
		//System.out.println("문장1");
		//System.out.println("문장2");
		try
		{
			System.out.println(10/0);
			System.out.println("문장2");
			System.out.println("문장3");
			System.out.println("문장4");
			System.out.println("문장5");
			
		}catch(Exception e)
		{
			System.out.println("문장6");
		}
		System.out.println("문장7");
		System.out.println("문장8==정상종료");
	}

}
