import java.util.Scanner;
public class 연습문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.print("정수 입력:");
			int a=scan.nextInt();
			if(a%2==0)
				count++;
				
		}
		System.out.println("짝수의 갯수:"+count);
		
	}

}
