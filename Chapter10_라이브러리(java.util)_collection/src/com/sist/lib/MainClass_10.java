package com.sist.lib;
/*
 *  자바의 컬렉션 프레임워크는 컬렉션에 저장된 요소를 읽어오는 방법을 Iterator 인터페이스로 표준화
 *  
 *  ListIterator 인터페이스는 Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스
 *  Iterator 인터페이스는 컬렉션의 요소에 접근할 때 한 방향으로만 이동할 수 있음
 *  하지만 JDK 1.2부터 제공된 ListIterator 인터페이스는 컬렉션 요소의 대체, 
 *  추가 그리고 인덱스 검색 등을 위한 작업에서 양방향으로 이동하는 것을 지원
 *  단, ListIterator 인터페이스는 List 인터페이스를 구현한 List 컬렉션 클래스에서만 
 *  listIterator() 메소드를 통해 사용할 수 있음
 *  
 */
import java.util.*;
public class MainClass_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		list.add("이순신");
		list.add("강감찬");
		System.out.println("====일반 출력(웹)====");
		for(String name:list)
		{
			System.out.println(name);
		}
		
		
		System.out.println("====데이터를 한 곳에 모아서 출력====");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) // 갯수가 명확하지 않은 경우 => 실시간 // => 데이터가 있는 동안 while문을 돌려라
		{
			System.out.println(it.next());
		}
		
		System.out.println("====ListIterator====");
		//List에서만 사용
		ListIterator<String> it1=list.listIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		System.out.println("======================");
		while(it1.hasPrevious()) //거꾸로 출력
		{
			System.out.println(it1.previous());
		}
	}

}
