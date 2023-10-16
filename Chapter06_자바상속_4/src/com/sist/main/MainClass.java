package com.sist.main;
/*
 *  1. 상속
 *     => 멤버변수, 메소드(기능=> 상속) => 상속은 주로 변수가 아니라 기능을 변경해서 사용하냐 아니냐 (라이브러리는 다 메소드, 변수 없음)
 *        -----
 *          | 접근지정어(private, default(패키지가 다른 경우 사용할 수 없음))
 *     => 메소드를 재사용하거나 변경해서 사용하는 것 (기능)
 *     => 객체지향 관련 => 메소드
 *     => 라이브러리는 변수가 없다 => 메소드
 *     => 형식
 *        단일 상속만 가능
 *        class SubClass extends SuperClass
 *                      ---------
 *                      기존의 클래스를 확장(수정, 추가)
 *        {
 *            SuperClass 가 가지고 있는 모든 메소드 사용이 가능
 *            => 변경해서 사용 가능(오버라이딩)
 *        }
 *     => 호출
 *        class A
 *        class B extends A
 *             ---        ---
 *             sub         super => 크기 "super > sub" => 상속을 내리는 클래스가 상속받은 클래스보다 크다
 *        *** 모든 클래스의 상위클래스는 Object다 (최상위클래스)
 *            => 자바에서 지원하는 라이브러리의 메소드 => Object를 상속
 *        
 *        => 확장 (클래스 사용시에는 확장된 클래스를 사용한다) => A를 사용할거면 확장할 필요가 없음 => 상속받은 B를 사용하는 것이 기본 
 *        // A a=new A(); => 활용
 *        B b=new B(); //기본
 *        A a=new B(); //특별한 경우에 사용
 *                       => A로부터 상속을 받은 클래스들를 묶어서 사용할때 (하나의 객체로)
 *                       => 스프링
 *        ------------
 *        네이버카페 => 게시판이 많음  
 *        *** 상위클래스는 하위클래스에 있는 변수/메소드를 접근할 수 없음
 *        B b=new B();
 *        A a=new B();
 *        
 *        class A   ===> a,c가 접근가능한 범위
 *        {
 *           int a,b;
 *           void aaa(){
 *           }
 *           void bbb(){
 *           }
 *        }
 *        class B extends A ====> b가 접근 가능한 범위
 *        {
 *           int c,d;
 *           ------------
 *           int a,b;
 *           void aaa(){} => 변경시 작성 => 오버라이딩 => 변경사항 없을 시 생략가능 
 *           void bbb(){} => 변경시 작성 => 오버라이딩 => 변경사항 없을 시 생략가능
 *           void ccc(){}
 *           ------------ 상속받은 A의 변수와 메소드가 들어와있음 => 메모리 상에만 배치되어있음 => 반복코딩을 제거
 *        }
 *        A a=new A();
 *        B b=new B();
 *        A c=new B(); => A가 가지고 있는 변수 + B에서 오버라이딩된 메소드 호출 => ccc는 접근 불가능
 *        
 *        클래스 객체명=new ~();
 *        --------- => 객체는 클래스에 있는 변수, 메소드만 사용하겠다 
 *                  => A a => a객체는 A클래스에 있는 변수, 메소드만 사용하겠다 (+하위클래스에서 오버라이딩된 메소드)
 *        
 *     
 */
class A
{
	int a,b;
	void aaa() {System.out.println("A:aaa() Call......");}
	void bbb() {System.out.println("A:bbb() Call......");}
}
class B extends A
{
	int a=100,b=200,c=300,d=400;
	void aaa() {System.out.println("B:aaa() Call......");}
	void bbb() {System.out.println("B:bbb() Call......");}
	void ccc() {System.out.println("C:ccc() Call......");}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);
		aa.aaa();
		aa.bbb();
		
		// 가장 많이 사용 70%
		System.out.println("====================");
		B bb=new B();
		System.out.println("bb.a="+bb.a);
		System.out.println("bb.b="+bb.b);
		System.out.println("bb.c="+bb.c);
		System.out.println("bb.d="+bb.d);
		bb.aaa();
		bb.bbb();
		bb.ccc();
		
		// 인터페이스 (클래스 여러개를 묶어서 사용) 30%
		System.out.println("====================");
		A ab=new B();
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);
		ab.aaa();
		ab.bbb();
		
		
	}

}
