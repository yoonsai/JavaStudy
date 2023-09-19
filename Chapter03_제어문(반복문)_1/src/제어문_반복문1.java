/*
 * 1. 반복문 => 중복을 제거
 *           --------- 메소드
 *    1) 데이터 저장
 *       변수 (한개만 저장이 가능) => 묶어서 사용
 *       
 *       국어, 영어, 수학, 총점, 평균
 *       ---------------------- 배열 ==>  클래스
 *    2) 명령문 => 묶어서 사용
 *       ---------------------- 메소드 
 *                              -----------+   클래스
 *    3) 반복문의 종류
 *       (1) for : 횟수가 지정된 경우에 주로 사용
 *                 => 화면 출력 (영화목록, 맛집목록)
 *       
 *           일반 for / 향상된 for(배열, 컬렉션)
 *              |
 *             => 2차 for까지 (웹에서는 아주 가끔) => 코테
 *       (2) while : 횟수가 없는 경우에 주로 사용
 *                   => 무한루프 (파일 읽기, 데이터베이스...)
 *       (3) do~while : 반드시 한번 이상을 수행 (사용빈도가 거의 없다)
 *       -------------------------------------------------
 *       규정/문법사항은 아님
 *       ---------------
 *       (4) 제어 (다시시작, 종료)
 *       ---------------------
 *       break; 반복문 중단
 *       continue; 특정부분을 제외
 *       ---------------------
 *       for => 형식, 동작(순서), 패턴
 *              for(초기값;조건식;증감식)
 *                  반복실행문장 => 블록을 열고 닫지 않으면 1문장만 for문의 실행문장임
 *                  문장 ==> for문 소속 문장이 아니다
 *              
 *              for() => 가급적이면 블록을 열고 닫는게 좋음 {}
 *              {
 *                  반복실행문장 => 반복수행
 *                  문장 => 반복수행
 *              }    
 *              
 *              동작 형식    
 *                        |false면 종료
 *                   1    2 <== 4---------|
 *              for(초기값;조건식;증감식)       |
 *              {         |true면 3으로 이동  |
 *                  반복실행문장 3 -----------|
 *              }    
 *         
 */
import java.io.*; // 입출력
public class 제어문_반복문1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String s="ABCDEFGHIJKLMNOP";
//		String[] alpha=s.split("");
//		for(int i=0;i<alpha.length;i++)
//		{
//			System.out.println(alpha[i]);
//		}
//		System.out.println();
//		for(String ss:alpha)
//		{
//			System.out.print(ss);
//		}
		FileReader fr=new FileReader("C:\\JavaDev\\JavaStudy\\Chapter03_제어문(반복문)_1\\src\\제어문_반복문1.java");
		int i=0;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

}
