package com.sist.main;
//객체 대입 => 메모리 통으로 전송 => 같은 메모리 주소를 제어
import java.util.Scanner;
class Human
{
	int age;
	String name;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong=new Human();
		// hon(age,name) => hong.name, hong.age
		hong.age=20;
		hong.name="홍길동"; //==> 쓰기 => setXxx
		
		// 변수(멤버변수,정적변수,지역변수,매개변수) => 읽기/쓰기
		System.out.println(hong.age);
		System.out.println(hong.name);
		
		// hong => 변수
		Human shim=hong; // => 메모리 주소를 대입
		//대입이 가능하다
		/*
		 *  int a=10;
		 *  int b=a; => 메모리에 있는 값을 대입
		 */
		shim.age=30;
		shim.name="심청이";
		System.out.println(shim.age);
		System.out.println(shim.name);
		
		System.out.println(hong.age);
		System.out.println(hong.name);
		
//		Human[] s=new Human[3];
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<s.length;i++)
//		{
//			s[i]=new Human();
//			
//			System.out.print((i+1)+"번째 사람의 나이 입력:");
//			s[i].age=scan.nextInt();
//			
//			System.out.print((i+1)+"번째 사람의 이름 입력:");
//			s[i].name=scan.next();
//		}
//		for(int i=0;i<s.length;i++)
//		{
//		    System.out.println((i+1)+"번째 사람의 나이:"+s[i].age+" 이름:"+s[i].name);
//		}
	}

}