import java.util.Scanner;
public class 연습문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		
		if(a>=90)
			System.out.println("A학점 입니다.");
		else if(a>=80)
			System.out.println("B학점 입니다.");
		else if(a>=70)
			System.out.println("C학점 입니다.");
		else if(a>=60)
			System.out.println("D학점 입니다.");
		else
			System.out.println("F학점 입니다.");
	}

}
