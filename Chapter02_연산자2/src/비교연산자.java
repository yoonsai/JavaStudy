/*
 * 비교연산자 ==> 결과값 (boolean : true/false)
 * ----- 사용처 (조건문, 반복문)
 * 숫자 (정수, 실수, boolean, 문자) => 문자열은 비교할 수 없다
 * boolean => ==,!=만가능
 * --------------------------- 문자는 어떤 연산자를 사용해도 정수형으로 변경
 * 1) == 같다
 * 2) != 같지않다
 * 3) < 작다
 * 4) > 크다
 * 5) <= 작거나 같다
 * 6) >= 크거나 같다
 * ---------------------------
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1; 
		// 1~100사이의 숫자를 랜덤으로 가져와라
		int b=(int)(Math.random()*100)+1; //예약가능한날 
		
		System.out.println("a:"+a); 
		System.out.println("b:"+b);
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>=b:"+(a>=b));
		
		
		System.out.println((Math.random()*26)+65);
		char c=(char)((Math.random()*26)+65); // 26은 알파벳 개수 /Math.random()*26 => 0~26까지
		char d=(char)((Math.random()*26)+65);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("c==d:"+(c==d));
		System.out.println("c!=d:"+(c!=d));
		System.out.println("c<d:"+(c<d));
		System.out.println("c>d:"+(c>d));
		System.out.println("c<=d:"+(c<=d));
		System.out.println("c>=d:"+(c>=d));
		
		boolean b1=false;
		boolean b2=true;
		System.out.println("b1==b2:"+(b1==b2));
		System.out.println("b1!=b2:"+(b1!=b2));
				
		
		
	}

}
