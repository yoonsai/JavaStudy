import java.util.Scanner;
public class 응용문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력:");
		int a=scan.nextInt();
		if(a>=0)
			System.out.println(a+"는 양수입니다.");
		if(a<0)
			System.out.println(a+"는 음수입니다.");
	}

}
