/*
 * 웹
 * --- 변수, 연산자, 제어문, 메소드, 클래스, 인터페이스, 예외처리
 *               -----
 *                 |
 *                if/for/while/break
 * 71page
 * -------while => 반복문 => 반복횟수가 없는 경우
 *          |
 *        사용처 => 데이터베이스 연동, 파일 읽기
 *        형식) 
 *            초기값
 *            while(조건문)
 *            {
 *               반복수행문장
 *               증가식
 *            }
 *            
 *            예) int i=1;  ------------1
 *                while(i<=10)--------------2  => fasle(종료),true(문장수행) / 수행을 안할수도 있음
 *                {
 *                   System.out.println();------3
 *                   i++;-------------------------4
 *                }   
 *                 
 *        순서) 
 * 
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======for=======");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n=======while=======");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
	}

}
