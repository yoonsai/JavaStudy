package com.sist.main;
import com.sist.manager2.*;
class A{
	int a;
	public A(int a)
	{
		this.a=a;
		
	} //매개변수가 있으면 하위 클래스에서 호출해줘야함
	
	//매개변수가 없으면 하위 클래스에서 super생략이 가능 => 호출은 함
//	public A()
//	{
//		
//	}
//	
}
class B extends A
{
	public B(int a)
	{
		super(a);
		a=1000;
		
	} // 상위 클래스의 생성자를 호출하는 메소드 = super
//	public B()
//	{
//		super(); // 상위클래스의 생성자를 먼저 호출하고 시작 =>super()은 생략 가능
//	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    B s=new B(100);
		System.out.println(s.a);
		
	}

}
