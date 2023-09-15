import java.util.Scanner;
public class 응용문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.print("세번째 정수 입력:");
		int num3=scan.nextInt();
		
		int sum=num1+num2+num3;
		double avg=(num1+num2+num3)/3.0;
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		
		int max=num1;
		if (max<num2)
			max=num2;
		if (max<num3)
			max=num3;
		System.out.println("최대값:"+max);
		
		int min=num1;
		if (min>num2)
			min=num2;
		if (min>num3)
			min=num3;
		System.out.println("최소값:"+min);

		

		
		
	}

}
