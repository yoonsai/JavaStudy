/*
 * 1차 for
 * 
 */
public class 제어문_반복문2 {
	static int b=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i+=2) // i는 for문안에서만 사용가능, 지역변수
		{
			System.out.println(i);
		}
		//System.out.println(i); -> 오류남
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=5-1;j++) 
			{
				System.out.println("★");
			}
			System.out.println();
		}
		
		
	}

}
