package com.sist.lib;
/*
 * ArrayList<클래스>
 *          -----
 *           | 기본형 ==> 많이 나오는 것 => Integer, String
 *             => 사용자 정의 클래스
 *             ArrayList<Music>
 *             ArrayList<Movie>
 *             ArratList<Food>
 *             ArrayList<>
 */
import java.util.*;
public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("홍길동");
		names1.add("박문수");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		for(String name:names1)
		{
			System.out.println(name);
		}
		System.out.println("===========");
		
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("홍길수");
		names2.add("박문수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("성춘향");
		for(String name:names2)
		{
			System.out.println(name);
		}
		System.out.println("===========");
		
		
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1); // 다른컬렉션에 데이터를 추가(복사)
		for(String name:temp)
		{
			System.out.println(name);
		}
		System.out.println("===========");
		temp.retainAll(names2); // 같은 데이터를 추가 (두개를 묶어서 같은 데이터만 뽑아서 추가 = 교집합)
		for(String name:temp)
		{
			System.out.println(name);
		}
	}

}
