package com.sist.io;
/*
 *  컬렉션 프레임워크 
 *   => 군집(다수의 데이터)를 쉽게 관리할 수 있게 만든 라이브러리
 *                         ----
 *                         데이터 관리 : 추가, 수정, 삭제, 읽기 (자료구조)
 *                         -------- 파일, 오라클
 *                                 ----  -----
 *                                   |     |select(읽기), update(수정), insert(추가), delete(삭제)
 *                                   | read(), write(), delete()
 *                                  파일/오라클
 *                                  --------
 *                                  1. 읽기 => file은 한줄씩 => 구분자
 *                                  2. 오라클 => 원하는 데이터만 가지고 올 수 있다
 *  
 *   
 *   => 자동으로 인덱스번호 관리 => 빈공백이 없다
 *   
 *   => 컬렉션의 종류 
 *      List : ArrayList
 *       => 순서가 지정(인덱스)
 *       => 중복을 허용한다
 *       => 주요메소드
 *          1) 추가 : add(Object)
 *          2) 삭제 : remove(int index)
 *          3) 수정 : set(int index, Object)
 *          4) 읽기 : get(int index)
 *          5) 비어있는지 확인 : isEmpty()
 *          6) 전체삭제 : clear()
 *          7) 저장된 갯수 : size()
 *          8) 두개의 List가 있는 경우
 *             => 교집합 => retainAll()
 *             => 합집합 => addAll()
 *             => 차집합 => removeAll()
 *          *** Arrays.asList => 배열 => ArrayList로 변경

 *      Set : HashSet
 *       => 순서가 없다
 *       => 중복을 허용하지 않는다
 *         ** null값을 추가할 수 있다 1번만
 *       => 장르별, 부서별, 상품별...
 *       => List에서 중복 데이터를 제거할때
 *       => 주요메소드
 *          1) 추가 : add()
 *          2) 삭제 : remove(Object o)
 *          3) 존재여부 : isEmpty()
 *          4) => 일반 for문을 사용할 수 없음 => for-Each문만 가능
 *          5) 개수확인 : size()
 *          
 *      Map : HashMap
 *       => 두개를 동시에 저장할때 (key,value)
 *       => 도서, 클래스 관리, 데이터 전송 관리, SQL관리 
 *       => put: 저장
 *       => get: 읽기
 *       => keySet: 저장된 키 읽기
 *       => values: 저장된 값 읽기
 *       => 크기 : size()
 *       -----------------------clear()
 *       
 *       **전체를 한곳에 모아서 출력, 관리 => Iterator
 *       
 *       제네릭 :
 *         프로그램 : 데이터 관리 
 *                 --------- 데이터 저장 방법 : 변수, 배열, 클래스, 컬렉션, 파일, 오라클, 데이터베이스
 *                           -----------
 *                             | 데이터형을 통일 
 *                             | 이미 만들어진 클래스(데이터형)
 *                               -------------- 
 *                               라이브러리 => 지정하는 리턴형/매개변수의 데이터형을 변경
 *                                          => 프로그램 개발시마다 형변환
 *                                          => 필요시마다 데이터형을 변경
 *                                          => 보완 => 제네릭
 *                                          => 라이브러리에 있는 데이터형을 프로그램에 맞게 사용
 *         사용법 <> => 클래스<데이터형> => 리턴형 / 매개변수가 변경
 *         => 단점은 기본형은 사용할 수 없다
 *                 ------- 기본형을 사용할 수 있게 클래스형 제공
 *                         Wrapper
 *                         ------- int, long, double, boolean
 *                                 Integer, Long, Double, Boolean
 *                                 => 호환성이 좋다 => 기본형과 동일시 한다
 *                                 
 *                                 
 *         Properties
 *              
 *                    자바에서 => 제어 파일명 : .txt, .properties
 *                    .xml
 *                    .csv ==> R
 *                    .json
 *                    ------- 각 업체에서 라이브러리 제공
 *                    
 */
import java.io.*;
import java.util.*;
public class MainClass_Collection정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 가끔 => MyBatis
			// Map => 파일 => .properties
			Properties prop=new Properties();
			prop.load(new FileInputStream("C:\\JavaDev\\JavaStudy\\Chapter11_라이브러리(java.io)_1\\src\\com\\sist\\io\\student.properties"));
			String name=prop.getProperty("name");
			String addr=prop.getProperty("address");
			String phone=prop.getProperty("phone");
			System.out.println(name+" "+addr+" "+phone);
			
			
			Properties props=System.getProperties();
			System.out.println(props.getProperty("java.version"));
			System.out.println(props.getProperty("user.language"));
		}catch(Exception e)
		{
			
		}
	}

}
