//10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.

public class 연습문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int sum=0;
		double avg=0.0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			sum+=arr[i];
		}
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f",sum/10.0);
		
	}

}
