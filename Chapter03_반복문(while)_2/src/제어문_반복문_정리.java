/*
 * 2차 for
 * ------
 * for(초기값;조건식;증가식) ===> 줄수 (row)
 * {
 *    for(초기값;조건식;증가식) ==> 실제출력
 *    {        ---- 설정(수열=방정식) => 수와 수의 관계
 *                     --------- 분석(넘파이,판다스)
 *                       MaPlotLip => 시각화
 *                       R => 자바에서 연동(Reserve)
 *       반복 수행문장
 *    }
 *    system.out.println();
 * }   
 * 
 * ==> 등수 구하기, 빈도 구하기, 정렬(버블, 선택) ....
 * 
 * 
 *    *
 *   **   
 *  ***   
 * ****
 * 
 * i  j(공백)   k(별표)
 * 1  3        1
 * 2  2        2
 * 3  1        3
 * 4  0        4  ==> k=i
 * ----
 * i+j=4
 * j=4-i
 * 
 * 
 * ****
 *  ***
 *   **  
 *    *
 *    
 * i  j(공백)   k(별표)
 * 1  0        4
 * 2  1        3
 * 3  2        2
 * 4  3        1  ==> k+i=5 ==> k=5-i
 * ----
 * i-j=1
 * j=i-1
 *    
 *    
 */

public class 제어문_반복문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
