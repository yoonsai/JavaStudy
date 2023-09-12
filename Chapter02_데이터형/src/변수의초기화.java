/*
 * 변수에 초기화
 * 1) 변수 추출
 * 2) 변수 선언(데이터형을 어떤걸 쓸거냐)
 * 3) 변수 초기화
 *    (1) 명시적인 초기화
 *      - int a=10;
 *    (2) 입력값을 받아 저장
 *      - scanner : 키보드 입력값을 받을 때 사용
 *      - BufferedReader -> 예외처리를 해줘야함
 *    (3) 임의값을 받아서 초기화
 *      = 랜덤
 *    (4) 크롤링
 */
import java.util.Scanner;
public class 변수의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=100;
//		int b=(int)(Math.random()*100); //random은 실수를 가져옴 0.0이상~1.0미만 = 0.0~0.99까지 => (Math.random()*100) = 0~99까지 // (Math.random()*100)+1 => 0부터 100까지
//		System.out.println(b);
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수입력 :");
//		int c=scan.nextInt();
//		System.out.println(c);
		
		int a=10;
		int b=20;
		//a=20. b=10으로 바꾸고 싶음
		int temp=a; // 변수가 2개있고 값을 바꾸고 싶을땐 임시변수 선언해줘야함 (정렬할때 주로 사용)
		a=b;
		b=temp;
		
	}

}
