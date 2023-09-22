/*
 * 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
 * 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라
 */
import java.util.Scanner;
public class 연습문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int sum=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("정수입력:");
			a[i]=scan.nextInt();
			
		}
		for(int b:a)
		{
			System.out.print(b+" ");
			sum+=b;
		}
		System.out.println("\n평균:"+sum/10.0);
	}

}
