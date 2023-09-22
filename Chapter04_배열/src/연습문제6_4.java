import java.util.Scanner;

public class 연습문제6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int max=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("정수입력:");
			a[i]=scan.nextInt();
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);
	}

}
