package com.sist.lib;
/*
 *   Wrapper : 기본데이터형을 클래스화 
 *     => 기본데이터형에 기능을 부여해서 쉽게 사용이 가능 
 *     int ==> Integer
 *     long ==> Long 
 *     double ==> Double 
 *     boolean ==> Boolean 
 *     --------------------- 웹에서 주로 사용 
 *     
 *     => 웹/윈도우 => 모든 데이터값 문자열 
 *                   ----------------
 *                   문자열을 정수,실수,논리형 
 *     => Double.parseDouble("4.5") => 4.5
 *        Integer.parseInt("10") => int page=10
 *        Boolean.parseBoolean("true") => true
 *                --------------------
 *                 HTML => checkbox 
 *     => 제네릭 사용시 => 데이터형을 통일 
 *        ----- 메소드 => 리턴형 , 매개변수 
 *                      -------------- Object
 *        <Integer> => 클래스 <int>(X)
 *        --------- 
 *        배열 => 저장 (클래스) => Object
 *        
 *        class Box<T> ==> T(Object)
 *        {
 *           T t=new T();
 *           void setT(T t){}
 *           T getT()
 *           {
 *              return T;
 *           }
 *        }
 *       
 *       Box<String> => <>안에는 클래스만
 *       -----------
 *       *** 오토박싱/언박싱
 *       Integer i=10; => int와 같이 사용가능 => 오토박싱
 *       int j=i; => 언박싱
 */
import java.util.*;
public class MainClass2 {
	static void aaa(Integer a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list=new ArrayList<Integer>();
//		list.add(null);
		
		aaa(10);
		Integer i=10; //오토박싱 => 정수처럼 보이지만 기능을 가지고 있음
		int j=i;//언박싱
		int k=new Integer(100);//언박싱
		System.out.println(j);
		
		/*List list=new ArrayList(); 
		list.add("a");
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass2());
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass2());
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass2());
		list.add(10);
		list.add('A');
		list.add(new MainClass2());*/
		
	}

}
