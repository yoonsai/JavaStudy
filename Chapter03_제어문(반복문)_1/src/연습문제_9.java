
public class 연습문제_9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문_반복문2.b=100;
        int sum=0, count=0;
		
		for(int i=100;i<1000;i++)
		{
			if(i%4!=0)
			{
				sum+=i;
				count++;
			}
			
		}
		System.out.println("갯수:"+count);
		System.out.println("합:"+sum);
		//System.out.println(제어문_반복문2.b);
	}

}
