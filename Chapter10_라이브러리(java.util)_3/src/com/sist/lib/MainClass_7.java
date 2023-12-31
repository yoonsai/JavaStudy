package com.sist.lib;
/*
 *   List => add,remove,set,size,get,isEmpty
 *   => List가 여러개 있는 경우 (Join)
 *      containsAll : 두개 list가 있는 경우 중복된 데이터를 모아서 관리
 *      retainAll : 두개 list에서 중복된 데이터만 남기기
 *      ----------- 장바구니 => 중복 구매
 *      *** addAll : 데이터 전체 복사
 *      subList : 부분적 데이터 복사 => subList(0, 4)인덱스 0번부터 4-1번까지 가져오기
 */
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			list.add(r.nextInt(100)+1);
		}
		System.out.println("=======list========");
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		
		
		
		System.out.println("\n=======list2========");
		
		//부분적으로 데이터 추출 : subList
		ArrayList<Integer> list2=new ArrayList<Integer>(list.subList(0, 4));
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		
		for(int i:list2)
		{
			System.out.print(i+" ");
		}
		
		
		
		System.out.println("\n======list정렬========");
		Collections.sort(list);
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		
		
		System.out.println("\n======list1과 list2 중복 데이터 추출=========");
		//같은 데이터 추출
		System.out.println(list.retainAll(list2));
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		
		
		System.out.println("\n======데이터 복사=========");
		// 데이터 복사
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list2);
		for(int i:list3)
		{
			System.out.print(i+" ");
		}
	}

}
