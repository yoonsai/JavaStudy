/*
 * 조건문
 * 단일조건문/선택조건문/다중조건문 => 형식, 순서
 * 연산자 => 어떤 연산자 => 결과값?
 * ------- 비교연산자,논리연산자, 부정연산자
 * 단일조건문
 * --------
 *   if(조건문) => 오류(예외처리) = 사전에 오류방지
 *   {
 *       조건이 true일때만 수행
 *   }
 *       
 */
public class 연습문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
