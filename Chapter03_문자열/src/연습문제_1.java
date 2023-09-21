import java.util.Scanner;
public class 연습문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // BufferedReader
		Scanner scan=new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int a=scan.nextInt();
		int b=a/10;
		int c=a%10;
		if(b==c)
			System.out.println("10의자리와 1의 자리가 같습니다.");
		else
			System.out.println("10의자리와 1의 자리가 같지 않습니다.");
	}

}
