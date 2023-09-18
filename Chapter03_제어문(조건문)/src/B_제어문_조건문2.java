/*
 * 단일조건문 true일 경우에 처리 => false는 건너뛴다
 * 선택조건문 => true일때 처리, false일떄 처리를 나눠서 작업
 * ------- ex) 아이디 중복체크
 *             중복일경우 => 이미 사용중인 아이디입니다, 중복이 아닐 경우 => 사용이 가능한 아이디입니다
 *             
 * 형식) 
 *      if(조건문)
 *      {
 *        // 조건문이 true일 경우
 *      }
 *      else
 *      {
 *        // 조건문이 false일 경우
 *      {            
 *      ====> 간결하게 처리 =>  삼항연산자 (웹,게임)
 *      
 *      => 짝수냐 홀수냐
 *      => 대문자 / 소문자
 *      => 웹 => 페이지
 * 
 */
public class B_제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
//		if(c>='A' && c<='Z') {
//			System.out.println(c+"는 대문자입니다.");
//		}
//		if(c>='a' && c<='z') {
//			System.out.println(c+"는 소문자입니다.");
//		}
		if(c>='A' && c<='Z') {
			System.out.println(c+"는 대문자입니다.");
		}
		else 
		{
			System.out.println(c+"는 소문자입니다.");
		}
		// else문장은 독립적으로 사용불가 => if문과 같이 사용
		// else문장은 바로 위에 있는 if만 지원한다.
		/*
		 * if() {
		 * }
		 * --------
		 * if() {
		 * }
		 * --------
		 * if() {
		 * }
		 * else {
		 * }
		 */
		int a=10;
		if(a%2==0) {
			System.out.println(a+"는 짝수입니다.");
		}
		else {
			System.out.println(a+"는 홀수입니다.");
		}
	}

}
