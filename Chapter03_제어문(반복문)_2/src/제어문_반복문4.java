/*
 * ★★★★★
 * ★★★★★
 * ★★★★★
 * ★★★★★
 * 
 * 줄수   별표
 *  1     5
 *  2     5
 *  3     5
 *  4     5
 */
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}*/
//		char a='A';
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				
//				System.out.print(a++);
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=4;i++)
//		{
//			char a='A';
//			for(int j=1;j<=5;j++)
//			{
//				
//				System.out.print(a++);
//			}
//			System.out.println();
//		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
					System.out.print("★");
				else
					System.out.print("☆");
				
			}
			System.out.println();
		}
		
	}

}
