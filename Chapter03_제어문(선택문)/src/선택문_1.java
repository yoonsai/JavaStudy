/*
 * 선택문은 범위가 지정되는 것이 아니다
 *    switch(정수, 문자, 문자열) {
		case 10: 
		case 9:
			score='A';
			break; // 종료명령
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
 * 

 * 
 * 밤위가 지정되면 다중 조건문
 * 범위가 없이 값이 1개일때 => switch => 웹,게임, 서버프로그램에서 주로 사용
 * 
 * case값이 동일할 수 없다
 * case값에 실수를 사용할 수 없다
 * case 값:
 * case문장을 수핼하고 종료시에는 반드시 break
 * case에 사용하는 순서는 상관이 없음 (default를 먼저 써도됨)
 * 
 */

import java.util.Scanner;
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,total,avg;
		double avg2;
		char score=' ';
		//switch case는 실수 불가능
				
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수:");
		a=scan.nextInt();
		System.out.print("영어점수:");
		b=scan.nextInt();
		System.out.print("수학점수:");
		c=scan.nextInt();
		
		total=a+b+c;
		avg2=total/3.0;
		
		avg=(int)(avg2/10);
		//10,9,8,7,6,5,4,3,2,1,0
		
		
		switch(avg) {
		case 10: // => if(avg==10 || avg==9)
		case 9:
			score='A';
			break; // 종료명령
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
		
		System.out.println("총점:"+total);
		System.out.printf("총점:%.2f\n",avg2);
		System.out.println("학점:"+score);
		
	}

}
