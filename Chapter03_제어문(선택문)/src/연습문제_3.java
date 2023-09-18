import java.util.Scanner;
public class 연습문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		
		if(a<0)
			System.out.println("a="+(a*-1));
		else
			System.out.println("a="+a);
	}

}
