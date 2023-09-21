import java.util.Scanner;
public class 연습문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int a=scan.nextInt();
//		if(a==12 || a==1 || a==2)
//			System.out.println("겨울");
//		else if(a>=3 && a<=5)
//			System.out.println("봄");
//		else if(a>=6 && a<=8)
//			System.out.println("여름");
//		else if(a>=9 && a<=11)
//			System.out.println("가을");
		
		switch(a)
		{
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:	
			System.out.println("여름");
			break;
		case 9:	case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			
		}
			
	}

}
