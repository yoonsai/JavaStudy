/*
 * 증감연산자
 * -> 1 증가 ++
 * -> 1 감소 --
 * = 전치연산자 => ++a; --a; 먼저 계산을 하고 
 * = 후치연산자 => a++; a--; 나중에 계산
 * int a=10;
 * int b=++a; => a를 1증가한 뒤에 b에 대입
 * 
 * int a=10;
 * int b=a++; => b에 a값을 대입 후에 a값을 1 증가
 * 
 * int a=10;
 * int b=++a + ++a + a++; 11 12 12
 * a= 13 (a는 증가된 수만큼)
 * 
 * int a=10;
 * int b=a++ + a++ + ++a; 10 11 13 
 * 
 * int a=10;
 * int b=++a + a++ + ++a + a++ ; 11 11 13 13 
 * 
 * int a=10;
 * int b=a++ + a++ + a++ + a++ ;  10 11 12 13 
 * 
 * int a=10;
 * int b=a-- + a++ + --a + a++ ;  10 9 9 9 
 * 
 * 
 */

public class C_증감연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		System.out.println("a:"+a+" b:"+b);
		a=10;
		b=a++;
		System.out.println("a:"+a+" b:"+b);
		
		// 
	}
	

}
