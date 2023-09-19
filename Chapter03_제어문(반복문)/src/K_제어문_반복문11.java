/*
 * 20개의 정수 난수 발생 => 짝수 , 홀수 갯수
 */
public class K_제어문_반복문11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int co1=0,co2=0;
		for(int i=1;i<=20;i++)
		{
			int a=(int)((Math.random()*100)+1);
			System.out.print(a+" ");
			if(a%2==0)
				co1++;
			else
				co2++;
		}
		System.out.println("\n짝수의 갯수:"+co1);
		System.out.println("홀수의 갯수:"+co2);
	}

}
