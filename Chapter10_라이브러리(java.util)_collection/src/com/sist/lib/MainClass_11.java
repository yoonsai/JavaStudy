package com.sist.lib;
//중복된 숫자 없애기 
import java.util.*;

public class MainClass_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,50,40,70,60,10,20,40};
		Set<Integer> set=new HashSet<Integer>(); //배열을 set으로 바꾸는 메소드가 없음
		for(int a:arr)
		{
			set.add(a);
		}
		System.out.println(set);
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(set);
		System.out.println(list);
		System.out.println("========정렬(ASC)=======");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("========정렬(DESC)=======");
		Collections.reverse(list);
		System.out.println(list);
		//ArrayList<?> list=new ArrayList<String>(); => ?는 와일드 카드(모든 데이터형을 받는 경우)
		// => ArrayList list=new ArrayList();
	}

}
