import java.util.Scanner;

public class 연습문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count3=0, count5=0;;
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.print("정수 입력:");
			int a=scan.nextInt();
			if(a%3==0)
				count3++;
			if(a%5==0)
				count5++;
				
		}
		System.out.println("3의 배수의 갯수:"+count3);
		System.out.println("5의 배수의 갯수:"+count5);
	}

}
