import java.util.Scanner;
public class 연습문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		int b=a/10;
		char result=' ';
		
		switch(b)
		{
		case 10:
		case 9:
			result='A';
			break;
		case 8:
			result='B';
			break;
		case 7:
			result='C';
			break;
		case 6:
			result='D';
			break;
	    default:
	    	result='F';
		}
		
		System.out.println(result+"학점입니다.");
	}

}
