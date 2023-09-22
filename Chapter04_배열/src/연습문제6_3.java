import java.util.Scanner;

public class 연습문제6_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("정수입력:");
			a[i]=scan.nextInt();
		}
		System.out.print(a[2]+" ");
		System.out.print(a[4]+" ");
		System.out.print(a[9]+" ");
	}
}
