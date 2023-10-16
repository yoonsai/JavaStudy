package com.sist.main2;
/*
 *  static메소드 / 인스턴스 메소드
 *  ----------- => 인스턴스나 static 상관없이 사용이 가능
 *      |
 *   static변수, static메소드를 호출
 *   인스턴스변수, 인스턴스 메소드는 반드시 객체 생성후에 사용
 *   
 *   => 클래스 생성 => 객체 생성 => 자동으로 this(자신의 객체)
 *                                    |
 *                                   멤버변수와 지역변수의 구분
 *                                ** 변수가 동일한 이름이면 지역변수 우선 순위
 *                                ** 지역변수,매개변수 찾고 => 없는
 *   예) 
 *       class A
 *       {
 *          int a=20; => 메모리 저장 위치가 다르다
 *                       Heap
 *          void display()
 *          {
 *             int a=10; => stack
 *             System.out.println(this.a);
 *                               --- 지역변수
 *          }
 *          void display(int a)
 *          {            ------ 지역변수의 일종 Stack
 *             System.out.println(a);
 *          }
 *       } 
 *       ====> this : 객체
 *             this() => 생성자 (자신의 생성자를 호출할때 사용)
 *             ------
 *             => 생성자에서 사용이 가능
 *             => 생성자 첫줄에 온다
 *       class A
 *       {
 *          A()
 *          {
 *          }
 *          A(int a)
 *          {
 *             this(); => super()
 *             System.out.println("aaa");
 *             this(); => 오류 => 첫줄에 와야함
 *          }
 *          
 *       } 
 */
class Student
{
	int hakbun; //0
	String name; //null
	String sex; //null
	
	public Student() {
		System.out.println("디폴트 생성자 호출...");
		this.hakbun=1;
		// student가 가지고 있는 멤버변수
		name="홍길동";
		sex="남자";
		// 지역변수와 충돌이 없는 경우에는 this.생략이 가능하다
	}
	public Student(int hakbun,String name)
	{
		this();
		this.hakbun=hakbun;
		this.name=name;
	}
	public Student(String sex)
	{
		this(); // this메소드 => 자신의 디폴트 생성자 호출
		this.sex=sex;
	}
	public Student(int h,String n,String s) // 오버로딩 => 같은 이름의 생성자,다른 매개변수 사용
	{
		this(s); //=> 매개변수가 있는 것도 호출 가능 => Student(String sex) 호출한 것
		//hakbun=h;
		//name=n;
		//sex=s;
	}
	public void print()
	{
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.out.println("==================");
	}
	/*
	 *  오버로딩 => 같은 메소드명으로 새로운 기능을 만든다
	 *     
	 *     1.void display(int a,int b,int c)
	 *     2.void display(char c,double d,int a)
	 *     3.void display(double d,double d1,double d2)
	 *     
	 *     display(10.5,'A',100) => double,char,int => 3번을 불러옴 => 같은 데이터형이 없으면 해당 데이터를 담을 수 있는 크기를 부름
	 *     
	 *     void aaa(int a)
	 *     => aaa(10), aaa('A') 가능
	 */
}
public class MainClass {
	void display(int a,int b,int c)
	{
		System.out.println("display(int a,int b,int c)");
	}
	void display(char c,double d,int a)
	{
		System.out.println("display(char c,double d,int a)");
	}
	void display(double d,double d1,double d2)
	{
		System.out.println("display(double d,double d1,double d2)");
	}
	void display(double d,int d1,int d2)
	{
		System.out.println("display(double d,int d1,int d2)");
	}
	void display(double d,char d1,char d2)
	{
		System.out.println("display(double d,char d1,char d2)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		m.display(10.5,'A',100); // 찾는순서 1)동일한 데이터형 2)가장 가까운거 3)제일큰거
		
//		Student st=new Student();
//		st.print();
//		
//		
//		Student st1=new Student("여자");
//		
//		st1.print(); // 0,null,여자
//		
//		Student st2=new Student(1,"심청이");
//		st2.print();// 1,홍길동,null
//		
//		Student st3=new Student(2,"박문수","남자"); // 입력한 매개변수 갯수에 따라 다른 생성자메소드가 호출
//		st3.print();// 2,심청이,남자
	}
	

}