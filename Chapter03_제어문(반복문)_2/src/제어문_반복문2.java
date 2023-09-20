
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=9;i++) // 줄수 => 1차 for문
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
