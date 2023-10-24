/*
 *  1. Math : 수학
 *      => Math.random() ==> java.util.Random()
 *                           Random r=new Random()
 *                           r.nextInt(100) => 0~99
 *      => Math.ceil() : 웹에서 가장 많이 사용
 *                    --------------------
 *                      | 페이징 => 무한 스크롤 => 
 *                        ---- 총페이지를 구함
 *         => 올림 메소드
 *            172/10.0 ==> 17.2 ==> 18(올림) ==> 2
 *            => 배열 => 컬렉션
 *   ------------------------------------------------
 *   => final 클래스 => 변경이 불가능 => 있는 그대로 사용, 오버라이딩 불가능
 *                 => 모든 메소드가 static이다 => math는 객체생성을 안함
 *   => Math는 리턴형이 대부분 double
 *                            
 *                     
 *  2. System
 *   ---------
 *   System.out.println() => 웹 => 확인
 *       정상적으로 사용자가 데이터를 보냈는지 확인
 *       동작 순서를 확인
 *       에러 => 처리
 *   
 *   System.gc() => 메모리 해제 요청, 웹서버(톰켓)
 *   System.exit() => 프로그램 종료 ==> 윈도우
 *   -----------
 *   *** String / StringBuffer / Wrapper
 *   데이터형 ==> 문자열로 변경할 줄 알아야함
 *   문자열 ==> 다른 데이터형으로 변경
 *   ----
 *   => 2진법 ,8진법, 16진법 표현
 *   ------------------------- => 10진법으로 표현  
 *   
 *   
 */
import java.util.*;
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.print("총 갯수:");
//		int total=scan.nextInt();
//		
//		// ==> 10개씩 나눠서 출력 ==> 총페이지 
//		// 이전  1/10  다음
//		int page=(int) Math.ceil(total/10.0);
//		//SELECT CEIL(COUNT(*)/10.0) FROM recipe;
//		System.out.println("총페이지:"+page);
		
		int a=10;
		System.out.println(Integer.toBinaryString(a)); // 2진법
		System.out.println(Integer.toOctalString(a)); // 8진법 ,
		System.out.println(Integer.toHexString(a));  // 16진법
		
		
	}

}
