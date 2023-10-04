/*
 * 자바 => 클래스 기반 
 *       -----
 *         1. 구성요소
 *            = 변수 : 기본형 데이터 (int, long .... double...)
 *                    참조형 데이터 (배열, 클래스)
 *                                    -----
 *            = 메소드
 *            = 생성자
 *            ------------------------------------ + (객체지향)
 *         2. 메소드 : 특정 작업을 수행하는 일련의 명령문의 집합
 *                   ------- 한가지 기능 수행이 가능하게 만든다
 *                           ------------
 *                              | 수정, 추가 (다형성)
 *             | 주로 사용처 (클래스와 클래스 연결)
 *             | 사용하는 이유
 *               = 재사용
 *               = 유지보수(추가, 수정) => 가독성
 *                 문장 => 단락 => 구조적인 프로그램
 *               = 중복코드 제거
 *             | 메소드 구조
 *               구성요소 : 리턴형, 메소드명, 매개변수 (인자)
 *               [접근지정어][옵션] 리턴형 메소드(매개변수)
 *                             -----     -------
 *                             한개만 사용   0개 이상
 *               = 선언부 / 구현부
 *                 리턴형 메소드(매개변수) // 선언부
 *                 {
 *                    // 구현부 => 구현을 해야 메모리에 저장
 *                 }
 *               = 선언부 / 구현부
 *                 (abstract) 리턴형 메소드(매개변수) // 선언부
 *                 {
 *                    // 구현부 => 구현을 해야 메모리에 저장
 *                 }
 *                 ----------- 수업 => 메소드는 정답은 아니다
 *                 
 *                 = 리턴형 => 한개의 데이터만 설정
 *                           --------------- 기본형, 배열, 클래스
 *                           String => 사용자 정의
 *                    = 메소드 자체에서 처리 => void
 *                    = 호출 후에 처리하는 방법 => 리턴형이 존재
 *                 = 매개변수 => 기본형, 참조형(배열, 클래스)
 *                         => 여러개 사용이 가능(3이상 넘어가면 참조형 이용)
 *                         => 사용자가 요청에 필요한 데이터
 *                 = 메소드명 => 식별자를 이용한다
 *                 ------------------------- 사용자 요청에 대한 처리 (한가지 기능 수행)
 *                 = void method() 
 *                 {
 *                    return; // 생략 => return : 메소드 처리 종료
 *                              ----- 컴파일러에 의해 자동으로 추가
 *                 }
 *                 int method() => 위에가 데이터형이 커도되긴함
 *                 {
 *                    return 10;
 *                           ---- 정수 (데이터형이 왠만하면 동일하는게 좋음)
 *                 }
 *                 double method()
 *                 {
 *                    return 10.5; (10,'a',10.5F)
 *                 }   
 *                 String method()
 *                 {
 *                    return "Hello";
 *                 }   
 *                 int[] method()
 *                 {
 *                    int arr=new int[5];
 *                    return arr; => 주소값을 넘김
 *                 }       
 *                 
 *         3. 메소드 유형
 *         **** 메소드 안에 선언된 변수는 해당 메소드에서만 사용이 가능
 *         void method()
 *         {
 *           int a=10;  => 지역변수 (반드시 초기화 후에 사용이 가능)
 *         } // a는 메모리 해제      
 *         *** 매개변수는 지역변수와 동일 취급
 *         *** return은 메소드 종료를 알려준다
 *         *** 메소드 블록 닫기 전에 return을 사용한다
 *             => 중간에 사용을 해서 종료  
 *         --------------------------------------
 *                  리턴형         매개변수
 *         --------------------------------------
 *                   o              o
 *            => String substring(int start)
 *         --------------------------------------
 *                   o              x
 *            => String trim()
 *               double random()       
 *         --------------------------------------
 *                   x              o
 *            => void main(String[] args)
 *            => void println(String s)
 *         --------------------------------------
 *                   x              x
 *            => void println()
 *         --------------------------------------
 *         => 결과 값이 없는 경우 반드시 void
 *            => 오라클 연경 (insert, update, delete)
 *               CRUD...
 *         => 메소드 (행위 동작) => 동작에 대한 처리....
 *               
 */
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
