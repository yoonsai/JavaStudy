
public class 연습문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int i;
		int sum=0;
		
		System.out.print("랜덤한 정수들:");
		while(a<=10)
		{
			i=(int)(Math.random()*10)+1;
			System.out.print(i+" ");
			sum+=i;
			a++;
		}
		double avg=sum/10.0;
		System.out.println();
		System.out.println("평균:"+avg);
		
		
	}

}
