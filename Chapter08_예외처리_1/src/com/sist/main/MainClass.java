package com.sist.main;
/*
 * 
 * 
 *   *** 인터페이스는 같은 기능을 가지는 클래스를 만들어서 제어
 *               --------- 강제화
 *       interface I
 *       {
 *           void aaa();
 *           void bbb();
 *           void ccc();
 *           void default ddd(){}
 *           void eee();
 *           void kkk();
 *       }
 *       class A implements I
 *       {
 *           void aaa(){}
 *           void bbb(){}
 *           void ccc(){}
 *           void ddd(){}
 *       }
 *       class B implements I
 *       {
 *           void aaa(){}
 *           void bbb(){}
 *           void ccc(){}
 *           void eee(){}
 *       }
 *       class C implements I
 *       {
 *           void aaa(){}
 *           void bbb(){}
 *           void ccc(){}
 *           void kkk(){}
 *       }
 *       인터페이스로 관리할 수 없다 ==>
 *       I i=new A() => i로 A가 가지고 있는 메소드를 제어
 *         => 접근할 수 없는 메소드
 *         aaa(),bbb(),ccc() / ddd()접근할 수 없음
 *       I i=new B() => i로 B가 가지고 있는 메소드를 제어
 *       I i=new C() => i로 C가 가지고 있는 메소드를 제어
 *       
 *       ====> A,B,C가 유형이 같은 경우 한개의 이름으로 제어
 *             목적 => 서로 다른 클래스를 묶어서 관리
 *                    ----------- 관련
 *                 => 관리(소스 코딩이 간결)
 *                 => 인터페이스의 메소드
 *                 예) 
 *                              DriverManager
 *                                   |
 *                    ---------------------------------
 *                      |    |     |    |    |      |
 *                    오라클 MySQL MSSQL DB2 SQLITE 사이베이스...
 *                    VARCHAR2  VARCHAR
 *                    CLOB      TEXT
 *                    NUMBER    INT/DOUBLE
 *                    => SQL => ANSI(표준화)
 *                    
 *                    컬렉션
 *                    Collection
 *                        |
 *                --------------------
 *                |
 *              List
 *                |
 *            ----------------------------------------
 *            |         |         |         |      | 
 *         ArrayList  Vector  LinkedList  stack  Queue
 *   1) 인터페이스 vs 추상클래스
 *   ---------------------------------------------------------------
 *                  인터페이스                            추상클래스
 *   ---------------------------------------------------------------
 *   구현메소드      선언된 메소드                      선언된 메소드/ 구현 메소드
 *            public void display();
 *            1. 
 *             구현된 메소드 사용
 *             = default 
 *               (접근지정어가 아니다)
 *            public default static display()
 *             = static
 *              => 접근시에 반드시 인터페이스명으로만 
 *                 접근이 가능
 *   ----------------------------------------------------------------
 *   인스턴스 변수      사용할 수 없다                          사용이 가능
 *                 => 공용                            private 변수 가능
 *                 => 상수형변수만 사용가능
 *                 => public (only) 
 *                 => openjdk
 *                    jdk => 1.9(private가 가능)
 *                    => C/C++ => exe
 *                    => 오라클에서 필요한 것(윈도우)
 *   ----------------------------------------------------------------
 *   생성자          생성자가 없다                         생성자가 있다
 *   ----------------------------------------------------------------
 *   접근범위         모든 내용을 공개                      한정한다 (모든 접근자)
 *                 => 메소드,변수
 *   ----------------------------------------------------------------
 *   상속            다중상속                             단일상속
 *                  implements                        extends
 *                  interface => interface
 *                            |
 *                           extends
 *                  interface => class
 *                            | 
 *                           implements
 *                  => 사용자 정의, 라이브러리
 *                     => 단일 상속이 중심이다
 *                  => 윈도우 : 여러개 받는 경우가 있다           
 *   -----------------------------------------------------------------
 *   ** 공통점 : new를 이용해서 메모리 할당이 불가능하다
 *             => 상속을 내려서 상속받은 클래스가 구현해서 사용
 *   ** 목적 : 서로 다른 클래스를 연결해서 사용이 가능
 *            관련된 클래스를 모아서 사용할 때 주로 사용
 *   ** 실생활
 *      => 110v => 220v => 어뎁터
 *      => 컴퓨터 : 마우스, 키보드
 *      
 *      MS => 인터페이스 전송
 *  -------------------------------------------------------------------
 *  인터페이스 구성요소
 *  public interface interface명
 *  {
 *        ---------------------
 *        상수 : 반드시 초기값 설정 (명시적으로 설정)
 *        int a=10;
 *              ---
 *        (public static final) int a=10;
 *         => 생략이 되면 접근 지정어 / 제어어를 추가
 *        ---------------------
 *        구현이 안된 메소드 : 프로그램에 맞게 구현
 *        => 개발자가 알아서 구현
 *        (public abstract) void display();
 *        ---------------------
 *        구현된 메소드
 *        => 공통으로 사용되는 부분
 *        => 필요시마다 변경해서 사용
 *        (public) default void method(){}
 *                 -------- 접근지정어가 아니라 구현된 메소드
 *        (public) static void method(){}
 *        ==> 인터페이스명.메소드명()
 *            ----------------
 *        ----------------------
 *  }
 *  *** 만약에 기능 추가가 있는 경우에는 default를 이용한다
 *                              ------------ 
 *   
 */
import java.util.*;
interface I
{
	static void display() // public생략가능 컴파일러에 의해 자동추가
	{
		System.out.println("I,,,");
	}
}
class A
{
	public static void aaa()
	{
		System.out.println("A:aaa(),,,");
	}
}
class B extends A
{
	public void bbb()
	{
		aaa();
		A.aaa(); // static메소드라서 가능
		I.display(); // static메소드라서 가능
	}
}
class C implements I // => clas(단일상속), interface(다중상속)
{
	public void ccc()
	{
		//display(); => interface 메소드가 static이면 인터페이스명.메소드명()으로만 접근가능
		I.display();
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new LinkedList();
		list.add("aaa");
		list.add("bbb");
	}

}
