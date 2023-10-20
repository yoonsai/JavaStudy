package com.sist.main;
/*
 *   interface
 *   ---------
 *     => 서로 다른 클래스를 연결해서 사용
 *     => 결합성이 낮은 프로그램
 *     => 개발자가 같은 메소드를 사용 => 표준화
 *     => 관련된 클래스를 묶어서 한개의 이름으로 관리
 *       --------------------------------
 *         Model => 형식 ==> interface
 *     => class A
 *        class B extends A
 *        
 *        A a=new A() => a에 있는 변수, 메소드만 호출
 *        B b=new B() => b에 있는 변수, 메소드만 호출
 *        A c=new B() => a에 있는 변수, 메소드는 오버라이딩 된 경우 B에 있는 것 호출
 *        
 *        ------
 *        
 *        interface I
 *        {
 *           aaa();  ==> 클래스 공통으로 적용되는 메소드 선언
 *        }
 *        class A implements I
 *           aaa() bbb()
 *            I i=new A() (X)  ==> A a=new A();
 *        class B implements I
 *        class C implements I
 *        
 *        I i=new A();
 *        --- -------- i에 존재하는 메소드 중에 A에서 오버라이딩한 메소드 호출
 *        I i=new B();
 *        I i=new C();
 *        
 *        상위 클래스 객체명=new 하위클래스()
 *        => 접근 : 변수는 상위클래스에 있는 변수만
 *                 메소드는 상위클래스에 있는 메소드만
 *                 ------------------------- 오버라이딩된것만
 *        => 인터페이스 통해서 클래스에 접근
 *           ------- 인터페이스에 있는 메소드만 가지고 있어야 효율적이다
 *           
 *        interface A
 *        { 
 *           void aaa();
 *           void bbb();
 *        }
 *        class B implements A
 *                ----------
 *        { 
 *           void aaa(){};
 *           void bbb(){};
 *           void ccc(){};
 *        }
 *        
 *        A a=new B(); ==> 가급적이면 사용하지 않는다
 *        ---- => aaa(),bbb()
 *        
 *        
 *        
 *     기본문법)
 *        변수는 사용할 수 없다 (상수만 사용이 가능하다)
 *        int i; ==> 오류
 *        int i=10;
 *        ---------- public static final int i=10;
 *                   --------------------
 *                   static final int i=10;
 *                   //상수
 *                   final int i=10;
 *                   //상수형 변수
 *                   int i=10;
 *                   //변수
 *             메소드
 *               구현이 안된 메소드 : 구현 내용이 여러개인 경우
 *               (public abstract)void display(); 
 *               public (abstract)void display();
 *               인터페이스는 접근지정어가 무조건 public
 *                                      -------
 *               구현이 된 메소드 : 공통으로 사용되는 부분 정의
 *                  => 새로운 기능 추가
 *               (public) default void aaa(){}
 *               (public) static void bbb(){}
 *               ==> 메소드나 상수를 선언 ==> 무조건 public
 *               --------------------------------------
 *               private < default < protected < public 크기는 확장시킬 수 있지만 축소는 불가능 
 *              
 *             상속 : => 인터페이스도 클래스다
 *                     --------------- 상속시 상위 클래스다
 *                     extends
 *                     implements
 *                     ----------- 상속
 *             다중 상속 => ,로 구분
 *             
 *             interface ====== interface
 *                       extends
 *             interface ====== class
 *                       implements
 *             class A
 *             interface B
 *             interface C
 *             class D extends A implements B,C  => 클래스 A확장을 시키고 B,C를 구현해서 사용하겠다
 *             {
 *             }
 *     
 *     
 *   class A
 *   {
 *     int a;
 *     void aaa(){}
 *   }
 *   Object obj=new A();
 *   
 *   class B
 *   class C
 *   Object[] obj={new A(),new B(),new C()}
 *   
 *   A a=(A)obj[0];
 *   
 *     
 */
interface A{
	//public static final int a = 10; // => public static final 자동 추가
	void aaa();
	void bbb();
	void ccc();
}
class B implements A
{
	
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}
}

interface C
{
	void aaa();
}
interface D //extends C
{
	void bbb();
}
class E implements C,D
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa() Call...");
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb() Call...");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new E();
		//d.aaa();
		d.bbb();
		E e=new E();
		e.aaa();
		e.bbb();
	}

}
