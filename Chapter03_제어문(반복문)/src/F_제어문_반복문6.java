// 1~100까지 5의 배수의합과 5의 배수의 갯수
public class F_제어문_반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("5의 배수의 합:"+sum);
		System.out.println("5의 배수의 개수:"+count);
	}

}
