/*
 * *=,/=
 * 
 * int a=10;
 * a*=20; ====> a=a*20 ==> a=10*20=200
 * 
 * int a=10;
 * a/=3; ====> a=a/3 ==> a=10/3=3
 */
public class E_복합대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=10;
		int b=a*20;
		System.out.println("a:"+a+" b:"+b);
		
		b=a/3;
		System.out.println(b);

	}

}
