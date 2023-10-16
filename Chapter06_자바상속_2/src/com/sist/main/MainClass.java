package com.sist.main;
/*
 *  상속
 *   자바 상속 => 1)멤버변수, 2)메소드
 *              -------
 *                | static, private 제외
 *             접근지정어
 *             -------
 *              | pubic / protected / default / private
 *               -------------------  --------  -----------> 상속을 받을 수 있지만 접근은 불가능 (상속의 예외조건이라고 하기도함)
 *                  |                   | 패키지가 같은 경우만
 *                  | 패키지와 상관없이 상속받을 수 있음
 *                  
 *          => 생성자, 초기화 블록은 상속 받을 수 없음
 *  ***** 클래스 여러개를 한개의 객체로 접근시에는 상위클래스를 이용해서 접근
 *        Student
 *        |     |
 *    HStudent  UStudent
 *    
 *    HStudent h=new HStudent();
 *    UStudent u=new UStudent();
 *    -------------------------
 *    Student h=new HStudent();
 *    h=new UStudent();
 *    
 *    ***** 모든 클래스를 한개의 객체로 연결이 가능
 *         ------------------------------
 *                       |
 *                     Object o=new MainClass()
 *                     o=new MainClass()...
 *                     Object는 모든 데이터형을 묶어서 사용이 가능
 *         Object o=10;
 *         o=10.5;
 *         o=true;..
 *        ------------------ 자바의 매개변수가 객체인 경우
 *                           Object => 형변환 => 제네릭스
 *    => 형식
 *    class 하위클래스 extends 상위클래스
 *    => 단일 상속만 가능
 *    
 *    다중 상속은 불가능하다
 *    ----------------
 *    class Man
 *    {
 *      String name;
 *      int age;
 *    }
 *    class Woman
 *    {
 *      String name;
 *      int age;
 *    }
 *    => 자바에는 다중상속은 없음 (다중상속 =>C/C++) 
 *    class Human extends Man,Woman => 다중상속
 *    {
 *      String name;
 *      int age;
 *      String name;
 *      int age;
 *    } => 오류
 *    // 자바에도 다중상속 => 인터페이스 (07)
 *    
 *  
 */
class Student
{
	String name;
	int age;
    void print() {
		System.out.println("Student");
	}
    void plan() {
    	System.out.println("super");
    }
}
class HStudent extends Student
{
	String highschool;
	void print() {
		System.out.println("HStudent"); 
	}
	void play(){
		System.out.println("Call...");
	}
}
class UStudent extends Student
{
	String university;
    void print() {
    	System.out.println("UStudent");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HStudent h=new HStudent();
        //UStudent u=new UStudent();
		Student h=new HStudent();
		//h=new UStudent();
		h.print();
		HStudent hs=new HStudent();
		hs.play();
		
		Student hu=new UStudent();
		hu.plan();
		
		
	}

}