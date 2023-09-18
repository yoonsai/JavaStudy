/*
 * 사칙연산
 * 정수를 2개 => 연산자(문자열)
 * 정수 3개 => 1개 결과값
 * 
 */

import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		int result=0; // 초기값을 안주면 오류남
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수:");
		num1=scan.nextInt();
		System.out.print("두번째 정수:");
		num2=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		switch(scan.next())
		{
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break; // break 안쓰면 맨 마지막 연산까지 처리함
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break; 
		default:
			System.out.println("잘못된 연산자입니다!");
		}
		
		System.out.println("계산결과:"+result);
	}

}
