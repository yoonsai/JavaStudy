import java.util.Scanner;
public class 제어문_반복제어문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		// 123456789
		while(true) {
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu<1 || menu>9)
			{
				System.out.println("다시 선택해주세요");
				continue;
			}
			if(menu==9)
				//System.exit(0); => 프로그램 전체 종료
				break; // => while만 종료, 밑에 문장을 수행하려면 System.exit(0)를 쓰면 오류
			System.out.println(menu+"번 메뉴를 선택하셨습니다.");
			
		}
		System.out.println("프로그램 종료!");
	}

}
