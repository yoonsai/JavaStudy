/*
 * break : 반복 중단
 *         게임 => ESC (반복문,switch~case)
 *         
 * continue : 특정부분제외
 * -----------------------반복문에서만 사용이 가능
 * *** 제어영역 => 자신의 반복문에서만 작동
 * for()
 * {
 *   for()
 *   {
 *      break; ==> 2차 for문만 제어
 *   }
 *   break; ==> 1차 for문만 제어
 * } 
 * 
 * outer:for()
 * {
 *   for()
 *   {
 *      break outer; ==> '이름이 있는 break'는 1차 for문도 같이 종료
 *   }
 * } 
 */
public class 제어문_반복제어문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break => 반복문 종료
//		for(int i=1;i<=10;i++)
//		{
//			if(i%3==0)
//				break;
//			System.out.println("i="+i); //if소속 문장이 아니다
//		}
		
//		for(int i=1;i<=10;i++)
//		{
//			if(i==3)
//			{
//				// 소스 코딩이 가능
//				break; // => i가 3이면 반복 종료
//				// 소스 코딩이 불가능
//			}	
//			System.out.println("i="+i);
//		}
		
		for(int i=1;i<=10;i++)
		{
			if(i==3)
				continue; // i가 3이면 올라가서 증가식으로 이동
			System.out.println("i="+i);
		}
		
		System.out.println("=======while======");
//		int i=1;
//		while(i<=10)
//		{
//			if(i==3)
//				break;
//			System.out.println("i="+i);
//			i++;
//		}
		int i=1;
		while(i<=10)
		{
			
			if(i==3)
				continue;
			System.out.println("i="+i);
			i++;
			
		}
		
	}

}
