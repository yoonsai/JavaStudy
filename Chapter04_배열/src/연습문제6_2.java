import java.util.Scanner;

public class 연습문제6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a=new char[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.print("문자입력:");
			a[i]=scan.next().charAt(0);
		}
		for(char b:a)
		{
			System.out.print(b+" ");
		}
	}

}
