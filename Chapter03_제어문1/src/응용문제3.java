import java.util.Scanner;
public class 응용문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력:");
		int a=scan.nextInt();
		System.out.print("학년 입력(1~4):");
		int grade=scan.nextInt();
		if(a>=0 && a<=100) {
			if(grade==4) {
				if(a>=70)
					System.out.println("합격입니다.");
				if(a<70)
					System.out.println("불합격입니다.");
			}
			if(grade!=4) {
				if(a>=60)
					System.out.println("합격입니다.");
				if(a<60)
					System.out.println("불합격입니다.");
			}
		}
		if(a<0 || a>100) //범위를 벗어난 경우 ||
			System.out.println("잘못된 값입니다.");
			
	}

}
