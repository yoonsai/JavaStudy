
public class 연습문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, count=0;
		
		for(int i=100;i<1000;i++)
		{
			if(i%7==0)
			{
				sum+=i;
				count++;
			}
			
		}
		System.out.println("7의 배수 갯수:"+count);
		System.out.println("7의 배수 합:"+sum);
	}

}
