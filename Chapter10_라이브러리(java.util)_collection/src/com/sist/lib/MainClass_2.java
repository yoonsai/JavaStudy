package com.sist.lib;
/*
 * 
 */
import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec=new Vector<Integer>();
		// 데이터 추가 ==> add(Object) => add(Integer)
		/*
		 * List<String> list=new Vector<String>();
		 * List<String> list=new LinkedList<String>();
		 * List<String> list=new ArrayList<String>();
		 * 
		 */
		// Wrapper => 기본형과 동일하게 사용된다
		// int i=10, Integer i=10 => 오토박싱
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.addElement(60);
		for(int i=0;i<vec.size();i++)
		{
			System.out.println(i+"."+vec.get(i));
		}
		
		
		System.out.println("=====삭제후======");
		vec.remove(3);
		for(int i=0;i<vec.size();i++)
		{
			System.out.println(i+"."+vec.get(i));
		}
		
		System.out.println("=====수정후======");
		vec.set(2,1000);
		for(int i=0;i<vec.size();i++)
		{
			System.out.println(i+"."+vec.get(i));
		}
		
		
		System.out.println("=====총갯수확인======");
		System.out.println("총갯수:"+vec.size());
		
		
		System.out.println("=====전체삭제 후======");
		vec.clear();
		System.out.println("총갯수:"+vec.size());
		
		if(vec.isEmpty())
		{
			System.out.println("접속자가 없습니다.");
		}
		else
		{
			System.out.println("접속자가 존재합니다.");
		}
	}

}
