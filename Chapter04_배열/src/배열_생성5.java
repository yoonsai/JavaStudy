/*
 * 양의 정수 10개 입력받아 배열에 저장하고, 
 * 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

 */
import java.util.Scanner;
public class 배열_생성5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
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
