package com.sist.main;
/*
 * 
 *      194page
 *      상속의 목적, 형식
 * 
 *      199page
 *      논리적 포함관계
 * 
 *       동물           -------> 추상화(위로 올라갈수록) => 공통점이 많이 있다
 *        |
 *      포유류
 *        |
 *       인간
 *    ---------
 *    |       |
 *   남자      여자      --------> 구체화(아래로 내려갈수록)
 *   
 *   abstract => 추상적인 => 공통적인 내용을 모아둔 것이다
 *   게시판 
 *     = 글쓰기
 *     = 상세보기
 *     = 목록
 *     = 수정
 *     = 삭제
 *     = 검색
 *     
 *   ======> 답변형 게시판
 *   ======> 묻고 답하기
 *   ======> 갤러리게시판
 *   ======> 댓글형게시판
 *   ======> 추상/인터페이스 => 벤치마킹  
 *   
 *   
 *   201~202, 204, 206page
 *   = 단일상속 => 다중상속시 변수가 충돌될 수 있음
 *   = 오버라이딩 = 재정의 = 메소드 변경
 *     변수 오버라이딩 / 메소드 오버라이딩
 *   = 오버로딩 / 오버라이딩의 차이
 *     ---------------
 *     오버로딩 : 중복함수 정의 => 같은 이름으로 새로운 기능 추가 
 *     오버라이딩 : 기존 메소드 수정
 *     
 *   207page
 *   = 접근 지정어
 *     => private변수는 접근이 불가능
 *   
 *   211page
 *   = 생성자
 *     class A
 *     {
 *        public A()
 *        {
 *        }
 *     }
 *     class B extends A
 *     {
 *        public B()
 *        {
 *           super(); => new A() 호출
 *        }
 *     }
 *     
 *     B b=new B(); => new A() => new B()
 *     
 *     = 자신의 객체 ==> this
 *     = 자신의 생성자 ==> this() = 메소드
 *     = 상위클래스 객체 ==> super
 *     = 상위클래스의 생성자 호출 ==> super() = 메소드
 *     
 *     ==> 상속을 받은 클래스는 자신과 관련된 메소드, 변수, 상위클래스의 변수, 메소드 사용이 가능
 *     ==> 상속을 내린 클래스는 자신과 관련된 메소드, 변수만 사용이 가능
 *     
 *     217page => final => 변수는 상수형이다
 *                         메소드는 확장이 안된다 => java.lang
 *     
 *     221page ==> 227page
 *       객체의 형변환
 *       --------- 클래스의 크기가 있다
 *                 -----------
 *                 반드시 상속, 포함
 *                 class A
 *                 {
 *                    int a,b;
 *                 }
 *                 class B
 *                 {
 *                    int a;
 *                 }
 *                 --------------- 크기를 잴 수 없다
 *                 class A
 *                 class B extends A
 *                 ------------------ B < A
 *                 class A
 *                 { 
 *                    B b=new B(); // 포함클래스 => has-a
 *                 }
 *                 class B
 *                 ------------------ B < A
 *                 
 *                 => 묵시적 형변환 ==> 자동 형변환
 *                    class A
 *                    class B extends A
 *                    
 *                    A a=new B();
 *                    ============== B b=(B)a; ==> 강제 형변환
 *                    B b=new B();
 *                    A a=b; // 큰 클래스엔 작은 클래스를 받을 수 있음
 *                    
 *                    클래스도 데이터형이다
 *                    => 자바에서 지원하지 않는 데이터형이라 사용자 정의 데이터형
 *                  
 *     ***제어자
 *     접근지정어 : private, protected, public, default
 *     그외 : static, final, abstract, synchronized
 *           statc : 공통적인 => 공유
 *             ==> 클래스, 메소드, 변수 ==> 지역변수에서는 사용할 수 없다
 *           final : 마지막, 종단
 *             ==> 클래스, 메소드, 변수, 지역변수
 *             예) public final class A => 확장할 수 없는 클래스
 *                => 상속을 할 수 없는 클래스
 *                => String, Math,System...(java.lang)
 *                public final void display(){} => 오버라이딩이 불가능
 *                public final int a=10; => 값을 변경할 수 없다(상수)
 *           abstract : 추상적인(공통성), 미완성
 *             ==> 추상클래스, 인터페이스에만
 *           synchronized : 동기적인 => 네트워크, 쓰레드
 *             = 비동기(한번에 다) => 속도가 빠름, 충돌이 있을 수 있음 = Ajax
 *             = 동기적(순차적) => 속도가 느리고, 안전성
 *           
 *           조합
 *           -------------------------
 *           대상         조합
 *           클래스     public default final abstract
 *                    protected/private ==> 사용시 오류
 *           변수       private final, static
 *           메소드     public final static abstract
 *           지역변수
 */
public class MainClass3 {
	private int a;
	
	public MainClass3() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
