/*
 * while 
 * ----
 *   => 10개의 난수 => 1~100
 *   => 최대값 / 최소값
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1, min=100; // 값을 변경해야되서
		int i=1; // 루프변수
		while(i<=10)
		{
			int rand=(int)(Math.random()*100)+1;
			System.out.print(rand+" ");
			if(max<rand)
				max=rand;
			if(min>rand)
				min=rand;
			i++;// 없으면 무한루프
		}
		System.out.println("\n최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
