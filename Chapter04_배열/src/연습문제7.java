public class 연습문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)((Math.random()*100)+1);
			
		}
		for(int b:a)
		{
			System.out.print(b+" ");
			sum+=b;
		}
		System.out.println("\n총점:"+sum);
		System.out.printf("평균:%.1f",sum/10.0);
	}

}
