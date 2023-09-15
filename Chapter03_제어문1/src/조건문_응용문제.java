import java.util.Scanner;
public class 조건문_응용문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		if(a>=50)
			System.out.println(a+"는 50이상입니다.");
		if(a<50)
			System.out.println(a+"는 50미만입니다.");
;
	}

}
