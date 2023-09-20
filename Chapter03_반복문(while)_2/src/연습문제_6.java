/*
 * 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

 */
import java.util.Scanner;
public class 연습문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("시작 정수 입력:");
		int start=scan.nextInt();
		System.out.print("끝 정수 입력:");
		int end=scan.nextInt();
		int sum=1;
		for(int i=start;i<=end;i++)
		{
			sum*=i;
			
		}
		System.out.println(start+"부터"+end+"까지 곱의 합:"+sum);
		
	}

}
