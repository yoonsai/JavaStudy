package com.sist.lib;
/*
 *  1. java.util
 *     => 프로그램에서 많이 사용되는 유용한 클래스의 집합
 *     => 반드시 import를 사용한다
 *     1) 날짜
 *        Date/Calendar ==> Date에 없는 기능 확장 Calendar
 *            --------- 예약
 *     2) 문자열 분해
 *        StringTokenizer
 *     3) 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 *         ---- 컬렉션(***)
 *              ----- 가변형 (크기를 결정하지 않는다)
 *        표준화 (모든 개발자가 동일하게 사용한다)
 *        => CURD => 읽기/쓰기/수정/삭제
 *           collection => interface
 *               |
 *   -----------------------------------------------
 *   |                     |                      |
 *  List                  Set                    Map  =====> 인터페이스
 *  = 데이터                = 데이터 중복x            = 데이터 
 *    중복허용                                        중복허용
 *  = 순서를 가짐            = 순서가 없음             = 순서가 없음
 *    (인덱스를 이용)                               = 키, 값으로 저장
 *  = 데이터베이스 사용시에                            = 키는 중복될 수 없음
 *    주로 사용(***)                               = 클래스 관리(스프링, 웹)    
 *    
 *              
 *     List
 *     ----
 *       | List를 구현한 클래스
 *     -------------------------------------- Stack
 *     |               |               |
 *   **ArrayList      Vector        LinkedList
 *                                     |
 *                                   Queue
 *     
 *     
 *     ArrayList : 오라클에 있는 데이터를 저장해서 제어
 *                 --------------------------
 *                        | 
 *                      브라우저
 *                      => 데이터베이스 관련 => 비동기 방식
 *     Vector : 동기 방식 => 네트워크 (사용자 정보를 저장할때 => IP,PORT)
 *       **Vector의 단점을 보완 ArrayList
 *     LinkedList : C호환 => 수정, 삭제, 추가가 빠름
 *                  => 읽기는 ArrayList가 빠름
 *     
 *     *** List라는 인터페이스를 구현했기 때문에 3가지의 메소드가 동일 
 *     
 *     
 *     
 *     Set
 *     ----
 *      | Set을 구현하는 클래스
 *     --------------------
 *     |                  |
 *     HashSet          TreeSet
 *     
 *     
 *     Map
 *     ----
 *      | Map을 구현하는 클래스
 *     --------------------
 *     |                  |
 *     HashMap         HashTable
 *     
 *     Random : 난수 발생
 *              
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List list=new ArrayList();
		//List list=new Vector();
		List list=new LinkedList(); // 3개 클래스의 메소드가 동일
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		
		for(Object o:list)
		{
			System.out.println(o);
		}
	}

}
