// if~else
/*
 * 예상되는 결과값이 두개로 나눠서 나오는 경우 => if~else
 * 단일> 여러개가 동시에 결과값이 있는 경우
 * 다중> 여러개중에 한개만 수행할때
 */

// 국어, 영어, 수학 => 평균, 총점 => 평균이 60이상 60이하

import java.util.Scanner;
public class C_제어문_조건문2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수선언
		// 초기화 => 명시적 초기화, 입력값을 받아서 저장, 임의 발생
		// 결과값 도출
		int kor,eng,math,total;
		double avg;
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수:");
		kor=scan.nextInt();
		System.out.print("영어점수:");
		eng=scan.nextInt();
		System.out.print("수학점수:");
		math=scan.nextInt();
		
		total=kor+eng+math;
		avg=total/3.0;
		
		System.out.println("===========결과값===========");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f",avg);
		System.out.println();
		
		if(avg>=60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		
	}

}
