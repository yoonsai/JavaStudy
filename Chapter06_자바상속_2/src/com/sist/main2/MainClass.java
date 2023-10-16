package com.sist.main2;
/*
 *  오버라이딩
 *  -------
 *  1) 메소드명이 동일
 *  2) 상속
 *  3) 매개변수가 동일
 *  4) 리턴형이 동일
 *  5) 축소는 불가능, 확대는 가능
 *    ---------------------
 *    private < default < protected < public
 */
//변수,메소드 오버라이딩 => 덮어쓴다
class Super{
	int number=10;
	void display() {
		System.out.println("Super:display CAll...");
	}
}
class Sub extends Super{
	//Super 클래스를 확장해서 새로운 클래스를 만든다
	int number=20; //변수 오버라ㅣ딩
	// 상속받은 것을 변경가능 => 오버라이딩
	// 변수나 메소드명을 동일하게 사용하여 값변경
	protected void display() {
		System.out.println("Sub:display CAll...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Super s=new Super();
		System.out.println(s.number); //10
		
		Sub ss=new Sub(); //=> 앞에 선언한 클래스에 따라 앞의 클래스의 해당 데이터를 제어=Sub
		System.out.println(ss.number); //20

		Super s1=new Sub(); //하위클래스를 통해서 접근이 가능 => 앞에 선언한 클래스에 따라 앞의 클래스의 해당 데이터를 제어=Super
		System.out.println(s1.number); //10
		// 생성자는 관계 없음*/
		
		//생성방법 3가지
		//Super / Sub // Sub=Super
		Super s=new Super(); 
		s.display(); // Super:display CAll...
		Sub ss=new Sub(); //*** 많이 쓰임
		ss.display(); // Sub:display CAll...
		Super s1=new Sub(); //*** 많이 쓰임
		s1.display(); // Sub:display CAll...
		
		/*
		 * 멤버변수 : 선언된 클래스형(의 변수제어)
		 *   Super s=new Super() => Super가 가지고 있는 변수 제어
		 *   Sub ss=new Sub() => Sub가 가지고 있는 변수 제어 
		 *   Super s1=new Sub() => Super가 가지고 있는 변수 제어
		 *   
		 * 메소드
		 *   Super s=new Super() => Super가 가지고 있는 메소드 제어
		 *   Sub ss=new Sub() => Sub가 가지고 있는 메소드 제어 
		 *   Super s1=new Sub() => Sub가 가지고 있는 메소드 제어(덮어쓰는 개념) => 오버라이딩된 메소드만!!! Sub에만 선언된 메소드는 접근 불가능
		 * 
		 */
		
	}

}
