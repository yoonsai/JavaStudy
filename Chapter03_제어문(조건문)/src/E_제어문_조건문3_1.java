
// 정수 2개 입력, 연산자(+,-,*,/) => 연산처리 (4칙연산)
// 다중 조건문 사용
/*
 * if(op=='+')
 * else if(op=='+')
 * else if(op=='*')
 * else if(op=='/')
 * else => 잘못된 연산자 입력시 오류 메시지
 */

import java.util.Scanner;
public class E_제어문_조건문3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a,b;
		char op=' '; // => 명시적 초기화
		System.out.print("첫번째 정수:");
		a=scan.nextInt();
		System.out.print("두번째 정수:");
		b=scan.nextInt();
		System.out.print("연산자 입력:");
		op=scan.next().charAt(0);
		
		// 사용자 입력값 받기
		// 사용자 요청에 따라 결과값을 출력 (가공) = 연산자, 제어문
		//                                =========== 메소드 (예:print)
		// --------------------------------- 재사용
		
		if(op=='+') {
			System.out.println(a+"+"+b+"="+(a+b));
		}
		else if(op=='-') {
			System.out.println(a+"-"+b+"="+(a-b));
		}
		else if(op=='*') {
			System.out.println(a+"*"+b+"="+(a*b));
		}
		else if(op=='/') {
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.println(a+"/"+b+"="+(a/b));
			}
		}
		else
		{
			System.out.println("잘못된 연산자입니다.");
		}
		                                   
	}

}
