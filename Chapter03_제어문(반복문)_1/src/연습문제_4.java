import java.util.Scanner;
public class 연습문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int a=scan.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+a+"까지의 합:"+sum);
	}

}
