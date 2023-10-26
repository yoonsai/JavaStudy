package com.sist.lib;
/*
 *   
 */
import java.util.*;
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	public Sawon(int sabun,String name,String dept)
	{
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
	}
	public void print()
	{
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
	}
	 
}
/*
 *   Object대신 저장해야되는 데이터형 설정 => 모든 매개변수, 리턴형이 변경된
 *   => 제네릭 => 컬렉션은 가급적이면 제네릭을 사용 권장
 *   => 데이터 첨부시에 원하는 데이터만 첨부가 가능하게 만들어준다
 *   => 분석이 쉬워짐
 *   => 데이터를 저장할때 => 같은 데이터를 첨부 (ArrayList는 폴더다) => 제네릭을 선언하면 다른 데이터형은 첨부할 수 없다
 */
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList list=new ArrayList();
		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add("홍길동");
//		list.add(4);
//		list.add(5);
//		for(int i=0;i<list.size();i++)
//		{
//			//int val=(int)list.get(i); => "홍길동"이 int로 받을 수 없음
//			Object val=list.get(i);
//			System.out.println(val);
//		}
		
		
		
		
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		//제네릭 => <클래스> => 기본형은 반드시 Wrapper
		//제네릭 => 폴더별로 저장 => 찾기
		//ArrayList<int> X => ArrayList<Integer>
		list.add(new Sawon(1,"홍길동1","개발부"));
		list.add(new Sawon(2,"홍길동2","영업부"));
		list.add(new Sawon(3,"홍길동3","총무부"));
		
		for(int i=0;i<list.size();i++)
			{
				
				//Object obj=list.get(i); // 상속내린 상위클래스는 하위 클래스의 메소드 접근 불가능 => print 메소드 접근 불가
			    //Sawon obj=(Sawon)list.get(i); // object라서 Sawon으로 형변경
			    Sawon obj=list.get(i); //ArrayList<Sawon> 제네릭을 사용해서 Sawon만 저장하겠다 => 형변경 안해도됨
			    obj.print();
				
			}
		


	}

}
