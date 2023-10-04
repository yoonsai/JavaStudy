/*
 *  리턴형 (처리 결과값 => 반드시 한개만 사용이 가능) => 여러개일때 배열이용
 *       --------------------------------
 *  1) 로그인 요청
 *     --------
 *     boolean => 경우의 수 2개
 *     경우의 수가 3개인 경우
 *     ---------------- id, pwd, login => String, int
 *  2) 기본형 => int, long, double
 *  3) 영화 정보 요청 : class
 *  4) 정렬 => 10 40 50 20 30 => 배열
 *  -------------------------------------------
 *  경우의 수를 잘 따져야함
 *  
 *  예) 정수 => 사칙연산
 *      + int plus(int,int)
 *      - int minus(int,int)
 *      * int gop(int,int)
 *      / String*** div(int,int) => 0으로 나눴을 때 '0으로 나눌 수 없습니다'라는 문구를 띄워야하기 때문에 string  
 */
/*
 * 1. 기능별로 나눠서 처리 (한가지 기능만 수행)
 * 
 *    예)
 *        사람 <===> 자판기
 *        --- 행위자 (액터)
 * 2. 반복이 있는 경우
 * 3. 다른 클래스와 연결 (****)
 */

import java.util.*;
// 1. 정수 한개 입력받아서(2~9) => 구구단을 출력
public class 메소드_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력(2~9):");
		int dan=scan.nextInt();
		
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+i*dan);
		}
	}

}
