package com.sist.main;
class A
{
	int a=10,b=20;
	void aaa()
	{
		System.out.println("A:aaa() Call...");
	}
}
class B extends A
{
	int a=100,b=200;
	int c,d;
	// 오버라이딩=>상속받은 메소드 변경
	void aaa()
	{
		System.out.println("B:aaa() Call...");
	}
	void bbb()
	{
		System.out.println("B:bbb() Call...");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println(a.a);
		System.out.println(a.b);
		//out.println(b.a);
		//System.out.println(b.b); => 상위클래스는 하위클래스 변수 사용 불가
		B b=new B();
		b.aaa();
		b.bbb();
		/*
		 * A > B 클래스의 크기 => 범위 (상속을 내린 클래스가 크다)
		 * A b=new B();
		 * B a=new A(); => 오류남 => 형변환
		 */
		A aa=new B(); // a,b,aaa만 접근가능
		System.out.println("aa.a=>"+aa.a); //10
		System.out.println("aa.b=>"+aa.b); //20
		//System.out.println("aa.c=>"+aa.c); => 접근 불가능
		aa.aaa();
		//aa.bbb(); => 오류남
		B bb=(B)aa;
		//B cc=(B)new A(); // 형변환 => int aa=10.5랑 같은 것 => 메모리 생성시 데이터형 변환을 같이 하는건 안됨 B bb=(B)aa; 이렇게 해야됨
		/*
		 *  상속 : 하위 클래스로 접근하는 것이 기본
		 *        -----------------------
		 *        class A
		 *        class B extends A
		 *        B b=new B();
		 *         = static, private, 생성자, 초기화 블록 => 상속 제외
		 *         = 상위클래스는 공통적으로 사용하는 메소드,변수를 써야함
		 *        A => 여러개를 한개의 클래스로 제어
		 */
		/*
		 *  학생            회사원
		 *  ---           -----
		 *  학번             사번
		 *  -------------------
		 *  이름             이름
		 *  나이             나이
		 *  -------------------
		 *  학년             연차
		 *  ----------------------------
		 *  먹는다()          먹는다()
		 *  잠을 잔다()        잠을 잔다()
		 *  ----------------------------
		 *  공부한다()         업무를 한다()
		 *  
		 *  
		 *         사람
		 *     ------------
		 *         이름 
		 *         나이 
		 *         먹는다()
		 *         잠을 잔다()
		 *    --------------------
		 *       | 상속       | 상속
		 *      학생         회사원
		 *      학번         사번
		 *      학년         연차
		 *      공부한다()    업무를 한다()
		 *     -----------------------> 반복을 제거
		 *     *** 단일 상속만 가능
		 *     
		 *     상위 클래스는 하위 클래스가 가진 변수,메소드 사용이 불가능
		 *     하위 클래스는 상위 클래스에서 내려준 변수,메소드를 사용할 수 있다
		 *               => static 변수는 상속은 아니고 사용이 가능
		 *               => 공통으로 사용이 가능
		 *     객체 생성
		 *     하위클래스로 객체 생성
		 *     class A
		 *     class B extends A
		 *     
		 *     => B b=new B();
		 *     => A a=new B(); => 여러개의 클래스를 한개로 묶어서 사용
		 *     => A bb=new B();
		 *             ---------
		 *        B cc=(B)bb;
		 *  
		 *  
		 *  
		 *     => 여러개의 클래스를 한개로 묶어서 사용
		 *     class 동물
		 *     class 사람 extends 동물
		 *     class 개 extends 동물
		 *     class 소 extends 동물
		 *     class 말 extends 동물
		 *     class 돼지 extends 동물
		 *     ------------------------
		 *     동물 ani=new 사람();
		 *     ani=new 개();
		 *     ani=new 소();
		 *   
		 */
		A bbb=new B();
		B cc=(B)bbb;

	}

}
