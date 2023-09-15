import java.util.Scanner;
public class 응용문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수:");
		int a=scan.nextInt();
		System.out.print("두번째 정수:");
		int b=scan.nextInt();
		System.out.print("세번째 정수:");
		int c=scan.nextInt();
		
		int sum=a+b+c;
		double avg=(a+b+c)/3.0;
		System.out.println("총점:"+sum);
		System.out.printf("평균:%.2f",avg);
		System.out.println();
		
		char d='A';
		if(avg>=90)
			d='A';
		if(avg>=80 && avg<90)
			d='B';
		if(avg>=70 && avg<80)
			d='C';
		if(avg>=60 && avg<70)
			d='D';
		if(avg<60)
			d='F';
		System.out.println("학점:"+d);
	}

}
