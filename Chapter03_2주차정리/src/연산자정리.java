/*
 *연산자
 *-----
 *   => 결과값 (데이터형 사용)
 *   1) 피연산자 / 연산자
 *     ------- 연산 대상
 *     
 *       1개 = 단항연산자 ++a , !a , (char)10
 *              - 증감연산자 ++, --
 *                전치연산자 : 먼저증가 => 다른 연산 수행
 *                후치 연산자 : 다른 연산 수행 => 증가
 *                int a=10;
 *                int b=a++;
 *                   --- ----
 *                    1    2
 *                int a=10;
 *                int b= ++a;
 *                   ---- ---
 *                    2    1
 *              - 부정연산자 ==> boolean만 사용 가능 (조건문)
 *                boolean bCheck=false;
 *                !bCheck => true
 *                bCheck=!bCheck
 *                
 *                String s="aaa";
 *                s.replace('a','b') ==> "bbb"
 *              - 형변환연산자
 *                -------- boolean은 불가능
 *              
 *       2개 = 이항연산자 a+b 
 *              - 산술연산자
 *                => 장바구니
 *                => + 문자열 결합
 *                   int이하 데이터형은 연산시 결과값이 int로 나옴
 *                   double + int = double
 *                   char + char = int
 *              - 비교연산자 : 조건문 / 반복문(조건식)
 *              
 *              - 논리연산자
 *                && ||
 *                ---
 *                (조건) && (조건)
 *               ------    -----
 *                  |        |
 *                 ------------- true && true = true
 *                   => 범위, 기간
 *                   => (조건) && (조건)
 *                      -----
 *                       false => 뒤에 있는 조건은 수행하지 않는다
 *                       => 효율적인 연산
 *                       
 *                (조건) || (조건)
 *                ------  -----
 *                  |        |
 *                 ------------- true || true = true
 *                               true || false = true
 *                               false || true = true
 *                      => 사용처 (오류 처리, 범위를 벗어났을 때, 잘못된 입력)
 *                      => true -> 뒤에 있는 조건은 수행하지 않는다
 *                      => 효율적인 연산
 *               
 *              - 대입연산자    
 *                =, +=, -=
 *                int a=10;
 *                a+=1; => a=a+1 => a=11
 *                => 1개 증가보다 여러개 증가
 *                a+=2, a+=3
 *                => 비행기, 총알 ...
 *                
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
 *       3개 = 삼항연산자 (조건)?값1:값2 ==> 페이지변경
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean bCheck=false;
//		bCheck=!bCheck;
//		if(!bCheck) {
//			System.out.println("출력");
//		}
//		System.out.println(bCheck);
//		int a=10;
//		a++; // a=a+1
//		System.out.println(a);
		
//		byte b1=10;
//		byte b2=20;
//		byte b3=(byte) (b1+b2);
		String s="Hello";
		String s1=new String("Hello");
		if(s==s1)
			System.out.println("같다");
		else
			System.out.println("다르다"); // ==은 주솟값이 같냐고 묻는거라 다름, equals는 저장되어있는 문자가 같냐고 묻는것
	}

}
