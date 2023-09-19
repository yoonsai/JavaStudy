/*
 * 식별자 => 변수/상수/메소드/클래스/인터페이스
 * 
 * 
 * 자바에서 제공하는 제어문
 * ------------------
 *   1. 조건문 : 형식, 사용처
 *     = 선택문 : 값이 1개 => 키보드, 서버 프로그램 => 어플리케이션
 *       형식) 
 *            switch(정수, 문자열, 문자)
 *            {
 *            case 값:
 *               실행문장
 *               break; => 실행문장 수행 후 종료
 *               ------ 중복적으로 실행문장이 있는 경우에는 break생략 가능
 *            case 값2:
 *               실행문장
 *               break;
 *            default: 값이 없는 경우 실행문장
 *            }
 *     = 단일조건문
 *       형식) 
 *            if(조건문) { => true/false
 *                          -------------비교연산자/논리연산자/부정연산자
 *                 조건이 true일때 처리 문장
 *            }
 *            => 웹에서 상세보기, 로그인, 아이디찾기...
 *            => 독립적이다 (if문마다 따로 수행)
 *            => 조건에 해당되는 모든 내용 출력...
 *     = 다중조건문
 *       형식) 
 *            if(조건문) {
 *                 조건이 true일때 처리문장 => 문장 수행 후 종료
 *                 조건이 false일때 다음 else if를 찾아감
 *            }
 *            else if(조건문) {
 *                 조건이 true일때 처리문장 => 문장 수행 후 종료 
 *                 조건이 false일때 다음 else if를 찾아감
 *            }
 *            else if(조건문) {
 *                 조건이 true일때 처리문장 => 문장 수행 후 종료
 *                 조건이 false일때 다음 else if를 찾아감
 *            }
 *            else {
 *                 조건이 없는 경우 
 *            }
 *     = 제어문 / 변수 / 연산자 ==> 자바스크립트, 오라클
 *     = 선택조건문 : true와 false를 나눠서 처리
 *       형식) 
 *            if(조건문) {
 *                 조건이 true일때 처리문장 => 문장 수행 후 종료
 *              
 *            }
 *            else  {
 *                  
 *                 조건이 false일때 수행 => 로그인이 안됐을 때
 *            }
 *            
 *   2. 반복문
 *   ===============================================================
 *     DB단 : DBA
 *     View단 : HTML, JS
 *     Back단 : Java
 *    --------------------
 *    
 *    
 *     => 종류, 형식
 *     1) 종류
 *        ***for : 반복횟수가 있는 경우 65page
 *              웹) 목록 출력, 쿠키 출력...
 *              => 출력용(자바스크립트)
 *        ***while : 반복횟수가 없는 경우
 *                서버 프로그램, 게임...
 *                데이터베이스프로그램, 파일읽기 => 데이터관리(오라클)에 많이 씀
 *        while(조건문)
 *        {
 *           반복 실행 문장
 *        }
 *        do~while => 반복횟수가 없는 경우 => 한번은 반드시 실행
 *                 => 후조건
 *        do{
 *           반복실행문
 *        }while(조건문)
 *   
 *   
 *   for => 2차 for (알고리즘) => 코테
 *   형식)  
 *              1 ->  2  -> 4
 *        for(초기값;조건식;증감식)
 *                 ---- true
 *        {
 *            반복 실행문장 -> 3
 *        }
 *        
 *        for(int i=0;i<=10;i++) => i가 1부터 10까지 = 10번 반복
 *        {
 *            반복 실행문장 -> 3
 *        }
 *        
 *        1 => 2 => 3 => 4
 *             ===========
 *             2 => 3 => 4
 *             ===========
 *             2 => 3 => 4
 *             
 *        초기값 : 조건식에 사용할 변수 선언 => 값은 한번만 사용
 *        조건식 : 반복 횟수 => 반복문을 중단할지 여부 확인
 *               false => 종료, true => 반복 수행
 *        증가식 : 조건식이 false가 되는 조건을 만든다
 *        -----
 *        한개 ++
 *        여러개 +=
 *   3. 반복제어문
 */
public class A_제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("=====for======");
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello For문"); 
		}
		System.out.println("=====for======");
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello For문"); 
		}
		System.out.println("=====for======");
		for(int i=10;i>=0;i--) //증감식
		{
			System.out.println("Hello For문"); 
		}
	}

}
