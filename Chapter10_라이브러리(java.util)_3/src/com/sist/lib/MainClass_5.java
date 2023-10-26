package com.sist.lib;

/*
 *  => 메소드 (340page)
 *  => 검색 => 
 * 
 * 
 * 
 */
import java.util.*;
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		// 정수만 메모리에 저장해서 관리
		/*
		 *  Wrapper => 기본형을 클래스형
		 *             => 기능을 부여
		 *             => 제네릭을 사용
		 *  => 장점은 Wrapper클래스와 기본형 호환
		 *  Integer => 10,20,30..
		 *  Integer => i=10; ==> int 
		 */
		// 추가 => add()
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); // object에서 int로 형변환이 필요없음
			System.out.println(i+":"+val);
		}
		
		
		
		System.out.println("====================");
		list.add(3,60); // 가급적이면 사용하지 않는다 => 인덱스번호가 변경되면서 속도가 느려짐
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i);
			System.out.println(i+":"+val);
		}
		
		
		System.out.println("====================");
		list.remove(3);
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i);
			System.out.println(i+":"+val);
		}
		
		System.out.println("====================");
		for(int i:list)
		{
			System.out.println(i);
		}
		System.out.println("====================");
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재 여부:"+list.isEmpty());
		// 라이블리 => 메소드 isXxx() => boolean
		// setXxx => void
		// 데이터가 없냐? false => 있다
		System.out.println("====================");
		list.clear();
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재 여부:"+list.isEmpty());
		
	}

}
