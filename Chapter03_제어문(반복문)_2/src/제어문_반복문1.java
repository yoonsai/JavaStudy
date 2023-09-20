/*
 * 데이터 저장 방법
 * --------
 * 변수
 * 상수
 * 배열
 * 클래스
 * ------- 메모리
 * 파일
 * RDBMS (오라클) ====> JDBC(핵심)
 * ------- 영구적인 저장장치
 * 사용자가 요청 => 처리 (데이터 가공)
 * 연산자
 * 제어문
 * -------명령문
 * 메소드
 * ---------------------+클래스(컴포넌트)
 * 출력 => 화면
 * 1) 화면 출력 :system.out.println
 * 2) 브라우저 : html/css
 * ----------------------------------- 동시에 처리 spring
 * 
 * => 서버(spring)에서 요청처리 ==>> 화면 변경(구시대)
 * => 차세대
 *    spring boot (서버) <==> front
 *    restful(Json)         -------    처리속도(vue,react)
 *         |
 *        통합 => 각 프로그램마다 따로 서버를 돌린다 (MSA)
 *     => AI => 머신러닝/딥러닝
 *     
 * ====> 반복문
 *       = for : 브라우저 화면 출력
 *               페이지 나누기
 *               -------------- 사용자가 한눈에 볼 수 있다(15~20)
 *       = while : 파일/데이터베이스(오라클)
 *    
 * 
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.println("i="+i+" ,j="+j);
			}
			System.out.println();
		}
	}

}
