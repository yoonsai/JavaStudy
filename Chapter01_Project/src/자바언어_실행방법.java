/*  1.프로젝트명 설정
 *  
 *  2. src => java 파일 생성
 *     java : 단위가 클래스
 *     클래스 생성
 *     ---------
 *        1. 클래스는 대문자로 시작
 *        2. 단어가 2개 이상일 경우
 *           시작하는 첫자는 대문자
 *           => MainClass. File_Name
 *           
 *  3. 자바에서 숫자표현
 *               => 8진법 011
 *               => 10진법
 *               => 16진법 0xFF => html의 색상표
 *            문자표현 : '한개의 사용이 가능' ('a')
 *            문자열 표현 : "여러개의 문자열 사용이 가능"
 *            
 *  4. 문장이 종료가 되면 ;써야함
 *  -------------명령수행
 *  -------------명령 => 순서 (알고리즘)
 *  5. 들여쓰기
 *  6. 자바 실행
 *  -----------
 *                     컴퓨터 인식(2진 파일)
 *                     0,1                                                 실행
 *  MainClass.java  ======================> MainClass.class(배포파일)    ===============>  
 *     = 원시소스              javac                      byteCode           java
 *     (개발자만 알아보는 소스)                                                 =인터프리터
 *     
 *  7. 프로그램 실행
 *  ------------
 *  컴파일 : 컴퓨터 인식언어로 변경
 *         java /c,c++
 *  인터프리터 : 한줄씩 번영 => HTML
 *  -------------------------------
 *  java : 컴파일 + 인터프리터 (보안이 뛰어남)
 *  => 자바 : 게임에 사용되는 언어 (세븐스타)
 *      = 임베디드 => 모바일
 *  => 그린 프로젝트 : 모든 기계를 리모콘 한개로 제어 => 1차 부도 => 네스케이프 (브라우저 업체) => 웹
 *  => 개별업체 (썬 마이크로 시스템) => 자바언어 사용(제임스 고슬린 + 아서벤이 만듦)
 *  => 1995년 5월 23일 자바탄생
 *  => 1996년 한국상륙
 *  => MS <=> 연합군(오라클, 썬)
 *  => MS (ms-sql, windows)
 *     sum (솔라리스) => 인수 => mysql
    => 2차부도
    => 오라클 인수 => 자바 유료화
    ----------
    자바의 제작 (제임스 고스링) -> 구글로 이직함(GO언어 만듦)
    => 모바일 (유료화 => 안드로이드 자바-> Kotlin으로 변경)
    *** 스프링 (오픈소스) => 준비(자바, 코틀린)
    ----------------------------------------------
    8. 자바 필수 지식
    1) 변수 (한개의 데이터 저장)
       - 데이터형 (정수,실수,문자...)
       -----------------------------
    2) 가공 : 연산자, 제어문
    3) 모아서 관리 : 배열 (같은 것만 모은다)
    4) 다른 데이터를 모아서 관리 : 클래스
    5) 클래스 : 재사용, 보안, 수정, 추가
    ------------------------------
       ===> 객체지향 프로그램
    6) 예외처리
    7) 라이브러리
    =====> IO(파일 입출력),  오라클 연결
                          ----------  
                          
                          
                          
                          
 *  2page 
 *  자바언어의 특징
 *  -----------
 *  1)실행방법
 *    = 컴파일 방식 ==> 2진파일로 변경 ( 컴퓨터가 인식하는 언어)
 *                   c/c++,,,java
 *                   기계어
 *            ****자바의 특징
 *                컴파일
 *                 c/c++ => 컴파일시 운영체제마다 다른 컴파일을 한다
 *                       => 컴파일된 내용이 다르다
 *                 java  => 운영체제마다 동일
 *                 => 컴파일된 파일 : 바이너리코드
 *                                 ------------
 *                                 One write       
 *   
 *    = 인터프리터 방식  ==> 한줄씩 번역해서 실행
 *              HTML / CSS
 *    = 보안 => 두번을 검색하기 때문에 (소스 검증)
 *      => 보안이 뛰어나다 => 인증시스템
 *               
 *                자바소스
 *                  ㅣ
 *                  JVM => 파일(dll)
 *                  ㅣ
 *          ------------------------
 *          ㅣ        ㅣ         ㅣ
 *          리눅스   원도우       mac
 *          =실행과정
 *                      기계어로 변경(javac)          한줄씪 번역(java)
 *          a.java ====================== A.class ================> Hello java!!
 *          프로그래머 코딩       컴파일       바이너리코드      인터프리터
 *          
 *               => 편집기 : 이클립스. 인텔리j (파이참)
 *               --------------------------- 어시스트
 *               이클립스 = java+javac => ctrl+f11
 *          --------------------------------------
 *          다운로드 : eclipssljp.org =>J2ee
 *          6page : 개발환ㄱ여 구축
 *          jdk = > 17 (이상버전은 한글 제어에 문제)
 *          ---> 스프링 (14)
 *               스프링 (sts =>3 .   
 *          
 *          ffff
 *          
 *          
 *          => 화면 출력 => ctrl + space
 */ 
public class 자바언어_실행방법 {
	/*
	 * rtrtrtetert rttttttt tttttttttttttt
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("hello java");
	}

}
