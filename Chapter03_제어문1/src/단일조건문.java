/*
 * 조건문은 반드시 true/false가 나와야함
 *            ------------
 *            비교연산자/논리연산자/부정연산자
 */
import java.util.Scanner;
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int a=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/): ");
		char op=scan.next().charAt(0);
		System.out.print("두번째 정수 입력: ");
		int b=scan.nextInt();
		
		if(op=='+') {
			System.out.println(a+"+"+b+"="+(a+b));
		}
		if(op=='-') {
			System.out.println(a+"-"+b+"="+(a-b));
		}
		if(op=='*') {
			System.out.println(a+"*"+b+"="+(a*b));
		}
		if(op=='/') {
			
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			if(b!=0) {
				System.out.println(a+"/"+b+"="+(a/b));
			}			
		}
		if(!(op=='+' || op=='-' || op=='*' || op=='/'))
			System.out.println("잘못된 연산자 입니다.");
		
//		if(op=='+') {
//			System.out.println(a+"+"+b+"="+(a+b));
//		}
//		else if(op=='-') {
//			System.out.println(a+"-"+b+"="+(a-b));
//		}
//		else if(op=='*') {
//			System.out.println(a+"*"+b+"="+(a*b));
//		}
//		else if(op=='/') {
//			
//			if(b==0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//			}
//			if(b!=0) {
//				System.out.println(a+"/"+b+"="+(a/b));
//			}			
//		}
//		else {
//			System.out.println("연산자 오류");
//		}

	}

}
