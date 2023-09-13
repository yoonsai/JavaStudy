/*
 * <<=, >>= 쉬프트연산자 (비트이동연산자)
 *   
 *   << : 비트를 왼쪽으로 이동
 *   >> : 비트를 오른쪽으로 이동
 *   
 *   27 <<3 = 27*2^3= 27*8=216
 *   27 >>3 = 27/2^3 = 3
 *   ---
 *   
 */
public class F_복합대입연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Integer.toBinaryString(3));
		int a=27;
		a<<=3;
		System.out.println(a);
		
		a=27;
		a>>=3;
		System.out.println(a);
		
		// a=33; 왼쪽으로 2이동, 오른쪽으로 2이동
		a=33;
		a<<=2;
		System.out.println(a);
		a=33;
		a>>=2;
		System.out.println(a);
	}

}