
public class 연습문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum2=0, sum3=0;
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
				sum2+=i;
			if(i%3==0)
				sum3+=i;
		}
		System.out.println("2의 배수의 합:"+sum2);
		System.out.println("3의 배수의 합:"+sum3);
	}

}
