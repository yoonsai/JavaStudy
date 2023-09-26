/*
 * 선택정렬 -> 왼쪽부터 정렬
 * -------------------
 * 버블정렬 => 오른쪽부터 정렬
 * 
 * 40 30 10 50 20 ==> ASC
 * -- --
 * 30 40
 *    -- --
 *    10 40
 *       -- --
 *       40 50
 *          -- --
 *          20 50
 * =============== 1ROUND 종료 
 * 30 10 40 20 50(고정)
 * -- --
 * 10 30
 *    -- --
 *    30 40
 *       -- --   
 *       20  40   
 * =============== 2ROUND 종료
 * 10 30 20 40(고정) 50(고정)    
 * -- --
 * 10 30
 *    -- --
 *    20 30 
 * =============== 3ROUND 종료
 * 10 20 30(고정) 40(고정) 50(고정) 
 * -- --
 * 10 20
 * =============== 4ROUND 종료
 * 10 20(고정) 30(고정) 40(고정) 50(고정)   
 * 
 * 
 * i     j
 * 0     4    i+j=4 => j=4-i까지  4=(length-1)
 * 1     3
 * 2     2
 * 3     1
 * ---------
 * 배열 => 같은 데이터형을 일정한 순서(index)로 모아서 관리
 *        
 *        => 배열의 크기 : length
 *        => 출력시에는 향상된 for (for-each)
 *        => 관련된 종류의 데이터 3개 이상인 경우
 *        => 선언 => 초기값
 *                 -----
 *                   |
 *                  1) 명시적
 *                  2) new
 *                     ----
 *                      |
 *                     자동 초기화
 *                     int=>0
 *                     double=>0.0
 *                     char=>'\0'
 *                     String=>null (null값은 오류가 많아서 초기값을 줘야함)
 *  ------------------------------------------------------------------
 *  
 *
 */
import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		//초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("=========정렬전========");
		System.out.println(Arrays.toString(arr));
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("=========정렬후========");
		System.out.println(Arrays.toString(arr));
	}

}
