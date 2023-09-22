/*
 * 5개 정수를 입력받은 후 차례로 출력하는 프로그램 

 */
import java.util.Scanner;
public class 연습문제6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.print("정수입력:");
			a[i]=scan.nextInt();
		}
		for(int b:a)
		{
			System.out.print(b+" ");
		}
	}

}
