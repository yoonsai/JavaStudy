import java.util.Scanner;
public class 연습문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int a=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int b=scan.nextInt();
		System.out.print("+,-,*,/ 입력:");
		switch(scan.next())
		{
		case "+":
			System.out.print(a+"+"+b+"="+(a+b));
			break;
		case "-":
			System.out.print(a+"-"+b+"="+(a-b));
			break;
		case "*":
			System.out.print(a+"*"+b+"="+(a*b));
			break;
		case "/":
			System.out.print(a+"/"+b+"="+(a/b));
			break;
		}
	}

}
