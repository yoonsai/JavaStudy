/*
 * 변수 : 저장 공간 
 * ===
 *  자바 저장 공간을 설정 (자료형, 데이터형)
 *  -----------------------------
 *  정수
 *   byte -> 1byte (8bit) => 0,1을 8개를 채워서 숫자 한개 저장  =>128~127
 *   int -> 4byte (32bit) => -21억 4천~21억 4천 = default (컴퓨터에서 모든 숫자는 int로 인식)
 *   long -> 8yte(64bit) => 금융권, 빅데이터
 *  실수 
 *   double(64bit) => 소수점 15자리 이상
 *  문자
 *   char (16bit) => 0~65535 (문자번호)
 *        'A' (x) ==> 65
 *  논리
 *   boolean : true, false (8bit) => 0,1
 *  --------------------------------------------------------------------
 *  정수 3개 저장
 *  int a,b,c;
 *      -----
 *      변수 (데이터가 저장된 공간의 이름)
 *  실수 2개 저장
 *  double d1,d2;
 *  문자 1개
 *  char c;
 *  boolean aa;
 *  ----------------> 데이터 저장 -------> 사용자 요청에 맞게 가공 -----> 화면 출력
 *  ----------------> 프로그램 (반복)              |
 *                                           연산자
 *  자바에서 제공하는 연산자
 *  -----------------
 *   단항연산자 a++,-a (피연산자가 1개)
 *   => 증감연산자(++,--) : 한개 증가, 한개 감소
 *   => 부정연산자(!) => boolean에서만 가능
 *      boolean bCheck=false;
 *      bCheck!=bCheck == bCheck=true
 *      예약가능한 날 => !(예약가능한 날)
 *   => 형변환연산자 (type) => 강제형변환
 *      -------- 객체지향 형변환 (클래스)
 *      숫자관련만 (정수, 실수, 문자)
 *      ----------------------
 *        UpCasting : 데이터형을 크게 만든다
 *         int => double
 *         char => int
 *         -------------- 자동형변환됨
 *         int a='A'
 *               ----int 변경 ('A'=>65)
 *         double d=100
 *                  ---- double변경 (100=>100.0)
 *        DownCasting : 데이터형을 작게 만든다
 *         char c=(char)65; c='A'
 *         int i=(int)100.0 i=100
 *      
 *      데이터형의 크기
 *      ------------
 *      byte < char < int < long < float < double  
 *             short
 *      
 *      자동 형변환
 *      --------
 *        연산 처리시 많이 변경 (자바자체)
 *        -------
 *        데이터형이 같은 것끼리 연산이된다
 *        
 *        => double + int (x)
 *                   -----double로 자동 변경
 *        => char + int (x)
 *           -----int로 자동 변경
 *        => int + long (x)
 *          -----long으로 자동 변경
 *        int이하 데이터형은 연산시 결과값 int로
 *        
 *   이항연산자
 *   => 산술연산자 (+,-,*,/,%)
 *      ****우선순위 *,/,% => +, -
 *      + : 두개의 값을 더한다 (1+2=3)
 *          문자를 합쳐준다 ("7"+"7"="77")
 *      / : 정수/정수 = 정수, 정수/실수 = 실수
 *                        정수/(double)정수 = 실수 
 *      ****0으로 나눌 수 없음      
 *      % : 왼쪽 부호
 *          => 윤년 구하기, 숫자 자르기 ..., 배수 구하기               
 *          
 *   => 비교연산자 (==,>,<,>=,<=) => 결과값은 true/false
 *   ***문자(''), 정수, 실수
 *      자바는 모든 국가의 언어 사용이 가능(유니코드 사용) => '한글'은 한글자당 2byte
 *      ==같다
 *      !=같지 않다
 *      < 작다 (왼쪽 기준)
 *      > 크다
 *      <=
 *      >=
 *   => 논리연산자 (&&, ||)
 *      && : 직렬연산자 (조건 2개가 true일 경우에만 true)
 *      || : 병렬연산자 ( 조건 2개 중에 한개 이상 true일 경우 true)
 *   => 대입연산자 (=,+=,-=)
 *      = 일반 대입
 *      += ========> a+=1 ==> a=a+1 => 여러개 증가
 *      
 *   삼항연산자 : 조건연산자
 *   (조건)?값1:값2
 *   -----
 *   true
 *   
 */
import java.util.Scanner;
public class A_자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(10); // 10이라는 값을 잊어버리지 않기 위해 변수에 저장
		Scanner scan=new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수를 입력해주세요(90 90 80):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int sum=a+b+c;
		double avg=(a+b+c)/3.0;
		
		System.out.println("국어점수:"+a);
		System.out.println("영어점수:"+a);
		System.out.println("수학점수:"+a);
		System.out.println("총점:"+sum+" 평균:"+avg);
		System.out.println();
		System.out.print(avg>=90 && avg<=100?"A학점":"");
		System.out.print(avg>=80 && avg<90?"B학점":"");
		System.out.print(avg>=70 && avg<90?"C학점":"");
		System.out.print(avg>=60 && avg<70?"D학점":"F학점");

		
		//System.out.println(a+"와 "+b+"와 "+c+"의 총점은"+sum+"이고 평균은"+avg+"입니다.");
		
//		System.out.print("첫번째 정수를 입력해주세요:");
//		int d=scan.nextInt();
//		System.out.print("두번째 정수를 입력해주세요:");
//		int e=scan.nextInt();
//		System.out.print("세번째 정수를 입력해주세요:");
//		int f=scan.nextInt();
//		int sum1=a+b+c;
//		double avg1=(a+b+c)/3.0;
//		
//		System.out.println("총점:"+sum1+" 평균:"+avg1);
		
		
	}

}
