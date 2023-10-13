package com.sist.manager;
// 같은 패키지상에 있는 경우 => default/public/protected
// => import를 사용하지 않는다
import java.util.*;
/*
 * 캡슐화 / 오버라이딩 / 상속 / 포함
 * ----- -------    |    ----
 *                  | 
 *                POJO 상속이 없는 클래스
 *  잘짠 프로그램인지 판단
 *  1) 결합성***
 *  2) 응집성
 *  3) 가독성***
 *  4) 최적화 
 */
public class StudentSystem {
	public Student[] students=new Student[3]; // 배열 크기만 만든것
	// 입력
	// 메소드 => 1) 멤버메소드(인스턴스메소드), 2) static메소드, 3) 생성자
	public void input() {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<students.length;i++)
		{
			students[i]=new Student(); // 배열 메모리 할당
			System.out.print((i+1)+"번째 학생의 학번 입력:");
			students[i].hakbun=scan.nextInt();
			
			System.out.print((i+1)+"번째 학생의 이름 입력:");
			students[i].name=scan.next();
			
			System.out.print((i+1)+"번째 학생의 국어점수 입력:");
			students[i].kor=scan.nextInt();
			
			System.out.print((i+1)+"번째 학생의 영어점수 입력:");
			students[i].eng=scan.nextInt();
			
			System.out.print((i+1)+"번째 학생의 수학점수 입력:");
			students[i].math=scan.nextInt();
			
		}
		
	}
}

