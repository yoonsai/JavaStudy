package com.sist.student;
import java.util.*;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager sm=new StudentManager();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("=========메뉴==========");
			System.out.println("1. 학생 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 추가하기");
			System.out.println("4. 수정하기");
			System.out.println("5. 삭제하기");
			System.out.println("6. 검색하기");
			System.out.println("7. 종료");
			System.out.println("=====================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==7)
			{
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 0 => 정상종료 / 1=> 비정상 종료
			}
			else if(menu==1)
			{
				ArrayList<Student> ar=sm.studentAllData();
				for(Student s:ar)
				{
					System.out.println(s.getHakbun()+"."+s.getName());
				}
			}
			else if(menu==2)
			{
				System.out.print("학번 입력:");
				int num=scan.nextInt();
				Student detail=sm.studentDetailData(num);
				System.out.println("학번:"+detail.getHakbun());
				System.out.println("이름:"+detail.getName());
				System.out.println("국어 점수:"+detail.getKor());
				System.out.println("영어 점수:"+detail.getEng());
				System.out.println("수학 점수:"+detail.getMath());
				System.out.println("총점:"+(detail.getKor()+detail.getEng()+detail.getMath()));
				System.out.println("평균:"+(detail.getKor()+detail.getEng()+detail.getMath())/3.0);
			}
			else if(menu==3)
			{
				System.out.print("추가할 학생 정보 입력(홍길동 90 80 70):");
				int hakbun=sm.hakbunMaxData();
				String name=scan.next();
				int kor=scan.nextInt();
				int eng=scan.nextInt();
				int math=scan.nextInt();
				Student std=new Student(hakbun, name, kor, eng, math);
				sm.studentAdd(std);
				
			}
			else if(menu==4)
			{
				System.out.print("수정할 학생의 학번 입력:");
				int hakbun=scan.nextInt();
				System.out.print("추가할 학생 정보 입력(홍길동 90 80 70):");
				String name=scan.next();
				int kor=scan.nextInt();
				int eng=scan.nextInt();
				int math=scan.nextInt();
				Student std=new Student(hakbun, name, kor, eng, math);
				sm.studentSet(std);
				
			}
			else if(menu==5)
			{
				System.out.print("삭제할 학생의 학번 입력:");
				int hakbun=scan.nextInt();
				sm.studentDelete(hakbun);
			}
			else if(menu==6)
			{
				System.out.print("검색할 학생 이름 입력:");
				String name=scan.next();
				ArrayList<Student> list=sm.studentFindData(name);
				for(Student std:list)
				{
					System.out.println(std.getHakbun()+"."+std.getName());
				}
			}
			
		}
	}

}
