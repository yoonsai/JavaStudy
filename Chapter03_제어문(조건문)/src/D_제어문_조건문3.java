/*
 * 다중 조건문 => 결과값이 1개만 도출
 * 형식)
 *     if(조건문)
 *     {
 *        조건이 true일때 수행문장 => 종료
 *        false가 되면 바로 아래 else if로 넘어감
 *     }
 *     else if(조건문)
 *     {
 *        조건이 true일때 수행문장 => 종료
 *        false가 되면 바로 아래 else if로 넘어감
 *     }
 *     else if(조건문)
 *     {
 *        조건이 true일때 수행문장 => 종료
 *        false가 되면 바로 아래 else if로 넘어감
 *     }
 *     else if(조건문)
 *     {
 *        조건이 true일때 수행문장 => 종료
 *        false가 되면 바로 아래 else if로 넘어감
 *     }
 *     else // 생략이 가능 => 해당 조건이 없는 경우에 처리
 *     {
 *     } 
 *     
 *     // 한개의 문장만 수행
 *     // 게임, 네트워크 서버
 *     
 *    
 */

// 국어, 영어, 수학 점수를 입력받아서 => 총점, 평균, 학점, 합격/불합격을 구해서 출력

import java.util.Scanner;
public class D_제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kr,en,ma,total;
		double avg;
		char score=' '; // 명시적인 초기화

		// 입력값을 받는다
		
		//초기화
		//결과값을 출력 => 제어문, 연산자 ==> Dos,브라우저,모바일
		
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수:");
		kr=scan.nextInt();
		System.out.print("영어점수:");
		en=scan.nextInt();
		System.out.print("수학점수:");
		ma=scan.nextInt();
		
		
		total=kr+en+ma;
		avg=total/3.0;
		
		if(avg>=90) {
			score='A';
		}
		else if(score>=80) {
			score='B';
		}
		else if(score>=70) {
			score='C';
		}
		else if(score>=60) {
			score='D';
		}
		else {
			score='F';
		}
		
		System.out.println("국어:"+kr);
		System.out.println("영어:"+en);
		System.out.println("수학:"+ma);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
		
	}

}
