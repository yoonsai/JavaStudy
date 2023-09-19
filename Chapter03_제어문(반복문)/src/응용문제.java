
public class 응용문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c3=0, c5=0, c7=0;
		for(int i=1;i<=20;i++)
		{
			int a=(int)((Math.random()*100)+1);
			System.out.print(a+" ");
			if(a%3==0)
				c3++;
			if(a%5==0)
				c5++;
			if(a%7==0)
				c7++;
			
		}
		System.out.println("\n3의 배수의 갯수:"+c3);
		System.out.println("5의 배수의 갯수:"+c5);
		System.out.println("10의 배수의 갯수:"+c7);
		
		
		System.out.println("==================================");
		
		int sum=0;
		for(int b=1;b<=10;b++)
		{
			if(b%2==0)
				sum-=b;
			else 
				sum+=b;
			
		}
		System.out.println(sum);
		System.out.println(1-2+3-4+5-6+7-8+9-10);
		System.out.println("==================================");
		
		for(char c='B';c<='N';c+=2)
		{
			System.out.print(c+" ");
		}
	}

}
