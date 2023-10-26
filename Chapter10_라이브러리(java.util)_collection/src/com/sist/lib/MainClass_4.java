package com.sist.lib;
import java.util.*;
//중복데이터제거
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"홍길동","심청이","박문수","이순신","강감찬","춘향이","이산","홍길동"};
		
		//배열을 컬렉션으로 변경
		List<String> list=Arrays.asList(name);
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("=================");
		//중복제거
		Set<String> set=new HashSet<String>();
		set.addAll(list);
		//중복된 데이터는 set에 저장되지 않는다.
		for(String s:set)
		{
			System.out.println(s);
		}
		System.out.println("=================");
		List<String> list2=new ArrayList<String>();
		set.addAll(set);
		for(String s:set)
		{
			System.out.println(s);
		}
	}

}
