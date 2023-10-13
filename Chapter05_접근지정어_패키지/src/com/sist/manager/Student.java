package com.sist.manager;

public class Student {
	// default (접근지정어) => 자신의 클래스, 같은 패키지에서는 사용이 가능 => 다른 패키지에서 사용하려면 public으로 바꿔야함
	// 다른 패키지에서는 사용이 불가능
//	int hakbun;
//	String name;
//	int kor,eng,math;
	
	//public => 단점 : 모든 데이터가 노출 , 하지만 다른 패키지에서 사용하려면 public만 가능
	public int hakbun;
	public String name;
	public int kor,eng,math;

}
