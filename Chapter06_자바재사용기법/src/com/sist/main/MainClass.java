package com.sist.main;
/*
 *   재사용 기법
 *    ------- 기존의 클래스를 사용 (라이브러리)
 *    => 라이브러리는 상속보다 포함
 *       --------
 *       | 상속을 할 수 없는 클래스 => 종단 클래스 
 *         종단 클래스 : public final class ClassName
 *         ---------------------------------------
 *          => java.lang (220page)
 *             String, Math, System, StringBuffer...
 *             => 변경할 수 없다 (완제품)
 *          예)
 *             public class MainClass extends String (x)
 *                                            ------- final class라 상속을 내릴 수 없음 => 포함관계로 해야함
 *    => 1. 상속 (is-a)
 *    => 2. 포함 (has-a)
 *    --------------------- 클래스를 비교할 수 있다
 *    class A
 *    {
 *       int a,b,c,d,e,f;
 *    }
 *    class B
 *    {  
 *       int a,b;
 *    }
 *    
 *    A > B (크기를 잴 수 없음) => 코드 오류 발생 => 상속관계일 경우에만 크기를 비교할 수 있음
 *    
 *    class A
 *    {
 *       int a,b,c,d,e,f;
 *    }
 *    class B extends A
 *    {  
 *       int a,b;
 *    }
 *    A > B => 메모리크기는 B가 크지만 실제 크기는 A가 더 큼(범위로 따짐) =>    예) long(4) < float(4)
 *                                                                 ---------------------
 *                                                                   1        1.000000 
 *                                                                 => 바이트크기가 아닌 수표현으로 크기비교
 *                 식물
 *                  |
 *                 나무
 *                  |
 *               -------
*                |     |
*              침엽수  활엽수
 *                          
 *   class A
 *   class B
 *   {
 *      A a;
 *   }
 *   => 포함 클래스(A<B)
 *   
 *   => 포함 : 변경없이 있는 그대로 사용
 *   => 상속 : 변경이 필요한 부분 => 오버라이딩 
 *   
 *   예) 
 *       윈도우 => 자동차 모양으로 윈도우를 변경해서 사용
 *               => 상속
 *               class Login extends JFrame
 *               {
 *               }
 *       윈도우 => 사각형으로 사용
 *               => 포함
 *               class Login
 *               {
 *                   JFrame fr=new JFrame();
 *                   //메소드에 선언 => 포함 클래스가 아니다
 *                   public void display()
 *                   {
 *                       JFrame fr=new JFrame(); // 포함클래스가 아니라 지역변수
 *                   }
 *               }
 *               
 *               Login log=new Login();
 *               log.fr.메소드();
 *               
 *               ==> 포함 클래스가 많다
 *               
 *               
 *               
 *                                                        
 *   
 *    
 */
public class MainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
