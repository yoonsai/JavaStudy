/*
 * 정수 입력을 1개를 입력 받는다
 * >>11
 * 같은 숫자입니다
 * >>88
 * >>77
 * 
 */
import java.util.Scanner;
public class 단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력해주세요:");
		int a=scan.nextInt();
		if(a>=1 && a<=100) {
			
			int b=a/10;
			int c=a%10;
			if(b==c)
				System.out.println("같은 숫자입니다.");
			if(b!=c)
				System.out.println("다른 숫자입니다.");
		}
		if(a<1 && a>99) {
				System.out.println("잘못된 입력값입니다.");
		}
		
	}

}
