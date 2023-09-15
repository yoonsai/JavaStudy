/*
 *
 * 자바
 * ----
 * 1. 데이터 저장
 * 변수 : 한개만 저장 ( 메모리 공간 )
 * => 변수 : 프로그램에 따라 변경이 가능
 * => 상수 : 고정 (final)
 * 2. 저장방법
 *  1) 정수
 *     1byte(-128~127) => byte => 네트워크(송수신), 파일업로드, 다운로드, web
 *     int : default => 모든 컴퓨터는 모든 숫자를 int로 인식 => 4byte(32비트)
 *     long : 64bit(큰숫자를 저장할때 사용) => 빅데이터, 금융권
 *     --------------------------------------------------------------
 *     정수 저장 => 10
 *     int 메모리공간=10
 *     ---{} 종료시, 프로그램 종료 => 사라진다
 * 
 *  2) 실수
 *     double : 64bit => 15자리 소수점 저장이 가능
 *  3) 문자
 *     char (0~65535) => 각문자마다 고유번호를 가지고 있다
 *     컴퓨터는 무조건 => 0,1
 *     => 'A' => 65
 *     => 'a' => 97 (대문자랑 32차이)
 *     => '0' => 48
 *  4) 논리
 *     boolean : 1byte
 *               => 저장할 수 있는 값 (true/false)
 *  ---------------------------------------------
 *  데이터 가공
 *  -------- 점수입력 (국어, 영어, 수학) => 평균, 총점, 등수
 *                                   -------------
 *  
 *  웹 => 조회수 증가, 인기순위 (데이터 가공)
 *       hit=hit+1
 *       => 연산자, 제어문
 *          ----- ----- -> 재사용(메소드)
 *                        ----------- 컴포넌트/클래스
 *  연산자
 *  -----
 *  산술연산자 (+,-,*,/,%)
 *  => 주의점
 *     => 형변환 (연산처리 => 같은 데이터형이여야 연산된다)
 *        int + char + double => double크기에 맞춰서 연산
 *        --------------------- double = 자동형변환
 *        int + (int)char + (int)double 
 *        ------------------------------int = 강제형변환
 *      => + :산술, 문자열결합                 
 *      => /
 *         정수/정수=정수 , 정수/실수=실수 
 *         0으로 나눌때 오류발생
 *      => % => 왼쪽부호가 남는다
 *      => 기타
 *         int + double = double
 *         char + int = int
 *         char + char = int
 *         byte + byte = int
 *         char + byte = int
 *         --------------------산술규칙
 *       
 *   단항연산자
 *      = 증감연산자 (++.--)
 *        => 전치연산자
 *           ++a : 먼저 증가 => 그다음 다른 연산 수행
 *           --a : 
 *           
 *        => 후치연산자
 *           ++a : 먼저 다른 연산 수행 => 그다음 증가
 *      = 부정연산자 
 *      = 형변환연산자    
 *        (데이터형)
 *        byte < char, short < int < long < float < double
 *   -----------------------------------------------------
 *   비교연산자 (문자열은 비교할 수 없음)
 *      정수/실수/문자 => equals,compare
 *      = (==)
 *      = !=
 *      = >
 *      = <
 *      = <=
 *      = >=
 *   논리연산자
 *     &&(포함), ||(포함이 안된경우)
 *     
 *   ----------------------------------------------------- 비교&논리 연산자는 결과값이 boolean(true/false)
 *   대입연산자
 *   = ==> a=10
 *   += ==> a+=10 => a=a+10 => 기존의 a값에서 10을 더한 값을 a에 대입
 *   -= ==> a-=10 => a=a-10 => 기존의 a값에서 10을 뺀 결과값을 a에 대입
 *   
 *   삼항연산자 (if~else)
 *   => 두개의 값을 지정한다 => 조건에 따라 1개의 값을 가지고 온다
 *      (조건)?값1:값2
 *      -----
 *      true => 값1
 *      false => 값2
 *         
 *       
 *       
 */
public class 자바정리_특징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
