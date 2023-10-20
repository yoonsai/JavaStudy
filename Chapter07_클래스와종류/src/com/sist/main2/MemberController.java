package com.sist.main2;
interface I
{
	int a=10;
	public void display(); // 선언 메소드:무조건 상속받은 클래스에서 구현해서 써라
	public default void aaa() { // 디폴트메소드
		System.out.println("default...");
	}
	// ==> 내용이 같은 경우
	public default int bbb(int c) { 
		int a=10;
		System.out.println("bbbbbbbbb");
		return a+c;
	}
}
class A implements I
{
	int c=1100;
	public void display() {
		System.out.println("A...");
	}
}
class B implements I
{
    public void display() {
    	System.out.println("B...");

	}
	
}
class C implements I
{
    public void display() {
    	System.out.println("C...");

	}
    public int bbb(int c) {
    	int a=1;
    	System.out.println("bbbbbbb.."); // 내용변경
    	return a+c;
    }
}
public class MemberController implements Controller{
	public void execute() {
		System.out.println("회원 관리 클래스");
	}
	public static void main(String[] args) {
		I i=new A();
		i.display();
		i.aaa();
		A aa=new A();
		System.out.println(aa.c);
		
		i=new B();
		i.display();
		i.aaa();
		
		i=new C();
		i.display();
		i.aaa();
		//i.bbb C클래스에만 있으면 i로 접근할 수 없음
		//=> 인터페이스 I 내부에서 메소드를 구현해야 접근 가능 => 인터페이스 하나로 제어할 수 있도록  
		int a=i.bbb(10);
		System.out.println(a);
		System.out.println(i.a);
		
	}
	
	
}
