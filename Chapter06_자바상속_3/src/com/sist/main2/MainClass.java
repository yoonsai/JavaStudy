package com.sist.main2;

import com.sist.manager.Super;

// 메모리 => 상위 클래스 => 상속받은 클래스 메모리 할당
class Superr
{
	int a=10;
	public Superr(int a)
	{
		this.a=a;
		System.out.println("Super 생성자 호출...");
	}
}
class Sub extends Superr
{
	int a;
	public Sub(int a) {
		
		// 상위 클래스가 디폴트 생성자인 경우에만 super();을 생략 가능
		//super(); // 생략가능 => 상위클래스를 호출해서 메모리 할당을 한 뒤 하위 클래스 생성 => public super() 자동추가
		//=> Super super=new Super();
		
		//상위 클래스의 매개변수가 있는 생성자는 반드시 호출 후에 사용
		super(10);
		this.a=100;
		//b=1000;
//		System.out.println("Sub생성자 호출...");
//		System.out.println("Sub:a="+this.a); // this생략가능 => 자신을 나타내주는 객체명
//		System.out.println("Super:a="+super.a); // super=> 상위 클래스를 나타내는 객체명
		
		/*
		 * heap
		 * -------------------
		 *   -----super-----
		 *     a => super.a (Super => a)
		 *   ---------------
		 *   
		 *   -----this------
		 *     a => this.a, a (Sub => a)
		 * -------------------
		 */
	}
}
/*
 *  클래스 중에 final 클래스
 *           ----------
 *           public final class()
 *                             --- 확장이 안되는 클래스
 *                             --- 상속을 받을 수 없다
 *                             --- String, Math
 *                                 System...
 *                                 java.lang => 217page
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superr s=new Sub(10);
		System.out.println(s.a);
	}

}
