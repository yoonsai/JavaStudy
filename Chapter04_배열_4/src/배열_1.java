/*
 * 1. 배열, 변수 => int,string
 *               -----------
 *               
 * 2. 요청 처리 => 연산자, 제어문 (메소드화)
 *              -----------
 *    연산자 : 산술연산자 (+,%)   
 *           비교연산자, 논리연산자, 대입연산자(+=)
 *    제어문 : if, if~else
 *           for : 향상된 for => 출력
 *                  -------------- 웹,JanaScript
 *                                        |
 *                                       라이브러리
 *                                       forEach,map
 *                                       => Vue,React,Redux
 *                                       
 *           while : 데이터베이스 연동 (오라클에서 데이터 읽기)                            
 *   -----------------------------------------  기본 과정
 *  3. 분리작업 => 관련된 내용을 묶어서 사용
 *     -----
 *     데이터 묶어서 사용
 *       = 배열
 *       = 클래스
 *     명령문 묶어서 => 입력/처리/출력 = 메소드
 *     ------------------------------- +
 *        => 객체 지향 프로그램 : 재사용, 수정, 기능추가, 데이터 노출 방지
 *                          ----- ------------ ------------ 캡슐화
 *                             |    다형성(오버라이딩, 오버로딩)
 *                             |
 *                            변경해서 사용 => 상속(is-a)
 *                            있는 그대로 사용 => 포함 (has-a)
 *     -------------------------------------------------------------
 *     1. 설계 => 인터페이스
 *     2. 비정상 종료를 방지 (오류를 사전에 처리) => 예외처리
 *     3. 라이브러리 => 조립식 프로그램
 *        --------네트워크, 데이터베이스 연동
 *     
 *                           
 *     배열     
 *     ---- 데이터 묶기
 *     => 연속적으로 메모리 할당 => 인덱스를 이용
 *     => ------ 메모리 크기가 동일
 *     =>        --------- 데이터형이 동일
 *     => 고정적이다 (크기를 선언하면 => 수정이 어렵다)
 *                               ---
 *                               큰 배열을 다시 만들어서 사용
 *     ----------------------보완 : 컬렉션 (******)
 *     배열 사용법
 *     --------
 *     1. 배열선언
 *        데이터형[] 배열명; => 자바 권장사항
 *        -------
 *        데이터형 배열명[]; => c언어
 *     2. 초기값 부여
 *        --------
 *        1) 명시적 초기화 => int, char
 *           => int[] arr={};
 *        -------------
 *        2) 크롤링 초기화
 *        3) 파일
 *        ------------- String
 *        4) 입력 => int, char
 *           int[] arr=new int[2];
 *           arr[0]=scan.nextInt();
 *           arr[1]=scan.nextInt();
 *        5) 난수 => int, char
 *          ---------------------형식, 순서
 *           int[] arr=new int[2];
 *           arr[0]=(int)(Math.random()*100);
 *           arr[1]=(int)(Math.random()*100);
 *           => 저장된 데이터가 많은 경우
 *              for => index이용
 *        
 *     3. 필요시에 수정
 *        arr[0] => 일반 변수와 동일
 *        arr[0]=100 => arr[0]=1000....
 *        => 배열의 장점  : 변수명이 동일 => 인덱스번호 이용
 *                                   ---------
 *                                     순차적
 *     4. 출력 => 검색
 *        ---
 *        향상된 for문 => 간결하다, 속도가 빠르다
 *        for(데이터형 변수명:배열, 컬렉션)
 *            -----      ---------
 *              | 배열에 저장된 데이터형 (일치, 큰 데이터형을 사용하다)
 *            => 실제 데이터를 1개씩 읽어온다
 *     5. 배열의 갯수 : 배열명.length
 *                   ----------- 갯수
 *     -------------------------------
 *     6. 출력시에 => 항상 0번부터 출력하는 것은 아니다
 *                 필요시에는 length-1
 *     7. 배열의 범위를 초과하면 => ArrayIndexOutOfBoundsException
 *        [1]
 *        --- 인덱스, 첨자
 *     8. 자동 초기화
 *        -------- new를 이용하면 메모리 할당시에 자동 초기화
 *        int => 0
 *        double => 0.0
 *        boolean => false
 *        char => '\u0000' => null값
 *        모든 클래스는 null값 초기화 ==> 107page
 *        int[] arr; ==> arr=null => 참조변수
 *           => int[] arr={1,2,3,4,5}
 *           => int[] arr=new int[5];
 *                    ---- 0,0,0,0,0
 *        String s; => null
 *     9. 메모리 할당
 *        int[] arr=new int[3];
 *        ---------
 *        
 *        arr   실제 저장되는 위치(Heap)
 *                arr[0] arr[1] arr[2] => 무조건 순차적
 *        ----- -------------------
 *        100      0     0      0
 *        ----- |------------------
 *                              
 */


import java.util.*;
public class 배열_1 {
	public static void main(String[] args) {
		//변수선언 => year, month => 입력
		int year,month;
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력:");
		year=scan.nextInt();
		System.out.print("월 입력:");
		month=scan.nextInt();
		//처리 => 달력을 만들기 위한 처리 ==> 세부적 (메소드가 많을 수 있다)
		// => 1년 1월 1일 ~요청 날짜 => 총 날수 % 7 = 요일 => 1일자에 대한 요일
		// 1. 전년도까지의 합
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400; // 윤년조건
		// 2. 전달까지의 합
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		// 문제 발생 ==> 2월 (윤년 => 29, 윤년(x) => 28)
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
		//전달까지의 합
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		total++;
		
		int week=total%7;
		System.out.println(week);
		
		
		
		char[] strWeek= {'일','월','화','수','목','금','토'};
//		System.out.println(year+"년도"+month+"월 1일은 +"strWeek[week]+"요일입니다.");
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		
		
		
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
		// 3. +1
		//달력 출력 ==> 메소드
	}
}
