package com.sist.main;
// 패키지가 다르면 => 반드시 클래스 사용시에 import
import com.sist.manager.*; //Student, StudentSystem 사용 가능
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSystem ss=new StudentSystem();
		ss.input();
		for(Student s:ss.students)
		{
			System.out.println(s.hakbun);
			System.out.println(s.name);
			System.out.println(s.kor);
			System.out.println(s.eng);
			System.out.println(s.math);
			System.out.println("==============");
		}
	}

}
