/*
 *  자바 제어문 종류
 *  -----------
 *  조건문
 *   = 단일조건문
 *     if(조건문){ => true/false (부정연산자, 논리연산자, 비교연산자)
 *       true일때 수행문장
 *     }
 *     => 독립적인 경우
 *   = 선택조건문 true와 false를 나눠서 처리하는 방법 => if~else
 *     => 로그인 여부
 *   = 다중조건문 if~else if~else => 한개의 문장만 수행
 *    
 *  선택문 : 한개의 값을 선택한 경우에 처리 (별점..)
 *       => 카테고리, 메뉴, ... 서버 프로그램
 *       switch(정수,문자,문자열)
 *       {
 *       case 값1:
 *         break;
 *       case 값2:
 *         break;
 *       default:
 *  반복문
 *    for : 횟수지정 => 배열, 컬렉션
 *                   --------- 인덱스번호 => 일정하게
 *                   => for문(for-each)
 *                      for a of list
 *                      for i in
 *          => 1차
 *            for(초기값;조건식;증가식)
 *            {
 *               반복문장
 *            }
 *          => 2차
 *             => 알고리즘 (2차) => SORT, 등수 구하기....
 *                   1    2    9
 *             for(초기값;조건식;증가식)
 *             {
 *                      3   4     6  
 *                for(초기값;조건식;증가식)
 *                {
 *                   반복수행문장  5
 *                }
 *                줄바꿈 7
 *             }   
 *    while
 *  반복제어문
 *  
 */
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		for(int a:arr) // 웹 출력 (목록)
		{
			System.out.println(a);
		}
	}

}
