package com.sist.lib;
/*
 *  Random : 난수발생
 *     => nextInt(int bound) ==> 0~bound-1 발생
 *  326page
 *     Arrays : 배열과 관련된 기능 제어
 *     ------
 *      1) ***sort => 정렬 ==> ORDER BY no DESC(ASC) => 걸리는 시간이 오래걸림
 *                            ==> index(최적화) ***
 *      2) copyof => 다른 배열에서 복사
 *      3) toString() => 배열값 출력
 *  328page
 *     StringTokenizer : 문자열을 분리
 *     ---------------
 *     가자미회무침 (소) 25,000원 ^ 
 *     가자미 회무침 (대) 35,000원 ^
 *     홍게 칼국수 7,000원 ^
 *     ==> split() => 정규식을 이용 => 쉽게 제작
 *     ==> 네트워크 / 빅데이터 / 웹
 *     ==> 기능(메소드)
 *         1) countTokens() : 분리된 데이터 갯수
 *         2) nextToken() : 실제 분리딘 데이터 읽기
 *         3) hasMoreTokens() : 분리된 수만큼 루프 수행
 *        
 *      
 */
import java.util.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[7];
		
		Random r=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt(100)+1;
		}
		System.out.println("=====정렬전======");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=====정렬전======");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 작은배열로 복사
		int[] subArr=Arrays.copyOf(arr, 3); // arr에서 앞에서부터 0,1,2번 인덱스 값 3개를 가져옴
		System.out.println(Arrays.toString(subArr));
		
		// 큰배열로 복사
		int[] subArr2=Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(subArr2)); // 큰배열도 만들 수 있음 뒤에 남은 배열값은 0으로 채워짐
		/*
		 *  나머지 영역은 초기값 설정
		 *  int 0
		 *  double 0.0
		 *  클래스 null
		 *  boolean fasle
		 */
		
		
	}

}
